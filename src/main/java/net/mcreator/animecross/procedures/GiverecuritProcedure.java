package net.mcreator.animecross.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

import java.util.concurrent.atomic.AtomicReference;

public class GiverecuritProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Amount_Of_Item_Needed = 0;
		boolean ItemBought = false;
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).marinereputation == false) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.IRON_INGOT)) : false) {
				{
					AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _iitemhandlerref.set(capability));
					if (_iitemhandlerref.get() != null) {
						for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
							ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
							if (Items.IRON_INGOT == itemstackiterator.getItem()) {
								Amount_Of_Item_Needed = Amount_Of_Item_Needed + (itemstackiterator).getCount();
							}
							if (Amount_Of_Item_Needed > 41) {
								if (ItemBought == false) {
									ItemBought = true;
									if (entity instanceof Player _player) {
										ItemStack _stktoremove = new ItemStack(Items.IRON_INGOT);
										_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 40,
												_player.inventoryMenu.getCraftSlots());
									}
									if (entity instanceof Player _player)
										_player.closeContainer();
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.RECRUIT_FORM.get());
										_setstack.setCount(20);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
