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
public class Modelmihawkhatmodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animecrossworkspace", "modelmihawkhatmodel"),
			"main");
	public final ModelPart bone;

	public Modelmihawkhatmodel(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition hat = bone.addOrReplaceChild("hat",
				CubeListBuilder.create().texOffs(34, 0).addBox(-4.125F, -24.5F, -5.3125F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
						.addBox(-4.125F, -24.5F, 4.25F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 2)
						.addBox(-4.4375F, -26.5625F, -4.5625F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -25.8125F, -4.5625F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(15, 14)
						.addBox(1.375F, -26.5625F, -4.5625F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(5.5F, -23.1875F, -1.875F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -0.125F));
		PartDefinition cube_r1 = hat.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(12, 30).addBox(-1.0F, 1.375F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, -22.1875F, 12.625F, -0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r2 = hat.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(28, 30).addBox(-1.0F, 1.375F, -5.4375F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, -22.1875F, 12.625F, -0.4189F, 0.0F, 0.0F));
		PartDefinition cube_r3 = hat.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 25).addBox(-4.0F, -9.8125F, 1.5F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -26.25F, -4.8125F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r4 = hat.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(18, 25).addBox(-0.3125F, -2.0F, 12.1875F, 10.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(30, 13).addBox(-0.3125F, -2.0F, 3.4375F, 10.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.3125F, -22.5F, -4.8125F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hexadecagon = hat.addOrReplaceChild("hexadecagon",
				CubeListBuilder.create().texOffs(0, 33).addBox(-8.3125F, -1.5913F, -8.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 3)
						.addBox(-8.3125F, -1.5913F, 5.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-8.3125F, 5.0F, -1.5913F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-8.3125F, -8.0F, -1.5913F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -28.9375F, 0.1875F, 0.0F, 0.0F, -1.5708F));
		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.3125F, -8.0F, -1.5913F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-8.3125F, 5.0F, -1.5913F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(-8.3125F, -1.5913F, 5.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 30)
						.addBox(-8.3125F, -1.5913F, -8.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(0, 8).addBox(-8.3125F, -8.0F, -1.5913F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 10)
						.addBox(-8.3125F, 5.0F, -1.5913F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 27)
						.addBox(-8.3125F, -1.5913F, 5.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 33)
						.addBox(-8.3125F, -1.5913F, -8.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(14, 13).addBox(-8.3125F, -1.5913F, 5.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 30)
						.addBox(-8.3125F, -1.5913F, -8.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(28, 27).addBox(-8.3125F, -1.5913F, 5.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 2)
						.addBox(-8.3125F, -1.5913F, -8.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
