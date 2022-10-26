package net.mcreator.animecross.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ChokedDespawnKNOTEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof KnotEntityEntity) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
