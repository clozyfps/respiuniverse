package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;

public class ChargePowerOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(AnimecrossworkspaceModMobEffects.POWECHARGE.get(), 100, 1, (false), (true)));
	}
}
