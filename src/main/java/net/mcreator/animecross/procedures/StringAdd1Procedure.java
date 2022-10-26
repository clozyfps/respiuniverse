package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class StringAdd1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double T = 0;
		double Zo = 0;
		double Yo = 0;
		double Za = 0;
		double Xo = 0;
		double Ya = 0;
		double Xa = 0;
		double amountofentitiesallowed = 0;
		double xmath = 0;
		double ymath = 0;
		double zmath = 0;
		Entity targetedentity = null;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.ENTITY_C.get()) : false)) {
			{
				final Vec3 _center = new Vec3(
						(entity.level
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getX()),
						(entity.level
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getY()),
						(entity.level
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator instanceof KnotEntityEntity)) {
						if (!(entity == entityiterator) && (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power > 49 && amountofentitiesallowed < 1) {
							amountofentitiesallowed = amountofentitiesallowed + 1;
							if (!(entity instanceof LivingEntity _livEnt
									? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.ENTITY_C.get())
									: false)) {
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(
											new MobEffectInstance(AnimecrossworkspaceModMobEffects.ENTITY_C.get(), 100, 1, (false), (false)));
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(
											new MobEffectInstance(AnimecrossworkspaceModMobEffects.ENTITY_B.get(), 400, 1, (false), (false)));
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent(
											("Selected: " + entityiterator.getDisplayName().getString() + " Select a position within 5 seconds!")),
											(false));
							}
						}
					}
				}
			}
		} else if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power > 49
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.ENTITY_C.get()) : false)) {
			if (!((world.getBlockState(new BlockPos(
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
					.getBlock() == Blocks.AIR)) {
				{
					double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power - 50;
					entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.power = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(AnimecrossworkspaceModMobEffects.ENTITY_C.get());
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new KnotEntityEntity(AnimecrossworkspaceModEntities.KNOT_ENTITY.get(), _level);
					entityToSpawn.moveTo(
							(entity.level.clip(
									new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getBlockPos().getX()),
							(entity.level.clip(
									new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getBlockPos().getY()),
							(entity.level.clip(
									new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getBlockPos().getZ()),
							0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (((Entity) world
						.getEntitiesOfClass(KnotEntityEntity.class, AABB.ofSize(new Vec3(
								(entity.level.clip(new ClipContext(
										entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level.clip(
										new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getY()),
								(entity.level.clip(
										new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getZ())),
								15, 15, 15), e -> true)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(
								(entity.level.clip(
										new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getX()),
								(entity.level.clip(
										new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getY()),
								(entity.level.clip(
										new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getZ())))
						.findFirst().orElse(null)) instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(AnimecrossworkspaceModMobEffects.ENTITY_A.get(), 300, 1, (false), (false)));
			} else if ((world.getBlockState(new BlockPos(
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(25)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
					.getBlock() == Blocks.AIR) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Can't Tie here!"), (false));
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(AnimecrossworkspaceModMobEffects.ENTITY_C.get());
			}
		}
	}
}
