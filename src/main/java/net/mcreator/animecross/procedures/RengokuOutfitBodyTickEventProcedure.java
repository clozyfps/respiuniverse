package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RengokuOutfitBodyTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 4, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 1, (false), (false)));
	}
}
