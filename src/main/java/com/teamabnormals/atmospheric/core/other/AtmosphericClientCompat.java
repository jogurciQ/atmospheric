package com.teamabnormals.atmospheric.core.other;

import com.teamabnormals.atmospheric.core.registry.AtmosphericBlocks;
import com.teamabnormals.blueprint.core.util.DataUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.List;

public class AtmosphericClientCompat {
	public static void registerBlockColors() {
		BlockColors blockColors = Minecraft.getInstance().getBlockColors();
		ItemColors itemColors = Minecraft.getInstance().getItemColors();

		List<RegistryObject<Block>> foliageColors = Arrays.asList(
				AtmosphericBlocks.ROSEWOOD_LEAVES,
				AtmosphericBlocks.ROSEWOOD_LEAF_PILE,
				AtmosphericBlocks.ROSEWOOD_LEAF_CARPET,
				AtmosphericBlocks.ROSEWOOD_HEDGE,
				AtmosphericBlocks.MORADO_LEAVES,
				AtmosphericBlocks.MORADO_LEAF_PILE,
				AtmosphericBlocks.MORADO_LEAF_CARPET,
				AtmosphericBlocks.MORADO_HEDGE,
				AtmosphericBlocks.FLOWERING_MORADO_LEAVES,
				AtmosphericBlocks.FLOWERING_MORADO_LEAF_PILE,
				AtmosphericBlocks.FLOWERING_MORADO_LEAF_CARPET,
				AtmosphericBlocks.FLOWERING_MORADO_HEDGE,
				AtmosphericBlocks.YUCCA_LEAVES,
				AtmosphericBlocks.YUCCA_LEAF_PILE,
				AtmosphericBlocks.YUCCA_LEAF_CARPET,
				AtmosphericBlocks.YUCCA_HEDGE
		);

		DataUtil.registerBlockColor(blockColors, (x, world, pos, u) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.get(0.5D, 1.0D), foliageColors);
		DataUtil.registerBlockItemColor(itemColors, (color, items) -> FoliageColor.get(0.5D, 1.0D), foliageColors);
	}

	public static void registerRenderLayers() {
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ROSEWOOD_LADDER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ROSEWOOD_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.STRIPPED_ROSEWOOD_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ROSEWOOD_LEAVES.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ROSEWOOD_LEAF_PILE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ROSEWOOD_LEAF_CARPET.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ROSEWOOD_HEDGE.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ROSEWOOD_SAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_ROSEWOOD_SAPLING.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.MORADO_LADDER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.MORADO_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.STRIPPED_MORADO_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.MORADO_LEAVES.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.MORADO_LEAF_PILE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.MORADO_LEAF_CARPET.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.MORADO_HEDGE.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.FLOWERING_MORADO_LEAVES.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.FLOWERING_MORADO_LEAF_PILE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.FLOWERING_MORADO_LEAF_CARPET.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.FLOWERING_MORADO_HEDGE.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.MORADO_SAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_MORADO_SAPLING.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.YUCCA_LADDER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.YUCCA_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.STRIPPED_YUCCA_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.YUCCA_LEAVES.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.YUCCA_LEAF_CARPET.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.YUCCA_LEAF_PILE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.YUCCA_HEDGE.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.YUCCA_SAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_YUCCA_SAPLING.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.KOUSA_LADDER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.KOUSA_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.KOUSA_LEAF_PILE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.KOUSA_LEAVES.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.KOUSA_SAPLING.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.KOUSA_LEAF_CARPET.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.KOUSA_HEDGE.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_KOUSA_SAPLING.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ASPEN_LADDER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ASPEN_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.STRIPPED_ASPEN_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ASPEN_LEAVES.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ASPEN_LEAF_PILE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ASPEN_LEAF_CARPET.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ASPEN_HEDGE.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ASPEN_SAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_ASPEN_SAPLING.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.GRIMWOOD_LADDER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.GRIMWOOD_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.STRIPPED_GRIMWOOD_POST.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.GRIMWOOD_LEAVES.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.GRIMWOOD_LEAF_PILE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.GRIMWOOD_LEAF_CARPET.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.GRIMWOOD_HEDGE.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.GRIMWOOD_SAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_GRIMWOOD_SAPLING.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.WARM_MONKEY_BRUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.HOT_MONKEY_BRUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.SCALDING_MONKEY_BRUSH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.WARM_WALL_MONKEY_BRUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.HOT_WALL_MONKEY_BRUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.SCALDING_WALL_MONKEY_BRUSH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ARID_SPROUTS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.GILIA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.PASSION_VINE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.WATER_HYACINTH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.YUCCA_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.TALL_YUCCA_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.YUCCA_BRANCH.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ALOE_VERA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.TALL_ALOE_VERA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.ALOE_GEL_BLOCK.get(), RenderType.translucent());

		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_WARM_MONKEY_BRUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_HOT_MONKEY_BRUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_SCALDING_MONKEY_BRUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_YUCCA_FLOWER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_GILIA.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(AtmosphericBlocks.POTTED_WATER_HYACINTH.get(), RenderType.cutout());
	}
}
