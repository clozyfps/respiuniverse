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
public class Modelmihawkdripp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animecrossworkspace", "modelmihawkdripp"),
			"main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart hexadecagon;
	public final ModelPart hat;

	public Modelmihawkdripp(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.hexadecagon = root.getChild("hexadecagon");
		this.hat = root.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition
				.addOrReplaceChild(
						"Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
								.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild(
				"Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild(
				"RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild(
				"LeftArm", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild(
				"RightLeg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
				"LeftLeg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition hexadecagon = partdefinition.addOrReplaceChild("hexadecagon",
				CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -0.3978F, -2.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -0.3978F, 1.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, 1.6F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -2.0F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.4375F, -1.6875F, -1.5708F, -1.0821F, 1.5708F));
		PartDefinition cube_r1 = hexadecagon.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(81, 85).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0028F, 2.6949F, -0.0625F, 1.5708F, 0.0F, -0.4363F));
		PartDefinition cube_r2 = hexadecagon.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(84, 90).addBox(5.875F, 6.1875F, -0.0625F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.8125F, -1.125F, -0.5F, 0.0F, 0.0F, -0.4363F));
		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -2.0F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, 1.6F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -0.3978F, 1.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4).addBox(-0.5F, -0.3978F, -2.0F,
								1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -2.0F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, 1.6F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -0.3978F, 1.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4).addBox(-0.5F, -0.3978F, -2.0F,
								1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -0.3978F, 1.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -0.3978F, -2.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -0.3978F, 1.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -0.3978F, -2.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hat = partdefinition.addOrReplaceChild("hat",
				CubeListBuilder.create().texOffs(92, 13).addBox(2.9375F, -1.7343F, -6.0393F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
						.texOffs(11, 87).addBox(-2.9663F, 0.7032F, -9.5393F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(11, 87)
						.addBox(-9.375F, 0.7032F, -3.1306F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-6.0F, -3.9218F, -6.0393F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-0.1875F, -3.9218F, -6.0393F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-4.0625F, -3.1718F, -6.0393F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6875F, -6.0782F, 1.5232F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r3 = hat.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(92, 13).addBox(-1.0F, -0.8125F, 0.5625F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9375F, 0.7133F, 7.1854F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r4 = hat.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(92, 13).addBox(-1.0F, -0.5F, -2.3125F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9375F, 1.1508F, 7.1854F, -0.8378F, 0.0F, 0.0F));
		PartDefinition cube_r5 = hat.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(92, 13).addBox(-1.0F, -0.9375F, -1.8125F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9375F, -0.2968F, 4.4607F, -0.3665F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r5 = hat.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(11, 87).addBox(-8.0F, -0.5F, -1.5913F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 87)
						.addBox(-1.5913F, -0.5F, -8.0F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.375F, 1.2032F, -1.5393F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r6 = hat.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(11, 87).addBox(-8.0F, -0.5F, -1.5913F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 87)
						.addBox(-1.5913F, -0.5F, -8.0F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.375F, 1.2032F, -1.5393F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r7 = hat.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(7, 80).addBox(-1.5913F, -0.5F, -8.0F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.375F, 1.2032F, -1.5393F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r8 = hat.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(11, 87).addBox(-1.5913F, -0.5F, -8.0F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.375F, 1.2032F, -1.5393F, 0.0F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
