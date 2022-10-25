package net.mcreator.animecross.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class HolydragonWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.WATER.defaultBlockState()));
		world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.DIAMOND_BLOCK.defaultBlockState()));
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.BUBBLE, x, y, z, 50, 0.1, 3, 0.1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SPLASH, x, y, z, 90, 0.1, 3, 0.1, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 10, 0.1, 3, 0.1, 0.1);
	}
}
