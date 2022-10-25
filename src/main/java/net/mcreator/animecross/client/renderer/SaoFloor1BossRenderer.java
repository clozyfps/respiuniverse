
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.SaoFloor1BossEntity;
import net.mcreator.animecross.client.model.Modelgleameyes;

public class SaoFloor1BossRenderer extends MobRenderer<SaoFloor1BossEntity, Modelgleameyes<SaoFloor1BossEntity>> {
	public SaoFloor1BossRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgleameyes(context.bakeLayer(Modelgleameyes.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SaoFloor1BossEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/gleameyes_fixed.png");
	}
}
