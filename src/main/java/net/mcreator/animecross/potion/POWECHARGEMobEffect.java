
package net.mcreator.animecross.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.procedures.POWECHARGEOnEffectActiveTickProcedure;

public class POWECHARGEMobEffect extends MobEffect {
	public POWECHARGEMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10027009);
	}

	@Override
	public String getDescriptionId() {
		return "effect.animecrossworkspace.powecharge";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		POWECHARGEOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
