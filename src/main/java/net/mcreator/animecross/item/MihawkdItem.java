
package net.mcreator.animecross.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.animecross.procedures.MihawkdHelmetTickEventProcedure;
import net.mcreator.animecross.procedures.MihawkdBodyTickEventProcedure;
import net.mcreator.animecross.init.AnimecrossworkspaceModTabs;
import net.mcreator.animecross.client.model.Modelmihawkhatmodel;
import net.mcreator.animecross.client.model.Modelmihawkdrippworkrn;

import java.util.Map;
import java.util.Collections;

public abstract class MihawkdItem extends ArmorItem {
	public MihawkdItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 7, 4}[slot.getIndex()];
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
				return "mihawkd";
			}

			@Override
			public float getToughness() {
				return 1.7f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends MihawkdItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_ONE_PIECE));
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("head",
							new Modelmihawkhatmodel(Minecraft.getInstance().getEntityModels().bakeLayer(Modelmihawkhatmodel.LAYER_LOCATION)).bone,
							"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
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
			return "animecrossworkspace:textures/entities/mihawkhattex.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MihawkdHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends MihawkdItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_ONE_PIECE));
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("body",
									new Modelmihawkdrippworkrn(
											Minecraft.getInstance().getEntityModels().bakeLayer(Modelmihawkdrippworkrn.LAYER_LOCATION)).Body,
									"left_arm",
									new Modelmihawkdrippworkrn(
											Minecraft.getInstance().getEntityModels().bakeLayer(Modelmihawkdrippworkrn.LAYER_LOCATION)).LeftArm,
									"right_arm",
									new Modelmihawkdrippworkrn(
											Minecraft.getInstance().getEntityModels().bakeLayer(Modelmihawkdrippworkrn.LAYER_LOCATION)).RightArm,
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
			return "animecrossworkspace:textures/entities/mihawkdriptexture.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MihawkdBodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends MihawkdItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AnimecrossworkspaceModTabs.TAB_ONE_PIECE));
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("left_leg",
									new Modelmihawkdrippworkrn(
											Minecraft.getInstance().getEntityModels().bakeLayer(Modelmihawkdrippworkrn.LAYER_LOCATION)).LeftLeg,
									"right_leg",
									new Modelmihawkdrippworkrn(
											Minecraft.getInstance().getEntityModels().bakeLayer(Modelmihawkdrippworkrn.LAYER_LOCATION)).RightLeg,
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
			return "animecrossworkspace:textures/entities/mihawkdriptexture.png";
		}
	}
}
