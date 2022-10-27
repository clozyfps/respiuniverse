
package net.mcreator.animecross.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class AllMightHairItem extends Item {

	public AllMightHairItem() {
		super(new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_OFATAB).stacksTo(1).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.3f)

						.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Eat this! (Requirement - Level 25"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);

		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AllMightHairPlayerFinishesUsingItemProcedure.execute();

		return retval;
	}

}
