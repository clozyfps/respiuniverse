
package net.mcreator.animecross.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class StringFruitItem extends Item {

	public StringFruitItem() {
		super(new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_ONE_PIECE).stacksTo(64).fireResistant().rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(-5).saturationMod(-0.2f).alwaysEat()

						.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Eating this fruit will grant you string powers!"));
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		StringFruitOnPlayerStoppedUsingProcedure.execute(entity);
	}

}
