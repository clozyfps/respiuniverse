// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGoku<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "goku"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelGoku(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hair = Head.addOrReplaceChild("hair", CubeListBuilder.create(),
				PartPose.offset(3.277F, -5.5642F, -5.959F));

		PartDefinition bangs = hair.addOrReplaceChild("bangs", CubeListBuilder.create(),
				PartPose.offset(-1.75F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bangs.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(20, 8).addBox(-0.8185F, -1.2022F, -1.377F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6632F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = bangs.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(20, 8).addBox(-1.131F, -2.0213F, -0.0401F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.1745F, 0.0F));

		PartDefinition cube_r3 = bangs.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(20, 9).addBox(-0.6932F, -1.3566F, -3.344F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.865F, 0.2782F, 0.1212F));

		PartDefinition cube_r4 = bangs.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(20, 8).addBox(-1.131F, -2.0213F, -0.0401F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8125F, 0.0F, 0.0F, 0.0349F, 0.1745F, 0.0F));

		PartDefinition cube_r5 = bangs.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(20, 8).addBox(-0.8185F, -1.2022F, -1.377F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8125F, 0.0F, 0.0F, 0.6632F, 0.1745F, 0.0F));

		PartDefinition cube_r6 = bangs.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(20, 9).addBox(-0.6932F, -1.3566F, -3.344F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8125F, 0.0F, 0.0F, 0.8245F, 0.0803F, -0.1039F));

		PartDefinition cube_r7 = bangs.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(20, 8).addBox(-1.5625F, -1.0F, -1.1875F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7145F, -1.0608F, 0.8965F, 0.0349F, 0.3491F, 0.0F));

		PartDefinition cube_r8 = bangs.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(20, 8).addBox(-0.6563F, -0.2813F, -1.6875F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7627F, -0.9169F, -0.2473F, 0.6632F, 0.3491F, 0.0F));

		PartDefinition cube_r9 = bangs.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(20, 9).addBox(-0.3438F, -0.4063F, -1.125F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2906F, 1.0332F, -2.0632F, 0.8059F, 0.2539F, -0.1071F));

		PartDefinition cube_r10 = bangs.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(20, 9).addBox(-0.6932F, -1.3566F, -3.344F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 0.0F, 0.0F, 0.8358F, 0.0355F, 0.1166F));

		PartDefinition cube_r11 = bangs.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(20, 8).addBox(-0.8185F, -1.2022F, -1.377F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 0.0F, 0.0F, 0.6632F, -0.0698F, 0.0F));

		PartDefinition cube_r12 = bangs.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(20, 8).addBox(-1.131F, -2.0213F, -0.0401F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 0.0F, 0.0F, 0.0349F, -0.0698F, 0.0F));

		PartDefinition top = hair.addOrReplaceChild("top", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.4645F, -4.1858F, 6.334F, 0.0F, 1.2566F, 1.4486F));

		PartDefinition cube_r13 = top.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(20, 9).addBox(-4.2188F, -0.8438F, -1.125F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7364F, 1.219F, -2.3347F, 0.8059F, 0.2539F, -0.1071F));

		PartDefinition cube_r14 = top.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(20, 8).addBox(-4.5313F, -0.7188F, -1.6875F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2643F, -0.7311F, -0.5188F, 0.6632F, 0.3491F, 0.0F));

		PartDefinition cube_r15 = top.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(20, 8).addBox(-5.4375F, -1.4375F, -1.1875F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3125F, -0.875F, 0.625F, 0.0349F, 0.3491F, 0.0F));

		PartDefinition cube_r16 = top.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(20, 8).addBox(-1.75F, -1.4375F, -1.1875F, 3.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.125F, 0.625F, 0.375F, 0.0349F, 0.3491F, 0.0F));

		PartDefinition cube_r17 = top.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(20, 9).addBox(-0.5313F, -0.8438F, -1.125F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4511F, 2.719F, -2.5847F, 0.8059F, 0.2539F, -0.1071F));

		PartDefinition cube_r18 = top.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(20, 8).addBox(-0.8438F, -0.7188F, -1.6875F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9232F, 0.7689F, -0.7688F, 0.6632F, 0.3491F, 0.0F));

		PartDefinition sides = hair.addOrReplaceChild("sides", CubeListBuilder.create(),
				PartPose.offset(-4.7281F, -2.9668F, 3.9993F));

		PartDefinition cube_r19 = sides.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(20, 8)
				.addBox(-0.6485F, -1.8564F, -3.3441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
				.addBox(-0.7139F, 0.2419F, -2.6803F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
				.addBox(-0.7139F, 0.2419F, -2.6803F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
				.addBox(-0.6485F, -1.8564F, -3.3441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8453F, 3.8608F, 4.698F, -2.8449F, -1.501F, -3.1416F));

		PartDefinition cube_r20 = sides.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(20, 8)
				.addBox(-1.0019F, -1.8354F, -1.3415F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
				.addBox(-1.0673F, 0.0196F, -0.1572F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
				.addBox(-1.0673F, 0.0196F, -0.1572F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
				.addBox(-1.0019F, -1.8354F, -1.3415F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8453F, 3.8608F, 4.698F, -3.1067F, -1.501F, 3.1416F));

		PartDefinition cube_r21 = sides.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(20, 8).addBox(-0.8486F, -0.7361F, -0.7132F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8113F, 1.5966F, 4.9033F, -3.1067F, -1.501F, 2.9147F));

		PartDefinition cube_r22 = sides.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(20, 8).addBox(-0.4952F, -0.632F, -3.0217F, 1.0F, 0.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8113F, 1.5966F, 4.9033F, -2.8449F, -1.501F, 2.9147F));

		PartDefinition cube_r23 = sides.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(20, 8)
						.addBox(-1.0673F, 0.0196F, -0.1572F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
						.addBox(-1.0019F, -1.8354F, -1.3415F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4672F, 3.3608F, 4.698F, -3.1067F, 1.2043F, 3.1416F));

		PartDefinition cube_r24 = sides.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(20, 8)
						.addBox(-0.7139F, 0.2419F, -2.6803F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 8)
						.addBox(-0.6485F, -1.8564F, -3.3441F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4672F, 3.3608F, 4.698F, -2.8449F, 1.2043F, -3.1416F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}