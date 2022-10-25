
package net.mcreator.animecross.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.animecross.procedures.ChimeraShadowGardenRightclickedProcedure;
import net.mcreator.animecross.init.AnimecrossworkspaceModTabs;

import java.util.List;

public class ChimeraShadowGardenItem extends Item {
	public ChimeraShadowGardenItem() {
		super(new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_JUJUTSU_KAISEN).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Power: 200 Level:15 - Summon dark fog to trap your opponent"));
		list.add(new TextComponent("and yourself."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ChimeraShadowGardenRightclickedProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}
