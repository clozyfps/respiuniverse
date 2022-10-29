
package net.mcreator.animecross.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.animecross.entity.KnotEntityEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class KnotEntityRenderer extends GeoEntityRenderer<KnotEntityEntity> {
	public KnotEntityRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new KnotEntityModelProcedure());
		this.shadowRadius = 0.1f;
	}

	@Override
	public RenderType getRenderType(KnotEntityEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
