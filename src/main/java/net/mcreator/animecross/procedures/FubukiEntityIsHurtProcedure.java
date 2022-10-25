package net.mcreator.animecross.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class FubukiEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.1) {
				degree = Math.toRadians(entity.getYRot());
				xRadius = 3;
				zRadius = 3;
				for (int index0 = 0; index0 < (int) (36); index0++) {
					x_pos = x + Math.cos(degree) * xRadius;
					y_pos = y + 1;
					z_pos = z + Math.sin(degree) * zRadius;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x_pos, y_pos, z_pos, 10, 0.1, 0.1, 0.1, 0);
					degree = degree + Math.toRadians(10);
				}
				degree = Math.toRadians(entity.getYRot());
				xRadius = 3;
				zRadius = 3;
				for (int index1 = 0; index1 < (int) (36); index1++) {
					x_pos = x + Math.cos(degree) * xRadius;
					y_pos = y + 2;
					z_pos = z + Math.sin(degree) * zRadius;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, x_pos, y_pos, z_pos, 10, 0.1, 0.1, 0.1, 0);
					degree = degree + Math.toRadians(10);
				}
				degree = Math.toRadians(entity.getYRot());
				xRadius = 3;
				zRadius = 3;
				for (int index2 = 0; index2 < (int) (36); index2++) {
					x_pos = x + Math.cos(degree) * xRadius;
					y_pos = y + 3;
					z_pos = z + Math.sin(degree) * zRadius;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x_pos, y_pos, z_pos, 10, 0.1, 0.1, 0.1, 0);
					degree = degree + Math.toRadians(10);
				}
				degree = Math.toRadians(entity.getYRot());
				xRadius = 3;
				zRadius = 3;
				for (int index3 = 0; index3 < (int) (36); index3++) {
					x_pos = x + Math.cos(degree) * xRadius;
					y_pos = y + 4;
					z_pos = z + Math.sin(degree) * zRadius;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x_pos, y_pos, z_pos, 10, 0.1, 0.1, 0.1, 0);
					degree = degree + Math.toRadians(10);
				}
				degree = Math.toRadians(entity.getYRot());
				xRadius = 2;
				zRadius = 2;
				for (int index4 = 0; index4 < (int) (36); index4++) {
					x_pos = x + Math.cos(degree) * xRadius;
					y_pos = y + 4;
					z_pos = z + Math.sin(degree) * zRadius;
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x_pos, y_pos, z_pos, 10, 0.1, 0.1, 0.1, 0);
					degree = degree + Math.toRadians(10);
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						entityiterator.hurt(DamageSource.GENERIC, 11);
					}
				}
			}
		}
	}
}
