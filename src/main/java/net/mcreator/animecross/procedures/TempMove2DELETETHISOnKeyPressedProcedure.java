package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

public class TempMove2DELETETHISOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double outcome = 0;
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).bombFruit == true) {
			if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power > 199) {
				if ((entity instanceof LivingEntity _livEnt
						? _livEnt.getHealth()
						: -1) > (79 * (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) / 100) {
					{
						double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power - 200;
						entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						_player.getAbilities().invulnerable = (true);
						_player.onUpdateAbilities();
					}
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
								- (75 * (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) / 100));
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, (float) ((74 * (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) / 100),
								Explosion.BlockInteraction.BREAK);
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
							if (entity instanceof Player _player) {
								_player.getAbilities().invulnerable = (false);
								_player.onUpdateAbilities();
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
				} else if (!((entity instanceof LivingEntity _livEnt
						? _livEnt.getHealth()
						: -1) > (74 * (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) / 100)) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("NOT ENOUGH HP! must have 80% or more of total hp"), (false));
				}
			}
		}
	}
}
