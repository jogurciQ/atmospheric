package com.teamabnormals.atmospheric.integration.boatload;

import com.teamabnormals.atmospheric.core.Atmospheric;
import com.teamabnormals.atmospheric.core.registry.AtmosphericBlocks;
import com.teamabnormals.atmospheric.core.registry.AtmosphericItems;
import com.teamabnormals.boatload.common.item.ChestBoatItem;
import com.teamabnormals.boatload.common.item.FurnaceBoatItem;
import com.teamabnormals.boatload.common.item.LargeBoatItem;
import com.teamabnormals.boatload.core.api.BoatloadBoatType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class AtmosphericBoatTypes {
	public static final BoatloadBoatType ROSEWOOD = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(Atmospheric.MOD_ID, "rosewood"), () -> AtmosphericBlocks.ROSEWOOD_PLANKS.get().asItem(), () -> AtmosphericItems.ROSEWOOD_BOAT.get(), () -> AtmosphericItems.ROSEWOOD_CHEST_BOAT.get(), () -> AtmosphericItems.ROSEWOOD_FURNACE_BOAT.get(), () -> AtmosphericItems.LARGE_ROSEWOOD_BOAT.get()));
	public static final BoatloadBoatType MORADO = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(Atmospheric.MOD_ID, "morado"), () -> AtmosphericBlocks.MORADO_PLANKS.get().asItem(), () -> AtmosphericItems.MORADO_BOAT.get(), () -> AtmosphericItems.MORADO_CHEST_BOAT.get(), () -> AtmosphericItems.MORADO_FURNACE_BOAT.get(), () -> AtmosphericItems.LARGE_MORADO_BOAT.get()));
	public static final BoatloadBoatType YUCCA = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(Atmospheric.MOD_ID, "yucca"), () -> AtmosphericBlocks.YUCCA_PLANKS.get().asItem(), () -> AtmosphericItems.YUCCA_BOAT.get(), () -> AtmosphericItems.YUCCA_CHEST_BOAT.get(), () -> AtmosphericItems.YUCCA_FURNACE_BOAT.get(), () -> AtmosphericItems.LARGE_YUCCA_BOAT.get()));
	public static final BoatloadBoatType KOUSA = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(Atmospheric.MOD_ID, "kousa"), () -> AtmosphericBlocks.KOUSA_PLANKS.get().asItem(), () -> AtmosphericItems.KOUSA_BOAT.get(), () -> AtmosphericItems.KOUSA_CHEST_BOAT.get(), () -> AtmosphericItems.KOUSA_FURNACE_BOAT.get(), () -> AtmosphericItems.LARGE_KOUSA_BOAT.get()));
	public static final BoatloadBoatType ASPEN = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(Atmospheric.MOD_ID, "aspen"), () -> AtmosphericBlocks.ASPEN_PLANKS.get().asItem(), () -> AtmosphericItems.ASPEN_BOAT.get(), () -> AtmosphericItems.ASPEN_CHEST_BOAT.get(), () -> AtmosphericItems.ASPEN_FURNACE_BOAT.get(), () -> AtmosphericItems.LARGE_ASPEN_BOAT.get()));
	public static final BoatloadBoatType GRIMWOOD = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(Atmospheric.MOD_ID, "grimwood"), () -> AtmosphericBlocks.GRIMWOOD_PLANKS.get().asItem(), () -> AtmosphericItems.GRIMWOOD_BOAT.get(), () -> AtmosphericItems.GRIMWOOD_CHEST_BOAT.get(), () -> AtmosphericItems.GRIMWOOD_FURNACE_BOAT.get(), () -> AtmosphericItems.LARGE_GRIMWOOD_BOAT.get()));

	public static final Supplier<Item> ROSEWOOD_CHEST_BOAT = () -> new ChestBoatItem(ROSEWOOD);
	public static final Supplier<Item> ROSEWOOD_FURNACE_BOAT = () -> new FurnaceBoatItem(ROSEWOOD);
	public static final Supplier<Item> LARGE_ROSEWOOD_BOAT = () -> new LargeBoatItem(ROSEWOOD);

	public static final Supplier<Item> MORADO_CHEST_BOAT = () -> new ChestBoatItem(MORADO);
	public static final Supplier<Item> MORADO_FURNACE_BOAT = () -> new FurnaceBoatItem(MORADO);
	public static final Supplier<Item> LARGE_MORADO_BOAT = () -> new LargeBoatItem(MORADO);

	public static final Supplier<Item> YUCCA_CHEST_BOAT = () -> new ChestBoatItem(YUCCA);
	public static final Supplier<Item> YUCCA_FURNACE_BOAT = () -> new FurnaceBoatItem(YUCCA);
	public static final Supplier<Item> LARGE_YUCCA_BOAT = () -> new LargeBoatItem(YUCCA);

	public static final Supplier<Item> KOUSA_CHEST_BOAT = () -> new ChestBoatItem(KOUSA);
	public static final Supplier<Item> KOUSA_FURNACE_BOAT = () -> new FurnaceBoatItem(KOUSA);
	public static final Supplier<Item> LARGE_KOUSA_BOAT = () -> new LargeBoatItem(KOUSA);

	public static final Supplier<Item> ASPEN_CHEST_BOAT = () -> new ChestBoatItem(ASPEN);
	public static final Supplier<Item> ASPEN_FURNACE_BOAT = () -> new FurnaceBoatItem(ASPEN);
	public static final Supplier<Item> LARGE_ASPEN_BOAT = () -> new LargeBoatItem(ASPEN);

	public static final Supplier<Item> GRIMWOOD_CHEST_BOAT = () -> new ChestBoatItem(GRIMWOOD);
	public static final Supplier<Item> GRIMWOOD_FURNACE_BOAT = () -> new FurnaceBoatItem(GRIMWOOD);
	public static final Supplier<Item> LARGE_GRIMWOOD_BOAT = () -> new LargeBoatItem(GRIMWOOD);
}