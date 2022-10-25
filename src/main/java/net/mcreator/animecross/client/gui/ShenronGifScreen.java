
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

import net.mcreator.animecross.world.inventory.ShenronGifMenu;
import net.mcreator.animecross.network.ShenronGifButtonMessage;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ShenronGifScreen extends AbstractContainerScreen<ShenronGifMenu> {
	private final static HashMap<String, Object> guistate = ShenronGifMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ShenronGifScreen(ShenronGifMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 311;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecrossworkspace:textures/screens/shenron_gif.png");

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

		RenderSystem.setShaderTexture(0,
				new ResourceLocation("animecrossworkspace:textures/screens/shenron-dragon-ball-dragon-de-dragon-ball-11562867803osejy5ngkp.png"));
		this.blit(ms, this.leftPos + 165, this.topPos + 2, 0, 0, 140, 96, 140, 96);

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
		this.font.draw(poseStack, "Hurry up and choose human.", 167, 181, -15952887);
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
		this.addRenderableWidget(new Button(this.leftPos + 3, this.topPos + 4, 155, 20, new TextComponent("I want to become stronger!"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new ShenronGifButtonMessage(0, x, y, z));
				ShenronGifButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 3, this.topPos + 30, 92, 20, new TextComponent("I want money!"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new ShenronGifButtonMessage(1, x, y, z));
				ShenronGifButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
