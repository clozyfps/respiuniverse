
package net.mcreator.animecross.client.renderer;

public class BatHollowRenderer extends MobRenderer<BatHollowEntity, Modelbathollow<BatHollowEntity>> {

	public BatHollowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbathollow(context.bakeLayer(Modelbathollow.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BatHollowEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/bat_hollow.png");
	}

}
