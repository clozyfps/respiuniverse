
package net.mcreator.animecross.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.procedures.EsperFlyingOnEffectActiveTickProcedure;
import net.mcreator.animecross.procedures.EsperFlyingEffectStartedappliedProcedure;
import net.mcreator.animecross.procedures.EsperFlyingEffectExpiresProcedure;

public class EsperFlyingMobEffect extends MobEffect {
	public EsperFlyingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -15552001);
	}

	@Override
	public String getDescriptionId() {
		return "effect.animecrossworkspace.esper_flying";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		EsperFlyingEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EsperFlyingOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EsperFlyingEffectExpiresProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
