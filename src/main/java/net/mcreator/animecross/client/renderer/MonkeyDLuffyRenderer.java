
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.animecross.entity.MonkeyDLuffyEntity;

public class MonkeyDLuffyRenderer extends HumanoidMobRenderer<MonkeyDLuffyEntity, HumanoidModel<MonkeyDLuffyEntity>> {
	public MonkeyDLuffyRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(MonkeyDLuffyEntity entity) {
		return new ResourceLocation(
				"animecrossworkspace:textures/entities/monkey_d_luffy_one_piece_hero_boy_straw_hat_rubber_man_pirate_captain_the_fifth_emperor_worst_generation_anime.png");
	}
}
