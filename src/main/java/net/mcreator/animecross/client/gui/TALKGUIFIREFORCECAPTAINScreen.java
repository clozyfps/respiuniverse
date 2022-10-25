
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

import net.mcreator.animecross.world.inventory.TALKGUIFIREFORCECAPTAINMenu;
import net.mcreator.animecross.network.TALKGUIFIREFORCECAPTAINButtonMessage;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TALKGUIFIREFORCECAPTAINScreen extends AbstractContainerScreen<TALKGUIFIREFORCECAPTAINMenu> {
	private final static HashMap<String, Object> guistate = TALKGUIFIREFORCECAPTAINMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public TALKGUIFIREFORCECAPTAINScreen(TALKGUIFIREFORCECAPTAINMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecrossworkspace:textures/screens/talkguifireforcecaptain.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/329605550033211.png"));
		this.blit(ms, this.leftPos + -261, this.topPos + -46, 0, 0, 256, 238, 256, 238);

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/329605550033211.png"));
		this.blit(ms, this.leftPos + -310, this.topPos + -40, 0, 0, 256, 238, 256, 238);

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/329605550033211.png"));
		this.blit(ms, this.leftPos + -217, this.topPos + -31, 0, 0, 256, 238, 256, 238);

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
		this.font.draw(poseStack, "OH THANK GOODNESS!! DEFEAT THESE 3 INFERNOS AND I WILL", -72, 13, -1);
		this.font.draw(poseStack, "MAKE YOU APART OF THE FIRE FORCE SQUAD!", -33, 28, -1);
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
		this.addRenderableWidget(new Button(this.leftPos + 41, this.topPos + 45, 56, 20, new TextComponent("Accept"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new TALKGUIFIREFORCECAPTAINButtonMessage(0, x, y, z));
				TALKGUIFIREFORCECAPTAINButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 39, this.topPos + 67, 61, 20, new TextComponent("Decline"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new TALKGUIFIREFORCECAPTAINButtonMessage(1, x, y, z));
				TALKGUIFIREFORCECAPTAINButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
