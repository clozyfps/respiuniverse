package net.mcreator.animecross.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

public class GivesaitamacouponProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(AnimecrossworkspaceModItems.TWENTY_PERCENT_OFF_COUPON.get()))
				: false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(AnimecrossworkspaceModItems.TWENTY_PERCENT_OFF_COUPON.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(
						"Saitama: Thankss! Now I can get that new TV! Oh, And I will train you! To get stronger you must run and kill things. The more you do this at some point you will get an achievement and be strong! Once you get this press \"r\" to switch between moves while you have your hand out!"),
						(false));
			{
				boolean _setval = true;
				entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.talkingtosaitama = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
