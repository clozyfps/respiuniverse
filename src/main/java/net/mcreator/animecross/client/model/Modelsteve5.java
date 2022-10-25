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

// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsteve5<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animecrossworkspace", "modelsteve_5"),
			"main");
	public final ModelPart armor_body;

	public Modelsteve5(ModelPart root) {
		this.armor_body = root.getChild("armor_body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition armor_body = partdefinition.addOrReplaceChild("armor_body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Ring1 = armor_body.addOrReplaceChild("Ring1",
				CubeListBuilder.create().texOffs(76, 7).addBox(-8.0F, -22.0F, 11.0F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(12.0F, -22.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-14.0F, -22.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(72, 62)
						.addBox(-8.0F, -22.0F, 11.0F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.6F)).texOffs(19, 5)
						.addBox(12.0F, -22.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.6F)).texOffs(19, 24)
						.addBox(-14.0F, -22.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 26.0F, 0.0F));
		PartDefinition cube_r1 = Ring1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(15, 79).addBox(-0.5F, -2.0F, -10.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.6F)).texOffs(51, 79)
						.addBox(-0.5F, -2.0F, -10.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -20.0F, -7.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r2 = Ring1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(28, 117).addBox(-1.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(0, 118)
						.addBox(-1.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -20.0F, 7.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r3 = Ring1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(74, 69).addBox(-1.5F, -2.0F, -10.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.6F)).texOffs(66, 84)
						.addBox(-1.5F, -2.0F, -10.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -20.0F, -7.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r4 = Ring1.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(109, 115).addBox(-0.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(118, 0)
						.addBox(-0.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -20.0F, 7.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Ring2 = armor_body.addOrReplaceChild("Ring2",
				CubeListBuilder.create().texOffs(131, 0).addBox(-5.0F, -22.0F, 8.0F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(91, 123)
						.addBox(9.0F, -22.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(13, 123)
						.addBox(-11.0F, -22.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(127, 39)
						.addBox(-5.0F, -22.0F, 8.0F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.6F)).texOffs(106, 83)
						.addBox(9.0F, -22.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(44, 109)
						.addBox(-11.0F, -22.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition cube_r5 = Ring2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(83, 105).addBox(3.5F, -2.0F, -8.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(124, 107)
						.addBox(3.5F, -2.0F, -8.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -20.0F, -7.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r6 = Ring2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(105, 30).addBox(-5.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(126, 26)
						.addBox(-5.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -20.0F, 7.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r7 = Ring2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(105, 6).addBox(-5.5F, -2.0F, -8.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(126, 56)
						.addBox(-5.5F, -2.0F, -8.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -20.0F, -7.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r8 = Ring2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(31, 104).addBox(3.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(54, 127)
						.addBox(3.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -20.0F, 7.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Ring3 = armor_body.addOrReplaceChild("Ring3",
				CubeListBuilder.create().texOffs(76, 24).addBox(-8.0F, -22.0F, 11.0F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 38)
						.addBox(12.0F, -22.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(38, 19)
						.addBox(-14.0F, -22.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(-8.0F, -22.0F, 11.0F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.6F)).texOffs(0, 0)
						.addBox(12.0F, -22.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.6F)).texOffs(0, 19)
						.addBox(-14.0F, -22.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 33.0F, 0.0F));
		PartDefinition cube_r9 = Ring3.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(36, 74).addBox(-0.5F, -2.0F, -10.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.6F)).texOffs(0, 89)
						.addBox(-0.5F, -2.0F, -10.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -20.0F, -7.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r10 = Ring3.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(57, 114).addBox(-1.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(118, 13)
						.addBox(-1.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -20.0F, 7.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r11 = Ring3.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 74).addBox(-1.5F, -2.0F, -10.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.6F)).texOffs(30, 89)
						.addBox(-1.5F, -2.0F, -10.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -20.0F, -7.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r12 = Ring3.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(114, 43).addBox(-0.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(78, 118)
						.addBox(-0.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -20.0F, 7.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Ring4 = armor_body.addOrReplaceChild("Ring4",
				CubeListBuilder.create().texOffs(81, 84).addBox(-7.0F, -22.0F, 10.0F, 14.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 62)
						.addBox(11.0F, -22.0F, -6.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(17, 62)
						.addBox(-13.0F, -22.0F, -6.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(76, 31)
						.addBox(-7.0F, -22.0F, 10.0F, 14.0F, 4.0F, 2.0F, new CubeDeformation(0.6F)).texOffs(21, 45)
						.addBox(11.0F, -22.0F, -6.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.6F)).texOffs(0, 57)
						.addBox(-13.0F, -22.0F, -6.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 40.0F, 0.0F));
		PartDefinition cube_r13 = Ring4.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(16, 95).addBox(0.5F, -2.0F, -9.0F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.6F)).texOffs(60, 100)
						.addBox(0.5F, -2.0F, -9.0F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -20.0F, -7.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r14 = Ring4.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(96, 110).addBox(-2.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(41, 122)
						.addBox(-2.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -20.0F, 7.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r15 = Ring4.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(82, 91).addBox(-2.5F, -2.0F, -9.0F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.6F)).texOffs(0, 104)
						.addBox(-2.5F, -2.0F, -9.0F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -20.0F, -7.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r16 = Ring4.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(15, 110).addBox(0.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(122, 120)
						.addBox(0.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -20.0F, 7.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Ring5 = armor_body.addOrReplaceChild("Ring5",
				CubeListBuilder.create().texOffs(76, 50).addBox(-7.0F, -22.0F, 10.0F, 14.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(59, 45)
						.addBox(11.0F, -22.0F, -6.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(59, 26)
						.addBox(-13.0F, -22.0F, -6.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(76, 43)
						.addBox(-7.0F, -22.0F, 10.0F, 14.0F, 4.0F, 2.0F, new CubeDeformation(0.6F)).texOffs(38, 57)
						.addBox(11.0F, -22.0F, -6.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.6F)).texOffs(59, 7)
						.addBox(-13.0F, -22.0F, -6.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 19.0F, 0.0F));
		PartDefinition cube_r17 = Ring5.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(96, 96).addBox(0.5F, -2.0F, -9.0F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.6F)).texOffs(99, 69)
						.addBox(0.5F, -2.0F, -9.0F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -20.0F, -7.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r18 = Ring5.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(113, 62).addBox(-2.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(119, 75)
						.addBox(-2.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -20.0F, 7.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r19 = Ring5.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(46, 95).addBox(-2.5F, -2.0F, -9.0F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.6F)).texOffs(100, 48)
						.addBox(-2.5F, -2.0F, -9.0F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -20.0F, -7.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r20 = Ring5.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(111, 102).addBox(0.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(119, 88)
						.addBox(0.5F, -2.0F, 0.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -20.0F, 7.0F, 0.0F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		armor_body.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
