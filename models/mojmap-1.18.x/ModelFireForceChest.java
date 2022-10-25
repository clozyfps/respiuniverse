// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFireForceChest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public ModelFireForceChest(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(19, 0)
						.addBox(-3.0F, -0.5F, -1.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(14, 22)
						.addBox(-2.0F, -1.5F, -3.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.25F)).texOffs(28, 14)
						.addBox(-3.0F, -1.5F, 1.75F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(2, 0)
						.addBox(-3.0F, -0.5F, -3.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.25F)).texOffs(0, 0)
						.addBox(2.0F, -0.5F, -3.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.25F)).texOffs(28, 0)
						.addBox(3.5F, -1.5F, -3.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.25F)).texOffs(0, 28)
						.addBox(-3.5F, -1.5F, -3.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r1 = Body.addOrReplaceChild("BodyLayer_r1",
				CubeListBuilder.create().texOffs(13, 21).addBox(-3.0F, -0.2662F, 0.2584F, 6.0F, 0.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 3.75F, 3.5F, -0.2182F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r2 = Body.addOrReplaceChild("BodyLayer_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 0.0F, 0.25F, 6.0F, 0.0F, 0.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 3.25F, 3.25F, -0.6109F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r3 = Body.addOrReplaceChild("BodyLayer_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 0.0F, -0.25F, 6.0F, 0.0F, 0.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 3.5F, 3.25F, -1.1781F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r4 = Body.addOrReplaceChild("BodyLayer_r4",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.25F, -1.4351F, 0.2855F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(0, 1)
						.addBox(7.25F, -1.4351F, 0.2855F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-3.75F, 3.25F, 3.25F, -0.7854F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r5 = Body.addOrReplaceChild("BodyLayer_r5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.25F, 0.0F, 0.25F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(0, 1)
						.addBox(7.25F, 0.0F, 0.25F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-3.75F, -0.5F, 3.25F, -1.1781F, 0.0F, 0.0F));

		PartDefinition BodyLayer_r6 = Body.addOrReplaceChild("BodyLayer_r6",
				CubeListBuilder.create().texOffs(11, 18).addBox(-3.0F, 0.0F, 0.25F, 6.0F, 0.0F, 3.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 3.25F, -1.5708F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(20, 18)
						.addBox(-3.75F, -0.75F, -3.0F, 4.0F, 11.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(24, 3)
						.addBox(-3.5F, 10.75F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-4.25F, 0.75F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-1.0F, 0.0F, -3.0F, 4.0F, 11.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(24, 10)
						.addBox(-0.25F, 11.5F, -2.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}