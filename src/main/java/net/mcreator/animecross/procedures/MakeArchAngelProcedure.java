package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class MakeArchAngelProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).archangelchosen == false) {
			if (!((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "target");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()) == entity)) {
				if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).issupremedeity == true) {
					{
						boolean _setval = true;
						(new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "target");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.isarchangel = _setval;
							capability.syncPlayerVariables((new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "target");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()));
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Success!"), (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("You can no longer make anyone a Arch Angel"), (false));
				}
			} else if ((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "target");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()) == entity) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Cant make yourself a Arch Angel"), (false));
			}
		}
	}
}
