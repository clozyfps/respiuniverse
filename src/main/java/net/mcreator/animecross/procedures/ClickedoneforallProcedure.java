package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ClickedoneforallProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "One For All";
			entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fightingstyle = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
