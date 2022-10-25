package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;

public class BlackslashsProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
