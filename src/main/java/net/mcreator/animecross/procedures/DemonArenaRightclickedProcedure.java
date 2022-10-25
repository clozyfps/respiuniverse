package net.mcreator.animecross.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;
import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class DemonArenaRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double loop = 0;
		double particleAmount = 0;
		if ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power > 400
				&& (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).level >= 5) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getItem() == AnimecrossworkspaceModItems.DEMON_ARENA.get()) == false) {
						for (int index0 = 0; index0 < (int) (36); index0++) {
							entityiterator.hurt(DamageSource.GENERIC, 1);
						}
					}
				}
			}
			{
				double _setval = (entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power - 400;
				entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 300);
			degree = Math.toRadians(entity.getYRot());
			xRadius = 10;
			zRadius = 10;
			for (int index1 = 0; index1 < (int) (36); index1++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 1;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.REDDEMONPARTICLE.get()), x_pos, y_pos, z_pos, 10,
							0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(10);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = 10;
			zRadius = 10;
			for (int index2 = 0; index2 < (int) (36); index2++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 2;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLUEPARTICLE.get()), x_pos, y_pos, z_pos, 10, 0.1,
							0.1, 0.1, 0);
				degree = degree + Math.toRadians(10);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = 10;
			zRadius = 10;
			for (int index3 = 0; index3 < (int) (36); index3++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 3;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.REDDEMONPARTICLE.get()), x_pos, y_pos, z_pos, 10,
							0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(10);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = 10;
			zRadius = 10;
			for (int index4 = 0; index4 < (int) (36); index4++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 4;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLOODPARTICLENEZUKO.get()), x_pos, y_pos, z_pos, 5,
							0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(10);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = 10;
			zRadius = 10;
			for (int index5 = 0; index5 < (int) (36); index5++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 5;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.REDDEMONPARTICLE.get()), x_pos, y_pos, z_pos, 10,
							0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(10);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = 9;
			zRadius = 9;
			for (int index6 = 0; index6 < (int) (36); index6++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 5;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x_pos, y_pos, z_pos, 10, 0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(10);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = 8;
			zRadius = 8;
			for (int index7 = 0; index7 < (int) (36); index7++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 4;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLOODPARTICLENEZUKO.get()), x_pos, y_pos, z_pos,
							10, 0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(10);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = 7;
			zRadius = 7;
			for (int index8 = 0; index8 < (int) (36); index8++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 3;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLUEPARTICLE.get()), x_pos, y_pos, z_pos, 10, 0.1,
							0.1, 0.1, 0);
				degree = degree + Math.toRadians(10);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = 6;
			zRadius = 6;
			for (int index9 = 0; index9 < (int) (36); index9++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 2;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLUEPARTICLE.get()), x_pos, y_pos, z_pos, 10, 0.1,
							0.1, 0.1, 0);
				degree = degree + Math.toRadians(10);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = 5;
			zRadius = 5;
			for (int index10 = 0; index10 < (int) (36); index10++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 1;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.BLOODPARTICLENEZUKO.get()), x_pos, y_pos, z_pos,
							10, 0.1, 0.1, 0.1, 0);
				degree = degree + Math.toRadians(10);
			}
		}
	}
}
