package net.mcreator.animecross.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;

public class MoonBreathingNichirinEntitySwingsItemProcedure {
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
				_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.MOON_BREATHING_PARTICLE.get()), x_pos, y_pos, z_pos, 2,
						0.1, 0.1, 0.1, 0);
			degree = degree + Math.toRadians(5);
		}
		if (Math.random() < 0.7) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = -1;
			zRadius = 3;
			for (int index1 = 0; index1 < (int) (36); index1++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 1;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.MOON_BREATHING_PARTICLE.get()), x_pos, y_pos,
							z_pos, 2, 0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(5);
			}
		}
		if (Math.random() < 0.7) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = 2;
			zRadius = 2;
			for (int index2 = 0; index2 < (int) (36); index2++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 1;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.MOON_BREATHING_PARTICLE.get()), x_pos, y_pos,
							z_pos, 2, 0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(5);
			}
		}
		if (Math.random() < 0.7) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = 5;
			zRadius = 5;
			for (int index3 = 0; index3 < (int) (36); index3++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 1;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.MOON_BREATHING_PARTICLE.get()), x_pos, y_pos,
							z_pos, 2, 0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(5);
			}
		}
		if (Math.random() < 0.7) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = -2;
			zRadius = 0;
			for (int index4 = 0; index4 < (int) (36); index4++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 2;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.MOON_BREATHING_PARTICLE.get()), x_pos, y_pos,
							z_pos, 2, 0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(5);
			}
		}
		if (Math.random() < 0.7) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = 1;
			zRadius = 1;
			for (int index5 = 0; index5 < (int) (36); index5++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 1;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.MOON_BREATHING_PARTICLE.get()), x_pos, y_pos,
							z_pos, 2, 0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(5);
			}
		}
		if (Math.random() < 0.7) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = 2;
			zRadius = 2;
			for (int index6 = 0; index6 < (int) (36); index6++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 3.1;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.MOON_BREATHING_PARTICLE.get()), x_pos, y_pos,
							z_pos, 2, 0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(5);
			}
		}
	}
}
