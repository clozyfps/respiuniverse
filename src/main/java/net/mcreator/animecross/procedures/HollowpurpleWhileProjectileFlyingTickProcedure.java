package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HollowpurpleWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLUEPARTICLE.get()), x, y, z, 30, 1, 2, 1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.PURPLE_PARTICLE.get()), x, y, z, 10, 1, 2, 1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.REDDEMONPARTICLE.get()), x, y, z, 30, 1, 2, 1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLASH, x, y, z, 1, 1, 2, 1, 5);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, 1, 2, 1, 0.1);
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
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.DESTROY);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 10);
	}
}
