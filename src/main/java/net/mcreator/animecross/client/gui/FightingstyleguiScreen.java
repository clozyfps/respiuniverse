
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

import net.mcreator.animecross.world.inventory.FightingstyleguiMenu;
import net.mcreator.animecross.procedures.OneforallcondiProcedure;
import net.mcreator.animecross.procedures.FistofflowingbuttoncondProcedure;
import net.mcreator.animecross.procedures.CapedbaldiconditionProcedure;
import net.mcreator.animecross.network.FightingstyleguiButtonMessage;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class FightingstyleguiScreen extends AbstractContainerScreen<FightingstyleguiMenu> {
	private final static HashMap<String, Object> guistate = FightingstyleguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FightingstyleguiScreen(FightingstyleguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecrossworkspace:textures/screens/fightingstylegui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("animecrossworkspace:textures/screens/animecrossingv2.png"));
		this.blit(ms, this.leftPos + -98, this.topPos + -30, 0, 0, 219, 229, 219, 229);

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
		if (CapedbaldiconditionProcedure.execute(entity))
			this.font.draw(poseStack, "Caped Baldi", -86, 16, -16640);
		if (FistofflowingbuttoncondProcedure.execute(entity))
			this.font.draw(poseStack, "Fist of flowing water", -19, 16, -16640);
		this.font.draw(poseStack, "One For All", -86, 73, -17664);
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
		this.addRenderableWidget(new Button(this.leftPos + -86, this.topPos + 30, 56, 20, new TextComponent("Select"), e -> {
			if (CapedbaldiconditionProcedure.execute(entity)) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new FightingstyleguiButtonMessage(0, x, y, z));
				FightingstyleguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (CapedbaldiconditionProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 4, this.topPos + 30, 56, 20, new TextComponent("Select"), e -> {
			if (FistofflowingbuttoncondProcedure.execute(entity)) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new FightingstyleguiButtonMessage(1, x, y, z));
				FightingstyleguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (FistofflowingbuttoncondProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + -86, this.topPos + 85, 56, 20, new TextComponent("Select"), e -> {
			if (OneforallcondiProcedure.execute(entity)) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new FightingstyleguiButtonMessage(2, x, y, z));
				FightingstyleguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (OneforallcondiProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
	}
}
