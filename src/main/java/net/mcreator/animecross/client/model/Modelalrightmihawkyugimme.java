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

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelalrightmihawkyugimme<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("animecrossworkspace", "modelalrightmihawkyugimme"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart howie;
	public final ModelPart huzz;
	public final ModelPart bone;
	public final ModelPart hexfou;
	public final ModelPart hexadecagonf;
	public final ModelPart hexadecagonff;
	public final ModelPart hexadecagons;
	public final ModelPart hexadecagonss;
	public final ModelPart hexadecagone;
	public final ModelPart hexadecagonn;
	public final ModelPart bowie;
	public final ModelPart hexadecagont;
	public final ModelPart hexadecagoneeee;
	public final ModelPart hexadecagontweel;
	public final ModelPart hexadecagonthirtt;
	public final ModelPart bb_main;

	public Modelalrightmihawkyugimme(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.howie = root.getChild("howie");
		this.huzz = root.getChild("huzz");
		this.bone = root.getChild("bone");
		this.hexfou = root.getChild("hexfou");
		this.hexadecagonf = root.getChild("hexadecagonf");
		this.hexadecagonff = root.getChild("hexadecagonff");
		this.hexadecagons = root.getChild("hexadecagons");
		this.hexadecagonss = root.getChild("hexadecagonss");
		this.hexadecagone = root.getChild("hexadecagone");
		this.hexadecagonn = root.getChild("hexadecagonn");
		this.bowie = root.getChild("bowie");
		this.hexadecagont = root.getChild("hexadecagont");
		this.hexadecagoneeee = root.getChild("hexadecagoneeee");
		this.hexadecagontweel = root.getChild("hexadecagontweel");
		this.hexadecagonthirtt = root.getChild("hexadecagonthirtt");
		this.bb_main = root.getChild("bb_main");
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
		PartDefinition howie = partdefinition.addOrReplaceChild(
				"howie", CubeListBuilder.create().texOffs(11, 87).addBox(-3.5913F, -2.5F, -6.0F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F))
						.texOffs(11, 87).addBox(-10.0F, -2.5F, 0.4087F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.1875F, -2.875F, -2.0625F));
		PartDefinition hexadecagon_r1 = howie.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(11, 87).addBox(-8.0F, -0.5F, -1.5913F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 87)
						.addBox(-1.5913F, -0.5F, -8.0F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r2 = howie.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(11, 87).addBox(-8.0F, -0.5F, -1.5913F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 87)
						.addBox(-1.5913F, -0.5F, -8.0F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r3 = howie.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(7, 80).addBox(-1.5913F, -0.5F, -8.0F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r4 = howie.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(11, 87).addBox(-1.5913F, -0.5F, -8.0F, 3.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition huzz = partdefinition.addOrReplaceChild("huzz",
				CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -0.3978F, -2.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -0.3978F, 1.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, 1.6F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -2.0F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.4375F, -1.6875F, -1.5708F, -1.0821F, 1.5708F));
		PartDefinition cube_r1 = huzz.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(81, 85).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0028F, 2.6949F, -0.0625F, 1.5708F, 0.0F, -0.4363F));
		PartDefinition cube_r2 = huzz.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(84, 90).addBox(5.875F, 6.1875F, -0.0625F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.8125F, -1.125F, -0.5F, 0.0F, 0.0F, -0.4363F));
		PartDefinition hexadecagon_r5 = huzz.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -2.0F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, 1.6F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -0.3978F, 1.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4).addBox(-0.5F, -0.3978F, -2.0F,
								1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r6 = huzz.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -2.0F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, 1.6F, -0.3978F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -0.3978F, 1.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4).addBox(-0.5F, -0.3978F, -2.0F,
								1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r7 = huzz.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -0.3978F, 1.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -0.3978F, -2.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r8 = huzz.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(42, 4).addBox(-0.5F, -0.3978F, 1.6F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-0.5F, -0.3978F, -2.0F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 1.9548F, 0.0F, 3.1416F));
		PartDefinition Mihawkssword = bone.addOrReplaceChild("Mihawkssword", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-8.0F, -3.375F, 7.9375F, -0.2094F, 0.0F, 0.0F));
		PartDefinition handle = Mihawkssword.addOrReplaceChild("handle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagonsec = handle.addOrReplaceChild("hexadecagonsec",
				CubeListBuilder.create().texOffs(18, 117).addBox(13.6505F, -1.3018F, -20.1009F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(18, 117).addBox(13.25F, -1.3018F, -19.7003F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r9 = hexadecagonsec.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(18, 117).addBox(4.6785F, -7.3018F, -23.5279F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(18, 117).addBox(5.079F, -7.3018F, -23.9285F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0625F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r10 = hexadecagonsec.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(18, 117).addBox(19.7282F, -7.3018F, -13.0041F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(18, 117).addBox(20.1287F, -7.3018F, -13.4047F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0625F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r11 = hexadecagonsec.addOrReplaceChild("hexadecagon_r11",
				CubeListBuilder.create().texOffs(18, 117).addBox(-4.2808F, -7.3018F, -24.1268F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0625F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r12 = hexadecagonsec.addOrReplaceChild("hexadecagon_r12",
				CubeListBuilder.create().texOffs(18, 117).addBox(23.5274F, -7.3018F, -4.6814F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0625F, 0.0F, 0.7854F, 0.0F));
		PartDefinition hexadecagonthird = handle.addOrReplaceChild("hexadecagonthird",
				CubeListBuilder.create().texOffs(35, 120).addBox(13.6505F, 4.9482F, -20.1009F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(35, 120).addBox(13.25F, 4.9482F, -19.7003F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r13 = hexadecagonthird.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(35, 120).addBox(4.6785F, -7.3018F, -23.5279F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(35, 120).addBox(5.079F, -7.3018F, -23.9285F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.25F, 0.0625F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r14 = hexadecagonthird.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(35, 120).addBox(19.7282F, -7.3018F, -13.0041F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(35, 120).addBox(20.1287F, -7.3018F, -13.4047F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.25F, 0.0625F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r15 = hexadecagonthird.addOrReplaceChild("hexadecagon_r15",
				CubeListBuilder.create().texOffs(35, 120).addBox(-4.2808F, -7.3018F, -24.1268F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.25F, 0.0625F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r16 = hexadecagonthird.addOrReplaceChild("hexadecagon_r16",
				CubeListBuilder.create().texOffs(35, 120).addBox(23.5274F, -7.3018F, -4.6814F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.25F, 0.0625F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Hilt = Mihawkssword.addOrReplaceChild("Hilt",
				CubeListBuilder.create().texOffs(104, 117).addBox(13.1875F, -1.9893F, -24.5384F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Hilt.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(104, 117).addBox(13.1875F, 10.9027F, -16.65F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9709F, 5.0131F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Hilt.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(104, 117).addBox(13.1875F, 4.1245F, -19.7804F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9709F, 5.0131F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Hilt.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(104, 117).addBox(13.1875F, -9.8071F, -17.8098F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9084F, 5.0131F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Hilt.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(104, 117).addBox(13.1875F, 12.5349F, -15.1303F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9084F, 5.0131F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Hilt.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(104, 117).addBox(13.1875F, 11.7872F, -16.021F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0669F, -4.9542F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Hilt.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(104, 117).addBox(13.1875F, 4.7298F, -19.5806F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.6875F, -4.5625F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Hilt.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(104, 117).addBox(13.1875F, -15.771F, -12.5372F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5153F, -5.0514F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r10 = Hilt.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(104, 117).addBox(13.1875F, -10.2574F, -17.565F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1875F, -4.625F, 0.3927F, 0.0F, 0.0F));
		PartDefinition blade = Mihawkssword.addOrReplaceChild("blade",
				CubeListBuilder.create().texOffs(78, 120).addBox(5.4F, -14.5518F, -11.9134F, 0.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 8.0F, -8.0F));
		PartDefinition mainblade = blade.addOrReplaceChild("mainblade", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spart = blade.addOrReplaceChild("spart", CubeListBuilder.create(), PartPose.offset(-8.0F, -8.0F, 8.0F));
		PartDefinition thpart = blade.addOrReplaceChild("thpart", CubeListBuilder.create(), PartPose.offset(-8.0F, -8.0F, 8.0F));
		PartDefinition group = Mihawkssword.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(110, 73).addBox(13.225F, -17.9518F, -18.7134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(110, 73).addBox(13.225F, -10.7518F, -18.2384F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -13.4518F, -18.3634F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -15.8518F, -18.5134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -18.9518F, -18.8384F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -19.9268F, -18.9634F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -20.6018F, -19.1884F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -21.6268F, -20.0384F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -21.7018F, -20.1634F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -21.7768F, -20.3634F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -21.8518F, -20.5384F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -21.9268F, -20.7134F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -22.0018F, -20.8384F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -22.0268F, -20.9384F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -21.4018F, -19.6884F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -21.5768F, -19.9884F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 73)
						.addBox(13.225F, -21.1018F, -19.4384F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.1875F, -2.0F, -2.25F));
		PartDefinition groups = Mihawkssword.addOrReplaceChild("groups",
				CubeListBuilder.create().texOffs(110, 100).addBox(13.375F, -10.7518F, -16.5384F, 0.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(110, 100).addBox(13.375F, -13.4518F, -16.6884F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -15.8518F, -16.8134F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -17.8518F, -17.0134F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -18.9518F, -17.1384F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -19.9268F, -17.2634F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -20.6018F, -17.4884F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -21.1018F, -17.7384F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -21.4018F, -17.9884F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -21.5768F, -18.2884F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -21.6268F, -18.3384F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -21.7268F, -18.7884F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -21.8268F, -18.9884F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -21.9018F, -19.1634F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -21.9768F, -19.3134F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -22.0268F, -19.4884F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 100)
						.addBox(13.375F, -21.6518F, -18.4634F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.1875F, -2.0F, -2.25F));
		PartDefinition groupt = Mihawkssword.addOrReplaceChild("groupt",
				CubeListBuilder.create().texOffs(110, 97).addBox(13.5F, -10.7518F, -16.3384F, 0.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(110, 97).addBox(13.5F, -13.4518F, -16.4884F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 97)
						.addBox(13.5F, -15.8518F, -16.6134F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 97)
						.addBox(13.5F, -17.8518F, -16.8134F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 97)
						.addBox(13.5F, -18.9518F, -16.9384F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 97)
						.addBox(13.5F, -19.9268F, -17.0634F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 97)
						.addBox(13.5F, -20.6018F, -17.2884F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 97)
						.addBox(13.5F, -21.1018F, -17.5384F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 97)
						.addBox(13.5F, -21.4018F, -17.7884F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 97)
						.addBox(13.5F, -21.5768F, -18.0884F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 97)
						.addBox(13.5F, -21.6268F, -18.1384F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.1875F, -2.0F, -2.25F));
		PartDefinition hexfou = partdefinition.addOrReplaceChild(
				"hexfou", CubeListBuilder.create().texOffs(35, 121).addBox(-2.8F, -2.0597F, 1.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(35, 121).addBox(-2.8F, -2.3F, 1.9403F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.6875F, 12.4375F, -6.25F));
		PartDefinition hexadecagon_r17 = hexfou.addOrReplaceChild("hexadecagon_r17",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 121)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r18 = hexfou.addOrReplaceChild("hexadecagon_r18",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 121)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r19 = hexfou.addOrReplaceChild("hexadecagon_r19",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r20 = hexfou.addOrReplaceChild("hexadecagon_r20",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagonf = partdefinition.addOrReplaceChild(
				"hexadecagonf", CubeListBuilder.create().texOffs(35, 121).addBox(-2.8F, -2.0597F, 1.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(35, 121).addBox(-2.8F, -2.3F, 1.9403F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.6875F, 10.75F, -5.9375F));
		PartDefinition hexadecagon_r21 = hexadecagonf.addOrReplaceChild("hexadecagon_r21",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 121)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r22 = hexadecagonf.addOrReplaceChild("hexadecagon_r22",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 121)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r23 = hexadecagonf.addOrReplaceChild("hexadecagon_r23",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r24 = hexadecagonf.addOrReplaceChild("hexadecagon_r24",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagonff = partdefinition.addOrReplaceChild(
				"hexadecagonff", CubeListBuilder.create().texOffs(35, 121).addBox(-2.8F, -2.0597F, 1.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(35, 121).addBox(-2.8F, -2.3F, 1.9403F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.6875F, 13.9375F, -6.5625F));
		PartDefinition hexadecagon_r25 = hexadecagonff.addOrReplaceChild("hexadecagon_r25",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 121)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r26 = hexadecagonff.addOrReplaceChild("hexadecagon_r26",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 121)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r27 = hexadecagonff.addOrReplaceChild("hexadecagon_r27",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r28 = hexadecagonff.addOrReplaceChild("hexadecagon_r28",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagons = partdefinition.addOrReplaceChild(
				"hexadecagons", CubeListBuilder.create().texOffs(35, 121).addBox(-2.8F, -2.0597F, 1.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(35, 121).addBox(-2.8F, -2.3F, 1.9403F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.75F, 16.1875F, -7.0F));
		PartDefinition hexadecagon_r29 = hexadecagons.addOrReplaceChild("hexadecagon_r29",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 121)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r30 = hexadecagons.addOrReplaceChild("hexadecagon_r30",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 121)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r31 = hexadecagons.addOrReplaceChild("hexadecagon_r31",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r32 = hexadecagons.addOrReplaceChild("hexadecagon_r32",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagonss = partdefinition.addOrReplaceChild(
				"hexadecagonss", CubeListBuilder.create().texOffs(35, 121).addBox(-2.8F, -2.0597F, 1.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(35, 121).addBox(-2.8F, -2.3F, 1.9403F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.6875F, 8.5F, -5.5625F));
		PartDefinition hexadecagon_r33 = hexadecagonss.addOrReplaceChild("hexadecagon_r33",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 121)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r34 = hexadecagonss.addOrReplaceChild("hexadecagon_r34",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 121)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r35 = hexadecagonss.addOrReplaceChild("hexadecagon_r35",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r36 = hexadecagonss.addOrReplaceChild("hexadecagon_r36",
				CubeListBuilder.create().texOffs(35, 121).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagone = partdefinition.addOrReplaceChild(
				"hexadecagone", CubeListBuilder.create().texOffs(56, 111).addBox(-2.8F, -2.0597F, 1.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(56, 111).addBox(-2.8F, -2.3F, 1.9403F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.75F, 15.1875F, -6.8125F));
		PartDefinition hexadecagon_r37 = hexadecagone.addOrReplaceChild("hexadecagon_r37",
				CubeListBuilder.create().texOffs(56, 111).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 111)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r38 = hexadecagone.addOrReplaceChild("hexadecagon_r38",
				CubeListBuilder.create().texOffs(56, 111).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 111)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r39 = hexadecagone.addOrReplaceChild("hexadecagon_r39",
				CubeListBuilder.create().texOffs(56, 111).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r40 = hexadecagone.addOrReplaceChild("hexadecagon_r40",
				CubeListBuilder.create().texOffs(56, 111).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagonn = partdefinition.addOrReplaceChild(
				"hexadecagonn", CubeListBuilder.create().texOffs(56, 111).addBox(-2.8F, -2.0597F, 1.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(56, 111).addBox(-2.8F, -2.3F, 1.9403F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.6875F, 9.5625F, -5.75F));
		PartDefinition hexadecagon_r41 = hexadecagonn.addOrReplaceChild("hexadecagon_r41",
				CubeListBuilder.create().texOffs(56, 111).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 111)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r42 = hexadecagonn.addOrReplaceChild("hexadecagon_r42",
				CubeListBuilder.create().texOffs(56, 111).addBox(-0.8F, -0.3F, -0.0597F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 111)
						.addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r43 = hexadecagonn.addOrReplaceChild("hexadecagon_r43",
				CubeListBuilder.create().texOffs(56, 111).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r44 = hexadecagonn.addOrReplaceChild("hexadecagon_r44",
				CubeListBuilder.create().texOffs(56, 111).addBox(-0.8F, -0.0597F, -0.3F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bowie = partdefinition.addOrReplaceChild(
				"bowie", CubeListBuilder.create().texOffs(56, 116).addBox(-2.8F, -2.0298F, 1.85F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(56, 116).addBox(-2.8F, -2.15F, 1.9702F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.6875F, 13.25F, -6.4375F));
		PartDefinition hexadecagon_r45 = bowie.addOrReplaceChild("hexadecagon_r45",
				CubeListBuilder.create().texOffs(56, 116).addBox(-0.8F, -0.15F, -0.0298F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(56, 116).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r46 = bowie.addOrReplaceChild("hexadecagon_r46",
				CubeListBuilder.create().texOffs(56, 116).addBox(-0.8F, -0.15F, -0.0298F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(56, 116).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r47 = bowie.addOrReplaceChild("hexadecagon_r47",
				CubeListBuilder.create().texOffs(56, 116).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r48 = bowie.addOrReplaceChild("hexadecagon_r48",
				CubeListBuilder.create().texOffs(56, 116).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagont = partdefinition.addOrReplaceChild(
				"hexadecagont", CubeListBuilder.create().texOffs(111, 80).addBox(-2.8F, -2.0298F, 1.85F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(111, 80).addBox(-2.8F, -2.15F, 1.9702F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.75F, 15.6875F, -6.9375F));
		PartDefinition hexadecagon_r49 = hexadecagont.addOrReplaceChild("hexadecagon_r49",
				CubeListBuilder.create().texOffs(111, 80).addBox(-0.8F, -0.15F, -0.0298F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(111, 80).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r50 = hexadecagont.addOrReplaceChild("hexadecagon_r50",
				CubeListBuilder.create().texOffs(111, 80).addBox(-0.8F, -0.15F, -0.0298F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(111, 80).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r51 = hexadecagont.addOrReplaceChild("hexadecagon_r51",
				CubeListBuilder.create().texOffs(111, 80).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r52 = hexadecagont.addOrReplaceChild("hexadecagon_r52",
				CubeListBuilder.create().texOffs(111, 80).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagoneeee = partdefinition
				.addOrReplaceChild("hexadecagoneeee",
						CubeListBuilder.create().texOffs(111, 80).addBox(-2.8F, -2.0298F, 1.85F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(111, 80).addBox(-2.8F, -2.15F, 1.9702F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-3.6875F, 9.0625F, -5.625F));
		PartDefinition hexadecagon_r53 = hexadecagoneeee.addOrReplaceChild("hexadecagon_r53",
				CubeListBuilder.create().texOffs(111, 80).addBox(-0.8F, -0.15F, -0.0298F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(111, 80).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r54 = hexadecagoneeee.addOrReplaceChild("hexadecagon_r54",
				CubeListBuilder.create().texOffs(111, 80).addBox(-0.8F, -0.15F, -0.0298F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(111, 80).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r55 = hexadecagoneeee.addOrReplaceChild("hexadecagon_r55",
				CubeListBuilder.create().texOffs(111, 80).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r56 = hexadecagoneeee.addOrReplaceChild("hexadecagon_r56",
				CubeListBuilder.create().texOffs(111, 80).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagontweel = partdefinition
				.addOrReplaceChild("hexadecagontweel",
						CubeListBuilder.create().texOffs(56, 116).addBox(-2.8F, -2.0298F, 1.85F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(56, 116).addBox(-2.8F, -2.15F, 1.9702F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-3.6875F, 11.5625F, -6.125F));
		PartDefinition hexadecagon_r57 = hexadecagontweel.addOrReplaceChild("hexadecagon_r57",
				CubeListBuilder.create().texOffs(56, 116).addBox(-0.8F, -0.15F, -0.0298F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(56, 116).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r58 = hexadecagontweel.addOrReplaceChild("hexadecagon_r58",
				CubeListBuilder.create().texOffs(56, 116).addBox(-0.8F, -0.15F, -0.0298F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(56, 116).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r59 = hexadecagontweel.addOrReplaceChild("hexadecagon_r59",
				CubeListBuilder.create().texOffs(56, 116).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r60 = hexadecagontweel.addOrReplaceChild("hexadecagon_r60",
				CubeListBuilder.create().texOffs(56, 116).addBox(-0.8F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagonthirtt = partdefinition
				.addOrReplaceChild("hexadecagonthirtt",
						CubeListBuilder.create().texOffs(36, 118).addBox(-2.2F, -2.0298F, 1.85F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(36, 118).addBox(-2.2F, -2.15F, 1.9702F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-4.0F, 12.25F, -7.375F));
		PartDefinition hexadecagon_r61 = hexadecagonthirtt.addOrReplaceChild("hexadecagon_r61",
				CubeListBuilder.create().texOffs(36, 118).addBox(-0.2F, -0.15F, -0.0298F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(36, 118).addBox(-0.2F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r62 = hexadecagonthirtt.addOrReplaceChild("hexadecagon_r62",
				CubeListBuilder.create().texOffs(36, 118).addBox(-0.2F, -0.15F, -0.0298F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(36, 118).addBox(-0.2F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r63 = hexadecagonthirtt.addOrReplaceChild("hexadecagon_r63",
				CubeListBuilder.create().texOffs(36, 118).addBox(-0.2F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r64 = hexadecagonthirtt.addOrReplaceChild("hexadecagon_r64",
				CubeListBuilder.create().texOffs(36, 118).addBox(-0.2F, -0.0298F, -0.15F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(34, 0).addBox(-4.4375F, -34.0F, -4.5625F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(1.375F, -34.0F, -4.5625F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-2.5F, -33.25F, -4.5625F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(92, 13)
						.addBox(4.5F, -31.8125F, -4.5625F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(92, 13).addBox(-1.0F, -0.8125F, 0.5625F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, -29.3649F, 8.6622F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(92, 13).addBox(-1.0F, -0.5F, -2.3125F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, -28.9274F, 8.6622F, -0.8378F, 0.0F, 0.0F));
		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(92, 13).addBox(-1.0F, -0.9375F, -1.8125F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, -30.375F, 5.9375F, -0.3665F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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
		howie.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		huzz.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexfou.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagonf.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagonff.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagons.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagonss.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagonn.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bowie.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagont.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagoneeee.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagontweel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagonthirtt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
