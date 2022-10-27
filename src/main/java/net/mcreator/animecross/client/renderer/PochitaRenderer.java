
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.PochitaEntity;
import net.mcreator.animecross.client.model.Modelpochitaentyty;

public class PochitaRenderer extends MobRenderer<PochitaEntity, Modelpochitaentyty<PochitaEntity>> {
	public PochitaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpochitaentyty(context.bakeLayer(Modelpochitaentyty.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PochitaEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/pochitaentitytexture.png");
	}
}
