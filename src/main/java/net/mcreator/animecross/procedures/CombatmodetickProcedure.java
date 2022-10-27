package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CombatmodetickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).combatmode == true
				&& (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power > 0) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.ONE_FOR_ALL_PARTICLE.get()), (entity.getX()),
						(entity.getY()), (entity.getZ()), 3, 0.1, 2, 0.1, 0.1);
			{
				double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power - 0.1;
				entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
