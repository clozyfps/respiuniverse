package net.mcreator.animecross.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;

public class WoodthrowhanamiProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 1, z + 1), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 2, y + 1, z + 2), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 3, y + 1, z + 3), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 4, y + 1, z + 4), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 5, y + 1, z + 5), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 1, z - 1), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 2, y + 1, z - 2), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 3, y + 1, z - 3), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 4, y + 1, z - 4), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 5, y + 1, z - 5), Blocks.OAK_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 5, y + 2, z - 5), Blocks.OAK_LOG.defaultBlockState(), 3);
		for (int index0 = 0; index0 < (int) (35); index0++) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.BREAK);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.CURSEDENERGY.get()), x, y, z, 50, 3, 3, 3, 1);
		}
	}
}
