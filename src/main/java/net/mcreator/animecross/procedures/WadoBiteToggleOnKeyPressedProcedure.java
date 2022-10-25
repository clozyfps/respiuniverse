package net.mcreator.animecross.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

public class WadoBiteToggleOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == AnimecrossworkspaceModItems.WADO_ICHIMONJI.get()) {
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(3, new ItemStack(AnimecrossworkspaceModItems.WADO_BITE_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnimecrossworkspaceModItems.WADO_BITE_HELMET.get()));
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(AnimecrossworkspaceModItems.WADO_ICHIMONJI.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == AnimecrossworkspaceModItems.WADO_BITE_HELMET.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.WADO_ICHIMONJI.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
				}
			}
		}
	}
}
