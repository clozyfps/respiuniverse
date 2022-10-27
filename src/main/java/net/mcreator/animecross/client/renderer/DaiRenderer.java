
package net.mcreator.animecross.client.renderer;

public class DaiRenderer extends HumanoidMobRenderer<DaiEntity, HumanoidModel<DaiEntity>> {

	public DaiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(DaiEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/dai.png");
	}

}
