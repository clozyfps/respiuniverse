
package net.mcreator.animecross.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.animecross.world.inventory.MainInfoMenu;
import net.mcreator.animecross.network.MainInfoButtonMessage;
import net.mcreator.animecross.network.AnimecrossworkspaceModVariables;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MainInfoScreen extends AbstractContainerScreen<MainInfoMenu> {
	private final static HashMap<String, Object> guistate = MainInfoMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MainInfoScreen(MainInfoMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/animecrossingv2.png"));
		this.blit(ms, this.leftPos + -17, this.topPos + -30, 0, 0, 219, 229, 219, 229);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Level:", -8, 24, -16128);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).level) + "", 23, 24, -16640);
		this.font.draw(poseStack, "XP:", -8, 37, -16640);
		this.font.draw(poseStack, "/50", 26, 38, -16640);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).exp) + "", 8, 37, -16640);
		this.font.draw(poseStack, "User:", -8, 77, -16640);
		this.font.draw(poseStack, "" + ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).user_name) + "", 19, 78, -16640);
		this.font.draw(poseStack, "Health", 129, 25, -16640);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).Healthstat) + "", 165, 25, -16640);
		this.font.draw(poseStack, "SP:", -8, 62, -16640);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).Stat_Points) + "", 10, 62, -16640);
		this.font.draw(poseStack, "Strength", 129, 43, -16640);
		this.font.draw(poseStack, "Speed", 129, 62, -16640);
		this.font.draw(poseStack, "Power", 129, 84, -16640);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_power) + "", 159, 84, -16640);
		this.font.draw(poseStack, "Fighting Style:", -8, 11, -16640);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).strengthstat) + "", 174, 43, -16640);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).speedstat) + "", 162, 62, -16640);
		this.font.draw(poseStack, "Stamina", 130, 106, -16640);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).max_stamina) + "", 172, 106, -16640);
		this.font.draw(poseStack, "" + ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).fightingstyle) + "", 72, 11, -16640);
		this.font.draw(poseStack, "Rank:", -9, 92, -17664);
		this.font.draw(poseStack, "Bounty:", -9, 108, -17664);
		this.font.draw(poseStack, "" + ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).Rank) + "", 18, 92, -17664);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(AnimecrossworkspaceModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new AnimecrossworkspaceModVariables.PlayerVariables())).Bounty) + "", 28, 108, -17664);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 203, this.topPos + 20, 30, 20, new TextComponent("+"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new MainInfoButtonMessage(0, x, y, z));
				MainInfoButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -7, this.topPos + 166, 61, 20, new TextComponent("Mastery"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new MainInfoButtonMessage(1, x, y, z));
				MainInfoButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 203, this.topPos + 38, 30, 20, new TextComponent("+"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new MainInfoButtonMessage(2, x, y, z));
				MainInfoButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 203, this.topPos + 58, 30, 20, new TextComponent("+"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new MainInfoButtonMessage(3, x, y, z));
				MainInfoButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 203, this.topPos + 78, 30, 20, new TextComponent("+"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new MainInfoButtonMessage(4, x, y, z));
				MainInfoButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 203, this.topPos + 100, 30, 20, new TextComponent("+"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new MainInfoButtonMessage(5, x, y, z));
				MainInfoButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 139, this.topPos + 170, 55, 20, new TextComponent("     >"), e -> {
		}));
	}
}
