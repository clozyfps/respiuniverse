package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class TatsumakiEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.1) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							entityiterator.setDeltaMovement(new Vec3(0, (entityiterator.getDeltaMovement().y() + 3), 0));
							for (int index0 = 0; index0 < (int) (20); index0++) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, y, z, 200, 3, 3, 3, 1);
								if (world instanceof Level _level && !_level.isClientSide())
									_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.BREAK);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, 3, 3, 3, 1);
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, y, z, 200, 3, 3, 3, 1);
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
									entityiterator.setDeltaMovement(new Vec3(0, (entityiterator.getDeltaMovement().y() - 20), 0));
									if (world instanceof Level _level && !_level.isClientSide())
										_level.explode(null, x, y, z, 8, Explosion.BlockInteraction.DESTROY);
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, y, z, 200, 3, 3, 3, 1);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 20);
						}
					}
				}
				loop = 20;
				particleAmount = 200;
				xRadius = 20;
				zRadius = 20;
				while (loop < particleAmount) {
					world.addParticle(ParticleTypes.ENCHANTED_HIT, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y,
							(z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
					loop = loop + 20;
				}
			}
		}
	}
}
