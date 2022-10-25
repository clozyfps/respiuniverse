package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;

public class LightFlightRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).PikaPikaUser == true
				&& (entity instanceof LivingEntity _livEnt
						? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.LIGHT_FLIGHT_POTION.get())
						: false) == false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(AnimecrossworkspaceModMobEffects.LIGHT_FLIGHT_POTION.get(), 99999, 1, (false), (false)));
		} else if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).PikaPikaUser == true
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.LIGHT_FLIGHT_POTION.get()) : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(AnimecrossworkspaceModMobEffects.LIGHT_FLIGHT_POTION.get());
		}
	}
}
