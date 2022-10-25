package net.mcreator.animecross.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

import java.util.Random;

public class RequiemArrowRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double number_pick = 0;
		number_pick = Mth.nextInt(new Random(), 1, 2);
		if (number_pick <= 22) {
			if (number_pick == 1) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Obtained The World!"), (false));
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.THE_WORLD_STAN_CHESTPLATE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.THE_WORLD.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (number_pick == 2) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Failed."), (false));
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(AnimecrossworkspaceModItems.REQUIEM_ARROW.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
