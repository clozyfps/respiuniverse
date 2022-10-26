
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.PochitaEntity;
import net.mcreator.animecross.client.model.Modelpochita;

public class PochitaRenderer extends MobRenderer<PochitaEntity, Modelpochita<PochitaEntity>> {
	public PochitaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpochita(context.bakeLayer(Modelpochita.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PochitaEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/pochita.png");
	}
}
