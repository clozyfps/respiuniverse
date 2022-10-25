
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

import net.mcreator.animecross.world.inventory.SaiyanTrainingMenu;
import net.mcreator.animecross.procedures.Ssj1condiProcedure;
import net.mcreator.animecross.network.SaiyanTrainingButtonMessage;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SaiyanTrainingScreen extends AbstractContainerScreen<SaiyanTrainingMenu> {
	private final static HashMap<String, Object> guistate = SaiyanTrainingMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SaiyanTrainingScreen(SaiyanTrainingMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 220;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecrossworkspace:textures/screens/saiyan_training.png");

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
		if (Ssj1condiProcedure.execute(entity))
			this.font.draw(poseStack, "300 Ki", 55, 16, -16711681);
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
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 13, 46, 20, new TextComponent("SSJ1"), e -> {
			if (Ssj1condiProcedure.execute(entity)) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new SaiyanTrainingButtonMessage(0, x, y, z));
				SaiyanTrainingButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (Ssj1condiProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 37, 46, 20, new TextComponent("SSJ2"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 61, 46, 20, new TextComponent("SSJB"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 11, this.topPos + 86, 35, 20, new TextComponent("UI"), e -> {
		}));
	}
}
