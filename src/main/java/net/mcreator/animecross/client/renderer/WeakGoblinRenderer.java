
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.WeakGoblinEntity;
import net.mcreator.animecross.client.model.Modelgoblinmodel1;

public class WeakGoblinRenderer extends MobRenderer<WeakGoblinEntity, Modelgoblinmodel1<WeakGoblinEntity>> {
	public WeakGoblinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgoblinmodel1(context.bakeLayer(Modelgoblinmodel1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeakGoblinEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/goblintexture.png");
	}
}
