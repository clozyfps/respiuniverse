package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

public class ArchAngelProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).archangelchosen == true) {
			if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).isarchangel == true) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 999999, 1, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 999999, 2, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999999, 4, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 999999, 1, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 999999, 3, (false), (false)));
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.REGENERATION)
						? _livEnt.getEffect(MobEffects.REGENERATION).getAmplifier()
						: 0) < 5) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 999999, 5, (false), (false)));
				}
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HEALTH_BOOST)
						? _livEnt.getEffect(MobEffects.HEALTH_BOOST).getAmplifier()
						: 0) < 10) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 999999, 10, (false), (false)));
				}
			}
		}
	}
}
