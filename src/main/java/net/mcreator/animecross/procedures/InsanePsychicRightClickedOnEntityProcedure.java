package net.mcreator.animecross.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

public class InsanePsychicRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(AnimecrossworkspaceModItems.SALT_BOTTLE.get()))
				: false) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("The salt doesnt work? Must be a glitch in the system yeah! :)"), (false));
		} else {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("This dang landlord.. YOU GOTTA BE JOK- oh hey!"), (false));
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Im a psychic if you didnt realize lol. "), (false));
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent(
								"Would you like some salt? Yes? Ok here take this. It can kill evil spirits! *Breaks act* B- BAHAHAHAH oh sorry. Bye!"),
								(false));
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 40);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (sourceentity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(AnimecrossworkspaceModItems.SALT_BOTTLE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 60);
		}
	}
}
