
package net.mcreator.animecross.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.procedures.SleepeffectOnEffectActiveTickProcedure;

public class SleepeffectMobEffect extends MobEffect {
	public SleepeffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.animecrossworkspace.sleepeffect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SleepeffectOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
