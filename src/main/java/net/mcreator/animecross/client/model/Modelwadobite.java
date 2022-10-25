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
public class Modelwadobite<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animecrossworkspace", "modelwadobite"),
			"main");
	public final ModelPart wado;

	public Modelwadobite(ModelPart root) {
		this.wado = root.getChild("wado");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition wado = partdefinition.addOrReplaceChild("wado",
				CubeListBuilder.create().texOffs(6, 17).addBox(-5.25F, -2.325F, -7.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r4 = wado.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(8, 7).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -1.825F, -5.0F, 2.618F, 0.0F, 0.0F));
		PartDefinition cube_r5 = wado.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -1.825F, -5.0F, 2.0944F, 0.0F, 0.0F));
		PartDefinition cube_r6 = wado.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(6, 12).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -1.825F, -5.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r7 = wado.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(12, 13).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -1.825F, -5.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r8 = wado.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(14, 5).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -1.825F, -5.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone = wado.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(6, 0).addBox(-0.5271F, 21.1281F, -1.2233F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5146F, -8.6844F, -1.2233F, 1.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 5)
						.addBox(-0.4896F, -10.3969F, -0.2108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 2)
						.addBox(-0.4896F, -9.6844F, -0.2108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0104F, -10.3094F, 0.4642F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.5793F, -1.8436F, -4.7882F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.1125F, -33.4088F, -0.5239F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.1125F, -33.6338F, 0.2261F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.1125F, -33.5588F, -0.7114F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1021F, 21.4093F, 13.1392F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(10, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0104F, -9.6855F, -0.1316F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(4, 0).addBox(-0.3875F, -23.2821F, -24.7717F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1021F, 21.4093F, 13.1392F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		wado.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
