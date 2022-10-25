
package net.mcreator.animecross.client.gui;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class PowershowOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.level;
				_x = entity.getX();
				_y = entity.getY();
				_z = entity.getZ();
			}
			Level world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			if (true) {
				Minecraft.getInstance().font.draw(event.getMatrixStack(),
						"" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).power) + "",
						posX + -214, posY + 104, -1);
				Minecraft.getInstance().font.draw(event.getMatrixStack(), "/", posX + -177, posY + 105, -12829636);
				Minecraft.getInstance().font.draw(event.getMatrixStack(),
						"" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_power) + "",
						posX + -159, posY + 105, -1);
				Minecraft.getInstance().font.draw(event.getMatrixStack(),
						"" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).stamina) + "",
						posX + -212, posY + 86, -1);
				Minecraft.getInstance().font.draw(event.getMatrixStack(), "/", posX + -183, posY + 86, -1);
				Minecraft.getInstance().font
						.draw(event.getMatrixStack(),
								"" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_stamina) + "",
								posX + -169, posY + 87, -1);
				Minecraft.getInstance().font.draw(event.getMatrixStack(), "Stamina", posX + -151, posY + 76, -1);
				Minecraft.getInstance().font.draw(event.getMatrixStack(), "Power", posX + -146, posY + 97, -1);
			}
		}
	}
}
