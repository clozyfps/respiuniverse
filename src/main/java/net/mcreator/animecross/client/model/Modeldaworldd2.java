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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldaworldd2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animecrossworkspace", "modeldaworldd_2"),
			"main");
	public final ModelPart rightarm2;
	public final ModelPart leftarm2;
	public final ModelPart bone;

	public Modeldaworldd2(ModelPart root) {
		this.rightarm2 = root.getChild("rightarm2");
		this.leftarm2 = root.getChild("leftarm2");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rightarm2 = partdefinition.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offset(8.0F, 19.0F, -6.0F));
		PartDefinition leftarm2 = partdefinition.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offset(8.0F, 19.0F, -6.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(6.1F, 7.0F, -6.0F));
		PartDefinition Head = bone
				.addOrReplaceChild(
						"Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, 12.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
								.texOffs(32, 0).addBox(-4.0F, -8.0F, 12.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
						PartPose.offset(1.9F, -12.0F, 0.0F));
		PartDefinition Body = bone.addOrReplaceChild(
				"Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, 14.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(16, 32).addBox(-4.0F, 0.0F, 14.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, -12.0F, 0.0F));
		PartDefinition RightArm = bone.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-3.1F, -10.0F, 0.0F));
		PartDefinition RightArmLayer_r1 = RightArm.addOrReplaceChild("RightArmLayer_r1",
				CubeListBuilder.create().texOffs(40, 32).addBox(-12.0F, -22.0F, 14.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(40, 16)
						.addBox(-12.0F, -23.0F, 14.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition LeftArm = bone.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(6.9F, -10.0F, 0.0F));
		PartDefinition LeftArmLayer_r1 = LeftArm.addOrReplaceChild("LeftArmLayer_r1",
				CubeListBuilder.create().texOffs(48, 48).addBox(8.0F, -21.0F, 14.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(32, 48)
						.addBox(8.0F, -23.0F, 14.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition RightLeg = bone.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightLegLayer_r1 = RightLeg.addOrReplaceChild("RightLegLayer_r1",
				CubeListBuilder.create().texOffs(0, 32).addBox(-7.9F, -12.0F, 14.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 16)
						.addBox(-7.9F, -12.0F, 14.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition LeftLeg = bone.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(3.8F, 0.0F, 0.0F));
		PartDefinition LeftLegLayer_r1 = LeftLeg.addOrReplaceChild("LeftLegLayer_r1",
				CubeListBuilder.create().texOffs(0, 48).addBox(2.9F, -12.0F, 14.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(16, 48)
						.addBox(2.9F, -12.0F, 14.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		rightarm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
