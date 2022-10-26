
package net.mcreator.animecross.client.renderer;

public class PochitaRenderer extends MobRenderer<PochitaEntity, Modelpochita<PochitaEntity>> {

	public PochitaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpochita(context.bakeLayer(Modelpochita.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(PochitaEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/pochita.png");
	}

}
