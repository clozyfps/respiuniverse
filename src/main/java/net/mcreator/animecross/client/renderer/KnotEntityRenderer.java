
package net.mcreator.animecross.client.renderer;

public class KnotEntityRenderer extends MobRenderer<KnotEntityEntity, Modelstring2<KnotEntityEntity>> {

	public KnotEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstring2(context.bakeLayer(Modelstring2.LAYER_LOCATION)), 0.1f);

	}

	@Override
	public ResourceLocation getTextureLocation(KnotEntityEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/lead_knotstring.png");
	}

}
