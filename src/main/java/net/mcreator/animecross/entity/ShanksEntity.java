
package net.mcreator.animecross.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ShanksEntity extends Monster {

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		event.getSpawns().getSpawner(MobCategory.AMBIENT).add(new MobSpawnSettings.SpawnerData(AnimecrossworkspaceModEntities.SHANKS.get(), 1, 1, 1));
	}

	public ShanksEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(AnimecrossworkspaceModEntities.SHANKS.get(), world);
	}

	public ShanksEntity(EntityType<ShanksEntity> type, Level world) {
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

		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, MarineEntity.class, true, true));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.6, true) {

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

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(AnimecrossworkspaceModItems.DELETED_MOD_ELEMENT.get()));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	public static void init() {
		SpawnPlacements.register(AnimecrossworkspaceModEntities.SHANKS.get(), SpawnPlacements.Type.NO_RESTRICTIONS,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 299);
		builder = builder.add(Attributes.ARMOR, 0.2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 26);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);

		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1);

		return builder;
	}
}