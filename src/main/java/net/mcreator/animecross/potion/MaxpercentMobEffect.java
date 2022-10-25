
package net.mcreator.animecross.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.procedures.MaxpercentOnEffectActiveTickProcedure;

public class MaxpercentMobEffect extends MobEffect {
	public MaxpercentMobEffect() {
		super(MobEffectCategory.NEUTRAL, -2894893);
	}

	@Override
	public String getDescriptionId() {
		return "effect.animecrossworkspace.maxpercent";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MaxpercentOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
