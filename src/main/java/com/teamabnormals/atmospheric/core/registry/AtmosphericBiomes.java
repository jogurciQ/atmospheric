package com.teamabnormals.atmospheric.core.registry;

import com.teamabnormals.atmospheric.core.Atmospheric;
import com.teamabnormals.blueprint.core.util.registry.BiomeSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.BiomeSubRegistryHelper.KeyedBiome;
import net.minecraft.util.Mth;
import net.minecraft.world.level.biome.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Atmospheric.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class AtmosphericBiomes {
	public static final BiomeSubRegistryHelper HELPER = Atmospheric.REGISTRY_HELPER.getBiomeSubHelper();

	public static final KeyedBiome RAINFOREST = HELPER.createBiome("rainforest", () -> createRainforestBiome());
	public static final KeyedBiome SPARSE_RAINFOREST = HELPER.createBiome("sparse_rainforest", () -> createRainforestBiome());
	public static final KeyedBiome RAINFOREST_BASIN = HELPER.createBiome("rainforest_basin", () -> createRainforestBiome());
	public static final KeyedBiome SPARSE_RAINFOREST_BASIN = HELPER.createBiome("sparse_rainforest_basin", () -> createRainforestBiome());

	public static final KeyedBiome DUNES = HELPER.createBiome("dunes", () -> createDunesBiome());
	public static final KeyedBiome FLOURISHING_DUNES = HELPER.createBiome("flourishing_dunes", () -> createDunesBiome());
	public static final KeyedBiome ROCKY_DUNES = HELPER.createBiome("rocky_dunes", () -> createDunesBiome());
	public static final KeyedBiome PETRIFIED_DUNES = HELPER.createBiome("petrified_dunes", () -> createDunesBiome());

	public static final KeyedBiome HOT_SPRINGS = HELPER.createBiome("hot_springs", AtmosphericBiomes::createHotSpringsBiome);

	public static void addBiomeTypes() {
		BiomeDictionary.addTypes(RAINFOREST.getKey(), Type.JUNGLE, Type.FOREST, Type.OVERWORLD);
		BiomeDictionary.addTypes(SPARSE_RAINFOREST.getKey(), Type.JUNGLE, Type.FOREST, Type.OVERWORLD);
		BiomeDictionary.addTypes(RAINFOREST_BASIN.getKey(), Type.JUNGLE, Type.FOREST, Type.WET, Type.OVERWORLD);
		BiomeDictionary.addTypes(SPARSE_RAINFOREST_BASIN.getKey(), Type.JUNGLE, Type.FOREST, Type.WET, Type.OVERWORLD);

		BiomeDictionary.addTypes(DUNES.getKey(), Type.DRY, Type.HOT, Type.SANDY, Type.OVERWORLD);
		BiomeDictionary.addTypes(FLOURISHING_DUNES.getKey(), Type.RARE, Type.DRY, Type.HOT, Type.SANDY, Type.LUSH, Type.OVERWORLD);
		BiomeDictionary.addTypes(ROCKY_DUNES.getKey(), Type.DRY, Type.HOT, Type.SANDY, Type.WASTELAND, Type.OVERWORLD);
		BiomeDictionary.addTypes(PETRIFIED_DUNES.getKey(), Type.RARE, Type.DRY, Type.HOT, Type.SANDY, Type.WASTELAND, Type.OVERWORLD);

		BiomeDictionary.addTypes(HOT_SPRINGS.getKey(), Type.RARE, Type.WET, Type.CONIFEROUS, Type.OVERWORLD);
	}

	private static Biome createRainforestBiome() {
		return (new Biome.BiomeBuilder()).precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.JUNGLE).temperature(0.9F).downfall(0.95F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(6675400).waterFogColor(408635).fogColor(12638463).skyColor(getSkyColorWithTemperatureModifier(0.9F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(new MobSpawnSettings.Builder().build()).generationSettings((new BiomeGenerationSettings.Builder()).build()).build();
	}

	private static Biome createDunesBiome() {
		return (new Biome.BiomeBuilder()).precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.DESERT).temperature(2.0F).downfall(0.0F).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(14988944).skyColor(getSkyColorWithTemperatureModifier(2.0F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings(new MobSpawnSettings.Builder().build()).generationSettings((new BiomeGenerationSettings.Builder()).build()).build();
	}

	private static Biome createHotSpringsBiome() {
		return (new Biome.BiomeBuilder()).precipitation(Biome.Precipitation.NONE)
				.biomeCategory(Biome.BiomeCategory.TAIGA)
				.temperature(0.25F)
				.downfall(0.4F)
				.specialEffects((new BiomeSpecialEffects.Builder())
						.waterColor(4445678)
						.waterFogColor(270131)
						.fogColor(12638463)
						.skyColor(getSkyColorWithTemperatureModifier(0.25F))
						.ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
						.build())
				.mobSpawnSettings(new MobSpawnSettings.Builder().build())
				.generationSettings((new BiomeGenerationSettings.Builder())
						.build())
				.build();
	}

	private static int getSkyColorWithTemperatureModifier(float temperature) {
		float lvt_1_1_ = temperature / 3.0F;
		lvt_1_1_ = Mth.clamp(lvt_1_1_, -1.0F, 1.0F);
		return Mth.hsvToRgb(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
	}
}
