
package net.mcreator.animecross.item;

import net.minecraft.sounds.SoundEvent;

public abstract class RengokuOutfitItem extends ArmorItem {

	public RengokuOutfitItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 7, 7, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "rengoku_outfit";
			}

			@Override
			public float getToughness() {
				return 1.9f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Chestplate extends RengokuOutfitItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_DEMON_SLAYER));
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("body", new Modelgob(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgob.LAYER_LOCATION)).Body,
									"left_arm", new Modelgob(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgob.LAYER_LOCATION)).LeftArm,
									"right_arm", new Modelgob(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgob.LAYER_LOCATION)).RightArm,
									"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "animecrossworkspace:textures/entities/rengoku_outfit.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RengokuOutfitBodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends RengokuOutfitItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_DEMON_SLAYER));
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("left_leg", new Modelgob(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgob.LAYER_LOCATION)).LeftLeg,
									"right_leg", new Modelgob(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgob.LAYER_LOCATION)).RightLeg,
									"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "animecrossworkspace:textures/entities/rengoku_outfit.png";
		}

	}

}
