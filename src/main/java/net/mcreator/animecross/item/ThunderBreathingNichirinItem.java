
package net.mcreator.animecross.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ThunderBreathingNichirinItem extends SwordItem {
	public ThunderBreathingNichirinItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 13f;
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

				new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_DEMON_SLAYER));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\"R\" To Switch Between Thunder Moves."));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		ThunderBreathingNichirinEntitySwingsItemProcedure.execute(

		);
		return retval;
	}

}
