package net.mcreator.animecross.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.init.AnimecrossworkspaceModMobEffects;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class StringSwingOnKeyReleasedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.WEB_SWINGING.get()) : false) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(50 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof LivingEntity _livEnt
								? _livEnt.hasEffect(AnimecrossworkspaceModMobEffects.WEB_SWINGING.get())
								: false) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.removeEffect(AnimecrossworkspaceModMobEffects.WEB_SWINGING.get());
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(AnimecrossworkspaceModMobEffects.WEB_SWINGING.get());
							if (!entityiterator.level.isClientSide())
								entityiterator.discard();
						}
					}
				}
			}
		}
	}
}
