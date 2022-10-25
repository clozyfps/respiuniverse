package net.mcreator.animecross.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;

public class PikaPikaRangedWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.PIKA_PIKA_PARTICLE_1.get()), x, y, z, 10, 0.1, 2, 0.1,
					0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.PIKA_PIKA_PARTICLE_2.get()), x, y, z, 5, 0.1, 2, 0.1, 0.1);
	}
}
