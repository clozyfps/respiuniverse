
package net.mcreator.animecross.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animecross.entity.VaccineManEntity;
import net.mcreator.animecross.client.model.Modelvaccineman;

public class VaccineManRenderer extends MobRenderer<VaccineManEntity, Modelvaccineman<VaccineManEntity>> {
	public VaccineManRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvaccineman(context.bakeLayer(Modelvaccineman.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VaccineManEntity entity) {
		return new ResourceLocation("animecrossworkspace:textures/entities/vaccineman.png");
	}
}
