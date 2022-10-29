
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.InfernoEntity;
import net.mcreator.animecross.client.model.Modelinferno;

public class InfernoRenderer extends MobRenderer<InfernoEntity, Modelinferno<InfernoEntity>> {
	public InfernoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinferno(context.bakeLayer(Modelinferno.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InfernoEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/inferno.png");
	}
}
