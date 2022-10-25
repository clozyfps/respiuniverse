
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

import net.mcreator.animecross.world.inventory.Masterroshigui2Menu;
import net.mcreator.animecross.network.Masterroshigui2ButtonMessage;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Masterroshigui2Screen extends AbstractContainerScreen<Masterroshigui2Menu> {
	private final static HashMap<String, Object> guistate = Masterroshigui2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Masterroshigui2Screen(Masterroshigui2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecrossworkspace:textures/screens/masterroshigui_2.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/5b071dc1a4bbb890d39a87c295e81683.png"));
		this.blit(ms, this.leftPos + -298, this.topPos + -131, 0, 0, 387, 516, 387, 516);

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
		this.font.draw(poseStack, "Ah,, Nice job!", 86, -12, -1);
		this.font.draw(poseStack, "I will give you training paper", 52, 4, -1);
		this.font.draw(poseStack, "So you can train", 84, 19, -1);
		this.font.draw(poseStack, "He is waiting for you..", 57, 125, -65536);
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
		this.addRenderableWidget(new Button(this.leftPos + 95, this.topPos + 36, 56, 20, new TextComponent("Thanks"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new Masterroshigui2ButtonMessage(0, x, y, z));
				Masterroshigui2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 101, this.topPos + 62, 40, 20, new TextComponent("Nvm"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new Masterroshigui2ButtonMessage(1, x, y, z));
				Masterroshigui2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
