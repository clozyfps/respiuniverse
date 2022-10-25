package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.Entity;

public class PurgatoryFlameEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
