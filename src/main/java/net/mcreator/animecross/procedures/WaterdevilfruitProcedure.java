package net.mcreator.animecross.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WaterdevilfruitProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.isInWaterOrBubble() && (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).DevilFruit) == true) {
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() - 2), 0));
			entity.hurt(DamageSource.GENERIC, 6);
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 0, 5, (false), (false)));
		}
	}
}
