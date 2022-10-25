// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCruel_Sun<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cruel_sun"), "main");
	private final ModelPart bone;

	public ModelCruel_Sun(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(24, 38)
				.addBox(-26.0F, -29.0F, -7.1875F, 32.0F, 32.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
				.addBox(-26.0F, -28.0F, -8.625F, 32.0F, 31.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-28.0F, -28.0625F, -6.75F, 24.0F, 31.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(14, 18)
				.addBox(-16.0F, -28.125F, -7.0F, 24.0F, 31.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
				.addBox(-26.0F, -28.0F, 3.125F, 32.0F, 31.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(24, 29)
				.addBox(-26.0F, -30.5F, -6.0625F, 32.0F, 24.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(38, 39)
				.addBox(-26.0F, -19.5F, -6.0F, 32.0F, 24.0F, 30.0F, new CubeDeformation(0.0F)),
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
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}