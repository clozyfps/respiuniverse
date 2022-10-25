
package net.mcreator.animecross.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.animecross.procedures.BlueexProcedure;
import net.mcreator.animecross.procedures.BlueEffectExpiresProcedure;

public class BlueMobEffect extends MobEffect {
	public BlueMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16737793);
	}

	@Override
	public String getDescriptionId() {
		return "effect.animecrossworkspace.blue";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BlueexProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		BlueEffectExpiresProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
