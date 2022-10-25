package net.mcreator.animecross.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

import java.util.Random;
import java.util.Iterator;

public class GrimoireGiverRightClickedOnEntityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		double number_pick = 0;
		if ((sourceentity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).alreadytalkedtogrimoireguy == false) {
			number_pick = Mth.nextInt(new Random(), 1, 3);
			if (number_pick <= 22) {
				if (number_pick == 1 && (sourceentity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).hasmana == true) {
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.FIRE_GRIMOIRE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(
								new TextComponent("You have the fire grimoire. Use it wisely young one, for it could cause great destruction."),
								(false));
				}
				if (number_pick == 2 && (sourceentity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).hasmana == false) {
					if (sourceentity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("animecrossworkspace:antimagic"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.ANTI_MAGIC_GRIMOIRE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent(
								"You have gained the power of a deeper being. A dark ominous presence has entered you. You have the anti-magic grimoire."),
								(false));
				}
				if (number_pick == 3 && (sourceentity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).hasmana == true) {
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.WATER_GRIMOIRE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("You have the water grimoire."), (false));
				}
			}
			{
				boolean _setval = true;
				sourceentity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.alreadytalkedtogrimoireguy = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
