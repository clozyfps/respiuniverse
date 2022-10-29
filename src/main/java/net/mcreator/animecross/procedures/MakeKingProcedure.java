package net.mcreator.animecross.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MakeKingProcedure {
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
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).level == 100
				|| (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).level > 100) {
			if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).goddess == true
					&& (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).demonrace == true) {
				if (AnimecrossworkspaceModVariables.WorldVariables.get(world).supremedeitychosen == false) {
					{
						boolean _setval = true;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.issupremedeity = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					AnimecrossworkspaceModVariables.WorldVariables.get(world).supremedeitychosen = true;
					AnimecrossworkspaceModVariables.WorldVariables.get(world).syncData(world);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Youve become the SUPREME DEITY"), (false));
					{
						double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_power + 1000;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.max_power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_stamina + 1000;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.max_stamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (AnimecrossworkspaceModVariables.WorldVariables.get(world).supremedeitychosen == true
						&& AnimecrossworkspaceModVariables.WorldVariables.get(world).demonkingchosen == false) {
					{
						boolean _setval = true;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.isdemonking = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					AnimecrossworkspaceModVariables.WorldVariables.get(world).demonkingchosen = true;
					AnimecrossworkspaceModVariables.WorldVariables.get(world).syncData(world);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Youve become the DEMON KING"), (false));
					{
						double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_power + 1000;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.max_power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_stamina + 1000;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.max_stamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).goddess == true
					&& (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).demonrace == false) {
				if (AnimecrossworkspaceModVariables.WorldVariables.get(world).supremedeitychosen == false) {
					{
						boolean _setval = true;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.issupremedeity = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					AnimecrossworkspaceModVariables.WorldVariables.get(world).supremedeitychosen = true;
					AnimecrossworkspaceModVariables.WorldVariables.get(world).syncData(world);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Youve become the SUPREME DEITY"), (false));
					{
						double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_power + 1000;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.max_power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_stamina + 1000;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.max_stamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).goddess == false
					&& (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).demonrace == true) {
				if (AnimecrossworkspaceModVariables.WorldVariables.get(world).demonkingchosen == false) {
					{
						boolean _setval = true;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.isdemonking = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					AnimecrossworkspaceModVariables.WorldVariables.get(world).demonkingchosen = true;
					AnimecrossworkspaceModVariables.WorldVariables.get(world).syncData(world);
					{
						double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_power + 1000;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.max_power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_stamina + 1000;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.max_stamina = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Youve become the DEMON KING"), (false));
				}
			}
		}
	}
}
