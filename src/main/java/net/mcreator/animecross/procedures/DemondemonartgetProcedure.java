package net.mcreator.animecross.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class DemondemonartgetProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		double number_pick = 0;
		if (((sourceentity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).hasdemonart == false) == ((sourceentity
						.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).isdemon == true)) {
			if (Math.random() < 0.1) {
				if (Math.random() < 0.1) {
					number_pick = Mth.nextInt(new Random(), 1, 4);
					if (number_pick <= 22) {
						{
							boolean _setval = true;
							sourceentity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.hasdemonart = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						if (number_pick == 1) {
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.SMACK_DOWN_ARROW_ABILITY.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.KOKETSU_ARROW_AWAKENING_ABILITY.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
						if (number_pick == 2) {
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.EXPLOSIVE_CLAWS.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.EXPLODING_BLOOD_BOMB.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
						if (number_pick == 3) {
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.FLESH_KAMA.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
						if (number_pick == 4) {
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.COMPASS_NEEDLE.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.DISORDER.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.AIR_TYPE.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (sourceentity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.ANNIHILATION_TYPE.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				}
			}
		}
	}
}
