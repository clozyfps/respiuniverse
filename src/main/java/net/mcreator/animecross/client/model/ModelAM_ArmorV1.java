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

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelAM_ArmorV1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animecrossworkspace", "model_am_armor_v_1"),
			"main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public ModelAM_ArmorV1(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(53, 52).addBox(-4.0F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 48)
						.addBox(-4.0F, 6.0F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 10)
						.addBox(-4.0F, 5.0F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 53)
						.addBox(3.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 22)
						.addBox(2.0F, 2.0F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(3.0F, 3.0F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 40)
						.addBox(1.5F, 3.75F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 53)
						.addBox(0.75F, 5.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, 6.0F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 53)
						.addBox(3.0F, 9.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 54)
						.addBox(-4.0F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 42)
						.addBox(-4.0F, 3.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 2)
						.addBox(-3.0F, 3.75F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 17)
						.addBox(-4.0F, 2.0F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(54, 0).addBox(-0.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9604F, 4.1924F, -2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(49, 53).addBox(-1.0F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8087F, 1.4619F, -2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(16, 32).addBox(-0.2706F, -1.1533F, -0.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(16, 38).addBox(-0.2706F, -1.1533F, 3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 29)
						.addBox(-1.2706F, -2.1533F, 4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 33)
						.addBox(-2.2706F, -4.1533F, 6.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 43)
						.addBox(-2.2706F, -6.1533F, 5.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-1.2706F, 1.8467F, 3.5F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 53)
						.addBox(-2.2706F, 1.8467F, 3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7901F, 0.7003F, -2.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(39, 41).addBox(-0.2929F, -1.2929F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(41, 14).addBox(-0.2929F, -4.2929F, 1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5723F, 0.6065F, 3.25F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(41, 18).addBox(-2.6316F, -2.9254F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0216F, -1.6097F, 3.75F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(7, 41).addBox(-1.5F, -2.9142F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.083F, -4.2713F, 3.8358F, 0.7854F, 0.0F, 0.7854F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(42, 25).addBox(-0.9588F, -4.5566F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0629F, -1.7242F, 5.2471F, 0.7854F, 0.0F, -1.1781F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(34, 3).addBox(-1.8839F, -0.3232F, -1.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 18)
						.addBox(-2.8839F, -0.3232F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1149F, 2.5081F, 3.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(12, 26).addBox(-2.75F, -1.0F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 51)
						.addBox(-3.75F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 22)
						.addBox(-4.75F, 1.0F, -1.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 53).addBox(-5.75F, 1.0F, -1.5F, 1.0F,
								1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0619F, 0.642F, 3.0F, 0.0F, 0.0F, -1.9635F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(30, 0).addBox(-4.4228F, -0.1311F, -1.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 23)
						.addBox(-5.4228F, -0.1311F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 3)
						.addBox(-1.4228F, -3.8811F, -1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-2.4228F, 1.1189F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5983F, 0.0891F, 3.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(6, 15).addBox(-2.75F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0396F, 8.4424F, -2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(53, 27).addBox(-0.25F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3266F, 10.1353F, -2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(6, 17).addBox(-0.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7896F, 6.0576F, -2.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(53, 36).addBox(-0.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5396F, 4.1924F, -2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(12, 51).addBox(-0.75F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5303F, 2.4697F, -2.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(53, 29).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 10.0F, -2.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(39, 51).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5381F, 0.8087F, -2.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(28, 15).addBox(-0.787F, -1.6929F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8498F, 0.9567F, -2.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r19 = Body.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(44, 12).addBox(-0.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9604F, 5.5576F, -2.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r20 = Body.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(47, 23).addBox(-0.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9604F, 8.4424F, -2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(11, 45).addBox(0.0F, 1.0F, -2.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 33)
						.addBox(-1.0F, 1.0F, -2.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 45)
						.addBox(-2.0F, 1.0F, -2.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-3.25F, 1.0F, -2.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 13)
						.addBox(-3.25F, 1.0F, -1.25F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 6)
						.addBox(-3.25F, 0.0F, -0.25F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 30)
						.addBox(-3.25F, 2.0F, 0.75F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 44)
						.addBox(-2.75F, 1.0F, -2.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 25)
						.addBox(-1.0F, 1.0F, 1.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 44)
						.addBox(-2.0F, 1.0F, 1.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 15)
						.addBox(-3.25F, 2.5F, 1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 44)
						.addBox(0.0F, 1.0F, 1.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 6)
						.addBox(-2.75F, 1.0F, 1.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r21 = RightArm.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(31, 50).addBox(-1.75F, -2.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 31)
						.addBox(-1.0F, -2.25F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, 1.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r22 = RightArm.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(22, 38).addBox(-0.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, 1.75F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r23 = RightArm.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.75F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 6)
						.addBox(-0.75F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3071F, 4.713F, 1.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r24 = RightArm.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(50, 47).addBox(-0.75F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 51)
						.addBox(-0.75F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8483F, 5.9804F, 1.75F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r25 = RightArm.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(51, 34).addBox(0.25F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 49)
						.addBox(0.25F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3827F, 7.0761F, 1.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r26 = RightArm.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(43, 51).addBox(0.0F, -1.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 2.7886F, 0.694F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r27 = RightArm.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(51, 45).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 1.0F, -1.75F, 0.0F, 0.0F, 0.3927F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(47, 42).addBox(2.0F, 1.0F, -2.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 41)
						.addBox(1.0F, 1.0F, -2.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 46)
						.addBox(0.0F, 1.0F, -2.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 5)
						.addBox(-1.0F, 1.0F, -2.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 37)
						.addBox(1.25F, 1.0F, -1.25F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 37)
						.addBox(1.25F, 0.0F, -0.25F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 42)
						.addBox(2.25F, 2.0F, 0.75F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 46)
						.addBox(2.25F, 1.0F, -2.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 6)
						.addBox(1.0F, 1.0F, 1.25F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 45)
						.addBox(0.0F, 1.0F, 1.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-1.0F, 1.0F, 1.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 45)
						.addBox(2.0F, 1.0F, 1.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 36)
						.addBox(2.25F, 1.0F, 1.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r28 = LeftArm.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(35, 50).addBox(-1.0F, -2.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 3)
						.addBox(-1.0F, -2.25F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 1.25F, 1.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r29 = LeftArm.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(52, 8).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 21)
						.addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 1.75F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r30 = LeftArm.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(52, 12).addBox(-0.75F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 52)
						.addBox(-0.75F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3071F, 4.713F, 1.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r31 = LeftArm.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(52, 15).addBox(-0.75F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 38)
						.addBox(-0.75F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1517F, 5.9804F, 1.75F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r32 = LeftArm.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(16, 52).addBox(0.25F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 52)
						.addBox(0.25F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6173F, 7.0761F, 1.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r33 = LeftArm.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(20, 52).addBox(0.0F, -1.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.25F, 2.7886F, 0.694F, -0.3927F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
				"LeftLeg", CubeListBuilder.create().texOffs(6, 26).addBox(1.1F, 0.75F, -2.25F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(12, 11).addBox(-2.15F, 0.75F, -2.25F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition cube_r34 = LeftLeg.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(49, 39).addBox(2.0F, -2.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 50)
						.addBox(0.0F, -1.25F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6881F, 0.9413F, -1.75F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r35 = LeftLeg.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(50, 0).addBox(-0.3827F, -1.6739F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 30)
						.addBox(-1.8827F, -1.6739F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0604F, 1.1856F, 1.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r36 = LeftLeg.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(4, 50).addBox(-0.8483F, -2.0196F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8142F, 1.7819F, 1.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r37 = LeftLeg.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(50, 25).addBox(-0.75F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5642F, 1.7624F, -0.8483F, -1.5708F, -1.1781F, 1.5708F));
		PartDefinition cube_r38 = LeftLeg.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(24, 22).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 25)
						.addBox(-0.5F, -4.0F, 2.75F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6F, 4.75F, 1.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild(
				"RightLeg", CubeListBuilder.create().texOffs(24, 0).addBox(1.15F, 0.75F, -2.25F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-2.1F, 0.75F, -2.25F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition cube_r39 = RightLeg.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(49, 13).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 36)
						.addBox(2.0F, -2.75F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6381F, 0.9413F, -1.75F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r40 = RightLeg.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(49, 19).addBox(-1.8827F, -2.4239F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(20, 26).addBox(-0.8827F, -1.1739F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1104F, 1.1856F, 1.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r41 = RightLeg.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(23, 49).addBox(-0.8483F, -2.0196F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3858F, 1.7819F, 1.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r42 = RightLeg.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(49, 28).addBox(-0.75F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6358F, 1.7624F, -0.8483F, -1.5708F, -1.1781F, 1.5708F));
		PartDefinition cube_r43 = RightLeg.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-0.5F, -4.0F, 2.75F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.65F, 4.75F, 1.75F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
