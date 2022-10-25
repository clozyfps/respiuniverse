package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;

public class RedEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(AnimecrossworkspaceModMobEffects.BLUE.get(), 60, 1, (false), (false)));
	}
}
