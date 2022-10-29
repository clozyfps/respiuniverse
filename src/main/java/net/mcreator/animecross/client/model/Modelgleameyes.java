package net.mcreator.animecross.client.model;

import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Abs;

import org.objectweb.asm.Handle;

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
public class Modelgleameyes<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("animecrossworkspace", "modelgleameyes"),
			"main");
	public final ModelPart Head;
	public final ModelPart UpperBody;
	public final ModelPart Weapon;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelgleameyes(ModelPart root) {
		this.Head = root.getChild("Head");
		this.UpperBody = root.getChild("UpperBody");
		this.Weapon = root.getChild("Weapon");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Nose_r1 = Head.addOrReplaceChild("Nose_r1",
				CubeListBuilder.create().texOffs(54, 27).addBox(-1.28F, 1.68F, -21.72F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(242, 199)
						.addBox(-5.28F, -2.32F, -20.72F, 10.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(233, 133)
						.addBox(-6.28F, -3.32F, -18.72F, 12.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 189)
						.addBox(-7.28F, -4.32F, -14.72F, 14.0F, 13.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -121.28F, -4.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition eye_r1 = Head.addOrReplaceChild("eye_r1",
				CubeListBuilder.create().texOffs(0, 22).addBox(6.22F, -2.7132F, -7.5366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 22)
						.addBox(4.97F, 0.7868F, -3.0366F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -117.28F, -29.0F, 0.9717F, -1.3195F, -0.2855F));
		PartDefinition Neck = Head.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(175, 177).addBox(-9.28F, -111.6F, -14.72F, 18.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition HeadSidePiece_r1 = Neck.addOrReplaceChild("HeadSidePiece_r1",
				CubeListBuilder.create().texOffs(0, 44).addBox(-6.3148F, -4.8685F, -6.148F, 3.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -118.28F, -10.0F, 0.2559F, 0.056F, -0.211F));
		PartDefinition HeadSidePiece_r2 = Neck.addOrReplaceChild("HeadSidePiece_r2",
				CubeListBuilder.create().texOffs(131, 0).addBox(1.72F, 1.1648F, -7.4421F, 3.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -123.28F, -10.0F, 0.258F, -0.045F, 0.1687F));
		PartDefinition BackPiece_r1 = Neck.addOrReplaceChild("BackPiece_r1",
				CubeListBuilder.create().texOffs(0, 146).addBox(-7.28F, -4.1873F, -12.995F, 14.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -124.28F, 8.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition BackPiece_r2 = Neck.addOrReplaceChild("BackPiece_r2",
				CubeListBuilder.create().texOffs(131, 65).addBox(-9.28F, 5.68F, -3.72F, 18.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -109.28F, 6.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition SidePiece_r1 = Neck.addOrReplaceChild("SidePiece_r1",
				CubeListBuilder.create().texOffs(0, 217).addBox(16.72F, 1.93F, -6.72F, 3.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -110.28F, -8.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition SidePiece_r2 = Neck.addOrReplaceChild("SidePiece_r2",
				CubeListBuilder.create().texOffs(23, 225).addBox(-1.28F, -1.32F, -6.72F, 3.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -110.28F, -8.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition Horns = Head.addOrReplaceChild("Horns", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Horn_r1 = Horns.addOrReplaceChild("Horn_r1",
				CubeListBuilder.create().texOffs(132, 230).addBox(-3.28F, -0.5931F, 2.1843F, 4.0F, 3.0F, 13.0F, new CubeDeformation(0.0F))
						.texOffs(108, 164).addBox(-15.28F, -0.5931F, 2.1843F, 4.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -119.28F, -22.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition Horn_r2 = Horns.addOrReplaceChild("Horn_r2",
				CubeListBuilder.create().texOffs(190, 236).addBox(-0.28F, -0.3309F, -1.0782F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -127.28F, -9.0F, 0.8702F, 0.7914F, 0.7006F));
		PartDefinition Horn_r3 = Horns.addOrReplaceChild("Horn_r3",
				CubeListBuilder.create().texOffs(146, 189).addBox(-2.4167F, -1.0994F, 0.7133F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -128.28F, -6.0F, 2.1117F, 0.8934F, 2.2276F));
		PartDefinition Horn_r4 = Horns.addOrReplaceChild("Horn_r4",
				CubeListBuilder.create().texOffs(91, 146).addBox(-0.8911F, -1.7116F, -0.5822F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.0F, -126.28F, -8.0F, 2.5674F, 0.147F, 3.0471F));
		PartDefinition Horn_r5 = Horns.addOrReplaceChild("Horn_r5",
				CubeListBuilder.create().texOffs(131, 25).addBox(-1.7074F, -1.7116F, -0.018F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, -126.28F, -8.0F, 2.5674F, -0.147F, -3.0471F));
		PartDefinition Horn_r6 = Horns.addOrReplaceChild("Horn_r6",
				CubeListBuilder.create().texOffs(228, 179).addBox(-2.03F, -1.1743F, -0.5409F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -126.28F, -9.0F, 0.9436F, -0.8452F, -0.8012F));
		PartDefinition Horn_r7 = Horns.addOrReplaceChild("Horn_r7",
				CubeListBuilder.create().texOffs(107, 149).addBox(-1.5335F, -1.0994F, -0.8015F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, -128.28F, -6.0F, 2.1565F, -0.8701F, -2.2856F));
		PartDefinition UpperBody = partdefinition.addOrReplaceChild("UpperBody",
				CubeListBuilder.create().texOffs(185, 0).addBox(-10.92F, -70.32F, -13.04F, 21.0F, 18.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(91, 110).addBox(-20.4F, -87.68F, -17.52F, 40.0F, 18.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition sideab_r1 = UpperBody.addOrReplaceChild("sideab_r1",
				CubeListBuilder.create().texOffs(0, 88).addBox(-6.04F, 0.84F, -2.92F, 29.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, -47.16F, -8.0F, 0.0F, 0.0F, -1.8326F));
		PartDefinition sideab_r2 = UpperBody.addOrReplaceChild("sideab_r2",
				CubeListBuilder.create().texOffs(131, 88).addBox(-6.04F, -9.16F, -2.92F, 29.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, -47.16F, -8.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition Abs = UpperBody.addOrReplaceChild("Abs",
				CubeListBuilder.create().texOffs(146, 25).addBox(-9.92F, -85.32F, -14.79F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(91, 110).addBox(-8.92F, -80.07F, -13.79F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 51)
						.addBox(-0.67F, -80.07F, -13.79F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 21)
						.addBox(-0.67F, -74.82F, -13.79F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 15)
						.addBox(-7.92F, -74.82F, -13.79F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 100)
						.addBox(-0.42F, -85.32F, -14.79F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition Pelvis = UpperBody.addOrReplaceChild("Pelvis",
				CubeListBuilder.create().texOffs(185, 44).addBox(-12.24F, -68.32F, -11.92F, 24.0F, 14.0F, 9.0F, new CubeDeformation(0.0F))
						.texOffs(54, 15).addBox(-3.24F, -64.32F, -3.92F, 8.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition tailjaw_r1 = Pelvis.addOrReplaceChild("tailjaw_r1",
				CubeListBuilder.create().texOffs(225, 82).addBox(-0.6734F, -6.6087F, -0.9174F, 6.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(76.0F, -29.16F, -35.0F, 2.6122F, 0.023F, -2.9374F));
		PartDefinition Tail_r1 = Pelvis.addOrReplaceChild("Tail_r1",
				CubeListBuilder.create().texOffs(104, 146).addBox(-2.8557F, -0.4172F, 11.0439F, 6.0F, 5.0F, 38.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-3.8557F, -1.4172F, -4.9561F, 8.0F, 6.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(77.0F, -48.16F, -5.0F, 2.874F, 0.023F, -2.9374F));
		PartDefinition Tail_r2 = Pelvis.addOrReplaceChild("Tail_r2",
				CubeListBuilder.create().texOffs(0, 44).addBox(-2.4948F, -1.7828F, -0.3719F, 8.0F, 6.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(61.0F, -60.16F, 27.0F, 2.8228F, 0.5674F, -3.1066F));
		PartDefinition Tail_r3 = Pelvis.addOrReplaceChild("Tail_r3",
				CubeListBuilder.create().texOffs(131, 0).addBox(-5.4066F, -3.356F, -0.1773F, 8.0F, 6.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.0F, -60.16F, 32.0F, 3.0894F, 1.3526F, 3.1328F));
		PartDefinition Tail_r4 = Pelvis.addOrReplaceChild("Tail_r4",
				CubeListBuilder.create().texOffs(131, 44).addBox(-4.24F, -5.16F, -0.92F, 8.0F, 6.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -59.16F, 10.0F, 0.0176F, 0.8724F, 0.0556F));
		PartDefinition Weapon = partdefinition.addOrReplaceChild("Weapon", CubeListBuilder.create(), PartPose.offset(-5.0F, 26.0F, 0.0F));
		PartDefinition Hilt3_r1 = Weapon.addOrReplaceChild("Hilt3_r1",
				CubeListBuilder.create().texOffs(0, 70).addBox(3.5F, -7.5F, -0.25F, 16.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, -41.0F, -26.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Blade = Weapon.addOrReplaceChild("Blade", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition BladeSharp6_r1 = Blade.addOrReplaceChild("BladeSharp6_r1",
				CubeListBuilder.create().texOffs(12, 44).addBox(-0.8587F, 0.0F, -18.2071F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-1.8587F, 0.0F, -12.2071F, 9.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.0F, -40.0F, -172.0F, 0.0F, -0.3927F, -1.5708F));
		PartDefinition BladeSharp4_r1 = Blade.addOrReplaceChild("BladeSharp4_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.75F, 0.0F, -28.0F, 12.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(62, 88)
						.addBox(-6.75F, 0.0F, -16.0F, 16.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.0F, -38.0F, -145.0F, 0.0F, -0.2182F, -1.5708F));
		PartDefinition BladeSharp2_r1 = Blade.addOrReplaceChild("BladeSharp2_r1",
				CubeListBuilder.create().texOffs(39, 0).addBox(-10.75F, 0.0F, -15.0F, 19.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.0F, -39.0F, -134.0F, 0.0F, -0.2182F, -1.5708F));
		PartDefinition BladeSharp_r1 = Blade.addOrReplaceChild("BladeSharp_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-15.75F, -0.5F, -39.25F, 11.0F, 1.0F, 109.0F, new CubeDeformation(0.0F))
						.texOffs(186, 88).addBox(-5.75F, -0.5F, -39.25F, 10.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 195)
						.addBox(-5.75F, -1.5F, -20.25F, 11.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.0F, -45.0F, -97.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Blade2_r1 = Blade.addOrReplaceChild("Blade2_r1",
				CubeListBuilder.create().texOffs(211, 133).addBox(0.0F, 5.5F, -18.25F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.0F, -64.0F, -79.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Blade2_r2 = Blade.addOrReplaceChild("Blade2_r2",
				CubeListBuilder.create().texOffs(48, 171).addBox(-1.5F, -6.5F, -74.25F, 11.0F, 3.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 110)
						.addBox(-1.5F, -6.5F, -51.25F, 20.0F, 3.0F, 51.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, -41.0F, -26.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Handle = Weapon.addOrReplaceChild("Handle", CubeListBuilder.create(), PartPose.offset(-43.0F, -55.0F, 0.0F));
		PartDefinition hexadecagon_r1 = Handle.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(185, 77).addBox(-24.8752F, -2.0032F, -0.3972F, 28.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(185, 28).addBox(-24.8752F, -0.6028F, -1.9968F, 28.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0304F, 13.5552F, 4.2368F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition hexadecagon_r2 = Handle.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(41, 198).addBox(-24.8752F, -2.0032F, -0.3972F, 28.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(185, 33).addBox(-24.8752F, -0.6028F, -1.9968F, 28.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0304F, 13.5552F, 4.2368F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hexadecagon_r3 = Handle.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(223, 38).addBox(-24.8752F, -2.0032F, -0.3972F, 28.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(185, 67).addBox(-24.8752F, -0.6028F, -1.9968F, 28.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0304F, 13.5552F, 4.2368F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition hexadecagon_r4 = Handle.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(57, 164).addBox(-24.8752F, -0.6028F, -1.9968F, 28.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0304F, 13.5552F, 4.2368F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition hexadecagon_r5 = Handle.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(185, 72).addBox(-24.8752F, -0.6028F, -1.9968F, 28.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.0304F, 13.5552F, 4.2368F, 0.0F, -1.5708F, 0.7854F));
		PartDefinition Hilt1 = Weapon.addOrReplaceChild("Hilt1", CubeListBuilder.create(), PartPose.offset(-48.25F, -58.5F, -29.0F));
		PartDefinition hexadecagon_r6 = Hilt1.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(54, 44).addBox(1.9522F, -2.4744F, -0.5024F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(91, 102).addBox(1.9522F, -0.4976F, -2.5256F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.3272F, 17.0206F, 4.6395F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition hexadecagon_r7 = Hilt1.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(0, 88).addBox(1.9522F, -2.4744F, -0.5024F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(35, 110).addBox(1.9522F, -0.4976F, -2.5256F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.3272F, 17.0206F, 4.6395F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hexadecagon_r8 = Hilt1.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(66, 88).addBox(1.9522F, -2.4744F, -0.5024F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(91, 116).addBox(1.9522F, -0.4976F, -2.5256F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.3272F, 17.0206F, 4.6395F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition hexadecagon_r9 = Hilt1.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(92, 37).addBox(1.9522F, -0.4976F, -2.5256F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.3272F, 17.0206F, 4.6395F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition hexadecagon_r10 = Hilt1.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(91, 122).addBox(1.9522F, -0.4976F, -2.5256F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.3272F, 17.0206F, 4.6395F, 0.0F, -1.5708F, 0.7854F));
		PartDefinition Hilt2 = Weapon.addOrReplaceChild("Hilt2", CubeListBuilder.create(), PartPose.offset(-51.0F, -60.25F, -11.75F));
		PartDefinition hexadecagon_r11 = Hilt2.addOrReplaceChild("hexadecagon_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(3.1931F, -4.4035F, -0.9143F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(233, 237).addBox(3.1931F, -1.0857F, -4.5965F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.8106F, 19.0075F, -17.7961F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition hexadecagon_r12 = Hilt2.addOrReplaceChild("hexadecagon_r12",
				CubeListBuilder.create().texOffs(0, 11).addBox(3.1931F, -4.4035F, -0.9143F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(240, 99).addBox(3.1931F, -1.0857F, -4.5965F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.8106F, 19.0075F, -17.7961F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hexadecagon_r13 = Hilt2.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(0, 44).addBox(3.1931F, -4.4035F, -0.9143F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 242).addBox(3.1931F, -1.0857F, -4.5965F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.8106F, 19.0075F, -17.7961F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition hexadecagon_r14 = Hilt2.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(41, 203).addBox(3.1931F, -1.0857F, -4.5965F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.8106F, 19.0075F, -17.7961F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition hexadecagon_r15 = Hilt2.addOrReplaceChild("hexadecagon_r15",
				CubeListBuilder.create().texOffs(242, 225).addBox(3.1931F, -1.0857F, -4.5965F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.8106F, 19.0075F, -17.7961F, 0.0F, -1.5708F, 0.7854F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_finger_r1 = LeftArm.addOrReplaceChild("left_finger_r1",
				CubeListBuilder.create().texOffs(98, 72).addBox(-9.1094F, -0.995F, 1.0841F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(100, 100).addBox(-5.6094F, 1.255F, -1.4159F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(101, 36)
						.addBox(-2.1094F, 1.255F, -0.4159F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(30.0F, -41.0F, -7.0F, 0.1403F, -1.2788F, 0.5406F));
		PartDefinition left_finger_r2 = LeftArm.addOrReplaceChild("left_finger_r2",
				CubeListBuilder.create().texOffs(98, 62).addBox(21.75F, 4.7881F, -3.1284F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(131, 0).addBox(18.0F, 4.7881F, -3.1284F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 51)
						.addBox(15.0F, 1.0381F, -1.1284F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.0F, -55.0F, -29.0F, -1.5708F, -1.4399F, 1.6581F));
		PartDefinition left_hand_r1 = LeftArm.addOrReplaceChild("left_hand_r1",
				CubeListBuilder.create().texOffs(89, 12).addBox(-5.0F, 8.0F, -3.0F, 7.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(206, 225)
						.addBox(-7.0F, -2.0F, -4.0F, 11.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.0F, -65.0F, -8.0F, 0.0F, -1.5708F, 0.0873F));
		PartDefinition left_ShoulderGOLDpearl_r1 = LeftArm.addOrReplaceChild("left_ShoulderGOLDpearl_r1",
				CubeListBuilder.create().texOffs(89, 44).addBox(-4.5F, -33.5F, 8.0F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-9.0F, -35.0F, 9.0F, 17.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 164)
						.addBox(-11.0F, -36.0F, 11.0F, 21.0F, 16.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 110)
						.addBox(-8.0F, -22.0F, 12.0F, 13.0F, 27.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(45.0F, -68.0F, -8.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_finger_r1 = RightArm.addOrReplaceChild("right_finger_r1",
				CubeListBuilder.create().texOffs(102, 0).addBox(-6.9819F, -0.783F, -4.0046F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(31, 13).addBox(-5.2319F, -1.033F, -0.0046F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-1.2319F, -1.033F, -0.0046F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-29.0F, -40.0F, -7.0F, -2.3998F, -1.4399F, 1.4835F));
		PartDefinition right_finger_r2 = RightArm.addOrReplaceChild("right_finger_r2",
				CubeListBuilder.create().texOffs(92, 0).addBox(8.0F, 1.0495F, -1.133F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(95, 77)
						.addBox(4.0F, 1.0495F, -1.133F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(131, 25)
						.addBox(2.0F, -0.9505F, -2.133F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-29.0F, -50.0F, -15.0F, -1.5708F, -1.4399F, 1.4835F));
		PartDefinition right_hand_r1 = RightArm.addOrReplaceChild("right_hand_r1",
				CubeListBuilder.create().texOffs(132, 246).addBox(-3.0F, 6.0F, -1.0F, 7.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(131, 44)
						.addBox(-5.0F, -4.0F, -4.0F, 11.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-29.0F, -63.0F, -9.0F, 0.0F, -1.5708F, -0.0873F));
		PartDefinition right_Shoulder_r1 = RightArm.addOrReplaceChild("right_Shoulder_r1",
				CubeListBuilder.create().texOffs(154, 146).addBox(-11.0F, -36.0F, 64.0F, 21.0F, 16.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(45.0F, -68.0F, -8.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition right_armGOLD_r1 = RightArm.addOrReplaceChild("right_armGOLD_r1",
				CubeListBuilder.create().texOffs(106, 216).addBox(-7.25F, -18.0F, 7.0F, 15.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(54, 44)
						.addBox(-6.25F, -22.0F, 8.0F, 13.0F, 27.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-41.0F, -68.0F, -8.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(166, 233).addBox(-10.0F, -20.0F, -3.36F, 6.0F, 20.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(60, 206).addBox(-14.0F, -55.0F, -12.36F, 13.0F, 21.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_thigh_r1 = RightLeg.addOrReplaceChild("right_thigh_r1",
				CubeListBuilder.create().texOffs(98, 230).addBox(-12.0F, 4.2234F, -4.5657F, 9.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -34.0F, -2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition right_thigh_r2 = RightLeg.addOrReplaceChild("right_thigh_r2",
				CubeListBuilder.create().texOffs(207, 110).addBox(-14.0F, -2.5F, -9.86F, 13.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -38.0F, -2.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(63, 237).addBox(4.72F, -20.0F, -3.36F, 6.0F, 20.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(160, 202).addBox(1.0F, -55.0F, -12.36F, 13.0F, 21.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_thigh_r1 = LeftLeg.addOrReplaceChild("left_thigh_r1",
				CubeListBuilder.create().texOffs(228, 159).addBox(3.0F, 4.2234F, -4.5657F, 9.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -34.0F, -2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition left_thigh_r2 = LeftLeg.addOrReplaceChild("left_thigh_r2",
				CubeListBuilder.create().texOffs(206, 202).addBox(1.0F, -2.5F, -9.86F, 13.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -38.0F, -2.0F, 0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		UpperBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Weapon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
