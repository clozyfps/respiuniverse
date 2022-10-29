
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.BlackDivineDogEntity;
import net.mcreator.animecross.client.model.Modeldivinedog;

public class BlackDivineDogRenderer extends MobRenderer<BlackDivineDogEntity, Modeldivinedog<BlackDivineDogEntity>> {
	public BlackDivineDogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldivinedog(context.bakeLayer(Modeldivinedog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlackDivineDogEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/black_divine_dog.png");
	}
}
