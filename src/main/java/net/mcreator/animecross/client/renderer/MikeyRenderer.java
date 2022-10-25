
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.MikeyEntity;
import net.mcreator.animecross.client.model.Modelmaikyyo;

public class MikeyRenderer extends MobRenderer<MikeyEntity, Modelmaikyyo<MikeyEntity>> {
	public MikeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaikyyo(context.bakeLayer(Modelmaikyyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MikeyEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/texture.maiky.png");
	}
}
