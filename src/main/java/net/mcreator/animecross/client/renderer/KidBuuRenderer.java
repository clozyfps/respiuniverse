
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.KidBuuEntity;
import net.mcreator.animecross.client.model.ModelKidBuu;

public class KidBuuRenderer extends MobRenderer<KidBuuEntity, ModelKidBuu<KidBuuEntity>> {
	public KidBuuRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelKidBuu(context.bakeLayer(ModelKidBuu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KidBuuEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/kid_buu.png");
	}
}
