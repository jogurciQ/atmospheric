package com.teamabnormals.atmospheric.core.data.server.tags;

import com.teamabnormals.atmospheric.core.Atmospheric;
import com.teamabnormals.atmospheric.core.other.tags.AtmosphericBlockTags;
import com.teamabnormals.atmospheric.core.registry.AtmosphericBlocks;
import com.teamabnormals.atmospheric.core.registry.AtmosphericItems;
import com.teamabnormals.blueprint.core.other.tags.BlueprintBlockTags;
import com.teamabnormals.blueprint.core.other.tags.BlueprintItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.Tags.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.teamabnormals.atmospheric.core.other.tags.AtmosphericItemTags.*;
import static com.teamabnormals.atmospheric.core.registry.AtmosphericBlocks.*;

public class AtmosphericItemTagsProvider extends ItemTagsProvider {

	public AtmosphericItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
		super(generator, blockTags, Atmospheric.MOD_ID, existingFileHelper);
	}

	@Override
	public void addTags() {
		this.copy(AtmosphericBlockTags.ROSEWOOD_LOGS, ROSEWOOD_LOGS);
		this.copy(AtmosphericBlockTags.MORADO_LOGS, MORADO_LOGS);
		this.copy(AtmosphericBlockTags.YUCCA_LOGS, YUCCA_LOGS);
		this.copy(AtmosphericBlockTags.ASPEN_LOGS, ASPEN_LOGS);
		this.copy(AtmosphericBlockTags.KOUSA_LOGS, KOUSA_LOGS);
		this.copy(AtmosphericBlockTags.GRIMWOOD_LOGS, GRIMWOOD_LOGS);

		this.copy(BlockTags.PLANKS, ItemTags.PLANKS);
		this.copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);
		this.copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
		this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
		this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
		this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
		this.copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
		this.copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
		this.copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);
		this.copy(BlockTags.SAND, ItemTags.SAND);
		this.copy(BlockTags.SLABS, ItemTags.SLABS);
		this.copy(BlockTags.WALLS, ItemTags.WALLS);
		this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
		this.copy(BlockTags.LEAVES, ItemTags.LEAVES);
		this.copy(BlockTags.WOODEN_TRAPDOORS, ItemTags.WOODEN_TRAPDOORS);
		this.copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
		this.copy(BlockTags.TALL_FLOWERS, ItemTags.TALL_FLOWERS);
		this.copy(BlockTags.FLOWERS, ItemTags.FLOWERS);
		this.copy(BlockTags.STANDING_SIGNS, ItemTags.SIGNS);
		this.tag(ItemTags.FLOWERS).add(AtmosphericItems.YELLOW_BLOSSOMS.get());
		this.tag(ItemTags.BOATS).add(AtmosphericItems.ROSEWOOD_BOAT.get(), AtmosphericItems.MORADO_BOAT.get(), AtmosphericItems.YUCCA_BOAT.get(), AtmosphericItems.KOUSA_BOAT.get(), AtmosphericItems.ASPEN_BOAT.get(), AtmosphericItems.GRIMWOOD_BOAT.get());
		this.tag(ItemTags.PIGLIN_LOVED).add(AtmosphericItems.SHIMMERING_PASSIONFRUIT.get(), AtmosphericBlocks.SHIMMERING_PASSIONFRUIT_CRATE.get().asItem());

		this.copy(Tags.Blocks.CHESTS_WOODEN, Tags.Items.CHESTS_WOODEN);
		this.copy(Tags.Blocks.CHESTS_TRAPPED, Tags.Items.CHESTS_TRAPPED);
		this.copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);
		this.copy(Tags.Blocks.FENCES_WOODEN, Tags.Items.FENCES_WOODEN);
		this.copy(Tags.Blocks.SAND_COLORLESS, Tags.Items.SAND_COLORLESS);
		this.copy(Tags.Blocks.SAND_RED, Tags.Items.SAND_RED);
		this.copy(Tags.Blocks.SANDSTONE, Tags.Items.SANDSTONE);
		this.tag(Tags.Items.BOOKSHELVES).add(ROSEWOOD_BOOKSHELF.get().asItem(), MORADO_BOOKSHELF.get().asItem(), YUCCA_BOOKSHELF.get().asItem(), KOUSA_BOOKSHELF.get().asItem(), ASPEN_BOOKSHELF.get().asItem(), GRIMWOOD_BOOKSHELF.get().asItem());
		this.tag(FRUITS).addTag(FRUITS_PASSIONFRUIT);
		this.tag(FRUITS_PASSIONFRUIT).add(AtmosphericItems.PASSIONFRUIT.get());

		this.copy(BlueprintBlockTags.LADDERS, BlueprintItemTags.LADDERS);
		this.copy(BlueprintBlockTags.HEDGES, BlueprintItemTags.HEDGES);
		this.copy(BlueprintBlockTags.VERTICAL_SLABS, BlueprintItemTags.VERTICAL_SLABS);
		this.copy(BlueprintBlockTags.WOODEN_VERTICAL_SLABS, BlueprintItemTags.WOODEN_VERTICAL_SLABS);
		this.tag(BlueprintItemTags.BOATABLE_CHESTS).add(ROSEWOOD_CHESTS.getFirst().get().asItem(), MORADO_CHESTS.getFirst().get().asItem(), YUCCA_CHESTS.getFirst().get().asItem(), KOUSA_CHESTS.getFirst().get().asItem(), ASPEN_CHESTS.getFirst().get().asItem(), GRIMWOOD_CHESTS.getFirst().get().asItem());
		this.tag(BlueprintItemTags.REVERTABLE_CHESTS).add(ROSEWOOD_CHESTS.getFirst().get().asItem(), MORADO_CHESTS.getFirst().get().asItem(), YUCCA_CHESTS.getFirst().get().asItem(), KOUSA_CHESTS.getFirst().get().asItem(), ASPEN_CHESTS.getFirst().get().asItem(), GRIMWOOD_CHESTS.getFirst().get().asItem());
	}
}