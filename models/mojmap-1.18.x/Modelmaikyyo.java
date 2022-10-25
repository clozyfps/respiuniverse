// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmaikyyo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "maikyyo"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelmaikyyo(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(96, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Head_r1 = bone.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(77, 17).addBox(-2.0F, -32.3F, -1.2F, 4.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, -0.0873F, 0.0F));

		PartDefinition Head_r2 = bone.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(12.5F, -28.8F, -4.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(12.0F, -24.2F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Head_r3 = bone
				.addOrReplaceChild("Head_r3",
						CubeListBuilder.create().texOffs(77, 17).addBox(30.1F, -8.3F, -4.3F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition Head_r4 = bone.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(77, 17).addBox(11.9F, -24.5F, -1.1F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, -0.3054F));

		PartDefinition Head_r5 = bone
				.addOrReplaceChild("Head_r5",
						CubeListBuilder.create().texOffs(77, 17).addBox(10.15F, -30.0F, -3.3F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r6 = bone.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(77, 17).addBox(13.5F, -23.5F, -4.8F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3927F));

		PartDefinition Head_r7 = bone.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.4F, -23.5F, -1.7F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.3491F));

		PartDefinition Head_r8 = bone.addOrReplaceChild("Head_r8",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.25F, -23.5F, -2.2F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3491F));

		PartDefinition Head_r9 = bone.addOrReplaceChild("Head_r9",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.1F, -25.2F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.1745F));

		PartDefinition Head_r10 = bone.addOrReplaceChild("Head_r10",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.6F, -30.3F, 1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.25F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.5F, -3.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.1745F));

		PartDefinition Head_r11 = bone.addOrReplaceChild("Head_r11",
				CubeListBuilder.create().texOffs(77, 17).addBox(5.8F, -25.5F, 6.2F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, -0.1745F));

		PartDefinition Head_r12 = bone.addOrReplaceChild("Head_r12",
				CubeListBuilder.create().texOffs(77, 17).addBox(8.1F, -30.0F, 1.8F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, -0.1745F));

		PartDefinition Head_r13 = bone.addOrReplaceChild("Head_r13",
				CubeListBuilder.create().texOffs(77, 17).addBox(8.2F, -28.8F, 8.6F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6109F, -0.3054F));

		PartDefinition Head_r14 = bone.addOrReplaceChild("Head_r14",
				CubeListBuilder.create().texOffs(77, 17).addBox(11.6F, -28.5F, -3.9F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.3054F));

		PartDefinition Head_r15 = bone.addOrReplaceChild("Head_r15",
				CubeListBuilder.create().texOffs(77, 17).addBox(15.2F, -26.5F, -5.9F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.4363F));

		PartDefinition Head_r16 = bone.addOrReplaceChild("Head_r16",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(6.3F, -30.5F, -3.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(6.5F, -28.5F, -4.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Head_r17 = bone4.addOrReplaceChild("Head_r17",
				CubeListBuilder.create().texOffs(77, 17).addBox(-2.0F, -32.3F, -1.2F, 4.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, -0.0873F, 0.0F));

		PartDefinition Head_r18 = bone4.addOrReplaceChild("Head_r18",
				CubeListBuilder.create().texOffs(77, 17).addBox(11.9F, -24.5F, -1.1F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, -0.3054F));

		PartDefinition Head_r19 = bone4
				.addOrReplaceChild("Head_r19",
						CubeListBuilder.create().texOffs(77, 17).addBox(10.15F, -30.0F, -3.3F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r20 = bone4.addOrReplaceChild("Head_r20",
				CubeListBuilder.create().texOffs(77, 17).addBox(13.5F, -23.5F, -4.8F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3927F));

		PartDefinition Head_r21 = bone4.addOrReplaceChild("Head_r21",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.4F, -23.5F, -1.7F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.3491F));

		PartDefinition Head_r22 = bone4.addOrReplaceChild("Head_r22",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.25F, -23.5F, -2.2F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3491F));

		PartDefinition Head_r23 = bone4.addOrReplaceChild("Head_r23",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.1F, -25.2F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.1745F));

		PartDefinition Head_r24 = bone4.addOrReplaceChild("Head_r24",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.6F, -30.3F, 1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.25F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.5F, -3.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.1745F));

		PartDefinition Head_r25 = bone4.addOrReplaceChild("Head_r25",
				CubeListBuilder.create().texOffs(77, 17).addBox(5.8F, -25.5F, 6.2F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, -0.1745F));

		PartDefinition Head_r26 = bone4.addOrReplaceChild("Head_r26",
				CubeListBuilder.create().texOffs(77, 17).addBox(8.1F, -30.0F, 1.8F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, -0.1745F));

		PartDefinition Head_r27 = bone4.addOrReplaceChild("Head_r27",
				CubeListBuilder.create().texOffs(77, 17).addBox(8.2F, -28.8F, 8.6F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6109F, -0.3054F));

		PartDefinition Head_r28 = bone4.addOrReplaceChild("Head_r28",
				CubeListBuilder.create().texOffs(77, 17).addBox(11.6F, -28.5F, -3.9F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.3054F));

		PartDefinition Head_r29 = bone4.addOrReplaceChild("Head_r29",
				CubeListBuilder.create().texOffs(77, 17).addBox(15.2F, -26.5F, -5.9F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.4363F));

		PartDefinition Head_r30 = bone4
				.addOrReplaceChild("Head_r30",
						CubeListBuilder.create().texOffs(77, 17).addBox(6.3F, -30.5F, -3.3F, 1.0F, 5.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Head_r31 = bone3.addOrReplaceChild("Head_r31",
				CubeListBuilder.create().texOffs(77, 17).addBox(-2.0F, -32.3F, -1.2F, 4.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, -0.0873F, 0.0F));

		PartDefinition Head_r32 = bone3.addOrReplaceChild("Head_r32",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(11.7F, -29.1F, 3.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(11.2F, -24.2F, 3.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Head_r33 = bone3.addOrReplaceChild("Head_r33",
				CubeListBuilder.create().texOffs(77, 17).addBox(29.8F, -9.0F, 3.9F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, -1.2654F));

		PartDefinition Head_r34 = bone3.addOrReplaceChild("Head_r34",
				CubeListBuilder.create().texOffs(77, 17).addBox(11.9F, -24.5F, -1.1F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, -0.3054F));

		PartDefinition Head_r35 = bone3
				.addOrReplaceChild("Head_r35",
						CubeListBuilder.create().texOffs(77, 17).addBox(10.15F, -30.0F, -3.3F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r36 = bone3.addOrReplaceChild("Head_r36",
				CubeListBuilder.create().texOffs(77, 17).addBox(13.5F, -23.5F, -4.8F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3927F));

		PartDefinition Head_r37 = bone3.addOrReplaceChild("Head_r37",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.4F, -23.5F, -1.7F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.3491F));

		PartDefinition Head_r38 = bone3.addOrReplaceChild("Head_r38",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.25F, -23.5F, -2.2F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3491F));

		PartDefinition Head_r39 = bone3.addOrReplaceChild("Head_r39",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.1F, -25.2F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.1745F));

		PartDefinition Head_r40 = bone3.addOrReplaceChild("Head_r40",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.6F, -30.3F, 1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.25F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.5F, -3.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.1745F));

		PartDefinition Head_r41 = bone3.addOrReplaceChild("Head_r41",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.0F, -25.5F, 3.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.1F, -30.0F, 1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, -0.1745F));

		PartDefinition Head_r42 = bone3.addOrReplaceChild("Head_r42",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(6.3F, -30.5F, -3.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(5.7F, -28.5F, 3.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone2 = bone3.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.4835F, 0.0F));

		PartDefinition Head_r43 = bone2.addOrReplaceChild("Head_r43",
				CubeListBuilder.create().texOffs(77, 17).addBox(11.9F, -24.5F, -1.1F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, -0.3054F));

		PartDefinition Head_r44 = bone2
				.addOrReplaceChild("Head_r44",
						CubeListBuilder.create().texOffs(77, 17).addBox(10.15F, -30.0F, -3.3F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r45 = bone2.addOrReplaceChild("Head_r45",
				CubeListBuilder.create().texOffs(77, 17).addBox(13.5F, -23.5F, -4.8F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3927F));

		PartDefinition Head_r46 = bone2.addOrReplaceChild("Head_r46",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.4F, -23.5F, -1.7F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.3491F));

		PartDefinition Head_r47 = bone2.addOrReplaceChild("Head_r47",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.25F, -24.0F, -2.2F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3491F));

		PartDefinition Head_r48 = bone2.addOrReplaceChild("Head_r48",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.1F, -25.4F, 1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.1745F));

		PartDefinition Head_r49 = bone2.addOrReplaceChild("Head_r49",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.6F, -30.3F, 1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.25F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.5F, -3.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.1745F));

		PartDefinition Head_r50 = bone2.addOrReplaceChild("Head_r50",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.0F, -25.5F, 3.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.1F, -30.0F, 1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, -0.1745F));

		PartDefinition Head_r51 = bone2.addOrReplaceChild("Head_r51",
				CubeListBuilder.create().texOffs(77, 16).addBox(11.1F, -30.0F, -2.0F, 1.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.2618F));

		PartDefinition Head_r52 = bone2
				.addOrReplaceChild("Head_r52",
						CubeListBuilder.create().texOffs(77, 17).addBox(6.3F, -30.5F, -3.3F, 1.0F, 5.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone6 = bone.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, -1.4399F, -0.0436F));

		PartDefinition Head_r53 = bone6.addOrReplaceChild("Head_r53",
				CubeListBuilder.create().texOffs(77, 17).addBox(11.9F, -24.5F, -1.1F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, -0.3054F));

		PartDefinition Head_r54 = bone6
				.addOrReplaceChild("Head_r54",
						CubeListBuilder.create().texOffs(77, 17).addBox(10.15F, -30.0F, -3.3F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r55 = bone6.addOrReplaceChild("Head_r55",
				CubeListBuilder.create().texOffs(77, 17).addBox(13.5F, -23.5F, -4.8F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3927F));

		PartDefinition Head_r56 = bone6.addOrReplaceChild("Head_r56",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.4F, -23.5F, -1.7F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.3491F));

		PartDefinition Head_r57 = bone6.addOrReplaceChild("Head_r57",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.25F, -23.5F, -2.2F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3491F));

		PartDefinition Head_r58 = bone6.addOrReplaceChild("Head_r58",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.1F, -25.2F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.1745F));

		PartDefinition Head_r59 = bone6.addOrReplaceChild("Head_r59",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.6F, -30.3F, 1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.25F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.5F, -3.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.1745F));

		PartDefinition Head_r60 = bone6.addOrReplaceChild("Head_r60",
				CubeListBuilder.create().texOffs(77, 17).addBox(5.8F, -25.5F, 6.2F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, -0.1745F));

		PartDefinition Head_r61 = bone6.addOrReplaceChild("Head_r61",
				CubeListBuilder.create().texOffs(77, 17).addBox(8.1F, -30.0F, 1.8F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, -0.1745F));

		PartDefinition Head_r62 = bone6.addOrReplaceChild("Head_r62",
				CubeListBuilder.create().texOffs(77, 17).addBox(8.2F, -28.8F, 8.6F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6109F, -0.3054F));

		PartDefinition Head_r63 = bone6.addOrReplaceChild("Head_r63",
				CubeListBuilder.create().texOffs(77, 17).addBox(11.6F, -28.5F, -3.9F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.3054F));

		PartDefinition Head_r64 = bone6.addOrReplaceChild("Head_r64",
				CubeListBuilder.create().texOffs(77, 17).addBox(15.2F, -26.5F, -5.9F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.4363F));

		PartDefinition Head_r65 = bone6
				.addOrReplaceChild("Head_r65",
						CubeListBuilder.create().texOffs(77, 17).addBox(6.3F, -30.5F, -3.3F, 1.0F, 5.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.6144F, 0.0F));

		PartDefinition Head_r66 = bone7
				.addOrReplaceChild("Head_r66",
						CubeListBuilder.create().texOffs(77, 17).addBox(10.15F, -30.0F, -3.3F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head_r67 = bone7.addOrReplaceChild("Head_r67",
				CubeListBuilder.create().texOffs(77, 17).addBox(13.5F, -23.5F, -4.8F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3927F));

		PartDefinition Head_r68 = bone7.addOrReplaceChild("Head_r68",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.4F, -23.5F, -1.7F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.3491F));

		PartDefinition Head_r69 = bone7.addOrReplaceChild("Head_r69",
				CubeListBuilder.create().texOffs(77, 17).addBox(12.25F, -23.5F, -2.2F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.3491F));

		PartDefinition Head_r70 = bone7.addOrReplaceChild("Head_r70",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.1F, -25.2F, 1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.1745F));

		PartDefinition Head_r71 = bone7.addOrReplaceChild("Head_r71",
				CubeListBuilder.create().texOffs(77, 17)
						.addBox(8.6F, -30.3F, 1.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.25F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17)
						.addBox(8.2F, -30.5F, -3.9F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, -0.1745F));

		PartDefinition Head_r72 = bone7.addOrReplaceChild("Head_r72",
				CubeListBuilder.create().texOffs(77, 17).addBox(5.8F, -25.5F, 6.2F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, -0.1745F));

		PartDefinition Head_r73 = bone7.addOrReplaceChild("Head_r73",
				CubeListBuilder.create().texOffs(77, 17).addBox(8.1F, -30.0F, 1.8F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, -0.1745F));

		PartDefinition Head_r74 = bone7.addOrReplaceChild("Head_r74",
				CubeListBuilder.create().texOffs(77, 17).addBox(8.2F, -28.8F, 8.6F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6109F, -0.3054F));

		PartDefinition Head_r75 = bone7.addOrReplaceChild("Head_r75",
				CubeListBuilder.create().texOffs(77, 17).addBox(11.6F, -28.5F, -3.9F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.3054F));

		PartDefinition Head_r76 = bone7.addOrReplaceChild("Head_r76",
				CubeListBuilder.create().texOffs(77, 17).addBox(15.2F, -26.5F, -5.9F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.4363F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 32)
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

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(38, 48)
				.addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition right_arm_r1 = RightArm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, 22.0F, 9.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(38, 48).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 32)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 32).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
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

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}