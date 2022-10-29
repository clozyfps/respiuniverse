
package net.mcreator.animecross.entity;

import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.IAnimatable;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.animecross.procedures.InfernoOnInitialEntitySpawnProcedure;
import net.mcreator.animecross.procedures.InfernoOnEntityTickUpdate3Procedure;
import net.mcreator.animecross.procedures.InfernoEntityDiesProcedure;
import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;
import net.mcreator.animecross.init.AnimecrossworkspaceModEntities;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InfernoEntity extends Monster implements IAnimatable {
	private AnimationFactory factory = new AnimationFactory(this);
	private boolean swinging;
	private long lastSwing;

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		event.getSpawns().getSpawner(MobCategory.MONSTER)
				.add(new MobSpawnSettings.SpawnerData(AnimecrossworkspaceModEntities.INFERNO.get(), 20, 4, 4));
	}

	public InfernoEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(AnimecrossworkspaceModEntities.INFERNO.get(), world);
	}

	public InfernoEntity(EntityType<InfernoEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, LivingEntity.class, true, true));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.4, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		InfernoEntityDiesProcedure.execute(source.getEntity());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		InfernoOnInitialEntitySpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		InfernoOnEntityTickUpdate3Procedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	public void aiStep() {
		super.aiStep();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 2; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.1D;
			double dy = (random.nextFloat() - 0.5D) * 0.1D;
			double dz = (random.nextFloat() - 0.5D) * 0.1D;
			world.addParticle((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.FIRE_PARTICLE.get()), x0, y0, z0, dx, dy, dz);
		}
	}

	public static void init() {
		SpawnPlacements.register(AnimecrossworkspaceModEntities.INFERNO.get(), SpawnPlacements.Type.ON_GROUND,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL
						&& Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 90);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 15);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1);
		return builder;
	}

	private <E extends IAnimatable> PlayState movementPredicate(AnimationEvent<E> event) {
		event.getController().animationSpeed = 1.25;
		event.getController().transitionLengthTicks = 5;
		double d1 = this.getX() - this.xOld;
		double d0 = this.getZ() - this.zOld;
		float velocity = (float) Math.sqrt(d1 * d1 + d0 * d0);
		if (getAttackAnim(event.getPartialTick()) > 0f && !this.swinging) {
			this.swinging = true;
			this.lastSwing = level.getGameTime();
		}
		if (this.swinging && this.lastSwing + 15L <= level.getGameTime()) {
			this.swinging = false;
		}
		if (this.swinging) {
			event.getController().transitionLengthTicks = 0;
			event.getController().animationSpeed = 0.8;
			event.getController().setAnimation(new AnimationBuilder().addAnimation("attack"));
			return PlayState.CONTINUE;
		}
		if (event.isMoving() && !this.swinging) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", true));
			return PlayState.CONTINUE;
		}
		if (this.isDeadOrDying()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("death", false));
			return PlayState.CONTINUE;
		}
		if (this.isInWaterOrBubble()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("swim", true));
			return PlayState.CONTINUE;
		}
		if (this.isSprinting()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("sprint", false));
			return PlayState.CONTINUE;
		}
		if (this.isShiftKeyDown()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("sneak", false));
			return PlayState.CONTINUE;
		}
		if (!this.swinging) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
			return PlayState.CONTINUE;
		}
		return PlayState.CONTINUE;
	}

	@Override
	protected void tickDeath() {
		++this.deathTime;
		if (this.deathTime == 20) {
			this.remove(InfernoEntity.RemovalReason.KILLED);
		}
	}

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController<>(this, "movement", 4, this::movementPredicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}
}
