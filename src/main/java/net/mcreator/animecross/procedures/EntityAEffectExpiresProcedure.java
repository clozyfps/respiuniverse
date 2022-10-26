package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.entity.KnotEntityEntity;

public class EntityAEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof KnotEntityEntity) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
