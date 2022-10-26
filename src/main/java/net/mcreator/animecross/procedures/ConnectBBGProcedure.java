package net.mcreator.animecross.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.animecross.init.AnimecrossworkspaceModParticleTypes;
import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;
import net.mcreator.animecross.entity.KnotEntityEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ConnectBBGProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double T = 0;
		double Zo = 0;
		double Yo = 0;
		double Za = 0;
		double Xo = 0;
		double Ya = 0;
		double Xa = 0;
		double amountofentitiesallowed = 0;
		double xmath = 0;
		double ymath = 0;
		double zmath = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof KnotEntityEntity)) {
					if (!(entity == entityiterator) && amountofentitiesallowed < 1) {
						if (entityiterator instanceof LivingEntity _livEnt
								? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.ENTITY_D.get())
								: false) {
							amountofentitiesallowed = amountofentitiesallowed + 1;
							xmath = (entity.getX() - entityiterator.getX()) / 12;
							ymath = ((entity.getY() - 2) - (entityiterator.getY() - 1)) / 15;
							zmath = (entity.getZ() - entityiterator.getZ()) / 12;
							entityiterator.setDeltaMovement(new Vec3(xmath, ymath, zmath));
							Xo = entity.getX() - entityiterator.getX();
							Yo = entity.getY() - entityiterator.getY();
							Zo = entity.getZ() - entityiterator.getZ();
							if (Math.floor(entity.getX()) <= Math.floor(entityiterator.getX())) {
								if (Math.floor(entity.getX()) == Math.floor(entityiterator.getX())) {
									if (Math.floor(entity.getY()) == Math.floor(entityiterator.getY())) {
										if (Math.floor(entity.getZ()) <= Math.floor(entityiterator.getZ())) {
											Za = Math.floor(entity.getZ()) + 0.2;
											while (Za <= Math.floor(entityiterator.getZ())) {
												T = (Za - entity.getZ()) / Zo;
												Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
												Xa = entity.getX() + Xo * T;
												if (world instanceof ServerLevel _level)
													_level.sendParticles(
															(SimpleParticleType) (AnimecrossworkspaceModParticleTypes.STRINGPARTICLE.get()), Xa, Ya,
															Za, 1, 0, 0, 0, 0);
												Za = 0.1 + Za;
											}
										} else {
											Za = Math.floor(entityiterator.getZ()) + 0.2;
											while (Za <= Math.floor(entity.getZ())) {
												T = (Za - entity.getZ()) / Zo;
												Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
												Xa = entity.getX() + Xo * T;
												if (world instanceof ServerLevel _level)
													_level.sendParticles(
															(SimpleParticleType) (AnimecrossworkspaceModParticleTypes.STRINGPARTICLE.get()), Xa, Ya,
															Za, 1, 0, 0, 0, 0);
												Za = 0.1 + Za;
											}
										}
									} else {
										if (Math.floor(entity.getY()) <= Math.floor(entityiterator.getY())) {
											Ya = Math.floor(entity.getY()) + 0.2;
											while (Ya <= Math.floor(entityiterator.getY())) {
												T = (Ya - entity.getY()) / Yo;
												Xa = entity.getX() + Xo * T;
												Za = entity.getZ() + Zo * T;
												if (world instanceof ServerLevel _level)
													_level.sendParticles(
															(SimpleParticleType) (AnimecrossworkspaceModParticleTypes.STRINGPARTICLE.get()), Xa, Ya,
															Za, 1, 0, 0, 0, 0);
												Ya = 0.1 + Ya;
											}
										} else {
											Ya = Math.floor(entityiterator.getY()) + 0.2;
											while (Ya <= Math.floor(entity.getY())) {
												T = (Ya - entity.getY()) / Yo;
												Xa = entity.getX() + Xo * T;
												Za = entity.getZ() + Zo * T;
												if (world instanceof ServerLevel _level)
													_level.sendParticles(
															(SimpleParticleType) (AnimecrossworkspaceModParticleTypes.STRINGPARTICLE.get()), Xa, Ya,
															Za, 1, 0, 0, 0, 0);
												Ya = 0.1 + Ya;
											}
										}
									}
								} else {
									Xa = Math.floor(entity.getX()) + 0.2;
									while (Xa <= Math.floor(entityiterator.getX())) {
										T = (Xa - entity.getX()) / Xo;
										Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
										Za = entity.getZ() + Zo * T;
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.STRINGPARTICLE.get()), Xa,
													Ya, Za, 1, 0, 0, 0, 0);
										Xa = 0.1 + Xa;
									}
								}
							} else {
								Xa = entityiterator.getX() + 0.2;
								while (Xa < Math.floor(entity.getX())) {
									T = (Xa - entity.getX()) / Xo;
									Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
									Za = entity.getZ() + Zo * T;
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (AnimecrossworkspaceModParticleTypes.STRINGPARTICLE.get()), Xa, Ya,
												Za, 1, 0, 0, 0, 0);
									Xa = 0.1 + Xa;
								}
							}
						}
					}
				}
			}
		}
	}
}
