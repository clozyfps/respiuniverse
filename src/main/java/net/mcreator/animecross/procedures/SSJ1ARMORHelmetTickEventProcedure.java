package net.mcreator.animecross.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.mcreator.animecross.AnimecrossworkspaceMod;

public class SSJ1ARMORHelmetTickEventProcedure {
	public static void execute(ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack) != 0) {
			AnimecrossworkspaceMod.LOGGER.info("Message");
		} else {
			(itemstack).enchant(Enchantments.BINDING_CURSE, 1);
			(itemstack).enchant(Enchantments.VANISHING_CURSE, 1);
		}
	}
}
