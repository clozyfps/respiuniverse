package net.mcreator.animecross.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;
import net.mcreator.animecross.entity.KnotEntityEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class StringAdd3Procedure {
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
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.ENTITY_E.get()) : false)) {
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
									? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.ENTITY_D.get())
									: false)) {
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(
											new MobEffectInstance(AnimecrossworkspaceModMobEffects.ENTITY_E.get(), 100, 1, (false), (false)));
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(
											new MobEffectInstance(AnimecrossworkspaceModMobEffects.ENTITY_D.get(), 400, 1, (false), (false)));
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(new TextComponent(("Selected: " + entityiterator.getDisplayName().getString()
											+ " Select another entity within 5 seconds!")), (false));
								{
									double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power - 50;
									entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.power = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
						}
					}
				}
			}
		} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.ENTITY_E.get()) : false) {
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
									? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.ENTITY_D.get())
									: false)) {
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(
											new MobEffectInstance(AnimecrossworkspaceModMobEffects.ENTITY_D.get(), 200, 1, (false), (false)));
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(AnimecrossworkspaceModMobEffects.ENTITY_E.get());
								{
									double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power - 50;
									entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.power = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
						}
					}
				}
			}
		}
	}
}
