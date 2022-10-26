// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpochita<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pochita"), "main");
	private final ModelPart Chainsaw;
	private final ModelPart tail;
	private final ModelPart Leftlegs;
	private final ModelPart Rightlegs;
	private final ModelPart Body;

	public Modelpochita(ModelPart root) {
		this.Chainsaw = root.getChild("Chainsaw");
		this.tail = root.getChild("tail");
		this.Leftlegs = root.getChild("Leftlegs");
		this.Rightlegs = root.getChild("Rightlegs");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Chainsaw = partdefinition.addOrReplaceChild("Chainsaw", CubeListBuilder.create().texOffs(0, 14)
				.addBox(-15.4375F, -4.25F, 10.4375F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -4.375F, 12.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -4.375F, 11.6875F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -4.375F, 11.375F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -4.375F, 11.0625F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -4.375F, 10.4375F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -3.9013F, 9.7772F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -4.375F, 10.75F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -4.375F, 12.375F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -3.3125F, 12.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -3.3125F, 11.6875F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -3.3125F, 11.375F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -3.3125F, 11.0625F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -3.3125F, 10.4375F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -3.3125F, 10.75F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
				.addBox(-15.4375F, -3.3125F, 12.375F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(15.3125F, 24.0F, -14.75F));

		PartDefinition cube_r1 = Chainsaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(14, 13).addBox(-0.0938F, -0.0313F, -0.0625F, 0.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.3438F, -3.2609F, 10.1293F, 1.2741F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Chainsaw.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(14, 13).addBox(-0.0938F, -0.0313F, 0.0F, 0.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.3438F, -3.495F, 9.8397F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Chainsaw.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(14, 13).addBox(-0.0938F, 0.0F, -0.0938F, 0.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.3438F, -4.1352F, 9.8915F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Chainsaw.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(14, 13).addBox(-0.0938F, 0.0F, -0.0938F, 0.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.3438F, -4.3125F, 10.1563F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon = Chainsaw.addOrReplaceChild("hexadecagon",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-7.4375F, 4.1505F, 1.875F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-7.4375F, 3.75F, 2.2755F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, -8.0F, 8.0F));

		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-0.5625F, -0.5F, -0.0995F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-0.5625F, -0.0995F, -0.5F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.875F, 4.25F, 2.375F, -0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-0.5625F, -0.5F, -0.0995F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-0.5625F, -0.0995F, -0.5F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.875F, 4.25F, 2.375F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(0, 14).addBox(-0.5625F, -0.0995F, -0.5F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.875F, 4.25F, 2.375F, -0.7854F, 0.0F, 0.0F));

		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(0, 14).addBox(-0.5625F, -0.0995F, -0.5F, 0.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.875F, 4.25F, 2.375F, 0.7854F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(11, 14)
				.addBox(-16.4375F, 3.6875F, 18.0625F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 14)
				.addBox(-16.4172F, 2.8815F, 20.0857F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(16.125F, 16.8125F, -15.3125F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(10, 14).addBox(-0.0938F, 0.0313F, -0.2188F, 0.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.3438F, 3.4775F, 19.8522F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(10, 14).addBox(-0.0938F, -0.4688F, -0.2188F, 0.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.3438F, 3.3449F, 19.9072F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(11, 14).addBox(-0.0938F, -0.2813F, -0.4688F, 0.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.3438F, 3.7813F, 19.3438F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Leftlegs = partdefinition.addOrReplaceChild("Leftlegs",
				CubeListBuilder.create().texOffs(8, 8)
						.addBox(-14.9375F, -2.0F, 12.6875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.9375F, -2.0F, 16.5625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(15.3125F, 24.0F, -14.75F));

		PartDefinition Rightlegs = partdefinition.addOrReplaceChild("Rightlegs",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-8.75F, -2.0F, 9.3125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 8)
						.addBox(-8.75F, -2.0F, 5.4375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.125F, 24.0F, -7.5F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-16.9375F, -4.25F, 12.5625F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(9, 12)
				.addBox(-14.375F, -5.6875F, 13.8125F, 0.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(9, 12)
				.addBox(-16.875F, -5.6875F, 13.8125F, 3.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(9, 12)
				.addBox(-17.0F, -5.6875F, 13.8125F, 0.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(15.3125F, 24.0F, -14.75F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Chainsaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftlegs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightlegs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Rightlegs.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leftlegs.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}