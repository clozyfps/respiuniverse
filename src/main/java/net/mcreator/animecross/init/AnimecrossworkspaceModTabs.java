
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AnimecrossworkspaceModTabs {
	public static CreativeModeTab TAB_AOT;
	public static CreativeModeTab TAB_DRAGON_BALL;
	public static CreativeModeTab TAB_ONE_PIECE;
	public static CreativeModeTab TAB_NARUTO;
	public static CreativeModeTab TAB_MOB_PSYCHO;
	public static CreativeModeTab TAB_BLACK_CLOVER;
	public static CreativeModeTab TAB_DEMON_SLAYER;
	public static CreativeModeTab TAB_ONE_PUNCH_MAN;
	public static CreativeModeTab TAB_JOJO_BIZZARE_ADVENTURE;
	public static CreativeModeTab TAB_FIRE_FORCE;
	public static CreativeModeTab TAB_SPYX_FAMILY;
	public static CreativeModeTab TAB_JUJUTSU_KAISEN;
	public static CreativeModeTab TAB_GOBLIN_SLAYER;
	public static CreativeModeTab TAB_SWORD_ART_ONLING;
	public static CreativeModeTab TAB_SEVEN_DEADLY_SINS;
	public static CreativeModeTab TAB_BLEACH;

	public static void load() {
		TAB_AOT = new CreativeModeTab("tabaot") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.ODM_EQUIP.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DRAGON_BALL = new CreativeModeTab("tabdragon_ball") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.ONE_STAR_DRAGON_BALL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ONE_PIECE = new CreativeModeTab("tabone_piece") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.GUM_GUM_FRUIT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_NARUTO = new CreativeModeTab("tabnaruto") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.UCHIHA_CLAN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MOB_PSYCHO = new CreativeModeTab("tabmob_psycho") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.SOUL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_BLACK_CLOVER = new CreativeModeTab("tabblack_clover") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.ANTI_MAGIC_GRIMOIRE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_DEMON_SLAYER = new CreativeModeTab("tabdemon_slayer") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.WATER_NICHIRIN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ONE_PUNCH_MAN = new CreativeModeTab("tabone_punch_man") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.TORNADO_AREA.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_JOJO_BIZZARE_ADVENTURE = new CreativeModeTab("tabjojo_bizzare_adventure") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.THE_WORLD_STAN_CHESTPLATE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_FIRE_FORCE = new CreativeModeTab("tabfire_force") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.ARTHUR_SABER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SPYX_FAMILY = new CreativeModeTab("tabspyx_family") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.YORS_STILLETO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_JUJUTSU_KAISEN = new CreativeModeTab("tabjujutsu_kaisen") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.CURSEDENERGYPARTICLE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_GOBLIN_SLAYER = new CreativeModeTab("tabgoblin_slayer") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.GOBLIN_SLAYER_ARMOR_HELMET.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SWORD_ART_ONLING = new CreativeModeTab("tabsword_art_onling") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.ELUCIDATOR.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SEVEN_DEADLY_SINS = new CreativeModeTab("tabseven_deadly_sins") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.DRAGON_HANDLE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_BLEACH = new CreativeModeTab("tabbleach") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AnimecrossworkspaceModItems.ICHIGO_ZANPAKUTO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
