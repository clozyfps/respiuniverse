package net.mcreator.animecross.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;
import net.mcreator.animecross.init.AnimecrossworkspaceModBlocks;

public class PurgatoryflamemoveProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y + 1, z), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 1, z + 1), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 2, y + 1, z + 2), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 3, y + 1, z + 3), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 4, y + 1, z + 4), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 5, y + 1, z + 5), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 5, y + 1, z - 5), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 4, y + 1, z - 4), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 3, y + 1, z - 3), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 2, y + 1, z - 2), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 1, z - 1), AnimecrossworkspaceModBlocks.PURGATORY_FLAME.get().defaultBlockState(), 3);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 100, 3, 3, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.PURGATORY_FLAMES.get()), x, y, z, 100, 3, 3, 3, 1);
	}
}
