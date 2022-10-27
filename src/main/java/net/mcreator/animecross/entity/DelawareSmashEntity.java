
package net.mcreator.animecross.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class DelawareSmashEntity extends AbstractArrow implements ItemSupplier {

	public DelawareSmashEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(AnimecrossworkspaceModEntities.DELAWARE_SMASH.get(), world);
	}

	public DelawareSmashEntity(EntityType<? extends DelawareSmashEntity> type, Level world) {
		super(type, world);
	}

	public DelawareSmashEntity(EntityType<? extends DelawareSmashEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public DelawareSmashEntity(EntityType<? extends DelawareSmashEntity> type, LivingEntity entity, Level world) {
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
		DelawareSmashProjectileHitsLivingEntityProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		DelawareSmashProjectileHitsBlockProcedure.execute(

		);
	}

	@Override
	public void tick() {
		super.tick();

		DelawareSmashWhileProjectileFlyingTickProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());

		if (this.inGround)
			this.discard();
	}

	public static DelawareSmashEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		DelawareSmashEntity entityarrow = new DelawareSmashEntity(AnimecrossworkspaceModEntities.DELAWARE_SMASH.get(), entity, world);
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

	public static DelawareSmashEntity shoot(LivingEntity entity, LivingEntity target) {
		DelawareSmashEntity entityarrow = new DelawareSmashEntity(AnimecrossworkspaceModEntities.DELAWARE_SMASH.get(), entity, entity.level);
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
