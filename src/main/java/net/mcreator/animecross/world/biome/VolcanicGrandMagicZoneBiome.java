
package net.mcreator.animecross.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.animecross.init.AnimecrossworkspaceModEntities;
import net.mcreator.animecross.init.AnimecrossworkspaceModBiomes;

public class VolcanicGrandMagicZoneBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(0f, 2f),
			Climate.Parameter.span(-2f, 0f), Climate.Parameter.span(-0.49f, 1.51f), Climate.Parameter.span(-0.3f, 1.7f), Climate.Parameter.point(0),
			Climate.Parameter.span(-1.91645752276f, 0.08354247724f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16711423).waterColor(-40440).waterFogColor(329011)
				.skyColor(-16711423).foliageColorOverride(10387789).grassColorOverride(9470285).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(AnimecrossworkspaceModEntities.INFERNO.get(), 12, 1, 5));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.MOUNTAIN).temperature(2f)
				.downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(
				ResourceKey.create(Registry.BIOME_REGISTRY,
						BuiltinRegistries.BIOME.getKey(AnimecrossworkspaceModBiomes.VOLCANIC_GRAND_MAGIC_ZONE.get())),
				BiomeDictionary.Type.WASTELAND, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SPOOKY, BiomeDictionary.Type.MAGICAL,
				BiomeDictionary.Type.MODIFIED);
	}
}
