
package net.mcreator.animecross.client.renderer;

public class SoulReaperRenderer extends HumanoidMobRenderer<SoulReaperEntity, HumanoidModel<SoulReaperEntity>> {

	public SoulReaperRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(SoulReaperEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/soul_reaper.png");
	}

}