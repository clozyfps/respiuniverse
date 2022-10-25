package net.mcreator.animecross.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;

public class WoodthrowhanamiWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.CURSEDENERGY.get()), x, y, z, 5, 0.1, 2, 0.1, 1);
		world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.SPRUCE_LOG.defaultBlockState()));
	}
}
