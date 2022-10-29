
package net.mcreator.animecross.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.animecross.entity.UzuiTengenEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class UzuiTengenRenderer extends GeoEntityRenderer<UzuiTengenEntity> {
	public UzuiTengenRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new UzuiTengenModelProcedure());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(UzuiTengenEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
