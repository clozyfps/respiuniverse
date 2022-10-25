package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

public class Give1000staminaCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 50000;
			entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.stamina = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
