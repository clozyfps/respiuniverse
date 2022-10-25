package net.mcreator.animecross.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;

public class YoruswingWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.YORUSWORDBLADESWING.get()), x, y, z, 1, 0.1, 4, 0.1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.YORUSWORDBLADESWING.get()), x, y, z, 1, 0.1, 3, 0.1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.YORUSWORDBLADESWING.get()), x, y, z, 1, 0.1, 2, 0.1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.YORUSWORDBLADESWING.get()), x, y, z, 1, 0.1, 1, 0.1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, y, z, 1, 0.1, 4, 0.1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, y, z, 1, 0.1, 3, 0.1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, y, z, 1, 0.1, 2, 0.1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, y, z, 1, 0.1, 1, 0.1, 0.1);
	}
}
