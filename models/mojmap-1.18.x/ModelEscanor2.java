// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelEscanor2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "escanor2"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Head2;
	private final ModelPart bone32;
	private final ModelPart Rhitta;

	public ModelEscanor2(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Head2 = root.getChild("Head2");
		this.bone32 = root.getChild("bone32");
		this.Rhitta = root.getChild("Rhitta");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(29, 127)
				.addBox(-3.76F, 0.5873F, -3.0839F, 7.0F, 13.0F, 7.0F, new CubeDeformation(-0.88F)).texOffs(170, 142)
				.addBox(-3.76F, -1.6527F, -3.0839F, 7.0F, 5.0F, 7.0F, new CubeDeformation(-1.52F)).texOffs(149, 148)
				.addBox(-3.92F, 2.6273F, -3.0839F, 7.0F, 10.0F, 7.0F, new CubeDeformation(-0.8F)).texOffs(32, 147)
				.addBox(-2.88F, 0.1473F, -3.0839F, 7.0F, 10.0F, 7.0F, new CubeDeformation(-1.44F)).texOffs(0, 45)
				.addBox(-2.56F, -0.0927F, -3.0839F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-1.52F)).texOffs(160, 38)
				.addBox(-2.48F, -0.0927F, -3.0839F, 7.0F, 8.0F, 7.0F, new CubeDeformation(-1.52F)).texOffs(167, 129)
				.addBox(-3.52F, 9.7473F, -3.0839F, 7.0F, 6.0F, 7.0F, new CubeDeformation(-1.04F)).texOffs(76, 166)
				.addBox(-3.76F, 12.6273F, -3.0839F, 7.0F, 6.0F, 7.0F, new CubeDeformation(-1.28F)).texOffs(121, 142)
				.addBox(-3.84F, 14.3873F, -3.0839F, 7.0F, 11.0F, 7.0F, new CubeDeformation(-1.6F)).texOffs(25, 78)
				.addBox(-3.84F, 21.5473F, -8.7239F, 7.0F, 4.0F, 13.0F, new CubeDeformation(-1.44F)),
				PartPose.offset(-3.04F, 0.0927F, 1.2039F));

		PartDefinition head_r1 = RightLeg.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(169, 8).addBox(-5.92F, 35.4F, -8.52F, 7.0F, 5.0F, 7.0F,
						new CubeDeformation(-1.52F)),
				PartPose.offsetAndRotation(2.08F, -12.64F, -17.84F, 0.5672F, 0.0F, 0.0F));

		PartDefinition head_r2 = RightLeg.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(190, 0).addBox(-5.92F, 35.4F, -8.52F, 7.0F, 4.0F, 7.0F,
						new CubeDeformation(-1.52F)),
				PartPose.offsetAndRotation(2.08F, -14.4298F, -9.98F, 0.2618F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(29, 127)
				.mirror().addBox(-3.24F, 0.5873F, -3.0839F, 7.0F, 13.0F, 7.0F, new CubeDeformation(-0.88F))
				.mirror(false).texOffs(0, 45).mirror()
				.addBox(-4.52F, -0.0927F, -3.0839F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-1.52F)).mirror(false)
				.texOffs(170, 142).mirror()
				.addBox(-3.24F, -1.6527F, -3.0839F, 7.0F, 5.0F, 7.0F, new CubeDeformation(-1.52F)).mirror(false)
				.texOffs(149, 148).mirror()
				.addBox(-3.08F, 2.6273F, -3.0839F, 7.0F, 10.0F, 7.0F, new CubeDeformation(-0.8F)).mirror(false)
				.texOffs(32, 147).mirror()
				.addBox(-4.2F, 0.0673F, -3.0839F, 7.0F, 10.0F, 7.0F, new CubeDeformation(-1.44F)).mirror(false)
				.texOffs(160, 38).mirror()
				.addBox(-4.52F, -0.0927F, -3.0839F, 7.0F, 8.0F, 7.0F, new CubeDeformation(-1.52F)).mirror(false)
				.texOffs(167, 129).mirror()
				.addBox(-3.48F, 9.7473F, -3.0839F, 7.0F, 6.0F, 7.0F, new CubeDeformation(-1.04F)).mirror(false)
				.texOffs(76, 166).mirror()
				.addBox(-3.24F, 12.6273F, -3.0839F, 7.0F, 6.0F, 7.0F, new CubeDeformation(-1.28F)).mirror(false)
				.texOffs(121, 142).mirror()
				.addBox(-3.16F, 14.3873F, -3.0839F, 7.0F, 11.0F, 7.0F, new CubeDeformation(-1.6F)).mirror(false)
				.texOffs(25, 78).mirror()
				.addBox(-3.16F, 21.5473F, -8.7239F, 7.0F, 4.0F, 13.0F, new CubeDeformation(-1.44F)).mirror(false),
				PartPose.offset(3.04F, 0.0927F, 1.2039F));

		PartDefinition head_r3 = LeftLeg.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(169, 8).mirror()
						.addBox(-1.08F, 35.4F, -8.52F, 7.0F, 5.0F, 7.0F, new CubeDeformation(-1.52F)).mirror(false),
				PartPose.offsetAndRotation(-2.08F, -12.64F, -17.84F, 0.5672F, 0.0F, 0.0F));

		PartDefinition head_r4 = LeftLeg.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(190, 0).mirror()
						.addBox(-1.08F, 35.4F, -8.52F, 7.0F, 4.0F, 7.0F, new CubeDeformation(-1.52F)).mirror(false),
				PartPose.offsetAndRotation(-2.08F, -14.4298F, -9.98F, 0.2618F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(6.4F, -17.68F, 0.0F));

		PartDefinition head_r5 = LeftArm.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(128, 91).addBox(13.28F, -12.52F, -1.88F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(-6.4F, -4.88F, 0.0F, 0.0F, 0.0F, 1.4835F));

		PartDefinition head_r6 = LeftArm.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(60, 150)
						.addBox(13.68F, -9.72F, -1.88F, 6.0F, 8.0F, 8.0F, new CubeDeformation(-1.84F)).texOffs(64, 103)
						.addBox(4.8F, -9.72F, -1.88F, 10.0F, 8.0F, 8.0F, new CubeDeformation(-1.52F)),
				PartPose.offsetAndRotation(-6.4F, -4.88F, 0.0F, 0.0F, 0.0F, 1.309F));

		PartDefinition bone22 = LeftArm.addOrReplaceChild("bone22", CubeListBuilder.create(),
				PartPose.offset(2.5013F, -6.0736F, 7.9456F));

		PartDefinition head_r7 = bone22.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(153, 69).addBox(16.4F, -12.52F, -2.56F, 9.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.189F, 0.3463F, 1.9966F));

		PartDefinition head_r8 = bone22.addOrReplaceChild("head_r8",
				CubeListBuilder.create().texOffs(0, 118).addBox(16.4F, -12.52F, -2.56F, 9.0F, 6.0F, 9.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(-9.6213F, 1.1936F, -7.9456F, 0.0F, 0.0F, 1.4835F));

		PartDefinition bone23 = bone22.addOrReplaceChild("bone23", CubeListBuilder.create(),
				PartPose.offset(4.0237F, 1.8146F, -7.9456F));

		PartDefinition head_r9 = bone23.addOrReplaceChild("head_r9",
				CubeListBuilder.create().texOffs(98, 174).addBox(17.2F, -9.88F, 0.2F, 8.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0071F));

		PartDefinition head_r10 = bone23.addOrReplaceChild("head_r10",
				CubeListBuilder.create().texOffs(194, 187).addBox(17.2F, -9.88F, 0.2F, 7.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(5.0932F, 3.9872F, 0.0F, 0.0F, 0.0F, 2.3126F));

		PartDefinition bone24 = bone23.addOrReplaceChild("bone24", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -0.88F));

		PartDefinition head_r11 = bone24.addOrReplaceChild("head_r11",
				CubeListBuilder.create().texOffs(177, 58).addBox(17.2F, -9.88F, 0.2F, 8.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0071F));

		PartDefinition head_r12 = bone24.addOrReplaceChild("head_r12",
				CubeListBuilder.create().texOffs(194, 43).addBox(17.2F, -9.88F, 0.2F, 7.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(5.0932F, 3.9872F, 0.0F, 0.0F, 0.0F, 2.3126F));

		PartDefinition bone25 = bone23.addOrReplaceChild("bone25", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -1.84F));

		PartDefinition head_r13 = bone25.addOrReplaceChild("head_r13",
				CubeListBuilder.create().texOffs(172, 37).addBox(17.2F, -9.88F, 0.2F, 8.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0071F));

		PartDefinition head_r14 = bone25.addOrReplaceChild("head_r14",
				CubeListBuilder.create().texOffs(193, 14).addBox(17.2F, -9.88F, 0.2F, 7.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(5.0932F, 3.9872F, 0.0F, 0.0F, 0.0F, 2.3126F));

		PartDefinition bone26 = bone23.addOrReplaceChild("bone26", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -2.64F));

		PartDefinition head_r15 = bone26.addOrReplaceChild("head_r15",
				CubeListBuilder.create().texOffs(171, 20).addBox(17.2F, -9.88F, 0.2F, 8.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0071F));

		PartDefinition head_r16 = bone26.addOrReplaceChild("head_r16",
				CubeListBuilder.create().texOffs(191, 136).addBox(17.2F, -9.88F, 0.2F, 7.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(5.0932F, 3.9872F, 0.0F, 0.0F, 0.0F, 2.3126F));

		PartDefinition bone27 = LeftArm.addOrReplaceChild("bone27", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0553F, -8.2155F, 8.044F, 0.0F, 0.0F, -0.3491F));

		PartDefinition head_r17 = bone27.addOrReplaceChild("head_r17",
				CubeListBuilder.create().texOffs(96, 67).addBox(8.48F, -2.36F, -8.36F, 10.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.48F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2457F, 0.1971F, 1.7169F));

		PartDefinition head_r18 = bone27.addOrReplaceChild("head_r18",
				CubeListBuilder.create().texOffs(127, 59).addBox(8.48F, -2.36F, -24.28F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.48F)),
				PartPose.offsetAndRotation(-0.4212F, -5.0648F, 5.6799F, -0.2665F, -0.4375F, 1.8811F));

		PartDefinition bone28 = LeftArm.addOrReplaceChild("bone28", CubeListBuilder.create(),
				PartPose.offset(-6.4F, -4.88F, 0.0F));

		PartDefinition head_r19 = bone28.addOrReplaceChild("head_r19",
				CubeListBuilder.create().texOffs(125, 75).addBox(6.96F, -11.56F, -1.88F, 9.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.32F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5272F));

		PartDefinition head_r20 = bone28.addOrReplaceChild("head_r20",
				CubeListBuilder.create().texOffs(119, 126).addBox(6.32F, -11.56F, -1.88F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.48F)),
				PartPose.offsetAndRotation(-4.2378F, 12.2776F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition head_r21 = bone28
				.addOrReplaceChild("head_r21",
						CubeListBuilder.create().texOffs(36, 95).addBox(9.12F, -9.48F, -1.88F, 10.0F, 8.0F, 8.0F,
								new CubeDeformation(-2.4F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.2654F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-6.4F, -17.68F, 0.0F));

		PartDefinition head_r22 = RightArm.addOrReplaceChild("head_r22",
				CubeListBuilder.create().texOffs(89, 134).addBox(-21.28F, -12.52F, -1.88F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(6.4F, -4.88F, 0.0F, 0.0F, 0.0F, -1.4835F));

		PartDefinition head_r23 = RightArm.addOrReplaceChild("head_r23",
				CubeListBuilder.create().texOffs(88, 150)
						.addBox(-19.68F, -9.72F, -1.88F, 6.0F, 8.0F, 8.0F, new CubeDeformation(-1.84F)).texOffs(28, 111)
						.addBox(-14.8F, -9.72F, -1.88F, 10.0F, 8.0F, 8.0F, new CubeDeformation(-1.52F)),
				PartPose.offsetAndRotation(6.4F, -4.88F, 0.0F, 0.0F, 0.0F, -1.309F));

		PartDefinition bone20 = RightArm.addOrReplaceChild("bone20", CubeListBuilder.create(),
				PartPose.offset(-2.5013F, -6.0736F, 7.9456F));

		PartDefinition head_r24 = bone20.addOrReplaceChild("head_r24",
				CubeListBuilder.create().texOffs(153, 85).addBox(-4.5F, -3.0F, -3.0F, 9.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(-0.6598F, 21.3808F, -8.3701F, 0.2524F, -0.3042F, -2.1944F));

		PartDefinition head_r25 = bone20.addOrReplaceChild("head_r25",
				CubeListBuilder.create().texOffs(55, 119).addBox(-25.4F, -12.52F, -2.56F, 9.0F, 6.0F, 9.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(9.6213F, 1.1936F, -7.9456F, 0.0F, 0.0F, -1.4835F));

		PartDefinition bone15 = bone20.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offset(-4.0237F, 1.8146F, -7.9456F));

		PartDefinition head_r26 = bone15.addOrReplaceChild("head_r26",
				CubeListBuilder.create().texOffs(28, 180).addBox(-2.964F, -3.121F, -1.68F, 8.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(3.2716F, 23.0091F, 1.88F, 0.0F, 0.0F, -2.2166F));

		PartDefinition head_r27 = bone15.addOrReplaceChild("head_r27",
				CubeListBuilder.create().texOffs(199, 64).addBox(-3.5F, -3.0F, -1.68F, 7.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(4.0541F, 22.8262F, 1.88F, 0.0F, 0.0F, 2.5569F));

		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -0.88F));

		PartDefinition head_r28 = bone16.addOrReplaceChild("head_r28",
				CubeListBuilder.create().texOffs(70, 179).addBox(-2.964F, -3.121F, -2.56F, 8.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(3.2716F, 23.0091F, 2.76F, 0.0F, 0.0F, -2.2166F));

		PartDefinition head_r29 = bone16.addOrReplaceChild("head_r29",
				CubeListBuilder.create().texOffs(198, 168).addBox(-3.5F, -3.0F, -2.56F, 7.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(4.0541F, 22.8262F, 2.76F, 0.0F, 0.0F, 2.5569F));

		PartDefinition bone17 = bone15.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -1.84F));

		PartDefinition head_r30 = bone17.addOrReplaceChild("head_r30",
				CubeListBuilder.create().texOffs(0, 178).addBox(-2.964F, -3.121F, -3.52F, 8.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(3.2716F, 23.0091F, 3.72F, 0.0F, 0.0F, -2.2166F));

		PartDefinition head_r31 = bone17.addOrReplaceChild("head_r31",
				CubeListBuilder.create().texOffs(136, 197).addBox(-3.5F, -3.0F, -3.52F, 7.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(4.0541F, 22.8262F, 3.72F, 0.0F, 0.0F, 2.5569F));

		PartDefinition bone18 = bone15.addOrReplaceChild("bone18", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -2.64F));

		PartDefinition head_r32 = bone18.addOrReplaceChild("head_r32",
				CubeListBuilder.create().texOffs(177, 75).addBox(-2.964F, -3.121F, -4.32F, 8.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(3.2716F, 23.0091F, 4.52F, 0.0F, 0.0F, -2.2166F));

		PartDefinition head_r33 = bone18.addOrReplaceChild("head_r33",
				CubeListBuilder.create().texOffs(110, 197).addBox(-3.5F, -3.0F, -4.32F, 7.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.64F)),
				PartPose.offsetAndRotation(4.0541F, 22.8262F, 4.52F, 0.0F, 0.0F, 2.5569F));

		PartDefinition bone19 = RightArm.addOrReplaceChild("bone19", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.0553F, -8.2155F, 8.044F, 0.0F, 0.0F, 0.3491F));

		PartDefinition head_r34 = bone19.addOrReplaceChild("head_r34",
				CubeListBuilder.create().texOffs(100, 103).addBox(-18.48F, -2.36F, -8.36F, 10.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.48F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2457F, -0.1971F, -1.7169F));

		PartDefinition head_r35 = bone19.addOrReplaceChild("head_r35",
				CubeListBuilder.create().texOffs(57, 134).addBox(-16.48F, -2.36F, -24.28F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.48F)),
				PartPose.offsetAndRotation(0.4212F, -5.0648F, 5.6799F, -0.2665F, 0.4375F, -1.8811F));

		PartDefinition bone14 = RightArm.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offset(6.4F, -4.88F, 0.0F));

		PartDefinition head_r36 = bone14.addOrReplaceChild("head_r36",
				CubeListBuilder.create().texOffs(126, 38).addBox(-15.96F, -11.56F, -1.88F, 9.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.32F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5272F));

		PartDefinition head_r37 = bone14.addOrReplaceChild("head_r37",
				CubeListBuilder.create().texOffs(136, 107).addBox(-14.32F, -11.56F, -1.88F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.48F)),
				PartPose.offsetAndRotation(4.2378F, 12.2776F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition head_r38 = bone14.addOrReplaceChild("head_r38",
				CubeListBuilder.create().texOffs(107, 22).addBox(-19.12F, -9.48F, -1.88F, 10.0F, 8.0F, 8.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition Head2 = partdefinition.addOrReplaceChild("Head2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 7.84F, 0.0F));

		PartDefinition head = Head2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(137, 227).mirror()
				.addBox(-2.72F, -9.8F, -5.28F, 8.0F, 10.0F, 10.0F, new CubeDeformation(-2.72F)).mirror(false)
				.texOffs(137, 227).addBox(-5.28F, -9.8F, -5.28F, 8.0F, 10.0F, 10.0F, new CubeDeformation(-2.72F)),
				PartPose.offset(0.0F, -27.12F, 0.0F));

		PartDefinition head_r39 = head.addOrReplaceChild("head_r39",
				CubeListBuilder.create().texOffs(0, 221).addBox(-2.48F, -3.16F, -3.0F, 5.0F, 6.0F, 5.0F,
						new CubeDeformation(-1.6F)),
				PartPose.offsetAndRotation(0.0F, -2.047F, 0.8906F, -0.6981F, 0.0F, 0.0F));

		PartDefinition head_r40 = head.addOrReplaceChild("head_r40",
				CubeListBuilder.create().texOffs(0, 190).addBox(0.08F, -6.92F, -4.0F, 4.0F, 8.0F, 8.0F,
						new CubeDeformation(-1.6F)),
				PartPose.offsetAndRotation(-0.0362F, -2.4075F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition head_r41 = head.addOrReplaceChild("head_r41",
				CubeListBuilder.create().texOffs(221, 218).mirror()
						.addBox(0.88F, -5.4F, -1.72F, 4.0F, 6.0F, 5.0F, new CubeDeformation(-1.84F)).mirror(false),
				PartPose.offsetAndRotation(-0.0362F, -2.4075F, 0.0F, 0.0F, 0.5672F, 0.1309F));

		PartDefinition head_r42 = head.addOrReplaceChild("head_r42",
				CubeListBuilder.create().texOffs(221, 218).addBox(-4.88F, -5.4F, -1.72F, 4.0F, 6.0F, 5.0F,
						new CubeDeformation(-1.84F)),
				PartPose.offsetAndRotation(0.0362F, -2.4075F, 0.0F, 0.0F, -0.5672F, -0.1309F));

		PartDefinition head_r43 = head.addOrReplaceChild("head_r43",
				CubeListBuilder.create().texOffs(66, 191).addBox(-4.08F, -6.92F, -4.0F, 4.0F, 8.0F, 8.0F,
						new CubeDeformation(-1.6F)),
				PartPose.offsetAndRotation(0.0362F, -2.4075F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(218, 86)
				.addBox(-3.68F, -2.28F, -5.04F, 5.0F, 6.0F, 6.0F, new CubeDeformation(-2.4F)).texOffs(143, 134)
				.addBox(-2.8541F, -3.3522F, -4.16F, 8.0F, 5.0F, 8.0F, new CubeDeformation(-1.28F)).texOffs(120, 181)
				.addBox(-1.8541F, -3.3522F, -1.68F, 6.0F, 9.0F, 6.0F, new CubeDeformation(-1.28F)).texOffs(148, 0)
				.addBox(-2.8541F, -3.4147F, -1.52F, 8.0F, 8.0F, 6.0F, new CubeDeformation(-1.28F)).texOffs(90, 186)
				.addBox(-1.3341F, -2.5922F, -4.8F, 5.0F, 6.0F, 8.0F, new CubeDeformation(-2.0F)),
				PartPose.offset(-1.1459F, -6.8078F, 0.0F));

		PartDefinition head_r44 = bone.addOrReplaceChild("head_r44",
				CubeListBuilder.create().texOffs(48, 184).addBox(-2.48F, -2.44F, -4.8F, 5.0F, 6.0F, 8.0F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(-0.16F, 0.0F, 0.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition head_r45 = bone.addOrReplaceChild("head_r45",
				CubeListBuilder.create().texOffs(181, 104).addBox(-0.36F, -9.46F, -3.8F, 5.0F, 9.0F, 7.0F,
						new CubeDeformation(-1.52F)),
				PartPose.offsetAndRotation(0.9859F, 5.7678F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition head_r46 = bone.addOrReplaceChild("head_r46",
				CubeListBuilder.create().texOffs(144, 181).addBox(-4.64F, -9.46F, -3.8F, 5.0F, 9.0F, 7.0F,
						new CubeDeformation(-1.52F)),
				PartPose.offsetAndRotation(1.3059F, 5.7678F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition head_r47 = bone.addOrReplaceChild("head_r47",
				CubeListBuilder.create().texOffs(181, 154).addBox(-2.52F, -2.44F, -4.8F, 5.0F, 6.0F, 8.0F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(2.4517F, 0.0F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition head_r48 = bone.addOrReplaceChild("head_r48",
				CubeListBuilder.create().texOffs(214, 193)
						.addBox(-4.48F, -2.44F, -5.12F, 5.0F, 6.0F, 6.0F, new CubeDeformation(-2.4F)).texOffs(145, 216)
						.addBox(-4.0F, -2.44F, -5.12F, 5.0F, 6.0F, 6.0F, new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition head_r49 = bone.addOrReplaceChild("head_r49",
				CubeListBuilder.create().texOffs(218, 138).addBox(-3.68F, -2.84F, -5.2F, 5.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition head_r50 = bone.addOrReplaceChild("head_r50",
				CubeListBuilder.create().texOffs(218, 160).addBox(-3.36F, -2.84F, -5.04F, 5.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(-0.16F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition head_r51 = bone.addOrReplaceChild("head_r51",
				CubeListBuilder.create().texOffs(180, 173).addBox(-3.12F, -3.08F, -5.2F, 5.0F, 6.0F, 8.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(-0.16F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition head_r52 = bone.addOrReplaceChild("head_r52",
				CubeListBuilder.create().texOffs(214, 180).addBox(-4.24F, -2.44F, -5.12F, 5.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(214, 36).addBox(-1.32F,
				-2.28F, -5.04F, 5.0F, 6.0F, 6.0F, new CubeDeformation(-2.4F)), PartPose.offset(2.2917F, 0.0F, 0.0F));

		PartDefinition head_r53 = bone2.addOrReplaceChild("head_r53",
				CubeListBuilder.create().texOffs(213, 5)
						.addBox(-0.52F, -2.44F, -5.12F, 5.0F, 6.0F, 6.0F, new CubeDeformation(-2.4F)).texOffs(213, 20)
						.addBox(-1.0F, -2.44F, -5.12F, 5.0F, 6.0F, 6.0F, new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition head_r54 = bone2
				.addOrReplaceChild("head_r54",
						CubeListBuilder.create().texOffs(44, 214).addBox(-1.32F, -2.84F, -5.2F, 5.0F, 6.0F, 6.0F,
								new CubeDeformation(-2.4F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition head_r55 = bone2.addOrReplaceChild("head_r55",
				CubeListBuilder.create().texOffs(214, 49).addBox(-1.64F, -2.84F, -5.04F, 5.0F, 6.0F, 6.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(0.16F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition head_r56 = bone2.addOrReplaceChild("head_r56",
				CubeListBuilder.create().texOffs(180, 89).addBox(-1.88F, -3.08F, -5.2F, 5.0F, 6.0F, 8.0F,
						new CubeDeformation(-2.4F)),
				PartPose.offsetAndRotation(0.16F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition head_r57 = bone2
				.addOrReplaceChild("head_r57",
						CubeListBuilder.create().texOffs(79, 214).addBox(-0.76F, -2.44F, -5.12F, 5.0F, 6.0F, 6.0F,
								new CubeDeformation(-2.4F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone37 = head.addOrReplaceChild("bone37", CubeListBuilder.create().texOffs(96, 222).addBox(-2.0F,
				-0.5247F, -2.5902F, 4.0F, 6.0F, 5.0F, new CubeDeformation(-1.84F)),
				PartPose.offset(0.0F, -6.0753F, -2.0498F));

		PartDefinition head_r58 = bone37.addOrReplaceChild("head_r58",
				CubeListBuilder.create().texOffs(20, 222).addBox(-2.0F, -2.68F, -2.16F, 4.0F, 6.0F, 5.0F,
						new CubeDeformation(-1.84F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition head_r59 = bone37.addOrReplaceChild("head_r59",
				CubeListBuilder.create().texOffs(61, 221).addBox(-2.0F, -3.76F, -1.84F, 4.0F, 7.0F, 5.0F,
						new CubeDeformation(-1.76F)),
				PartPose.offsetAndRotation(0.0F, 2.1553F, -0.4302F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone35 = head.addOrReplaceChild("bone35", CubeListBuilder.create().texOffs(143, 123)
				.addBox(-2.4F, -2.4F, -4.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(-1.68F)).texOffs(143, 123).mirror()
				.addBox(-1.76F, -2.48F, -4.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(-1.68F)).mirror(false),
				PartPose.offset(0.0F, -1.84F, 0.0F));

		PartDefinition head_r60 = bone35.addOrReplaceChild("head_r60",
				CubeListBuilder.create().texOffs(219, 70).addBox(-2.48F, -3.0F, -4.0F, 5.0F, 6.0F, 6.0F,
						new CubeDeformation(-1.68F)),
				PartPose.offsetAndRotation(-1.0029F, -0.2755F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition head_r61 = bone35.addOrReplaceChild("head_r61",
				CubeListBuilder.create().texOffs(199, 218).addBox(-2.52F, -3.0F, -4.0F, 5.0F, 6.0F, 6.0F,
						new CubeDeformation(-1.68F)),
				PartPose.offsetAndRotation(1.0029F, -0.2755F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition bone36 = bone35.addOrReplaceChild("bone36",
				CubeListBuilder.create().texOffs(143, 123)
						.addBox(-2.4F, -2.32F, -4.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(-1.6F)).texOffs(143, 123)
						.mirror().addBox(-1.6F, -2.32F, -4.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(-1.6F))
						.mirror(false).texOffs(101, 90).mirror()
						.addBox(-2.52F, -1.04F, -4.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(-1.68F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone32 = partdefinition.addOrReplaceChild("bone32", CubeListBuilder.create(),
				PartPose.offset(0.0F, 17.36F, 0.0F));

		PartDefinition bone31 = bone32.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(112, 0)
				.addBox(-5.44F, 16.7073F, 14.7561F, 11.0F, 8.0F, 7.0F, new CubeDeformation(-1.28F)).texOffs(135, 15)
				.addBox(-5.44F, 16.7073F, 14.7561F, 11.0F, 4.0F, 7.0F, new CubeDeformation(-1.2F)),
				PartPose.offset(0.0F, -37.5073F, -16.6361F));

		PartDefinition bone3 = bone32.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(67, 32)
				.addBox(-8.0F, 1.16F, -1.88F, 16.0F, 10.0F, 8.0F, new CubeDeformation(-1.52F)).texOffs(87, 50)
				.addBox(-7.52F, 3.16F, -2.88F, 15.0F, 8.0F, 9.0F, new CubeDeformation(-1.2F)).texOffs(89, 83)
				.addBox(-5.44F, 8.08F, -1.88F, 7.0F, 13.0F, 7.0F, new CubeDeformation(-1.52F)).texOffs(89, 83).mirror()
				.addBox(-1.56F, 8.08F, -1.88F, 7.0F, 13.0F, 7.0F, new CubeDeformation(-1.52F)).mirror(false),
				PartPose.offset(0.0F, -38.72F, 0.0F));

		PartDefinition head_r62 = bone3.addOrReplaceChild("head_r62",
				CubeListBuilder.create().texOffs(136, 165).addBox(-0.56F, 8.08F, -1.88F, 6.0F, 9.0F, 7.0F,
						new CubeDeformation(-1.6F)),
				PartPose.offsetAndRotation(11.7098F, 0.6859F, 0.0F, 0.0F, 0.0F, 0.9163F));

		PartDefinition head_r63 = bone3.addOrReplaceChild("head_r63",
				CubeListBuilder.create().texOffs(152, 26).addBox(-0.2115F, -6.2003F, -1.88F, 6.0F, 10.0F, 7.0F,
						new CubeDeformation(-1.68F)),
				PartPose.offsetAndRotation(0.2698F, 13.9659F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition head_r64 = bone3.addOrReplaceChild("head_r64",
				CubeListBuilder.create().texOffs(153, 47).addBox(-5.7885F, -6.2003F, -1.88F, 6.0F, 10.0F, 7.0F,
						new CubeDeformation(-1.68F)),
				PartPose.offsetAndRotation(-0.2698F, 13.9659F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition head_r65 = bone3.addOrReplaceChild("head_r65",
				CubeListBuilder.create().texOffs(162, 165).addBox(-5.44F, 8.08F, -1.88F, 6.0F, 9.0F, 7.0F,
						new CubeDeformation(-1.6F)),
				PartPose.offsetAndRotation(-11.7098F, 0.6859F, 0.0F, 0.0F, 0.0F, -0.9163F));

		PartDefinition head_r66 = bone3.addOrReplaceChild("head_r66",
				CubeListBuilder.create().texOffs(0, 95).addBox(-5.44F, 8.08F, -1.88F, 11.0F, 11.0F, 7.0F,
						new CubeDeformation(-1.6F)),
				PartPose.offsetAndRotation(0.0F, -0.3197F, 2.3228F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head_r67 = bone3.addOrReplaceChild("head_r67",
				CubeListBuilder.create().texOffs(160, 115).addBox(2.56F, -0.48F, -1.88F, 6.0F, 6.0F, 8.0F,
						new CubeDeformation(-1.36F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition head_r68 = bone3.addOrReplaceChild("head_r68",
				CubeListBuilder.create().texOffs(160, 97).addBox(2.72F, -0.48F, -1.88F, 6.0F, 6.0F, 8.0F,
						new CubeDeformation(-1.36F)),
				PartPose.offsetAndRotation(-0.051F, 0.1904F, 0.2406F, -0.3054F, 0.0F, 0.2618F));

		PartDefinition head_r69 = bone3.addOrReplaceChild("head_r69",
				CubeListBuilder.create().texOffs(108, 160).addBox(-8.72F, -0.48F, -1.88F, 6.0F, 6.0F, 8.0F,
						new CubeDeformation(-1.36F)),
				PartPose.offsetAndRotation(0.051F, 0.1904F, 0.2406F, -0.3054F, 0.0F, -0.2618F));

		PartDefinition head_r70 = bone3.addOrReplaceChild("head_r70",
				CubeListBuilder.create().texOffs(20, 164).addBox(-8.72F, -0.48F, -1.88F, 6.0F, 6.0F, 8.0F,
						new CubeDeformation(-1.36F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition head_r71 = bone3.addOrReplaceChild("head_r71",
				CubeListBuilder.create().texOffs(0, 155)
						.addBox(-1.0F, 1.16F, -1.8F, 6.0F, 6.0F, 8.0F, new CubeDeformation(-1.52F)).texOffs(48, 166)
						.addBox(-5.0F, 1.16F, -1.8F, 6.0F, 6.0F, 8.0F, new CubeDeformation(-1.52F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head_r72 = bone3.addOrReplaceChild("head_r72",
				CubeListBuilder.create().texOffs(127, 209).addBox(-3.0F, -1.96F, -2.0F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(-1.52F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r73 = bone4.addOrReplaceChild("head_r73",
				CubeListBuilder.create().texOffs(207, 205).addBox(0.04F, 0.76F, -2.0F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(-1.68F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0945F, -0.2909F, 1.2515F));

		PartDefinition head_r74 = bone4.addOrReplaceChild("head_r74",
				CubeListBuilder.create().texOffs(103, 209).addBox(-2.12F, -0.52F, -2.0F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(-1.6F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2451F, -0.1841F, 0.6318F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r75 = bone5.addOrReplaceChild("head_r75",
				CubeListBuilder.create().texOffs(64, 90).addBox(-6.04F, 0.76F, -2.0F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(-1.68F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0945F, 0.2909F, -1.2515F));

		PartDefinition head_r76 = bone5.addOrReplaceChild("head_r76",
				CubeListBuilder.create().texOffs(61, 207).addBox(-3.88F, -0.52F, -2.0F, 6.0F, 7.0F, 6.0F,
						new CubeDeformation(-1.6F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2451F, 0.1841F, -0.6318F));

		PartDefinition bone29 = bone3.addOrReplaceChild("bone29", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.8F, 0.0F));

		PartDefinition bone7 = bone29.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(187, 199)
				.addBox(-4.56F, 15.04F, -2.12F, 6.0F, 5.0F, 7.0F, new CubeDeformation(-1.68F)).texOffs(187, 199)
				.mirror().addBox(-1.76F, 15.04F, -2.12F, 6.0F, 5.0F, 7.0F, new CubeDeformation(-1.68F)).mirror(false)
				.texOffs(41, 200).addBox(-4.64F, 12.88F, -2.12F, 6.0F, 5.0F, 7.0F, new CubeDeformation(-1.6F))
				.texOffs(41, 200).mirror().addBox(-1.68F, 12.88F, -2.12F, 6.0F, 5.0F, 7.0F, new CubeDeformation(-1.6F))
				.mirror(false), PartPose.offset(0.16F, 0.0F, -0.24F));

		PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.8F, 0.0F, 0.6545F, 0.0F));

		PartDefinition head_r77 = bone9.addOrReplaceChild("head_r77",
				CubeListBuilder.create().texOffs(214, 123).addBox(-3.56F, 9.4F, -3.16F, 5.0F, 10.0F, 5.0F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(-4.3037F, 0.0F, 2.52F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head_r78 = bone9.addOrReplaceChild("head_r78",
				CubeListBuilder.create().texOffs(206, 108).addBox(-4.56F, 7.24F, -5.08F, 6.0F, 10.0F, 5.0F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(-4.3037F, 0.0F, 2.52F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.24F));

		PartDefinition head_r79 = bone8
				.addOrReplaceChild("head_r79",
						CubeListBuilder.create().texOffs(22, 207).addBox(-4.56F, 9.4F, -3.16F, 6.0F, 10.0F, 5.0F,
								new CubeDeformation(-2.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head_r80 = bone8
				.addOrReplaceChild("head_r80",
						CubeListBuilder.create().texOffs(194, 27).addBox(-5.56F, 7.24F, -5.08F, 7.0F, 10.0F, 5.0F,
								new CubeDeformation(-2.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone10 = bone29.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(83, 200)
						.addBox(-4.64F, 10.32F, -2.28F, 6.0F, 5.0F, 7.0F, new CubeDeformation(-1.28F)).texOffs(198, 80)
						.addBox(-1.04F, 10.32F, -2.28F, 6.0F, 5.0F, 7.0F, new CubeDeformation(-1.28F)),
				PartPose.offset(-0.16F, 0.0F, -0.24F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.8F, 0.0F, -0.6545F, 0.0F));

		PartDefinition head_r81 = bone11.addOrReplaceChild("head_r81",
				CubeListBuilder.create().texOffs(179, 211).addBox(-1.44F, 9.4F, -3.16F, 5.0F, 10.0F, 5.0F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(4.3037F, 0.0F, 2.52F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head_r82 = bone11.addOrReplaceChild("head_r82",
				CubeListBuilder.create().texOffs(162, 201).addBox(-1.44F, 7.24F, -5.08F, 6.0F, 10.0F, 5.0F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(4.3037F, 0.0F, 2.52F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone12 = bone10.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.24F));

		PartDefinition head_r83 = bone12
				.addOrReplaceChild("head_r83",
						CubeListBuilder.create().texOffs(0, 206).addBox(-1.44F, 9.4F, -3.16F, 6.0F, 10.0F, 5.0F,
								new CubeDeformation(-2.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head_r84 = bone12
				.addOrReplaceChild("head_r84",
						CubeListBuilder.create().texOffs(24, 192).addBox(-1.44F, 7.24F, -5.08F, 7.0F, 10.0F, 5.0F,
								new CubeDeformation(-2.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Rhitta = partdefinition.addOrReplaceChild("Rhitta", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.4375F, -18.375F, -2.0625F, -0.0335F, -0.2254F, -1.5696F));

		PartDefinition TopPieceBlade = Rhitta.addOrReplaceChild("TopPieceBlade", CubeListBuilder.create()
				.texOffs(226, 240).addBox(-3.75F, 6.5F, -11.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(226, 240).addBox(-5.4795F, 6.5F, -9.7705F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(226, 240).addBox(0.7705F, 6.75F, -9.5205F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(2.0205F, 7.0F, -9.5205F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(0.5205F, 7.0F, -10.0205F, 4.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(0.5205F, 7.0F, -8.5205F, 4.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(-3.917F, 7.0F, -17.708F, 0.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(-3.417F, 7.0F, -18.208F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(-2.667F, 7.0F, -18.208F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(-3.167F, 7.0F, -18.458F, 0.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(-3.417F, 7.0F, -17.708F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(226, 240).addBox(-3.417F, 6.75F, -16.458F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(-2.417F, 7.0F, -17.708F, 0.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(3.5205F, 7.0F, -8.7705F, 2.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(3.5205F, 7.0F, -9.5205F, 2.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(3.5205F, 7.0F, -9.2705F, 2.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(226, 240).addBox(-3.75F, 6.5F, -12.791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(226, 240).addBox(-12.5205F, 6.75F, -9.7705F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 242).addBox(-16.0205F, 7.0F, -11.0205F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(226, 240).addBox(-6.7705F, 6.5F, -9.7705F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(226, 240).addBox(-10.0205F, 6.25F, -9.5205F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(226, 240).addBox(-11.0205F, 6.5F, -9.5205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.0625F, -13.0F, -12.0F));

		PartDefinition cube_r1 = TopPieceBlade.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(226, 240).addBox(-0.2197F, -0.5F, 0.1339F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3076F, 7.0F, -7.2495F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = TopPieceBlade.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(226, 240)
				.addBox(-4.5946F, -0.5F, 0.2325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
				.addBox(-3.3446F, -0.75F, 0.2325F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
				.addBox(-1.5946F, -0.5F, -0.0175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0566F, 7.0F, -7.9999F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r3 = TopPieceBlade.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(226, 240).addBox(-1.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.289F, 7.0F, -8.6136F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r4 = TopPieceBlade.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(226, 240).addBox(-1.2803F, -0.5F, -0.2197F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0977F, 7.0F, -10.4634F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r5 = TopPieceBlade.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(226, 240)
				.addBox(-1.0016F, -0.5F, -4.499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
				.addBox(-1.0016F, -0.75F, -3.499F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
				.addBox(-1.2516F, -0.5F, -1.499F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2516F, 7.0F, -10.9814F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r6 = TopPieceBlade.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(92, 242)
						.addBox(1.2484F, 0.0F, -4.749F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
						.addBox(1.2484F, -0.25F, -1.249F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 242)
						.addBox(-1.5016F, 0.0F, -4.999F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
						.addBox(-1.2516F, -0.25F, -1.499F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0016F, 7.0F, -10.9814F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r7 = TopPieceBlade.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(92, 242)
						.addBox(-0.8358F, 0.0F, -4.1036F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
						.addBox(-0.0858F, -0.25F, -0.8536F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4747F, 7.0F, -14.1129F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r8 = TopPieceBlade.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(92, 242)
						.addBox(-4.7803F, 0.0F, -1.4697F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
						.addBox(-1.2803F, -0.25F, -0.2197F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.8477F, 7.0F, -10.4634F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r9 = TopPieceBlade.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(92, 242)
						.addBox(-5.0F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
						.addBox(-1.5F, -0.25F, -0.25F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.039F, 7.0F, -8.6136F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r10 = TopPieceBlade.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(92, 242)
						.addBox(-5.0946F, 0.0F, 2.7325F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
						.addBox(-1.3446F, -0.25F, 2.7325F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(92, 242)
						.addBox(-5.0946F, 0.0F, -1.2675F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
						.addBox(-1.5946F, -0.25F, -0.0175F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.8066F, 7.0F, -7.9999F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r11 = TopPieceBlade.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(92, 242)
						.addBox(-2.0643F, 0.0F, 0.8536F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(226, 240)
						.addBox(-0.3143F, -0.25F, -0.1464F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2636F, 7.0F, -3.8407F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r12 = TopPieceBlade.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(226, 240).addBox(-1.5F, -0.5F, -1.25F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2716F, 7.0F, -11.6362F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r13 = TopPieceBlade.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(226, 240).addBox(-1.2803F, -0.5F, -1.2803F, 1.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5571F, 7.0F, -11.1182F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r14 = TopPieceBlade.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(226, 240).addBox(-4.751F, -0.5F, -1.2516F, 6.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0391F, 7.0F, -10.2721F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r15 = TopPieceBlade.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(226, 240).addBox(-5.25F, -0.5F, -1.25F, 6.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.48F, 7.0F, -9.5231F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r16 = TopPieceBlade.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(226, 240).addBox(-4.9697F, -0.5F, -1.2803F, 6.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9023F, 7.0F, -7.5776F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r17 = TopPieceBlade.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(226, 240).addBox(-0.2484F, -0.5F, -5.001F, 1.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7484F, 7.0F, -7.0596F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r18 = TopPieceBlade.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(226, 240).addBox(-0.25F, -0.5F, -4.75F, 1.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5931F, 7.0F, -6.7315F, 0.0F, 0.3927F, 0.0F));

		PartDefinition LongBeam = Rhitta.addOrReplaceChild("LongBeam",
				CubeListBuilder.create().texOffs(220, 238)
						.addBox(-3.75F, 6.25F, -4.5F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(220, 238)
						.addBox(-3.75F, 6.5F, -5.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.0625F, -13.0F, -12.0F));

		PartDefinition Handle = Rhitta.addOrReplaceChild("Handle",
				CubeListBuilder.create().texOffs(52, 246)
						.addBox(-4.0F, 6.0F, 23.25F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(-8.0273F, 6.0F, 17.9727F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(-5.6852F, 6.0F, 14.954F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 242)
						.addBox(-3.75F, 6.25F, 16.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(-4.0F, 6.0F, 15.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(-4.0F, 6.0F, 13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(-4.25F, 5.75F, 14.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.0625F, -13.0F, -12.0F));

		PartDefinition cube_r19 = Handle.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(52, 246).addBox(-0.0947F, -1.0F, -0.5518F, 0.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0795F, 7.0F, 15.7146F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r20 = Handle.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(52, 246).addBox(-0.7577F, -1.0F, -1.1739F, 0.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.6724F, 7.0F, 16.6068F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r21 = Handle.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(52, 246).addBox(-0.625F, -1.0F, -1.75F, 0.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.3542F, 7.0F, 17.9809F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r22 = Handle.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(52, 246)
						.addBox(3.556F, -0.25F, -2.4136F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(3.306F, -0.5F, -1.9136F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(3.056F, -0.75F, -1.1636F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.2338F, 7.0F, 17.2859F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r23 = Handle.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(52, 246)
						.addBox(-0.4136F, -0.25F, -1.056F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(0.0864F, -0.5F, -1.306F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(0.8364F, -0.75F, -1.556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.2338F, 7.0F, 17.2859F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r24 = Handle.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(52, 246)
						.addBox(-2.125F, -0.25F, -0.9571F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(-1.625F, -0.5F, -1.2071F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(-0.875F, -0.75F, -1.4571F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(-0.375F, -1.0F, -1.7071F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0276F, 7.0F, 21.4063F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r25 = Handle.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(52, 246)
						.addBox(4.963F, -0.25F, 0.5679F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(4.713F, -0.5F, -0.1821F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 246)
						.addBox(4.463F, -0.75F, -0.6821F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0127F, 7.0F, 22.1881F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r26 = Handle.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(52, 246).addBox(-1.6929F, -1.0F, -0.088F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5968F, 7.0F, 22.5494F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r27 = Handle.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(52, 246).addBox(-1.75F, -1.0F, -0.375F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0875F, 7.0F, 23.5579F, 0.0F, -0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone32.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rhitta.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Head2.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head2.xRot = headPitch / (180F / (float) Math.PI);
	}
}