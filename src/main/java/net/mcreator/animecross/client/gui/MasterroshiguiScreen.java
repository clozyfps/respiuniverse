
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

import net.mcreator.animecross.world.inventory.MasterroshiguiMenu;
import net.mcreator.animecross.network.MasterroshiguiButtonMessage;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MasterroshiguiScreen extends AbstractContainerScreen<MasterroshiguiMenu> {
	private final static HashMap<String, Object> guistate = MasterroshiguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MasterroshiguiScreen(MasterroshiguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecrossworkspace:textures/screens/masterroshigui.png");

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
				new ResourceLocation("animecrossworkspace:textures/screens/ddxcvqx-2e194b3f-6e01-4eaf-b5c8-88d2816a2371.png"));
		this.blit(ms, this.leftPos + -224, this.topPos + -53, 0, 0, 236, 332, 236, 332);

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
		this.font.draw(poseStack, "Hey wanna control your Ki", 42, 3, -1);
		this.font.draw(poseStack, "Once you click yes, come back when you reach 100", -43, 99, -1);
		this.font.draw(poseStack, "ki level.", 58, 117, -1);
		this.font.draw(poseStack, "Right click the item it gives you", -1, 84, -1);
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
		this.addRenderableWidget(new Button(this.leftPos + 82, this.topPos + 21, 40, 20, new TextComponent("Yes"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new MasterroshiguiButtonMessage(0, x, y, z));
				MasterroshiguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 84, this.topPos + 48, 35, 20, new TextComponent("No"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new MasterroshiguiButtonMessage(1, x, y, z));
				MasterroshiguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
