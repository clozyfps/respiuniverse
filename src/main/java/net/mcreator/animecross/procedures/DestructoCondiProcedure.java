package net.mcreator.animecross.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

public class DestructoCondiProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(AnimecrossworkspaceModItems.DESTRUCTO_DISK_ITEM.get()))
				: false) {
			return false;
		}
		return true;
	}
}
