// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGoblin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "goblin"), "main");
	private final ModelPart Leftarm;
	private final ModelPart Head;
	private final ModelPart Rightarfm;
	private final ModelPart cloak;
	private final ModelPart Body;
	private final ModelPart rightleg;
	private final ModelPart leftleg;
	private final ModelPart goblinmodel;

	public ModelGoblin(ModelPart root) {
		this.Leftarm = root.getChild("Leftarm");
		this.Head = root.getChild("Head");
		this.Rightarfm = root.getChild("Rightarfm");
		this.cloak = root.getChild("cloak");
		this.Body = root.getChild("Body");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.goblinmodel = root.getChild("goblinmodel");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Leftarm = partdefinition.addOrReplaceChild("Leftarm",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.75F, -7.1875F, -0.3125F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -6.375F, -0.3125F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -4.3125F, -0.3125F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.125F, -5.1875F, -0.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 4)
						.addBox(-1.375F, -9.75F, -1.4375F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.3125F, -8.4375F, -1.8125F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Rightarfm = partdefinition.addOrReplaceChild("Rightarfm",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.9375F, -6.375F, -0.3125F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.8125F, -5.1875F, -0.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.9375F, -4.3125F, -0.3125F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.125F, -7.1875F, -0.3125F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cloak = partdefinition.addOrReplaceChild("cloak",
				CubeListBuilder.create().texOffs(5, 14)
						.addBox(-2.724F, -0.8208F, 0.9688F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 14)
						.addBox(-2.724F, -0.8208F, -1.1562F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.4115F, 20.9458F, 0.0312F));

		PartDefinition cube_r1 = cloak.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(6, 15).addBox(-1.0F, -0.9063F, 0.0625F, 2.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.2618F));

		PartDefinition cube_r2 = cloak.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(6, 14).addBox(-1.0313F, -0.6875F, -0.0625F, 2.0F, 0.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8802F, -0.1333F, 0.0313F, 0.0F, -1.5708F, 0.1222F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.125F, -7.4375F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 4)
						.addBox(-0.9375F, -4.5625F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(-1.3125F, -3.875F, -1.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(0, 3)
						.addBox(-1.4375F, -3.4375F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3125F, -1.875F, -0.375F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3125F, -0.5F, -0.75F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.375F, -0.5F, -0.8125F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.25F, -3.4375F, -0.5625F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.375F, -1.875F, -0.4375F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition goblinmodel = partdefinition.addOrReplaceChild("goblinmodel", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightarfm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cloak.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		goblinmodel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Rightarfm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}