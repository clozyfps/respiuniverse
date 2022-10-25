
package net.mcreator.animecross.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.procedures.RedexProcedure;
import net.mcreator.animecross.procedures.RedEffectExpiresProcedure;

public class RedMobEffect extends MobEffect {
	public RedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -65536);
	}

	@Override
	public String getDescriptionId() {
		return "effect.animecrossworkspace.red";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RedexProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		RedEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
