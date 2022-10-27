
package net.mcreator.animecross.client.renderer;

public class AllMightRenderer extends HumanoidMobRenderer<AllMightEntity, HumanoidModel<AllMightEntity>> {

	public AllMightRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(AllMightEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/all_might.png");
	}

}
