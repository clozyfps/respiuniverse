// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeluzuiarmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "uzuiarmor"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart octagon;
	private final ModelPart octagon4;
	private final ModelPart octagon5;
	private final ModelPart octagon6;
	private final ModelPart octagon7;
	private final ModelPart octagon8;
	private final ModelPart octagon9;
	private final ModelPart octagon10;
	private final ModelPart octagon11;
	private final ModelPart octagon12;
	private final ModelPart octagon13;
	private final ModelPart bone;

	public Modeluzuiarmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.octagon = root.getChild("octagon");
		this.octagon4 = root.getChild("octagon4");
		this.octagon5 = root.getChild("octagon5");
		this.octagon6 = root.getChild("octagon6");
		this.octagon7 = root.getChild("octagon7");
		this.octagon8 = root.getChild("octagon8");
		this.octagon9 = root.getChild("octagon9");
		this.octagon10 = root.getChild("octagon10");
		this.octagon11 = root.getChild("octagon11");
		this.octagon12 = root.getChild("octagon12");
		this.octagon13 = root.getChild("octagon13");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition headband = Head.addOrReplaceChild("headband", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = headband.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 47).addBox(-4.625F, -1.375F, -0.5F, 9.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.25F, -4.25F, 0.0F, 0.0F, -0.1658F));

		PartDefinition octagon14 = headband.addOrReplaceChild("octagon14",
				CubeListBuilder.create().texOffs(58, 37)
						.addBox(0.0F, -0.4142F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(0.0F, -1.0F, -0.4142F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, -5.8125F, -5.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r1 = octagon14.addOrReplaceChild("octagon_r1",
				CubeListBuilder.create().texOffs(58, 37)
						.addBox(0.0F, -1.0F, -0.4142F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(0.0F, -0.4142F, -0.9375F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon2 = headband.addOrReplaceChild("octagon2",
				CubeListBuilder.create().texOffs(58, 37)
						.addBox(0.0F, -0.4142F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(0.0F, -1.0F, -0.4142F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -6.4375F, -5.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r2 = octagon2.addOrReplaceChild("octagon_r2",
				CubeListBuilder.create().texOffs(58, 37)
						.addBox(0.0F, -1.0F, -0.4142F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(0.0F, -0.4142F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon3 = headband.addOrReplaceChild("octagon3",
				CubeListBuilder.create().texOffs(7, 34)
						.addBox(0.25F, 2.8125F, 6.5F, 0.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 34)
						.addBox(0.25F, 1.375F, -1.875F, 0.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(0.0F, -1.0F, -0.4142F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(0.0F, -0.4142F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5625F, -6.875F, -5.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r3 = octagon3.addOrReplaceChild("octagon_r3",
				CubeListBuilder.create().texOffs(58, 37)
						.addBox(0.0F, -0.4142F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(0.0F, -1.0F, -0.4142F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

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

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 48)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition octagon = partdefinition.addOrReplaceChild("octagon",
				CubeListBuilder.create().texOffs(1, 35)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 35)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.125F, -1.0625F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r4 = octagon.addOrReplaceChild("octagon_r4",
				CubeListBuilder.create().texOffs(1, 35)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(1, 35)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon4 = partdefinition.addOrReplaceChild("octagon4",
				CubeListBuilder.create().texOffs(3, 36)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 36)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.125F, 0.1875F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r5 = octagon4.addOrReplaceChild("octagon_r5",
				CubeListBuilder.create().texOffs(3, 36)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 36)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon5 = partdefinition.addOrReplaceChild("octagon5",
				CubeListBuilder.create().texOffs(3, 38)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 38)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.125F, 1.4375F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r6 = octagon5.addOrReplaceChild("octagon_r6",
				CubeListBuilder.create().texOffs(3, 38)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 38)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon6 = partdefinition.addOrReplaceChild("octagon6",
				CubeListBuilder.create().texOffs(3, 38)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 38)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.125F, 2.75F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r7 = octagon6.addOrReplaceChild("octagon_r7",
				CubeListBuilder.create().texOffs(3, 38)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 38)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon7 = partdefinition.addOrReplaceChild("octagon7",
				CubeListBuilder.create().texOffs(4, 41)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 41)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.125F, 4.0625F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r8 = octagon7.addOrReplaceChild("octagon_r8",
				CubeListBuilder.create().texOffs(4, 41)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 41)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon8 = partdefinition.addOrReplaceChild("octagon8",
				CubeListBuilder.create().texOffs(2, 40)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 40)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.25F, 3.8125F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r9 = octagon8.addOrReplaceChild("octagon_r9",
				CubeListBuilder.create().texOffs(2, 40)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 40)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon9 = partdefinition.addOrReplaceChild("octagon9",
				CubeListBuilder.create().texOffs(4, 39)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 39)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.25F, 2.4375F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r10 = octagon9.addOrReplaceChild("octagon_r10",
				CubeListBuilder.create().texOffs(4, 39)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 39)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon10 = partdefinition.addOrReplaceChild("octagon10",
				CubeListBuilder.create().texOffs(3, 36)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 36)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.25F, 1.1875F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r11 = octagon10.addOrReplaceChild("octagon_r11",
				CubeListBuilder.create().texOffs(3, 36)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 36)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon11 = partdefinition.addOrReplaceChild("octagon11",
				CubeListBuilder.create().texOffs(3, 37)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 37)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.25F, -0.125F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r12 = octagon11.addOrReplaceChild("octagon_r12",
				CubeListBuilder.create().texOffs(3, 37)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 37)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon12 = partdefinition.addOrReplaceChild("octagon12",
				CubeListBuilder.create().texOffs(2, 38)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 38)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.25F, -1.4375F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r13 = octagon12.addOrReplaceChild("octagon_r13",
				CubeListBuilder.create().texOffs(2, 38)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 38)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition octagon13 = partdefinition.addOrReplaceChild("octagon13",
				CubeListBuilder.create().texOffs(2, 40)
						.addBox(-2.5F, -2.2071F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 40)
						.addBox(-2.5F, -2.5F, 1.7929F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.25F, -2.6875F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition octagon_r14 = octagon13.addOrReplaceChild("octagon_r14",
				CubeListBuilder.create().texOffs(2, 40)
						.addBox(-0.5F, -0.5F, -0.2071F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 40)
						.addBox(-0.5F, -0.2071F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 2.0944F, 0.0F, 3.1416F));

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
		octagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		octagon4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		octagon5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		octagon6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		octagon7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		octagon8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		octagon9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		octagon10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		octagon11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		octagon12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		octagon13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}