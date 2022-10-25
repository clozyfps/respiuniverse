
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

import net.mcreator.animecross.world.inventory.Kitrainingpaper1Menu;
import net.mcreator.animecross.procedures.DestructoCondiProcedure;
import net.mcreator.animecross.procedures.BlastcondiProcedure;
import net.mcreator.animecross.network.Kitrainingpaper1ButtonMessage;
import net.mcreator.animecross.AnimecrossworkspaceMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Kitrainingpaper1Screen extends AbstractContainerScreen<Kitrainingpaper1Menu> {
	private final static HashMap<String, Object> guistate = Kitrainingpaper1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Kitrainingpaper1Screen(Kitrainingpaper1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 230;
	}

	private static final ResourceLocation texture = new ResourceLocation("animecrossworkspace:textures/screens/kitrainingpaper_1.png");

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
		this.font.draw(poseStack, "160 Ki", 113, 13, -16713985);
		if (BlastcondiProcedure.execute(entity))
			this.font.draw(poseStack, "10 Ki", 76, 93, -16713985);
		this.font.draw(poseStack, "wip", 96, 65, -16777216);
		this.font.draw(poseStack, "Find It.", 247, 210, -65536);
		this.font.draw(poseStack, "150 Ki", 136, 175, -16713985);
		if (DestructoCondiProcedure.execute(entity))
			this.font.draw(poseStack, "220 Ki", 105, 121, -16713985);
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
		this.addRenderableWidget(new Button(this.leftPos + 5, this.topPos + 8, 103, 20, new TextComponent("Big Bang Attack"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 3, this.topPos + 169, 129, 20, new TextComponent("Instant Transmission"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 5, this.topPos + 61, 87, 20, new TextComponent("Death Impact"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 5, this.topPos + 88, 66, 20, new TextComponent("Ki Blast"), e -> {
			if (BlastcondiProcedure.execute(entity)) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new Kitrainingpaper1ButtonMessage(3, x, y, z));
				Kitrainingpaper1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (BlastcondiProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 5, this.topPos + 116, 98, 20, new TextComponent("Destructo Disk"), e -> {
			if (DestructoCondiProcedure.execute(entity)) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new Kitrainingpaper1ButtonMessage(4, x, y, z));
				Kitrainingpaper1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DestructoCondiProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 229, this.topPos + 7, 61, 20, new TextComponent("Saiyans"), e -> {
			if (true) {
				AnimecrossworkspaceMod.PACKET_HANDLER.sendToServer(new Kitrainingpaper1ButtonMessage(5, x, y, z));
				Kitrainingpaper1ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
	}
}
