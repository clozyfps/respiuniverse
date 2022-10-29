
package net.mcreator.animecross.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.animecross.entity.BatHollowEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BatHollowRenderer extends GeoEntityRenderer<BatHollowEntity> {
	public BatHollowRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BatHollowModelProcedure());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(BatHollowEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
