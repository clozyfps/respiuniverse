
package net.mcreator.animecross.client.renderer;

public class ShanksRenderer extends HumanoidMobRenderer<ShanksEntity, HumanoidModel<ShanksEntity>> {

	public ShanksRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(ShanksEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/shanks.png");
	}

}
