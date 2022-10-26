package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GryphonEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		degree = Math.toRadians(entity.getYRot());
		xRadius = 3;
		zRadius = 3;
		for (int index0 = 0; index0 < (int) (36); index0++) {
			x_pos = x + Math.cos(degree) * xRadius;
			y_pos = y + 1;
			z_pos = z + Math.sin(degree) * zRadius;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x_pos, y_pos, z_pos, 1, 0.1, 0.1, 0.1, 0);
			degree = degree + Math.toRadians(5);
		}
	}
}
