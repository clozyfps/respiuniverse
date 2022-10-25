package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

import java.util.Random;

public class RollProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double number_pick = 0;
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).rollsleft > 0) {
			{
				double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).rollsleft - 1;
				entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.rollsleft = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			number_pick = Mth.nextInt(new Random(), 1, 7);
			if (number_pick <= 22) {
				if (number_pick == 1) {
					{
						String _setval = "Goddess";
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentrace = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (number_pick == 2) {
					{
						String _setval = "Demon";
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentrace = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (number_pick == 3) {
					{
						String _setval = "Esper";
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentrace = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (number_pick == 4) {
					{
						String _setval = "3rd Gen Pyro";
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentrace = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (number_pick == 5) {
					{
						String _setval = "Evil Spirit";
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentrace = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (number_pick == 6) {
					{
						String _setval = "Human";
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentrace = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (number_pick == 7) {
					{
						String _setval = "Saiyan";
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentrace = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
