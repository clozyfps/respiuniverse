
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.BatHollowEntity;
import net.mcreator.animecross.client.model.Modelbathollow;

public class BatHollowRenderer extends MobRenderer<BatHollowEntity, Modelbathollow<BatHollowEntity>> {
	public BatHollowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbathollow(context.bakeLayer(Modelbathollow.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BatHollowEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/bat_hollow.png");
	}
}
