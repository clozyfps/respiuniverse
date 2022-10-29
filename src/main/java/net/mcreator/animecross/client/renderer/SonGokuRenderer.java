
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.SonGokuEntity;
import net.mcreator.animecross.client.model.ModelGoku;

public class SonGokuRenderer extends MobRenderer<SonGokuEntity, ModelGoku<SonGokuEntity>> {
	public SonGokuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGoku(context.bakeLayer(ModelGoku.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SonGokuEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/goku_base_texture.png");
	}
}
