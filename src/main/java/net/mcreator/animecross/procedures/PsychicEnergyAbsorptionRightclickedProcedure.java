package net.mcreator.animecross.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;
import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;
import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class PsychicEnergyAbsorptionRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power > 250
				&& (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).level >= 10
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.MAXPERCENT.get()) : false)) {
			{
				double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power - 250;
				entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(50 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getItem() == AnimecrossworkspaceModItems.PSYCHIC_ENERGY_ABSORPTION.get()) == false) {
						{
							double _setval = (entityiterator.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power - 500;
							entityiterator.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.power = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					}
					{
						double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power + 5000;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					for (int index0 = 0; index0 < (int) (200); index0++) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLUEPARTICLE.get()), x, y, z, 100, 3, 2, 3,
									1);
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.REDDEMONPARTICLE.get()), x, y, z, 100, 3,
									2, 3, 1);
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLOODPARTICLENEZUKO.get()), x, y, z, 100,
									3, 2, 3, 1);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 100, 3, 2, 3, 1);
					}
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
			for (int index1 = 0; index1 < (int) (200); index1++) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLUEPARTICLE.get()), x, y, z, 500, 5, 4, 5, 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.REDDEMONPARTICLE.get()), x, y, z, 100, 5, 4, 5, 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLOODPARTICLENEZUKO.get()), x, y, z, 100, 5, 4, 5,
							1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 100, 5, 3, 5, 1);
			}
		}
	}
}
