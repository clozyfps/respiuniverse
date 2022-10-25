package net.mcreator.animecross.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;

public class ExlodingBloodBombWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLOODPARTICLENEZUKO.get()), x, y, z, 10, 0.1, 3, 0.1, 1);
	}
}
