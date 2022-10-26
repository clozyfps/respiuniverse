
package net.mcreator.animecross.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ThunderclapandflashEntity extends AbstractArrow implements ItemSupplier {

	public ThunderclapandflashEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(AnimecrossworkspaceModEntities.THUNDERCLAPANDFLASH.get(), world);
	}

	public ThunderclapandflashEntity(EntityType<? extends ThunderclapandflashEntity> type, Level world) {
		super(type, world);
	}

	public ThunderclapandflashEntity(EntityType<? extends ThunderclapandflashEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ThunderclapandflashEntity(EntityType<? extends ThunderclapandflashEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.AIR);
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		ThunderclapandflashProjectileHitsLivingEntityProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entityHitResult.getEntity(),
				this.getOwner());
	}

	@Override
	public void tick() {
		super.tick();

		if (this.inGround)
			this.discard();
	}

	public static ThunderclapandflashEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		ThunderclapandflashEntity entityarrow = new ThunderclapandflashEntity(AnimecrossworkspaceModEntities.THUNDERCLAPANDFLASH.get(), entity,
				world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);

		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")),
				SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));

		return entityarrow;
	}

	public static ThunderclapandflashEntity shoot(LivingEntity entity, LivingEntity target) {
		ThunderclapandflashEntity entityarrow = new ThunderclapandflashEntity(AnimecrossworkspaceModEntities.THUNDERCLAPANDFLASH.get(), entity,
				entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);

		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")),
				SoundSource.PLAYERS, 1, 1f / (new Random().nextFloat() * 0.5f + 1));

		return entityarrow;
	}

}
