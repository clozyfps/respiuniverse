package net.mcreator.animecross.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GiveEffectProcedure {
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
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).isarchangel == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(AnimecrossworkspaceModMobEffects.ARCH_ANGEL_POTION.get(), 999999, 1, (false), (false)));
		}
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).isTenCommandment == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(AnimecrossworkspaceModMobEffects.COMMANDMENT.get(), 999999, 1, (false), (false)));
		}
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).issupremedeity == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(AnimecrossworkspaceModMobEffects.SUPREME_DEITY.get(), 999999, 1, (false), (false)));
		}
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).isdemonking == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(AnimecrossworkspaceModMobEffects.DEMON_KING.get(), 999999, 1, (false), (false)));
		}
	}
}
