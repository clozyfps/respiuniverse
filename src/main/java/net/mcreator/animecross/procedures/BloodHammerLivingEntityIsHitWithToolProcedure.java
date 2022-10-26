package net.mcreator.animecross.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class BloodHammerLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 0, 1, 0);
	}
}
