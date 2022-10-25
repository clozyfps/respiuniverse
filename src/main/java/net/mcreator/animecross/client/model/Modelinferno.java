package net.mcreator.animecross.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modelinferno<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animecrossworkspace", "modelinferno"),
			"main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart Body;
	public final ModelPart Head;

	public Modelinferno(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(84, 17).addBox(-7.532F, -23.038F, -2.0855F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(28, 65).addBox(-8.292F, -19.018F, -2.0855F, 7.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(37, 98)
						.addBox(-6.812F, -8.748F, -0.5655F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 42)
						.addBox(-6.922F, -2.228F, -5.3155F, 4.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_thigh_r1 = RightLeg.addOrReplaceChild("right_thigh_r1",
				CubeListBuilder.create().texOffs(78, 0).addBox(-7.532F, -6.238F, -6.2715F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.05F, 5.686F, -0.3927F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_thigh_r1 = LeftLeg.addOrReplaceChild("left_thigh_r1",
				CubeListBuilder.create().texOffs(20, 82).addBox(-3.032F, 8.262F, -7.7715F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-1.812F, 22.552F, -6.2515F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-3.292F, 12.092F, -7.7715F, 7.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -31.3F, 5.686F, 0.0F, -0.3927F, 0.0F));
		PartDefinition left_thigh_r2 = LeftLeg.addOrReplaceChild("left_thigh_r2",
				CubeListBuilder.create().texOffs(78, 74).addBox(-1.262F, -1.658F, -9.6915F, 4.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.06F, -0.57F, 4.376F, 0.0F, -0.3927F, 0.0F));
		PartDefinition left_thigh_r3 = LeftLeg.addOrReplaceChild("left_thigh_r3",
				CubeListBuilder.create().texOffs(54, 74).addBox(-3.032F, -0.4638F, -3.8797F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -31.3F, 5.686F, -0.3927F, -0.3927F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_arm_r1 = RightArm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(88, 35).addBox(-7.0012F, 8.7466F, -5.744F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.812F, -55.156F, 2.894F, -1.2225F, 1.1274F, -0.8883F));
		PartDefinition right_Shoulder_r1 = RightArm.addOrReplaceChild("right_Shoulder_r1",
				CubeListBuilder.create().texOffs(28, 26).addBox(-3.44F, -3.64F, -1.704F, 10.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.812F, -55.156F, 2.894F, -2.9598F, -1.4213F, -2.9598F));
		PartDefinition right_arm_r2 = RightArm.addOrReplaceChild("right_arm_r2",
				CubeListBuilder.create().texOffs(53, 93).addBox(-3.409F, 3.66F, -5.744F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.812F, -55.156F, 2.894F, -0.1817F, 1.4213F, 0.1817F));
		PartDefinition right_finger_r1 = RightArm.addOrReplaceChild("right_finger_r1",
				CubeListBuilder.create().texOffs(20, 68).addBox(-1.3579F, 7.8639F, 10.6812F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.928F, -42.246F, -0.138F, -2.4666F, -1.0476F, 1.9407F));
		PartDefinition right_finger_r2 = RightArm.addOrReplaceChild("right_finger_r2",
				CubeListBuilder.create().texOffs(56, 23).addBox(-1.3579F, 8.5466F, 0.0898F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.928F, -42.246F, -0.138F, -1.6376F, -1.0476F, 1.9407F));
		PartDefinition right_finger_r3 = RightArm.addOrReplaceChild("right_finger_r3",
				CubeListBuilder.create().texOffs(68, 23).addBox(2.3511F, 7.6786F, 10.5094F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(51, 23).addBox(-0.8744F, 7.599F, 8.1848F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 68)
						.addBox(-0.7346F, 7.6003F, 10.3896F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 27)
						.addBox(0.866F, 7.6472F, 10.4408F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.928F, -42.246F, -0.138F, -2.4776F, -0.6549F, 1.9492F));
		PartDefinition right_finger_r4 = RightArm.addOrReplaceChild("right_finger_r4",
				CubeListBuilder.create().texOffs(62, 23).addBox(2.3511F, 8.2947F, 0.1103F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(54, 65).addBox(0.866F, 8.223F, 0.0872F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 72)
						.addBox(-0.7346F, 8.1535F, 0.0872F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-1.0074F, 6.9854F, -0.4448F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.928F, -42.246F, -0.138F, -1.6486F, -0.6549F, 1.9492F));
		PartDefinition right_hand_r1 = RightArm.addOrReplaceChild("right_hand_r1",
				CubeListBuilder.create().texOffs(102, 9).addBox(-1.606F, 3.6362F, -0.4448F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(96, 70).addBox(-1.808F, -1.6838F, -2.0408F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.928F, -42.246F, -0.138F, -1.6581F, -0.7854F, 1.9635F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(11.0F, -30.0F, 0.0F, -0.3927F, 0.0F, -0.3927F));
		PartDefinition left_arm2_r1 = LeftArm.addOrReplaceChild("left_arm2_r1",
				CubeListBuilder.create().texOffs(97, 86).addBox(-2.3675F, -0.1202F, -1.9457F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(0, 42).addBox(0.3345F, 8.4498F, -1.8497F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-0.9155F, 8.4498F, -1.8497F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 30)
						.addBox(-2.6655F, 8.4498F, 0.1503F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 99)
						.addBox(-2.1655F, 4.1998F, -1.0997F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.472F, 8.654F, 8.512F, -1.9489F, -0.9753F, 1.89F));
		PartDefinition left_hand_r1 = LeftArm.addOrReplaceChild("left_hand_r1",
				CubeListBuilder.create().texOffs(50, 5).addBox(-2.5462F, 10.8318F, -6.4135F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.472F, 8.654F, 8.512F, -2.0765F, -1.3029F, 2.453F));
		PartDefinition left_hand_r2 = LeftArm.addOrReplaceChild("left_hand_r2",
				CubeListBuilder.create().texOffs(28, 52).addBox(-2.5462F, 8.306F, -1.8497F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(40, 23).addBox(-6.9794F, 9.6651F, 0.1503F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.472F, 8.654F, 8.512F, -2.4692F, -1.3029F, 2.453F));
		PartDefinition left_hand_r3 = LeftArm.addOrReplaceChild("left_hand_r3",
				CubeListBuilder.create().texOffs(24, 34).addBox(0.3345F, 11.0434F, -6.4591F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(47, 22).addBox(-0.9155F, 11.0434F, -6.4591F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 30)
						.addBox(-2.1655F, 11.0434F, -6.4591F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.472F, 8.654F, 8.512F, -1.5562F, -0.9753F, 1.89F));
		PartDefinition left_hand_r4 = LeftArm.addOrReplaceChild("left_hand_r4",
				CubeListBuilder.create().texOffs(48, 65).addBox(-2.1655F, 8.4498F, -1.8497F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.322F, 8.754F, 9.862F, -1.9489F, -0.9753F, 1.89F));
		PartDefinition left_Shoulder_r1 = LeftArm.addOrReplaceChild("left_Shoulder_r1",
				CubeListBuilder.create().texOffs(0, 18).addBox(-7.6676F, -0.0913F, -4.704F, 10.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.188F, -8.656F, 1.994F, 1.5708F, -0.7854F, -1.5708F));
		PartDefinition left_arm_r1 = LeftArm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(73, 86).addBox(-2.0754F, -0.6146F, -0.994F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.188F, 2.594F, 9.494F, 0.0F, 1.5708F, 0.0F));
		PartDefinition left_arm_r2 = LeftArm.addOrReplaceChild("left_arm_r2",
				CubeListBuilder.create().texOffs(17, 93).addBox(0.6663F, 6.4433F, -0.994F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.188F, -8.656F, 1.994F, 1.5708F, 0.7854F, 1.5708F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(34, 52).addBox(-6.7437F, -40.1282F, 2.1586F, 13.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(0, 52).addBox(-5.6374F, -49.5762F, 1.5627F, 11.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.5728F, -58.8118F, -0.0606F, 21.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 34)
						.addBox(-5.4894F, -48.9602F, 0.6317F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-0.4354F, -48.9602F, 0.6317F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 22)
						.addBox(-5.4894F, -46.1672F, 1.1637F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 18)
						.addBox(-1.1004F, -46.1672F, 1.1637F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 38)
						.addBox(-0.6324F, -43.3742F, 1.1637F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-4.4894F, -43.3742F, 1.1637F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition sideab_r1 = Body.addOrReplaceChild("sideab_r1",
				CubeListBuilder.create().texOffs(0, 42).addBox(-2.7853F, 0.2349F, -1.5534F, 15.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.448F, -36.8311F, 4.244F, 0.0F, 0.0F, -1.8326F));
		PartDefinition sideab_r2 = Body.addOrReplaceChild("sideab_r2",
				CubeListBuilder.create().texOffs(40, 42).addBox(-2.7853F, -5.0851F, -1.5534F, 15.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.916F, -36.8311F, 4.244F, 0.0F, 0.0F, -1.309F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(50, 10).addBox(-5.361F, -63.3452F, 0.669F, 10.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition BackPiece_r1 = Head.addOrReplaceChild("BackPiece_r1",
				CubeListBuilder.create().texOffs(94, 61).addBox(-5.361F, 2.4698F, -3.479F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -61.367F, 11.692F, -0.1309F, 0.0F, 0.0F));
		PartDefinition head_r1 = Head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(65, 52).addBox(-0.642F, -5.2961F, -1.0387F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(40, 18).addBox(-1.142F, -2.2961F, -1.5387F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, -71.251F, -4.628F, 0.2269F, 0.3378F, -0.2042F));
		PartDefinition head_r2 = Head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(20, 38).addBox(-0.7721F, -1.5703F, -0.7957F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, -69.751F, -4.378F, 0.6196F, 0.3378F, -0.2042F));
		PartDefinition head_r3 = Head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(0, 68).addBox(-0.3371F, -5.5522F, 0.3697F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(35, 42).addBox(-0.8371F, -2.5522F, -0.1303F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -71.251F, -6.128F, 0.2269F, -0.3378F, 0.2042F));
		PartDefinition head_r4 = Head.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(50, 0).addBox(-1.1593F, -1.688F, -0.4207F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -69.751F, -4.628F, 0.6196F, -0.3378F, 0.2042F));
		PartDefinition head_r5 = Head.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.4236F, -1.0927F, 1.5278F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -67.501F, -5.128F, 1.0123F, -0.3378F, 0.2042F));
		PartDefinition head_r6 = Head.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(0, 18).addBox(-2.207F, -0.9293F, 1.5278F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -67.501F, -5.128F, 1.0123F, 0.3378F, -0.2042F));
		PartDefinition head_r7 = Head.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(64, 23).addBox(-3.425F, -4.8822F, -6.581F, 6.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
						.texOffs(64, 40).addBox(1.543F, 1.8358F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 23)
						.addBox(-0.457F, 2.3358F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-1.457F, 2.3358F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 5)
						.addBox(0.543F, 2.0858F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 18)
						.addBox(-3.457F, 1.8358F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 42)
						.addBox(-2.457F, 2.0858F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 65)
						.addBox(1.543F, 0.8358F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 65)
						.addBox(0.543F, 1.0858F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 68)
						.addBox(-0.457F, 1.3358F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 40)
						.addBox(-1.457F, 1.3358F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 55)
						.addBox(-2.457F, 1.0858F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 54)
						.addBox(-3.457F, 0.8358F, -8.895F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-3.957F, -3.9142F, -8.395F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 57)
						.addBox(-4.425F, -4.3822F, -7.831F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -67.751F, 6.372F, 0.2618F, 0.0F, 0.0F));
		PartDefinition HeadSidePiece_r1 = Head.addOrReplaceChild("HeadSidePiece_r1",
				CubeListBuilder.create().texOffs(91, 47).addBox(-3.7635F, -2.6741F, -3.2707F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.852F, -66.155F, 3.18F, 0.2559F, 0.056F, -0.211F));
		PartDefinition HeadSidePiece_r2 = Head.addOrReplaceChild("HeadSidePiece_r2",
				CubeListBuilder.create().texOffs(86, 92).addBox(0.511F, 1.0037F, -3.9592F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.788F, -68.815F, 3.18F, 0.258F, -0.045F, 0.1687F));
		PartDefinition BackPiece_r2 = Head.addOrReplaceChild("BackPiece_r2",
				CubeListBuilder.create().texOffs(102, 0).addBox(-4.425F, -2.7796F, -6.9133F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -69.347F, 12.756F, 0.2618F, 0.0F, 0.0F));
		PartDefinition SidePiece_r1 = Head.addOrReplaceChild("SidePiece_r1",
				CubeListBuilder.create().texOffs(0, 85).addBox(-2.6859F, -4.0168F, -4.575F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.68F, -59.649F, 5.244F, 0.0F, 0.0F, -0.5672F));
		PartDefinition SidePiece_r2 = Head.addOrReplaceChild("SidePiece_r2",
				CubeListBuilder.create().texOffs(36, 85).addBox(-0.835F, -0.6962F, -3.575F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.32F, -61.899F, 4.244F, 0.0F, 0.0F, 0.5672F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
