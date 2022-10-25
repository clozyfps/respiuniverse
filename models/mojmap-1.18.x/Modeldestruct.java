// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldestruct<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "destruct"), "main");
	private final ModelPart hexadecagon;

	public Modeldestruct(ModelPart root) {
		this.hexadecagon = root.getChild("hexadecagon");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hexadecagon = partdefinition.addOrReplaceChild("hexadecagon",
				CubeListBuilder.create().texOffs(46, 0)
						.addBox(-6.1989F, -8.0F, -6.0F, 11.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(46, 35)
						.addBox(-7.0F, -8.0F, -5.1989F, 13.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 16.0F, 1.0F));

		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(46, 39)
						.addBox(-7.0F, 0.0F, -6.1989F, 13.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(46, 26)
						.addBox(-6.1989F, 0.0F, -7.0F, 11.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 1.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(46, 13)
						.addBox(-7.0F, 0.0F, -6.1989F, 13.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(46, 13)
						.addBox(-6.1989F, 0.0F, -7.0F, 11.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 1.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(46, 26).addBox(-6.1989F, 0.0F, -7.0F, 11.0F, 1.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild(
				"hexadecagon_r4", CubeListBuilder.create().texOffs(44, 0).addBox(-6.1989F, 0.0F, -7.0F, 11.0F, 1.0F,
						13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 1.0F, 0.0F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		hexadecagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}