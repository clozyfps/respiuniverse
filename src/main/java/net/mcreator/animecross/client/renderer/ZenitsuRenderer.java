
package net.mcreator.animecross.client.renderer;

public class ZenitsuRenderer extends HumanoidMobRenderer<ZenitsuEntity, HumanoidModel<ZenitsuEntity>> {

	public ZenitsuRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(ZenitsuEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/zenitsu_kimetsu_no_yaiba.png");
	}

}
