// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSSJPLAYER<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ssjplayer"), "main");
	private final ModelPart Head;

	public ModelSSJPLAYER(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Main2 = Hair.addOrReplaceChild("Main2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.028F, 0.0F));

		PartDefinition Left = Main2.addOrReplaceChild("Left", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.004F, 0.0F));

		PartDefinition bunch = Left.addOrReplaceChild("bunch", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.003F, -5.7557F, -4.004F, 0.3124F, 0.2079F, 0.0666F));

		PartDefinition bunch_r1 = bunch.addOrReplaceChild("bunch_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.0297F, -2.4679F, -1.1965F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3931F, -2.9825F, 1.5815F, -0.7127F, -0.0546F, 0.5036F));

		PartDefinition bunch_r2 = bunch.addOrReplaceChild("bunch_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.6802F, -0.7769F, -1.2595F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3931F, -2.9825F, 1.5815F, -0.4905F, -0.0713F, 0.1031F));

		PartDefinition bunch_r3 = bunch.addOrReplaceChild("bunch_r3",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.5983F, -0.3999F, -1.5815F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4931F, -2.7075F, 1.5815F, 0.0F, 0.0F, -0.0654F));

		PartDefinition bunch8 = Left.addOrReplaceChild("bunch8",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.8018F, -0.87F, -0.9009F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -6.006F, -3.003F, 0.0656F, 0.1238F, 0.4783F));

		PartDefinition bunch8_r1 = bunch8.addOrReplaceChild("bunch8_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.2973F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8018F, 1.03F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition bunch9 = Left.addOrReplaceChild("bunch9",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.872F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -4.004F, -2.002F, -0.214F, 0.1766F, 0.7609F));

		PartDefinition bunch9_r1 = bunch9.addOrReplaceChild("bunch9_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.973F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bunch10 = Left.addOrReplaceChild("bunch10",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.874F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -2.002F, 0.0F, -0.2538F, 0.093F, 0.7869F));

		PartDefinition bunch10_r1 = bunch10.addOrReplaceChild("bunch10_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.4224F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bunch11 = Left.addOrReplaceChild("bunch11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.003F, -7.007F, -2.002F, 0.0476F, -0.0069F, -0.2166F));

		PartDefinition bunch11_r1 = bunch11.addOrReplaceChild("bunch11_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.5005F, -1.3F, -0.8008F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2748F, -3.4337F, 0.4218F, -0.3798F, 0.1024F, 0.5563F));

		PartDefinition bunch11_r2 = bunch11.addOrReplaceChild("bunch11_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -0.3408F, -1.2119F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9259F, -2.3282F, 0.2109F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bunch15 = Left.addOrReplaceChild("bunch15",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -8.008F, -1.001F, -0.0932F, 0.0143F, 0.0844F));

		PartDefinition bunch15_r1 = bunch15.addOrReplaceChild("bunch15_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.825F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch17 = Left.addOrReplaceChild("bunch17",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -8.008F, 0.0F, -0.1298F, -0.017F, -0.1298F));

		PartDefinition bunch17_r1 = bunch17.addOrReplaceChild("bunch17_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -6.4F, -0.4254F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.023F, -2.7403F, -0.6109F, 0.0F, 0.0F));

		PartDefinition bunch17_r2 = bunch17.addOrReplaceChild("bunch17_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.625F, -0.5756F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch18 = Left.addOrReplaceChild("bunch18",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.874F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -2.002F, 2.002F, 0.1682F, 0.1136F, 0.7004F));

		PartDefinition bunch18_r1 = bunch18.addOrReplaceChild("bunch18_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.6476F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bunch19 = Left.addOrReplaceChild("bunch19",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.872F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -4.004F, 1.001F, 0.1409F, 0.399F, 0.5638F));

		PartDefinition bunch19_r1 = bunch19.addOrReplaceChild("bunch19_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-3.1481F, -1.81F, -0.8108F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition bunch20 = Left.addOrReplaceChild("bunch20",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.871F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -5.005F, 0.0F, 0.1706F, 0.1996F, 0.7153F));

		PartDefinition bunch20_r1 = bunch20.addOrReplaceChild("bunch20_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-3.2983F, -1.81F, -0.8108F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.029F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition bunch31 = Left.addOrReplaceChild("bunch31",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -0.874F, 0.2002F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.002F, -2.002F, 2.8028F, 0.6531F, -0.1074F, -0.291F));

		PartDefinition bunch31_r1 = bunch31.addOrReplaceChild("bunch31_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8108F, 0.19F, 0.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.974F, 2.9029F, -0.5672F, 0.0F, 0.0F));

		PartDefinition bunch32 = Left.addOrReplaceChild("bunch32",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -0.872F, 0.2002F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -4.004F, 2.8028F, 0.5059F, -0.3082F, -0.1665F));

		PartDefinition bunch32_r1 = bunch32.addOrReplaceChild("bunch32_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8108F, 0.19F, 0.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.972F, 2.9029F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch38 = Left.addOrReplaceChild("bunch38",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -7.007F, 0.0F, -0.2931F, -0.0895F, -0.3829F));

		PartDefinition bunch38_r1 = bunch38.addOrReplaceChild("bunch38_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.225F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch39 = Left.addOrReplaceChild("bunch39",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.874F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -2.002F, 3.003F, 0.3765F, 0.5351F, 0.6915F));

		PartDefinition bunch39_r1 = bunch39.addOrReplaceChild("bunch39_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.2973F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bunch40 = Left.addOrReplaceChild("bunch40",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.8028F, -0.872F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -4.004F, 3.003F, 0.668F, 0.4042F, 0.945F));

		PartDefinition bunch40_r1 = bunch40.addOrReplaceChild("bunch40_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-2.4474F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bunch41 = Left.addOrReplaceChild("bunch41",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.003F, -7.007F, 2.002F, -0.3696F, 0.2475F, -0.2181F));

		PartDefinition bunch41_r1 = bunch41.addOrReplaceChild("bunch41_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.3895F, -0.7455F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch41_r2 = bunch41.addOrReplaceChild("bunch41_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch46 = Left.addOrReplaceChild("bunch46",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.974F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -2.002F, 3.003F, -0.7352F, 0.0454F, 0.0199F));

		PartDefinition bunch46_r1 = bunch46.addOrReplaceChild("bunch46_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.0527F, 0.2306F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.974F, -1.001F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bunch48 = Left.addOrReplaceChild("bunch48",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.97F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.002F, -6.006F, 3.003F, -0.7259F, -0.1394F, -0.1081F));

		PartDefinition bunch48_r1 = bunch48.addOrReplaceChild("bunch48_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.025F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.97F, -1.001F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Right = Main2.addOrReplaceChild("Right", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.004F, 0.0F));

		PartDefinition bunch2 = Right.addOrReplaceChild("bunch2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -1.97F, -1.001F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -6.006F, -3.003F, 0.5221F, -0.0227F, 0.1289F));

		PartDefinition bunch2_r1 = bunch2.addOrReplaceChild("bunch2_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -3.55F, 0.1001F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.97F, -1.001F, -0.48F, 0.0F, 0.0F));

		PartDefinition bunch6 = Right.addOrReplaceChild("bunch6",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -1.97F, 0.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -6.006F, -4.004F, 0.5208F, -0.0516F, 0.1199F));

		PartDefinition bunch6_r1 = bunch6.addOrReplaceChild("bunch6_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -2.45F, 0.1001F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5699F, 0.6699F, -0.7418F, 0.0F, 0.0F));

		PartDefinition bunch6_r2 = bunch6.addOrReplaceChild("bunch6_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -1.7F, 0.1001F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.97F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch7 = Right.addOrReplaceChild("bunch7",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.569F, 0.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -7.007F, -4.004F, 0.217F, -0.2357F, 0.1709F));

		PartDefinition bunch7_r1 = bunch7.addOrReplaceChild("bunch7_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.7207F, -2.44F, 0.1001F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.569F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bunch12 = Right.addOrReplaceChild("bunch12",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -8.008F, -3.003F, -0.0428F, 0.0189F, 0.0852F));

		PartDefinition bunch12_r1 = bunch12.addOrReplaceChild("bunch12_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.875F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bunch13 = Right.addOrReplaceChild("bunch13",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -8.008F, -3.003F, -0.2181F, -0.0073F, 0.0467F));

		PartDefinition bunch13_r1 = bunch13.addOrReplaceChild("bunch13_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -3.175F, 0.2002F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch14 = Right.addOrReplaceChild("bunch14",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -1.968F, -1.001F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -8.008F, -2.002F, -0.1899F, -0.2141F, 0.0853F));

		PartDefinition bunch14_r1 = bunch14.addOrReplaceChild("bunch14_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.8F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.968F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch16 = Right.addOrReplaceChild("bunch16",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.008F, -1.001F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bunch16_r1 = bunch16.addOrReplaceChild("bunch16_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.85F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2088F, -0.0701F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bunch16_r2 = bunch16.addOrReplaceChild("bunch16_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.4F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch21 = Right.addOrReplaceChild("bunch21",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -7.007F, -1.001F, -0.1233F, -0.1211F, 0.0658F));

		PartDefinition bunch21_r1 = bunch21.addOrReplaceChild("bunch21_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.575F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2098F, -0.0701F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bunch21_r2 = bunch21.addOrReplaceChild("bunch21_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.4F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch22 = Right.addOrReplaceChild("bunch22",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.872F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -4.004F, -2.002F, -0.214F, -0.1766F, -0.7609F));

		PartDefinition bunch22_r1 = bunch22.addOrReplaceChild("bunch22_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition bunch23 = Right.addOrReplaceChild("bunch23",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.874F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -2.002F, 0.0F, -0.2132F, 0.0015F, -0.7626F));

		PartDefinition bunch23_r1 = bunch23.addOrReplaceChild("bunch23_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition bunch24 = Right.addOrReplaceChild("bunch24",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.871F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -5.005F, 0.0F, 0.1706F, -0.1996F, -0.7153F));

		PartDefinition bunch24_r1 = bunch24.addOrReplaceChild("bunch24_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.029F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition bunch25 = Right.addOrReplaceChild("bunch25",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.874F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -2.002F, 2.002F, 0.169F, -0.117F, -0.7008F));

		PartDefinition bunch25_r1 = bunch25.addOrReplaceChild("bunch25_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition bunch26 = Right.addOrReplaceChild("bunch26",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.872F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -4.004F, 1.001F, 0.1437F, -0.4422F, -0.5705F));

		PartDefinition bunch26_r1 = bunch26.addOrReplaceChild("bunch26_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition bunch27 = Right.addOrReplaceChild("bunch27",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.87F, -0.9009F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -6.006F, -3.003F, 0.0572F, -0.2136F, -0.4396F));

		PartDefinition bunch27_r1 = bunch27.addOrReplaceChild("bunch27_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8018F, 1.03F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition bunch28 = Right.addOrReplaceChild("bunch28",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -0.874F, 0.2002F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -2.002F, 2.8028F, 0.726F, 0.1383F, 0.3711F));

		PartDefinition bunch28_r1 = bunch28.addOrReplaceChild("bunch28_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8108F, 0.19F, 0.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.974F, 2.9029F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bunch29 = Right.addOrReplaceChild("bunch29",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -0.872F, 0.2002F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -4.004F, 2.8028F, 0.4507F, 0.2316F, 0.1231F));

		PartDefinition bunch29_r1 = bunch29.addOrReplaceChild("bunch29_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8108F, 0.19F, 0.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.972F, 2.9029F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bunch30 = Right.addOrReplaceChild("bunch30",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.9009F, -0.874F, 0.2002F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -2.002F, 2.8028F, 0.6074F, 0.0603F, -0.1163F));

		PartDefinition bunch30_r1 = bunch30.addOrReplaceChild("bunch30_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8108F, 0.19F, 0.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.974F, 2.9029F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bunch33 = Right.addOrReplaceChild("bunch33",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.001F, -8.008F, 1.001F, -0.3054F, -0.0073F, 0.0467F));

		PartDefinition bunch33_r1 = bunch33.addOrReplaceChild("bunch33_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.7007F, -5.4F, 0.3003F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6064F, -1.9442F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bunch33_r2 = bunch33.addOrReplaceChild("bunch33_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.4F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch34 = Right.addOrReplaceChild("bunch34",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.968F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -8.008F, 1.001F, -0.4344F, -0.0299F, -0.0379F));

		PartDefinition bunch34_r1 = bunch34.addOrReplaceChild("bunch34_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.4F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.968F, -1.001F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bunch35 = Right.addOrReplaceChild("bunch35",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -7.007F, 0.0F, -0.2521F, 0.0696F, 0.2499F));

		PartDefinition bunch35_r1 = bunch35.addOrReplaceChild("bunch35_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -4.4F, 0.2002F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6754F, -1.9529F, -0.48F, 0.0F, 0.0F));

		PartDefinition bunch35_r2 = bunch35.addOrReplaceChild("bunch35_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bunch36 = Right.addOrReplaceChild("bunch36",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -7.007F, 2.002F, -0.3828F, -0.09F, -0.1555F));

		PartDefinition bunch36_r1 = bunch36.addOrReplaceChild("bunch36_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -6.65F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.694F, -2.2777F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch36_r2 = bunch36.addOrReplaceChild("bunch36_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch37 = Right.addOrReplaceChild("bunch37",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.001F, -7.007F, 2.002F, -0.478F, 0.0406F, 0.034F));

		PartDefinition bunch37_r1 = bunch37.addOrReplaceChild("bunch37_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.5F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2172F, -0.0655F, -0.5672F, 0.0F, 0.0F));

		PartDefinition bunch37_r2 = bunch37.addOrReplaceChild("bunch37_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.4F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch42 = Right.addOrReplaceChild("bunch42",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.874F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -2.002F, 3.003F, 0.2691F, -0.4828F, -0.829F));

		PartDefinition bunch42_r1 = bunch42.addOrReplaceChild("bunch42_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.026F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition bunch43 = Right.addOrReplaceChild("bunch43",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -0.872F, -0.9009F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -4.004F, 3.003F, 0.6938F, -0.472F, -1.0056F));

		PartDefinition bunch43_r1 = bunch43.addOrReplaceChild("bunch43_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(0.0F, -1.81F, -0.8108F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8028F, 1.028F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition bunch44 = Right.addOrReplaceChild("bunch44",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.969F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.003F, -7.007F, 2.002F, -0.3696F, -0.2475F, 0.2181F));

		PartDefinition bunch44_r1 = bunch44.addOrReplaceChild("bunch44_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -4.075F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.5418F, -1.5116F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bunch44_r2 = bunch44.addOrReplaceChild("bunch44_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.969F, -1.001F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bunch45 = Right.addOrReplaceChild("bunch45",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.971F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.005F, 3.003F, -0.7367F, -0.0066F, -0.0545F));

		PartDefinition bunch45_r1 = bunch45.addOrReplaceChild("bunch45_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.7507F, -5.2F, 0.2503F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.5472F, -1.7734F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bunch45_r2 = bunch45.addOrReplaceChild("bunch45_r2",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -1.4F, 0.2002F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.971F, -1.001F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bunch47 = Right.addOrReplaceChild("bunch47",
				CubeListBuilder.create().texOffs(45, 2).addBox(-1.001F, -2.97F, -1.001F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.002F, -6.006F, 3.003F, -0.7331F, 0.0813F, 0.0427F));

		PartDefinition bunch47_r1 = bunch47.addOrReplaceChild("bunch47_r1",
				CubeListBuilder.create().texOffs(45, 2).addBox(-0.8008F, -2.375F, 0.2002F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.97F, -1.001F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bangs = Hair.addOrReplaceChild("Bangs", CubeListBuilder.create(),
				PartPose.offset(2.002F, -7.031F, -3.003F));

		PartDefinition BangSection2 = Bangs.addOrReplaceChild("BangSection2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.004F, 0.0F, -1.001F, 0.8228F, 0.609F, 0.2567F));

		PartDefinition Bang2 = BangSection2.addOrReplaceChild("Bang2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.2252F, 0.6507F));

		PartDefinition Bottom = Bang2.addOrReplaceChild("Bottom", CubeListBuilder.create().texOffs(45, 3)
				.addBox(-2.9029F, -31.9F, -6.1561F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.002F, 30.8058F, 3.3533F));

		PartDefinition Top = Bang2.addOrReplaceChild("Top", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.2262F, -2.4524F));

		PartDefinition Top_r1 = Top.addOrReplaceChild("Top_r1",
				CubeListBuilder.create().texOffs(45, 3).addBox(-0.8108F, 0.04F, -2.8979F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.032F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Bang1 = BangSection2.addOrReplaceChild("Bang1", CubeListBuilder.create(),
				PartPose.offset(-1.7517F, -0.0883F, -0.3825F));

		PartDefinition Bottom2 = Bang1.addOrReplaceChild("Bottom2", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition bunch3_r1 = Bottom2.addOrReplaceChild("bunch3_r1",
				CubeListBuilder.create().texOffs(45, 3).addBox(-0.9009F, -1.1368F, -0.4433F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1001F, 1.2323F, 0.4004F, -0.1745F, 0.2182F, 0.0F));

		PartDefinition Top2 = Bang1.addOrReplaceChild("Top2", CubeListBuilder.create(),
				PartPose.offset(-0.1001F, -1.2012F, -2.002F));

		PartDefinition bunch3_r2 = Top2.addOrReplaceChild("bunch3_r2",
				CubeListBuilder.create().texOffs(45, 3).addBox(-0.7997F, 0.1388F, -1.8308F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0323F, 0.0F, 0.1745F, 0.2182F, 0.0F));

		PartDefinition BangSection = Bangs.addOrReplaceChild("BangSection", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bang = BangSection.addOrReplaceChild("Bang", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.002F, 0.0F, -1.001F, 0.7089F, -0.745F, -0.1584F));

		PartDefinition Bottom3 = Bang.addOrReplaceChild("Bottom3", CubeListBuilder.create().texOffs(45, 3)
				.addBox(-0.8008F, -31.8F, -6.4064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 31.031F, 4.004F));

		PartDefinition Top3 = Bang.addOrReplaceChild("Top3", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6506F, -2.3774F));

		PartDefinition bunch4_r1 = Top3.addOrReplaceChild("bunch4_r1",
				CubeListBuilder.create().texOffs(45, 3).addBox(-0.7207F, 0.28F, -2.1622F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3184F, -0.025F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Bang3 = BangSection.addOrReplaceChild("Bang3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, -0.6109F, 0.0F));

		PartDefinition Bottom4 = Bang3.addOrReplaceChild("Bottom4", CubeListBuilder.create().texOffs(45, 3)
				.addBox(-0.8008F, -0.769F, -2.4024F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Top4 = Bang3.addOrReplaceChild("Top4", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.6757F, -2.4274F));

		PartDefinition bunch5_r1 = Top4.addOrReplaceChild("bunch5_r1",
				CubeListBuilder.create().texOffs(45, 3).addBox(-0.7207F, 0.0202F, -2.012F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0067F, 0.025F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}