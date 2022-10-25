package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;
import net.mcreator.animecross.init.AnimecrossworkspaceModEntities;
import net.mcreator.animecross.entity.CruelsunproEntity;

public class EscanorEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.1) {
				if ((world instanceof Level _lvl && _lvl.isDay()) == true) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level;
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new CruelsunproEntity(AnimecrossworkspaceModEntities.CRUELSUNPRO.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setSecondsOnFire(100);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 25, 1);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				} else if ((world instanceof Level _lvl && _lvl.isDay()) == false) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Message"), (false));
				}
			}
			if (Math.random() < 0.1) {
				if ((world instanceof Level _lvl && _lvl.isDay()) == true) {
					for (int index0 = 0; index0 < (int) (25); index0++) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.SUN_PARTICLE.get()), (entity.getX()),
									(entity.getY()), (entity.getZ()), 50, 1, 5, 1, 1);
					}
					if (entity instanceof Player _player) {
						_player.getAbilities().invulnerable = (true);
						_player.onUpdateAbilities();
					}
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
					}.start(world, 100);
				} else if ((world instanceof Level _lvl && _lvl.isDay()) == false) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Message"), (false));
				}
			}
			if (Math.random() < 0.1) {
				if ((world instanceof Level _lvl && _lvl.isDay()) == true) {
					for (int index1 = 0; index1 < (int) (25); index1++) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.SUN_PARTICLE.get()), (entity.getX()),
									(entity.getY()), (entity.getZ()), 50, 1, 5, 1, 1);
					}
				} else if ((world instanceof Level _lvl && _lvl.isDay()) == false) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Message"), (false));
				}
			}
		}
	}
}
