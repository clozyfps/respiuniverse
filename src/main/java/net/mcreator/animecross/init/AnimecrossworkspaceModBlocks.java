
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animecross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.animecross.block.TvrightBlock;
import net.mcreator.animecross.block.TvleftBlock;
import net.mcreator.animecross.block.TvTopBlock;
import net.mcreator.animecross.block.TvSingleBlock;
import net.mcreator.animecross.block.TvBottomRightBlock;
import net.mcreator.animecross.block.TvBottomLeftBlock;
import net.mcreator.animecross.block.TvBottomBlock;
import net.mcreator.animecross.block.TVToprightBlock;
import net.mcreator.animecross.block.TVTopLeftBlock;
import net.mcreator.animecross.block.PurgatoryMediumSpikeBlock;
import net.mcreator.animecross.block.PurgatoryLargeSpikeBlock;
import net.mcreator.animecross.block.PurgatoryFlameBlock;
import net.mcreator.animecross.block.PurgatoryBlockBlock;
import net.mcreator.animecross.block.PinPlateBlock;
import net.mcreator.animecross.block.LightedPlateBlock;
import net.mcreator.animecross.block.FloorPlateBlock;
import net.mcreator.animecross.block.FireNezukoblockBlock;
import net.mcreator.animecross.block.BlackSteelOreBlock;
import net.mcreator.animecross.AnimecrossworkspaceMod;

public class AnimecrossworkspaceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AnimecrossworkspaceMod.MODID);
	public static final RegistryObject<Block> LIGHTED_PLATE = REGISTRY.register("lighted_plate", () -> new LightedPlateBlock());
	public static final RegistryObject<Block> PIN_PLATE = REGISTRY.register("pin_plate", () -> new PinPlateBlock());
	public static final RegistryObject<Block> FLOOR_PLATE = REGISTRY.register("floor_plate", () -> new FloorPlateBlock());
	public static final RegistryObject<Block> TV_BOTTOM = REGISTRY.register("tv_bottom", () -> new TvBottomBlock());
	public static final RegistryObject<Block> TV_BOTTOM_LEFT = REGISTRY.register("tv_bottom_left", () -> new TvBottomLeftBlock());
	public static final RegistryObject<Block> TV_BOTTOM_RIGHT = REGISTRY.register("tv_bottom_right", () -> new TvBottomRightBlock());
	public static final RegistryObject<Block> TV_TOP = REGISTRY.register("tv_top", () -> new TvTopBlock());
	public static final RegistryObject<Block> TV_TOP_LEFT = REGISTRY.register("tv_top_left", () -> new TVTopLeftBlock());
	public static final RegistryObject<Block> TV_TOPRIGHT = REGISTRY.register("tv_topright", () -> new TVToprightBlock());
	public static final RegistryObject<Block> TV_SINGLE = REGISTRY.register("tv_single", () -> new TvSingleBlock());
	public static final RegistryObject<Block> TVRIGHT = REGISTRY.register("tvright", () -> new TvrightBlock());
	public static final RegistryObject<Block> TVLEFT = REGISTRY.register("tvleft", () -> new TvleftBlock());
	public static final RegistryObject<Block> FIRE_NEZUKOBLOCK = REGISTRY.register("fire_nezukoblock", () -> new FireNezukoblockBlock());
	public static final RegistryObject<Block> BLACK_STEEL_ORE = REGISTRY.register("black_steel_ore", () -> new BlackSteelOreBlock());
	public static final RegistryObject<Block> PURGATORY_FLAME = REGISTRY.register("purgatory_flame", () -> new PurgatoryFlameBlock());
	public static final RegistryObject<Block> PURGATORY_LARGE_SPIKE = REGISTRY.register("purgatory_large_spike",
			() -> new PurgatoryLargeSpikeBlock());
	public static final RegistryObject<Block> PURGATORY_BLOCK = REGISTRY.register("purgatory_block", () -> new PurgatoryBlockBlock());
	public static final RegistryObject<Block> PURGATORY_MEDIUM_SPIKE = REGISTRY.register("purgatory_medium_spike",
			() -> new PurgatoryMediumSpikeBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			FireNezukoblockBlock.registerRenderLayer();
			PurgatoryFlameBlock.registerRenderLayer();
			PurgatoryLargeSpikeBlock.registerRenderLayer();
			PurgatoryMediumSpikeBlock.registerRenderLayer();
		}
	}
}
