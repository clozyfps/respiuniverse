package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

public class CapedbaldifightingstyleselectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Caped Baldi";
			entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fightingstyle = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
