
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.KnotEntityEntity;
import net.mcreator.animecross.client.model.Modelstring2;

public class KnotEntityRenderer extends MobRenderer<KnotEntityEntity, Modelstring2<KnotEntityEntity>> {
	public KnotEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstring2(context.bakeLayer(Modelstring2.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(KnotEntityEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/lead_knotstring.png");
	}
}
