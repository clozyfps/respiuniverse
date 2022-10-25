// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDBZArmor1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Body;

	public ModelDBZArmor1(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(4.0F, -0.25F, -2.5F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-11.0F, -0.25F, -2.5F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-4.0F, 5.0F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 17)
						.addBox(-4.5F, 12.0F, -2.5F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(19, 23)
						.addBox(-2.0F, 7.0F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Armor_r1 = Body.addOrReplaceChild("Armor_r1",
				CubeListBuilder.create().texOffs(32, 23).addBox(-4.0F, 0.75F, 0.75F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.75F, -3.75F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Armor_r2 = Body.addOrReplaceChild("Armor_r2",
				CubeListBuilder.create().texOffs(0, 31).addBox(-4.0F, -0.5F, 1.0F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.75F, 3.75F, -2.7489F, 0.0F, -3.1416F));

		PartDefinition Armor_r3 = Body.addOrReplaceChild("Armor_r3",
				CubeListBuilder.create().texOffs(28, 9).addBox(-4.0F, 0.75F, 0.75F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.75F, 3.75F, -2.3562F, 0.0F, -3.1416F));

		PartDefinition Armor_r4 = Body.addOrReplaceChild("Armor_r4",
				CubeListBuilder.create().texOffs(32, 25).addBox(-4.0F, -0.5F, 1.0F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.75F, -3.75F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Armor_r5 = Body.addOrReplaceChild("Armor_r5",
				CubeListBuilder.create().texOffs(24, 14)
						.addBox(-3.0F, -5.75F, -5.5F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(12.0F, -5.75F, -5.5F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 1.2803F, 4.0407F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Armor_r6 = Body.addOrReplaceChild("Armor_r6",
				CubeListBuilder.create().texOffs(20, 11)
						.addBox(-3.0F, 0.5F, -1.25F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 6)
						.addBox(12.0F, 0.5F, -1.25F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.25F, 3.75F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Armor_r7 = Body.addOrReplaceChild("Armor_r7",
				CubeListBuilder.create().texOffs(2, 4).addBox(-1.0F, -2.0377F, -3.2019F, 1.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.75F, 0.2803F, -0.2093F, 0.7854F, 0.0F, -0.3927F));

		PartDefinition Armor_r8 = Body.addOrReplaceChild("Armor_r8",
				CubeListBuilder.create().texOffs(32, 27).addBox(-1.0F, -0.5303F, -2.2907F, 1.0F, 0.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.75F, 0.2803F, -0.2093F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Armor_r9 = Body.addOrReplaceChild("Armor_r9",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -2.3211F, 1.5282F, 1.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.75F, 0.2803F, -0.2093F, -0.7854F, 0.0F, -0.3927F));

		PartDefinition Armor_r10 = Body.addOrReplaceChild("Armor_r10",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.5381F, -2.173F, -3.0666F, 1.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.5F, 1.0303F, -0.2093F, 0.7854F, 0.0F, -0.7854F));

		PartDefinition Armor_r11 = Body.addOrReplaceChild("Armor_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5381F, -2.4564F, 1.3929F, 1.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.5F, 1.0303F, -0.2093F, -0.7854F, 0.0F, -0.7854F));

		PartDefinition Armor_r12 = Body.addOrReplaceChild("Armor_r12",
				CubeListBuilder.create().texOffs(17, 0).addBox(-0.5381F, -0.7217F, -2.2907F, 1.0F, 0.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.5F, 1.0303F, -0.2093F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Armor_r13 = Body.addOrReplaceChild("Armor_r13",
				CubeListBuilder.create().texOffs(2, 2).addBox(-0.5381F, -2.173F, -3.0666F, 1.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.75F, 1.2803F, -0.2093F, 0.7854F, 0.0F, 0.7854F));

		PartDefinition Armor_r14 = Body.addOrReplaceChild("Armor_r14",
				CubeListBuilder.create().texOffs(19, 0).addBox(-0.5381F, -0.7217F, -2.2907F, 1.0F, 0.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.75F, 1.2803F, -0.2093F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Armor_r15 = Body.addOrReplaceChild("Armor_r15",
				CubeListBuilder.create().texOffs(2, 0).addBox(-0.5381F, -2.4564F, 1.3929F, 1.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.75F, 1.2803F, -0.2093F, -0.7854F, 0.0F, 0.7854F));

		PartDefinition Armor_r16 = Body.addOrReplaceChild("Armor_r16",
				CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -2.0377F, -3.2019F, 1.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.75F, 0.7803F, -0.2093F, 0.7854F, 0.0F, 0.3927F));

		PartDefinition Armor_r17 = Body.addOrReplaceChild("Armor_r17",
				CubeListBuilder.create().texOffs(32, 32).addBox(-1.0F, -0.5303F, -2.2907F, 1.0F, 0.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.75F, 0.7803F, -0.2093F, 0.0F, 0.0F, 0.3927F));

		PartDefinition Armor_r18 = Body.addOrReplaceChild("Armor_r18",
				CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -2.3211F, 1.5282F, 1.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.75F, 0.7803F, -0.2093F, -0.7854F, 0.0F, 0.3927F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}