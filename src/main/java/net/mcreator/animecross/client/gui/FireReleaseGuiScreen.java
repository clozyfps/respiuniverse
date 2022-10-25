
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

import net.mcreator.animecross.world.inventory.FireReleaseGuiMenu;
import net.mcreator.animecross.network.FireReleaseGuiButtonMessage;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class FireReleaseGuiScreen extends AbstractContainerScreen<FireReleaseGuiMenu> {
	private final static HashMap<String, Object> guistate = FireReleaseGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FireReleaseGuiScreen(FireReleaseGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecrossworkspace:textures/screens/fire_release_gui.png");

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
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		this.font.draw(poseStack, "|", -167, -7, -1);
		this.font.draw(poseStack, "12 SP", -177, 10, -1);
		this.font.draw(poseStack, "\\", -142, 22, -1);
		this.font.draw(poseStack, "|", -82, 48, -1);
		this.font.draw(poseStack, "25 SP", -91, 63, -1);
		this.font.draw(poseStack, "\\", -59, 69, -1);
		this.font.draw(poseStack, "|", -5, 98, -1);
		this.font.draw(poseStack, "35 SP", -14, 114, -1);
		this.font.draw(poseStack, "More Coming in the future.", 53, 108, -1);
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
		this.addRenderableWidget(new Button(this.leftPos + -212, this.topPos + -28, 103, 20, new TextComponent("Fire Ball Jutsu"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new FireReleaseGuiButtonMessage(0, x, y, z));
				FireReleaseGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -133, this.topPos + 26, 129, 20, new TextComponent("Phoenix Flower Jutsu"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new FireReleaseGuiButtonMessage(1, x, y, z));
				FireReleaseGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -54, this.topPos + 77, 113, 20, new TextComponent("Dragon Flame Bomb"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new FireReleaseGuiButtonMessage(2, x, y, z));
				FireReleaseGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
