// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbathollow<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bathollow"), "main");
	private final ModelPart head;
	private final ModelPart body;

	public Modelbathollow(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightEar = head.addOrReplaceChild("rightEar", CubeListBuilder.create().texOffs(24, 0).addBox(
				-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftEar = head.addOrReplaceChild("leftEar",
				CubeListBuilder.create().texOffs(24, 0).mirror()
						.addBox(1.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-5.0F, 16.0F, 0.0F, 10.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightWing = body
				.addOrReplaceChild("rightWing",
						CubeListBuilder.create().texOffs(42, 0).addBox(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition rightWingTip = rightWing.addOrReplaceChild("rightWingTip",
				CubeListBuilder.create().texOffs(24, 16).addBox(-8.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 1.0F, 1.5F, 0.0F, -0.2618F, 0.0F));

		PartDefinition leftWing = body.addOrReplaceChild("leftWing",
				CubeListBuilder.create().texOffs(42, 0).mirror()
						.addBox(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition leftWingTip = leftWing.addOrReplaceChild("leftWingTip",
				CubeListBuilder.create().texOffs(24, 16).mirror()
						.addBox(0.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(12.0F, 1.0F, 1.5F, 0.0F, 0.2618F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}