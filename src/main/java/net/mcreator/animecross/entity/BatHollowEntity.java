
package net.mcreator.animecross.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BatHollowEntity extends Monster {

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		event.getSpawns().getSpawner(MobCategory.AMBIENT)
				.add(new MobSpawnSettings.SpawnerData(AnimecrossworkspaceModEntities.BAT_HOLLOW.get(), 9, 1, 3));
	}

	public BatHollowEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(AnimecrossworkspaceModEntities.BAT_HOLLOW.get(), world);
	}

	public BatHollowEntity(EntityType<BatHollowEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, LivingEntity.class, true, true));
		this.goalSelector.addGoal(2, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (BatHollowEntity.this.getTarget() != null && !BatHollowEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return BatHollowEntity.this.getMoveControl().hasWanted() && BatHollowEntity.this.getTarget() != null
						&& BatHollowEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = BatHollowEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				BatHollowEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 3);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = BatHollowEntity.this.getTarget();
				if (BatHollowEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					BatHollowEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = BatHollowEntity.this.distanceToSqr(livingentity);
					if (d0 < 50) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						BatHollowEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 3);
					}
				}
			}
		});
		this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, SoulReaperEntity.class, (float) 6));
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 0.4, 20) {

			@Override
			protected Vec3 getPosition() {
				Random random = BatHollowEntity.this.getRandom();
				double dir_x = BatHollowEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = BatHollowEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = BatHollowEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

		});
		this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.4, true) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}

		});
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(7, new HurtByTargetGoal(this).setAlertOthers());
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
	public boolean causeFallDamage(float l, float d, DamageSource source) {

		return false;
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();

		this.setNoGravity(true);

	}

	public static void init() {
		SpawnPlacements.register(AnimecrossworkspaceModEntities.BAT_HOLLOW.get(), SpawnPlacements.Type.NO_RESTRICTIONS,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 70);
		builder = builder.add(Attributes.ARMOR, 0.2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 9);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);

		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 2);

		builder = builder.add(Attributes.FLYING_SPEED, 0.4);

		return builder;
	}
}