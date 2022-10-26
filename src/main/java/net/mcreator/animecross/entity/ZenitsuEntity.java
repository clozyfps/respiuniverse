
package net.mcreator.animecross.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ZenitsuEntity extends Monster {

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		event.getSpawns().getSpawner(MobCategory.AMBIENT)
				.add(new MobSpawnSettings.SpawnerData(AnimecrossworkspaceModEntities.ZENITSU.get(), 1, 1, 1));
	}

	public ZenitsuEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(AnimecrossworkspaceModEntities.ZENITSU.get(), world);
	}

	public ZenitsuEntity(EntityType<ZenitsuEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(AnimecrossworkspaceModItems.DELETED_MOD_ELEMENT.get()));

	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, DemonEntity.class, true, true));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, AkazaEntity.class, true, true));
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.7, true) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}

		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, YahabaEntity.class, true, true));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, KokushiboEntity.class, true, true));
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(7, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));

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
	public boolean hurt(DamageSource source, float amount) {
		ZenitsuEntityIsHurtProcedure.execute(this);
		return super.hurt(source, amount);
	}

	public static void init() {
		SpawnPlacements.register(AnimecrossworkspaceModEntities.ZENITSU.get(), SpawnPlacements.Type.NO_RESTRICTIONS,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 199);
		builder = builder.add(Attributes.ARMOR, 0.1);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 15);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);

		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1);

		return builder;
	}
}