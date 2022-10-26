
package net.mcreator.animecross.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class HollowPurpleAbilityItem extends Item {

	public HollowPurpleAbilityItem() {
		super(new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_JUJUTSU_KAISEN).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Power: 210 Level: 21 - Shoot ball of energy"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HollowPurpleAbilityRightclickedProcedure.execute(entity, itemstack);
		return ar;
	}

}
