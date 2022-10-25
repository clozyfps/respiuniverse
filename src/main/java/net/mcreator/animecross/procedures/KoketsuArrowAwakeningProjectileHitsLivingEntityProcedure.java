package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

public class KoketsuArrowAwakeningProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == AnimecrossworkspaceModItems.KOKETSU_ARROW_AWAKENING_ABILITY.get()) == false) {
			entity.setDeltaMovement(
					new Vec3((entity.getDeltaMovement().x() + 5), (entity.getDeltaMovement().y() + 1.5), (entity.getDeltaMovement().z())));
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 2, Explosion.BlockInteraction.BREAK);
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
					entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() - 5), (entity.getDeltaMovement().z() + 5)));
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 2, Explosion.BlockInteraction.BREAK);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 10);
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
					entity.setDeltaMovement(
							new Vec3((entity.getDeltaMovement().x() + 5), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + 5)));
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 2, Explosion.BlockInteraction.BREAK);
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
					entity.setDeltaMovement(
							new Vec3((entity.getDeltaMovement().x() + 2), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + 2)));
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 2, Explosion.BlockInteraction.BREAK);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 30);
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
					entity.setDeltaMovement(
							new Vec3((entity.getDeltaMovement().x() + 2), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + 2)));
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 2, Explosion.BlockInteraction.BREAK);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 40);
		}
	}
}
