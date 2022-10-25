package net.mcreator.animecross.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;
import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;

public class LightFlightPotionOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).stamina > 1) {
			{
				double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).stamina - 0.6;
				entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stamina = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 20, 1, (false), (false)));
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.PIKA_PIKA_PARTICLE_1.get()), x, y, z, 40, 0.1, 2, 0.1,
						0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.PIKA_PIKA_PARTICLE_2.get()), x, y, z, 40, 0.1, 2, 0.1,
						0.1);
		} else if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).stamina < 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(AnimecrossworkspaceModMobEffects.LIGHT_FLIGHT_POTION.get());
		}
	}
}
