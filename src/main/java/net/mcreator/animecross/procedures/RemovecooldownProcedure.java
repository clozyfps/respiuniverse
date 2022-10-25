package net.mcreator.animecross.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.animecross.init.AnimecrossworkspaceModItems;

public class RemovecooldownProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.DRAGON_FIRE_TECHNIQUE.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.FIRE_BALL_JUTSU.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.KOKETSU_ARROW_AWAKENING_ABILITY.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.SMACK_DOWN_ARROW_ABILITY.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.EXPLODING_BLOOD_BOMB.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.EXPLOSIVE_CLAWS.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.THE_WORLD.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.GUM_GUM_GATLING.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.GUM_GUM_PISTOL_ITEM.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.TORNADO_AREA.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.WIND_BOMB.get(), 0);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(AnimecrossworkspaceModItems.WATER_NICHIRIN.get(), 0);
	}
}
