package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

public class GivepyriProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double number_pick = 0;
		{
			String _setval = "Pyrokenesis";
			entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.tele = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
