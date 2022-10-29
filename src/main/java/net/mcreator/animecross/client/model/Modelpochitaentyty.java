package net.mcreator.animecross.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpochitaentyty<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animecrossworkspace", "modelpochitaentyty"),
			"main");
	public final ModelPart Pochita;

	public Modelpochitaentyty(ModelPart root) {
		this.Pochita = root.getChild("Pochita");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Pochita = partdefinition.addOrReplaceChild("Pochita", CubeListBuilder.create(), PartPose.offset(7.25F, 15.875F, -15.3125F));
		PartDefinition Body2 = Pochita.addOrReplaceChild("Body2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.6875F, -11.25F, 8.5625F, 12.0F, 10.0F, 15.0F, new CubeDeformation(0.0F))
						.texOffs(0, 47).addBox(-0.6875F, -15.6875F, 13.3125F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 61)
						.addBox(-13.625F, -15.6875F, 13.3125F, 14.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(-13.8125F, -15.6875F, 13.3125F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 37)
						.addBox(-7.0F, -6.0F, 24.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.8125F, 7.1875F, 0.5625F));
		PartDefinition cube_r1 = Body2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(30, 43).addBox(-7.0F, -30.0F, -7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(30, 43).addBox(-7.0F, -12.0F, 25.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Body2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(30, 43).addBox(-7.0F, 1.0F, 28.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition Legs = Pochita.addOrReplaceChild("Legs",
				CubeListBuilder.create().texOffs(9, 2).addBox(-2.625F, -2.0F, 8.5625F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-12.625F, -2.0F, 8.5625F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 2)
						.addBox(-12.625F, -2.0F, 21.5625F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 1)
						.addBox(-2.75F, -2.0F, 21.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.8125F, 7.1875F, 0.5625F));
		PartDefinition Chainsaw = Pochita.addOrReplaceChild("Chainsaw",
				CubeListBuilder.create().texOffs(46, 0).addBox(-7.5F, -11.1875F, -5.25F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-7.5F, -12.125F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-7.5F, -12.125F, -1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-7.5F, -12.125F, -3.8125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-7.5F, -12.125F, -5.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-7.5F, -8.25F, -1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-7.5F, -8.25F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-7.5F, -8.25F, -3.8125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-7.5F, -8.25F, -5.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5625F, 7.1875F, 7.8125F));
		PartDefinition cube_r4 = Chainsaw.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.3125F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9375F, -8.6082F, -7.7492F, 2.4958F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Chainsaw.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9375F, -8.6082F, -7.7492F, 2.0769F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Chainsaw.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 52).addBox(-0.4375F, -0.1875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -10.1351F, -7.8766F, 1.4486F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Chainsaw.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, -0.125F, -0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -11.625F, -7.0F, 0.8203F, 0.0F, 0.0F));
		PartDefinition hexadecagon = Chainsaw.addOrReplaceChild(
				"hexadecagon", CubeListBuilder.create().texOffs(57, 0).addBox(-2.25F, -2.2984F, 0.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(57, 0).addBox(-2.25F, -3.5F, 1.7016F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.1875F, -7.6875F, -7.6875F));
		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(57, 0).addBox(-0.25F, -1.5F, -0.2984F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(-0.25F, -0.2984F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(57, 0).addBox(-0.25F, -1.5F, -0.2984F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(-0.25F, -0.2984F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(57, 0).addBox(-0.25F, -0.2984F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(57, 0).addBox(-0.25F, -0.2984F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Pochita.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
