
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

import net.mcreator.animecross.world.inventory.LadyTamayoGUIMenu;
import net.mcreator.animecross.network.LadyTamayoGUIButtonMessage;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class LadyTamayoGUIScreen extends AbstractContainerScreen<LadyTamayoGUIMenu> {
	private final static HashMap<String, Object> guistate = LadyTamayoGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public LadyTamayoGUIScreen(LadyTamayoGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecrossworkspace:textures/screens/lady_tamayo_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/yamao.png"));
		this.blit(ms, this.leftPos + -203, this.topPos + -7, 0, 0, 150, 150, 150, 150);

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/demonjuice.png"));
		this.blit(ms, this.leftPos + -6, this.topPos + 59, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/pyrojuice.png"));
		this.blit(ms, this.leftPos + -5, this.topPos + 114, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "What do you want to buy?", -5, -6, -1);
		this.font.draw(poseStack, "Humanity Restorement", -47, 48, -1);
		this.font.draw(poseStack, "10 SP", -11, 77, -1);
		this.font.draw(poseStack, "Remove the demon effect", -52, 86, -1);
		this.font.draw(poseStack, "Pyro Fluid", -22, 104, -1);
		this.font.draw(poseStack, "20 SP", -10, 130, -1);
		this.font.draw(poseStack, "Gain 3rd Generation Pyro abilities", -82, 141, -1);
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
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 62, 40, 20, new TextComponent("Buy"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new LadyTamayoGUIButtonMessage(0, x, y, z));
				LadyTamayoGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 116, 40, 20, new TextComponent("Buy"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new LadyTamayoGUIButtonMessage(1, x, y, z));
				LadyTamayoGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
