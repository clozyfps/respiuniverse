// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmarineredcape<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "marineredcape"), "main");
	private final ModelPart Arms;
	private final ModelPart cape;
	private final ModelPart shoulders;
	private final ModelPart rightarm;
	private final ModelPart leftarm;

	public Modelmarineredcape(ModelPart root) {
		this.Arms = root.getChild("Arms");
		this.cape = root.getChild("cape");
		this.shoulders = root.getChild("shoulders");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Arms = partdefinition.addOrReplaceChild("Arms", CubeListBuilder.create(),
				PartPose.offset(-0.1875F, 10.0309F, 7.2295F));

		PartDefinition Arm1 = Arms.addOrReplaceChild("Arm1", CubeListBuilder.create(),
				PartPose.offset(0.75F, 0.0F, -0.75F));

		PartDefinition cube_r1 = Arm1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(23, 23)
						.addBox(-2.5625F, -0.375F, -5.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-2.5625F, -0.375F, -0.5625F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.1229F, -0.1938F, 5.9979F, 1.7279F, -0.8203F, -1.5708F));

		PartDefinition cube_r2 = Arm1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 19)
						.addBox(-0.25F, 1.875F, -5.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-0.25F, 1.875F, -1.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -4.0F, 7.0F, 0.7443F, -0.1069F, 0.1153F));

		PartDefinition cube_r3 = Arm1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(14, 0).addBox(-1.3125F, -5.625F, -1.5F, 4.0F, 14.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4375F, -5.4862F, 0.5584F, 0.7907F, -0.0673F, 0.102F));

		PartDefinition Arm2 = Arms.addOrReplaceChild("Arm2", CubeListBuilder.create(),
				PartPose.offset(3.5759F, -3.54F, 1.6894F));

		PartDefinition cube_r4 = Arm2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(12, 24)
						.addBox(0.375F, 5.625F, -2.375F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 17)
						.addBox(0.375F, 5.5625F, 1.5625F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.375F, -7.5625F, -1.4375F, 4.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7808F, 0.1558F, -0.1198F));

		PartDefinition cube_r5 = Arm2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 22).addBox(-2.375F, -0.5F, -0.4375F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9368F, 3.6347F, 3.4497F, 1.3232F, -0.7576F, -1.5203F));

		PartDefinition cube_r6 = Arm2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(12, 22).addBox(-1.875F, -0.5F, -0.625F, 5.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9506F, 4.571F, 3.9041F, 1.3345F, -0.7739F, -1.5114F));

		PartDefinition cape = partdefinition.addOrReplaceChild("cape", CubeListBuilder.create(),
				PartPose.offset(0.0F, 23.5F, 0.0F));

		PartDefinition cube_r7 = cape.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(54, 14)
						.addBox(-8.25F, -11.5F, -2.0F, 3.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 39)
						.addBox(5.1875F, -11.5F, -2.0F, 3.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-8.0F, -11.5F, -0.5F, 16.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1875F, -13.4691F, 7.2295F, 0.5149F, 0.0F, 0.0F));

		PartDefinition shoulders = partdefinition.addOrReplaceChild("shoulders",
				CubeListBuilder.create().texOffs(14, 17)
						.addBox(5.0F, -24.1875F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-7.875F, -24.1875F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.5F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cape.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shoulders.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}