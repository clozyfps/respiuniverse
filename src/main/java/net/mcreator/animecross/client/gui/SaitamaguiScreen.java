
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

import net.mcreator.animecross.world.inventory.SaitamaguiMenu;
import net.mcreator.animecross.network.SaitamaguiButtonMessage;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SaitamaguiScreen extends AbstractContainerScreen<SaitamaguiMenu> {
	private final static HashMap<String, Object> guistate = SaitamaguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SaitamaguiScreen(SaitamaguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecrossworkspace:textures/screens/saitamagui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/83f37a2ea093d2a8ce8887b87a7ed475.png"));
		this.blit(ms, this.leftPos + -243, this.topPos + -20, 0, 0, 256, 212, 256, 212);

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/screenshot_2022-09-21_115838.png"));
		this.blit(ms, this.leftPos + 33, this.topPos + 53, 0, 0, 100, 48, 100, 48);

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
		this.font.draw(poseStack, "Oh- Hey Im trying to find the grocery store", -27, 22, -13312);
		this.font.draw(poseStack, "Think you can craft a coupon for me?", -8, 35, -1);
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
		this.addRenderableWidget(new Button(this.leftPos + 57, this.topPos + 110, 46, 20, new TextComponent("Give"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new SaitamaguiButtonMessage(0, x, y, z));
				SaitamaguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
