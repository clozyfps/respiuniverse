package net.mcreator.animecross.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;

public class WoodthrowhanamiProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y - 1, z), Blocks.SPRUCE_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z), Blocks.SPRUCE_LOG.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.SPRUCE_LOG.defaultBlockState(), 3);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.CURSEDENERGY.get()), x, y, z, 20, 0.1, 2, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 2, 0.1, 2, 0.1, 1);
	}
}
