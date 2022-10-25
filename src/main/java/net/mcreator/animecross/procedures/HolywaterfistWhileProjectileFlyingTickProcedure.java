package net.mcreator.animecross.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class HolywaterfistWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.WATER.defaultBlockState()));
	}
}
