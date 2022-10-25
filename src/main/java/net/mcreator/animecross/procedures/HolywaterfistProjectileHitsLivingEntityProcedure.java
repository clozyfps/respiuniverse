package net.mcreator.animecross.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class HolywaterfistProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FISHING, x, y, z, 30, 0.1, 5, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FISHING, x, y, z, 30, 0.1, 4, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FISHING, x, y, z, 30, 0.1, 3, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FISHING, x, y, z, 30, 0.1, 2, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FISHING, x, y, z, 30, 0.1, 1, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 30, 0.1, 1, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 30, 0.1, 1, 0.1, 1);
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z + 1), Blocks.WATER.defaultBlockState(), 3);
	}
}
