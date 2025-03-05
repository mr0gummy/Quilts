package dev.mr0gummy.quilts;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class ModBlocks {



	public static final Block QUILT = registerBlockWithItem("quilt", Quiltblock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();

	public static final Block WHITE_AND_ORANGE_QUILT = registerBlockWithItem("white_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_MAGENTA_QUILT = registerBlockWithItem("white_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("white_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_YELLOW_QUILT = registerBlockWithItem("white_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_LIME_QUILT = registerBlockWithItem("white_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_PINK_QUILT = registerBlockWithItem("white_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_GRAY_QUILT = registerBlockWithItem("white_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("white_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_CYAN_QUILT = registerBlockWithItem("white_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_PURPLE_QUILT = registerBlockWithItem("white_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_BLUE_QUILT = registerBlockWithItem("white_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_BROWN_QUILT = registerBlockWithItem("white_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_GREEN_QUILT = registerBlockWithItem("white_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_RED_QUILT = registerBlockWithItem("white_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();
	public static final Block WHITE_AND_BLACK_QUILT = registerBlockWithItem("white_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.WHITE_CARPET)).getLeft();

	public static final Block ORANGE_AND_WHITE_QUILT = registerBlockWithItem("orange_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_MAGENTA_QUILT = registerBlockWithItem("orange_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("orange_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_YELLOW_QUILT = registerBlockWithItem("orange_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_LIME_QUILT = registerBlockWithItem("orange_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_PINK_QUILT = registerBlockWithItem("orange_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_GRAY_QUILT = registerBlockWithItem("orange_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("orange_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_CYAN_QUILT = registerBlockWithItem("orange_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_PURPLE_QUILT = registerBlockWithItem("orange_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_BLUE_QUILT = registerBlockWithItem("orange_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_BROWN_QUILT = registerBlockWithItem("orange_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_GREEN_QUILT = registerBlockWithItem("orange_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_RED_QUILT = registerBlockWithItem("orange_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();
	public static final Block ORANGE_AND_BLACK_QUILT = registerBlockWithItem("orange_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET)).getLeft();

	public static final Block MAGENTA_AND_WHITE_QUILT = registerBlockWithItem("magenta_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_ORANGE_QUILT = registerBlockWithItem("magenta_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("magenta_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_YELLOW_QUILT = registerBlockWithItem("magenta_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_LIME_QUILT = registerBlockWithItem("magenta_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_PINK_QUILT = registerBlockWithItem("magenta_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_GRAY_QUILT = registerBlockWithItem("magenta_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("magenta_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_CYAN_QUILT = registerBlockWithItem("magenta_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_PURPLE_QUILT = registerBlockWithItem("magenta_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_BLUE_QUILT = registerBlockWithItem("magenta_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_BROWN_QUILT = registerBlockWithItem("magenta_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_GREEN_QUILT = registerBlockWithItem("magenta_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_RED_QUILT = registerBlockWithItem("magenta_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();
	public static final Block MAGENTA_AND_BLACK_QUILT = registerBlockWithItem("magenta_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET)).getLeft();

	public static final Block LIGHT_BLUE_AND_WHITE_QUILT = registerBlockWithItem("light_blue_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_ORANGE_QUILT = registerBlockWithItem("light_blue_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_MAGENTA_QUILT = registerBlockWithItem("light_blue_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_YELLOW_QUILT = registerBlockWithItem("light_blue_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_LIME_QUILT = registerBlockWithItem("light_blue_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_PINK_QUILT = registerBlockWithItem("light_blue_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_GRAY_QUILT = registerBlockWithItem("light_blue_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("light_blue_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_CYAN_QUILT = registerBlockWithItem("light_blue_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_PURPLE_QUILT = registerBlockWithItem("light_blue_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_BLUE_QUILT = registerBlockWithItem("light_blue_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_BROWN_QUILT = registerBlockWithItem("light_blue_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_GREEN_QUILT = registerBlockWithItem("light_blue_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_RED_QUILT = registerBlockWithItem("light_blue_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();
	public static final Block LIGHT_BLUE_AND_BLACK_QUILT = registerBlockWithItem("light_blue_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET)).getLeft();

	public static final Block YELLOW_AND_WHITE_QUILT = registerBlockWithItem("yellow_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_ORANGE_QUILT = registerBlockWithItem("yellow_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_MAGENTA_QUILT = registerBlockWithItem("yellow_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("yellow_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_LIME_QUILT = registerBlockWithItem("yellow_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_PINK_QUILT = registerBlockWithItem("yellow_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_GRAY_QUILT = registerBlockWithItem("yellow_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("yellow_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_CYAN_QUILT = registerBlockWithItem("yellow_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_PURPLE_QUILT = registerBlockWithItem("yellow_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_BLUE_QUILT = registerBlockWithItem("yellow_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_BROWN_QUILT = registerBlockWithItem("yellow_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_GREEN_QUILT = registerBlockWithItem("yellow_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_RED_QUILT = registerBlockWithItem("yellow_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();
	public static final Block YELLOW_AND_BLACK_QUILT = registerBlockWithItem("yellow_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET)).getLeft();

	public static final Block LIME_AND_WHITE_QUILT = registerBlockWithItem("lime_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_ORANGE_QUILT = registerBlockWithItem("lime_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_MAGENTA_QUILT = registerBlockWithItem("lime_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("lime_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_YELLOW_QUILT = registerBlockWithItem("lime_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_PINK_QUILT = registerBlockWithItem("lime_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_GRAY_QUILT = registerBlockWithItem("lime_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("lime_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_CYAN_QUILT = registerBlockWithItem("lime_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_PURPLE_QUILT = registerBlockWithItem("lime_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_BLUE_QUILT = registerBlockWithItem("lime_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_BROWN_QUILT = registerBlockWithItem("lime_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_GREEN_QUILT = registerBlockWithItem("lime_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_RED_QUILT = registerBlockWithItem("lime_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();
	public static final Block LIME_AND_BLACK_QUILT = registerBlockWithItem("lime_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIME_CARPET)).getLeft();


	public static final Block PINK_AND_WHITE_QUILT = registerBlockWithItem("pink_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_ORANGE_QUILT = registerBlockWithItem("pink_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_MAGENTA_QUILT = registerBlockWithItem("pink_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("pink_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_YELLOW_QUILT = registerBlockWithItem("pink_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_LIME_QUILT = registerBlockWithItem("pink_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_GRAY_QUILT = registerBlockWithItem("pink_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("pink_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_CYAN_QUILT = registerBlockWithItem("pink_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_PURPLE_QUILT = registerBlockWithItem("pink_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_BLUE_QUILT = registerBlockWithItem("pink_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_BROWN_QUILT = registerBlockWithItem("pink_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_GREEN_QUILT = registerBlockWithItem("pink_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_RED_QUILT = registerBlockWithItem("pink_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();
	public static final Block PINK_AND_BLACK_QUILT = registerBlockWithItem("pink_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PINK_CARPET)).getLeft();

	public static final Block GRAY_AND_WHITE_QUILT = registerBlockWithItem("gray_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_ORANGE_QUILT = registerBlockWithItem("gray_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_MAGENTA_QUILT = registerBlockWithItem("gray_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("gray_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_YELLOW_QUILT = registerBlockWithItem("gray_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_LIME_QUILT = registerBlockWithItem("gray_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_PINK_QUILT = registerBlockWithItem("gray_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("gray_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_CYAN_QUILT = registerBlockWithItem("gray_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_PURPLE_QUILT = registerBlockWithItem("gray_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_BLUE_QUILT = registerBlockWithItem("gray_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_BROWN_QUILT = registerBlockWithItem("gray_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_GREEN_QUILT = registerBlockWithItem("gray_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_RED_QUILT = registerBlockWithItem("gray_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();
	public static final Block GRAY_AND_BLACK_QUILT = registerBlockWithItem("gray_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GRAY_CARPET)).getLeft();

	public static final Block LIGHT_GRAY_AND_WHITE_QUILT = registerBlockWithItem("light_gray_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_ORANGE_QUILT = registerBlockWithItem("light_gray_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_MAGENTA_QUILT = registerBlockWithItem("light_gray_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("light_gray_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_YELLOW_QUILT = registerBlockWithItem("light_gray_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_LIME_QUILT = registerBlockWithItem("light_gray_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_PINK_QUILT = registerBlockWithItem("light_gray_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_GRAY_QUILT = registerBlockWithItem("light_gray_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_CYAN_QUILT = registerBlockWithItem("light_gray_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_PURPLE_QUILT = registerBlockWithItem("light_gray_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_BLUE_QUILT = registerBlockWithItem("light_gray_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_BROWN_QUILT = registerBlockWithItem("light_gray_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_GREEN_QUILT = registerBlockWithItem("light_gray_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_RED_QUILT = registerBlockWithItem("light_gray_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();
	public static final Block LIGHT_GRAY_AND_BLACK_QUILT = registerBlockWithItem("light_gray_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET)).getLeft();

	public static final Block CYAN_AND_WHITE_QUILT = registerBlockWithItem("cyan_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_ORANGE_QUILT = registerBlockWithItem("cyan_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_MAGENTA_QUILT = registerBlockWithItem("cyan_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("cyan_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_YELLOW_QUILT = registerBlockWithItem("cyan_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_LIME_QUILT = registerBlockWithItem("cyan_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_PINK_QUILT = registerBlockWithItem("cyan_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_GRAY_QUILT = registerBlockWithItem("cyan_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("cyan_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_PURPLE_QUILT = registerBlockWithItem("cyan_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_BLUE_QUILT = registerBlockWithItem("cyan_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_BROWN_QUILT = registerBlockWithItem("cyan_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_GREEN_QUILT = registerBlockWithItem("cyan_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_RED_QUILT = registerBlockWithItem("cyan_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();
	public static final Block CYAN_AND_BLACK_QUILT = registerBlockWithItem("cyan_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.CYAN_CARPET)).getLeft();

	public static final Block PURPLE_AND_WHITE_QUILT = registerBlockWithItem("purple_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_ORANGE_QUILT = registerBlockWithItem("purple_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_MAGENTA_QUILT = registerBlockWithItem("purple_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("purple_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_YELLOW_QUILT = registerBlockWithItem("purple_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_LIME_QUILT = registerBlockWithItem("purple_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_PINK_QUILT = registerBlockWithItem("purple_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_GRAY_QUILT = registerBlockWithItem("purple_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("purple_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_CYAN_QUILT = registerBlockWithItem("purple_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_BLUE_QUILT = registerBlockWithItem("purple_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_BROWN_QUILT = registerBlockWithItem("purple_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_GREEN_QUILT = registerBlockWithItem("purple_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_RED_QUILT = registerBlockWithItem("purple_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();
	public static final Block PURPLE_AND_BLACK_QUILT = registerBlockWithItem("purple_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET)).getLeft();

	public static final Block BLUE_AND_WHITE_QUILT = registerBlockWithItem("blue_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_ORANGE_QUILT = registerBlockWithItem("blue_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_MAGENTA_QUILT = registerBlockWithItem("blue_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("blue_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_YELLOW_QUILT = registerBlockWithItem("blue_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_LIME_QUILT = registerBlockWithItem("blue_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_PINK_QUILT = registerBlockWithItem("blue_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_GRAY_QUILT = registerBlockWithItem("blue_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("blue_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_CYAN_QUILT = registerBlockWithItem("blue_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_PURPLE_QUILT = registerBlockWithItem("blue_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_BROWN_QUILT = registerBlockWithItem("blue_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_GREEN_QUILT = registerBlockWithItem("blue_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_RED_QUILT = registerBlockWithItem("blue_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();
	public static final Block BLUE_AND_BLACK_QUILT = registerBlockWithItem("blue_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLUE_CARPET)).getLeft();

	public static final Block BROWN_AND_WHITE_QUILT = registerBlockWithItem("brown_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_ORANGE_QUILT = registerBlockWithItem("brown_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_MAGENTA_QUILT = registerBlockWithItem("brown_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("brown_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_YELLOW_QUILT = registerBlockWithItem("brown_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_LIME_QUILT = registerBlockWithItem("brown_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_PINK_QUILT = registerBlockWithItem("brown_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_GRAY_QUILT = registerBlockWithItem("brown_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("brown_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_CYAN_QUILT = registerBlockWithItem("brown_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_PURPLE_QUILT = registerBlockWithItem("brown_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_BLUE_QUILT = registerBlockWithItem("brown_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_GREEN_QUILT = registerBlockWithItem("brown_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_RED_QUILT = registerBlockWithItem("brown_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();
	public static final Block BROWN_AND_BLACK_QUILT = registerBlockWithItem("brown_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BROWN_CARPET)).getLeft();

	public static final Block GREEN_AND_WHITE_QUILT = registerBlockWithItem("green_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_ORANGE_QUILT = registerBlockWithItem("green_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_MAGENTA_QUILT = registerBlockWithItem("green_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("green_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_YELLOW_QUILT = registerBlockWithItem("green_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_LIME_QUILT = registerBlockWithItem("green_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_PINK_QUILT = registerBlockWithItem("green_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_GRAY_QUILT = registerBlockWithItem("green_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("green_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_CYAN_QUILT = registerBlockWithItem("green_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_PURPLE_QUILT = registerBlockWithItem("green_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_BLUE_QUILT = registerBlockWithItem("green_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_BROWN_QUILT = registerBlockWithItem("green_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_RED_QUILT = registerBlockWithItem("green_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();
	public static final Block GREEN_AND_BLACK_QUILT = registerBlockWithItem("green_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.GREEN_CARPET)).getLeft();

	public static final Block RED_AND_WHITE_QUILT = registerBlockWithItem("red_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_ORANGE_QUILT = registerBlockWithItem("red_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_MAGENTA_QUILT = registerBlockWithItem("red_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("red_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_YELLOW_QUILT = registerBlockWithItem("red_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_LIME_QUILT = registerBlockWithItem("red_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_PINK_QUILT = registerBlockWithItem("red_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_GRAY_QUILT = registerBlockWithItem("red_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("red_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_CYAN_QUILT = registerBlockWithItem("red_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_PURPLE_QUILT = registerBlockWithItem("red_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_BLUE_QUILT = registerBlockWithItem("red_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_BROWN_QUILT = registerBlockWithItem("red_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_GREEN_QUILT = registerBlockWithItem("red_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();
	public static final Block RED_AND_BLACK_QUILT = registerBlockWithItem("red_and_black_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.RED_CARPET)).getLeft();

	public static final Block BLACK_AND_WHITE_QUILT = registerBlockWithItem("black_and_white_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_ORANGE_QUILT = registerBlockWithItem("black_and_orange_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_MAGENTA_QUILT = registerBlockWithItem("black_and_magenta_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_LIGHT_BLUE_QUILT = registerBlockWithItem("black_and_light_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_YELLOW_QUILT = registerBlockWithItem("black_and_yellow_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_LIME_QUILT = registerBlockWithItem("black_and_lime_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_PINK_QUILT = registerBlockWithItem("black_and_pink_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_GRAY_QUILT = registerBlockWithItem("black_and_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_LIGHT_GRAY_QUILT = registerBlockWithItem("black_and_light_gray_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_CYAN_QUILT = registerBlockWithItem("black_and_cyan_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_PURPLE_QUILT = registerBlockWithItem("black_and_purple_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_BLUE_QUILT = registerBlockWithItem("black_and_blue_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_BROWN_QUILT = registerBlockWithItem("black_and_brown_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_GREEN_QUILT = registerBlockWithItem("black_and_green_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();
	public static final Block BLACK_AND_RED_QUILT = registerBlockWithItem("black_and_red_quilt", CarpetBlock::new, AbstractBlock.Settings.copy(Blocks.BLACK_CARPET)).getLeft();


	public static <T extends Item> T registerItem(String name, Function<Item.Settings, T> factory) {
		RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Quilts.MOD_ID, name));
		return Registry.register(
				Registries.ITEM,
				key,
				factory.apply(new Item.Settings().registryKey(key))
		);
	}

	public static <T extends Block> T registerBlock(String name, Function<AbstractBlock.Settings, T> factory, AbstractBlock.Settings base) {
		RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Quilts.MOD_ID, name));
		return Registry.register(
				Registries.BLOCK,
				key,
				factory.apply(base.registryKey(key))
		);
	}

	public static <T extends Block> Pair<T, BlockItem> registerBlockWithItem(String name, Function<AbstractBlock.Settings, T> factory, AbstractBlock.Settings base) {
		T block = registerBlock(name, factory, base);
		return new Pair<>(
				block,
				registerItem(name, settings -> new BlockItem(block, settings))
		);
	}

	public static void init() {
	}
}
