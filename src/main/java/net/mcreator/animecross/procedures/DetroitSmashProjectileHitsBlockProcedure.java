package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DetroitSmashProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.DESTROY);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.ONE_FOR_ALL_PARTICLE.get()), x, y, z, 50, 1, 4, 1, 0.1);
	}
}
