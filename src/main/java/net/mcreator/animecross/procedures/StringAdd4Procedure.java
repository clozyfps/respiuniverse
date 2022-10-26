package net.mcreator.animecross.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;
import net.mcreator.animecross.init.AnimecrossworkspaceModEntities;
import net.mcreator.animecross.entity.KnotEntityEntity;

import java.util.Comparator;

public class StringAdd4Procedure {
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
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).stringFruit == true) {
			if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power > 14
					&& !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.ENTITY_B.get()) : false)) {
				{
					double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power - 15;
					entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.power = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
					_entity.addEffect(new MobEffectInstance(AnimecrossworkspaceModMobEffects.WEB_SWINGING.get(), 300, 1, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(AnimecrossworkspaceModMobEffects.WEB_SWINGING.get(), 300, 1, (false), (false)));
			}
		}
	}
}
