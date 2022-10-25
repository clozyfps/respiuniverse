package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;

public class EsperFloatOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.ESPER_FLYING.get()) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(AnimecrossworkspaceModMobEffects.ESPER_FLYING.get());
		}
	}
}
