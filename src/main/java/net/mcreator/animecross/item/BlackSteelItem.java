
package net.mcreator.animecross.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.animecross.init.AnimecrossworkspaceModTabs;

import java.util.List;

public class BlackSteelItem extends Item {
	public BlackSteelItem() {
		super(new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_GOBLIN_SLAYER).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Used to craft goblin slayer armor and steel weapons."));
	}
}
