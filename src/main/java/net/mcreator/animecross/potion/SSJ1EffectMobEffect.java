
package net.mcreator.animecross.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.procedures.SSJ1EffectOnEffectActiveTickProcedure;
import net.mcreator.animecross.procedures.SSJ1EffectEffectStartedappliedProcedure;
import net.mcreator.animecross.procedures.SSJ1EffectEffectExpiresProcedure;

public class SSJ1EffectMobEffect extends MobEffect {
	public SSJ1EffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -14080);
	}

	@Override
	public String getDescriptionId() {
		return "effect.animecrossworkspace.ssj_1_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SSJ1EffectEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SSJ1EffectOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SSJ1EffectEffectExpiresProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
