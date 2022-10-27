
package net.mcreator.animecross.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SwordOfDaiItem extends SwordItem {
	public SwordOfDaiItem() {
		super(new Tier() {
			public int getUses() {
				return 99999;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 15f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				3, 1f,

				new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_DRAGON_QUEST));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Sword of dai!"));
	}

}
