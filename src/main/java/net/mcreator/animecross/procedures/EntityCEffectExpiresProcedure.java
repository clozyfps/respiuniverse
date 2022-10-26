package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

public class EntityCEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SelectingTarget = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
