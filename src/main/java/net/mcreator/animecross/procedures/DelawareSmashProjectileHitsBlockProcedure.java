package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DelawareSmashProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 50, 3, 3, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.ONE_FOR_ALL_PARTICLE.get()), x, y, z, 50, 3, 3, 3, 1);
	}
}
