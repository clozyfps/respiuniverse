// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelkizaru<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kizaru"), "main");
	private final ModelPart sunglasses;
	private final ModelPart head;
	private final ModelPart cape2;
	private final ModelPart Rightarn;
	private final ModelPart Leftarm;
	private final ModelPart Leftleg;
	private final ModelPart Rightleg;
	private final ModelPart body;

	public Modelkizaru(ModelPart root) {
		this.sunglasses = root.getChild("sunglasses");
		this.head = root.getChild("head");
		this.cape2 = root.getChild("cape2");
		this.Rightarn = root.getChild("Rightarn");
		this.Leftarm = root.getChild("Leftarm");
		this.Leftleg = root.getChild("Leftleg");
		this.Rightleg = root.getChild("Rightleg");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition sunglasses = partdefinition.addOrReplaceChild("sunglasses", CubeListBuilder.create(),
				PartPose.offset(1.5134F, 5.8034F, -1.2686F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(24, 37)
				.addBox(-1.125F, -24.3125F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cape2 = partdefinition.addOrReplaceChild("cape2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -3.1416F, -0.0087F, 3.1416F));

		PartDefinition Marinecaptaincape = cape2.addOrReplaceChild("Marinecaptaincape", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.1875F, -0.6875F, -10.1875F, -0.4712F, 0.0F, 0.0F));

		PartDefinition shoulders = Marinecaptaincape.addOrReplaceChild("shoulders", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.5F, 0.0F));

		PartDefinition cape = Marinecaptaincape.addOrReplaceChild("cape", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.0625F, -4.5625F));

		PartDefinition cube_r1 = cape.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 21)
						.addBox(-7.0F, -11.5F, -3.5F, 2.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 21)
						.addBox(5.0F, -11.5F, -3.5F, 2.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -11.5F, -0.5F, 14.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1875F, -13.4691F, 7.2295F, 2.7139F, 0.0156F, 3.1337F));

		PartDefinition Arms = Marinecaptaincape.addOrReplaceChild("Arms", CubeListBuilder.create(),
				PartPose.offset(-0.375F, -13.9691F, 7.2295F));

		PartDefinition Arm1 = Arms.addOrReplaceChild("Arm1", CubeListBuilder.create(),
				PartPose.offset(0.75F, 0.0F, -0.75F));

		PartDefinition cube_r2 = Arm1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 21).addBox(-10.3125F, -1.3125F, 7.4375F, 2.0F, 14.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4375F, -5.4862F, 0.5584F, 2.9938F, -0.0273F, 3.0192F));

		PartDefinition Arm2 = Arms.addOrReplaceChild("Arm2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.9453F, -0.6018F, 4.6932F, -0.0352F, -0.1395F, 0.0049F));

		PartDefinition cube_r3 = Arm2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(16, 21).addBox(4.875F, -4.25F, 8.125F, 2.0F, 14.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2444F, -2.9382F, -3.0039F, 2.9228F, -0.0329F, -3.0728F));

		PartDefinition Rightarn = partdefinition.addOrReplaceChild("Rightarn",
				CubeListBuilder.create().texOffs(16, 37)
						.addBox(-4.6875F, -21.8125F, -0.8125F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(6, 21).addBox(-4.875F, -12.25F, -0.9375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Leftarm = partdefinition.addOrReplaceChild("Leftarm",
				CubeListBuilder.create().texOffs(6, 21)
						.addBox(3.125F, -12.25F, -0.9375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 37)
						.addBox(3.3125F, -21.8125F, -0.8125F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create().texOffs(30, 7)
				.addBox(0.4375F, -10.875F, -1.1875F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
				.addBox(0.4375F, -0.375F, -2.9375F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg",
				CubeListBuilder.create().texOffs(32, 19)
						.addBox(-2.5F, -10.875F, -1.1875F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 24)
						.addBox(-2.5F, -0.375F, -2.9375F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(30, 0)
						.addBox(-3.375F, -21.875F, -1.5F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 31)
						.addBox(-2.5F, -16.375F, -1.1875F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		sunglasses.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cape2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightarn.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.Rightarn.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}