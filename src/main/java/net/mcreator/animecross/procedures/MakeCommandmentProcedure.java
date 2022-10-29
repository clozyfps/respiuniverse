package net.mcreator.animecross.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class MakeCommandmentProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (AnimecrossworkspaceModVariables.WorldVariables.get(world).amountofcommandmentschosen < 1) {
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
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).isdemonking == true) {
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
							capability.isTenCommandment = _setval;
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
					AnimecrossworkspaceModVariables.WorldVariables.get(world).amountofcommandmentschosen = 1;
					AnimecrossworkspaceModVariables.WorldVariables.get(world).syncData(world);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Success!"), (false));
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("You can no longer make anyone a commandment"), (false));
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
					_player.displayClientMessage(new TextComponent("Cant make yourself a commandment"), (false));
			}
		}
	}
}
