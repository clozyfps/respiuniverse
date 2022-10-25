// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmikeycloak<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mikeycloak"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelmikeycloak(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(34, 32)
						.addBox(6.9F, 15.0F, -3.0F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 32)
						.addBox(-7.9F, 15.0F, -3.0F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 32)
						.addBox(-7.9F, 15.0F, -3.15F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 32)
						.addBox(4.9F, 15.0F, -3.15F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-4.0F, 15.0F, 5.2F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-4.0F, 15.0F, 5.2F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftArm_r2 = Body.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(0, 59).mirror()
						.addBox(-5.2F, -23.6F, 3.9F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.7854F, 0.0873F));

		PartDefinition LeftArm_r3 = Body.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(0, 59).mirror()
						.addBox(-2.8F, -26.6F, 0.2F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.6109F, -0.1309F));

		PartDefinition LeftArm_r4 = Body.addOrReplaceChild("LeftArm_r4",
				CubeListBuilder.create().texOffs(25, 21).mirror()
						.addBox(-2.2F, -26.6F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(16, 32).addBox(1.2F, -9.0F, 5.2F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition LeftArm_r5 = Body.addOrReplaceChild("LeftArm_r5",
				CubeListBuilder.create().texOffs(0, 59).mirror()
						.addBox(-10.2F, -23.6F, -2.1F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(33, 0).addBox(-10.2F, -23.35F, -2.05F, 2.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition LeftArm_r6 = Body.addOrReplaceChild("LeftArm_r6",
				CubeListBuilder.create().texOffs(25, 39).mirror()
						.addBox(3.8F, -23.6F, -5.1F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0436F, -0.7854F, -0.0873F));

		PartDefinition LeftArm_r7 = Body.addOrReplaceChild("LeftArm_r7",
				CubeListBuilder.create().texOffs(25, 39).mirror()
						.addBox(1.7F, -26.6F, 0.3F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.6109F, 0.1309F));

		PartDefinition LeftArm_r8 = Body.addOrReplaceChild("LeftArm_r8",
				CubeListBuilder.create().texOffs(25, 39).mirror()
						.addBox(1.0F, -26.6F, -2.1F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(16, 32).addBox(-4.2F, -9.0F, 5.2F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition LeftArm_r9 = Body.addOrReplaceChild("LeftArm_r9",
				CubeListBuilder.create().texOffs(25, 39).mirror()
						.addBox(6.0F, -23.6F, -2.1F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(51, 0).mirror()
						.addBox(8.0F, -23.35F, -2.05F, 2.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(23, 34).addBox(7.7F, -23.0F, -3.05F, 1.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(100, 18)
						.addBox(-4.0F, -24.0F, 2.55F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(110, 25)
						.addBox(-3.0F, -26.0F, 6.3F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
						.addBox(2.0F, -22.5F, 5.7F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
						.addBox(-3.0F, -22.5F, 5.7F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2_r1 = cube_r2
				.addOrReplaceChild("cube_r2_r1",
						CubeListBuilder.create().texOffs(24, 16).addBox(-4.0F, -23.0F, 5.7F, 8.0F, 15.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0332F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -2.618F, 0.0F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(25, 46).addBox(6.8F, -9.0F, -2.3F, 1.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition Body_r3_r1 = Body_r3.addOrReplaceChild("Body_r3_r1",
				CubeListBuilder.create().texOffs(25, 44).addBox(6.85F, -24.0F, -2.5F, 1.0F, 16.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.0436F));

		PartDefinition Body_r3_r2 = Body_r3
				.addOrReplaceChild("Body_r3_r2",
						CubeListBuilder.create().texOffs(4, 52).addBox(6.55F, -9.0F, -2.3F, 1.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition Body_r3_r3 = Body_r3
				.addOrReplaceChild("Body_r3_r3",
						CubeListBuilder.create().texOffs(23, 41).addBox(7.15F, -24.0F, -2.3F, 1.0F, 16.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Body_r4 = Body
				.addOrReplaceChild("Body_r4",
						CubeListBuilder.create().texOffs(5, 54).addBox(-7.85F, -9.0F, -2.3F, 1.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

		PartDefinition Body_r4_r1 = Body_r4.addOrReplaceChild("Body_r4_r1",
				CubeListBuilder.create().texOffs(12, 50)
						.addBox(-7.55F, -9.0F, -2.3F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 53)
						.addBox(-7.55F, -9.0F, -2.25F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0873F, 2.3562F, 0.0873F));

		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.0873F, 2.3562F, -0.0873F));

		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0873F, -2.3562F, -0.0873F));

		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.0873F, -2.3562F, 0.0873F));

		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9",
				CubeListBuilder.create().texOffs(9, 53).addBox(6.27F, -9.0F, -2.5F, 1.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition Body_r9_r1 = Body_r9
				.addOrReplaceChild("Body_r9_r1",
						CubeListBuilder.create().texOffs(23, 43).addBox(6.5F, -24.0F, -2.5F, 1.0F, 16.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Body_r10 = Body
				.addOrReplaceChild("Body_r10",
						CubeListBuilder.create().texOffs(9, 53).addBox(-7.3F, -9.0F, -2.1F, 1.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition Body_r10_r1 = Body_r10.addOrReplaceChild("Body_r10_r1",
				CubeListBuilder.create().texOffs(24, 43).addBox(-8.1F, -24.0F, -2.1F, 1.0F, 16.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0436F));

		PartDefinition Body_r10_r2 = Body_r10.addOrReplaceChild("Body_r10_r2",
				CubeListBuilder.create().texOffs(23, 44).addBox(-7.8F, -24.0F, -2.1F, 1.0F, 16.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0436F));

		PartDefinition Body_r10_r3 = Body_r10
				.addOrReplaceChild("Body_r10_r3",
						CubeListBuilder.create().texOffs(23, 42).addBox(-7.5F, -24.0F, -2.1F, 1.0F, 16.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition Body_r11_r1 = Body_r11
				.addOrReplaceChild("Body_r11_r1",
						CubeListBuilder.create().texOffs(20, 39).addBox(5.6F, -23.4F, -3.1F, 3.0F, 15.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Body_r11_r2 = Body_r11.addOrReplaceChild("Body_r11_r2",
				CubeListBuilder.create().texOffs(120, 48)
						.addBox(-8.7F, -23.4F, -3.1F, 3.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 39)
						.addBox(-8.7F, -22.9F, -3.05F, 1.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Body_r12 = Body.addOrReplaceChild("Body_r12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition right_arm_r1 = RightArm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, 22.0F, 9.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

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
}