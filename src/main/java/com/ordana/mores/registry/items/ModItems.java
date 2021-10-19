package com.ordana.mores.registry.items;

import com.ordana.mores.Mores;
import com.ordana.mores.registry.blocks.ModBlocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final BlockItem GRANITE_COAL_ORE = new BlockItem(ModBlocks.GRANITE_COAL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ANDESITE_COAL_ORE = new BlockItem(ModBlocks.ANDESITE_COAL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DIORITE_COAL_ORE = new BlockItem(ModBlocks.DIORITE_COAL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TUFF_COAL_ORE = new BlockItem(ModBlocks.TUFF_COAL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem GRANITE_IRON_ORE = new BlockItem(ModBlocks.GRANITE_IRON_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ANDESITE_IRON_ORE = new BlockItem(ModBlocks.ANDESITE_IRON_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DIORITE_IRON_ORE = new BlockItem(ModBlocks.DIORITE_IRON_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TUFF_IRON_ORE = new BlockItem(ModBlocks.TUFF_IRON_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem GRANITE_GOLD_ORE = new BlockItem(ModBlocks.GRANITE_GOLD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ANDESITE_GOLD_ORE = new BlockItem(ModBlocks.ANDESITE_GOLD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DIORITE_GOLD_ORE = new BlockItem(ModBlocks.DIORITE_GOLD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TUFF_GOLD_ORE = new BlockItem(ModBlocks.TUFF_GOLD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem GRANITE_COPPER_ORE = new BlockItem(ModBlocks.GRANITE_COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ANDESITE_COPPER_ORE = new BlockItem(ModBlocks.ANDESITE_COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DIORITE_COPPER_ORE = new BlockItem(ModBlocks.DIORITE_COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TUFF_COPPER_ORE = new BlockItem(ModBlocks.TUFF_COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem GRANITE_REDSTONE_ORE = new BlockItem(ModBlocks.GRANITE_REDSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ANDESITE_REDSTONE_ORE = new BlockItem(ModBlocks.ANDESITE_REDSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DIORITE_REDSTONE_ORE = new BlockItem(ModBlocks.DIORITE_REDSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TUFF_REDSTONE_ORE = new BlockItem(ModBlocks.TUFF_REDSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem GRANITE_LAPIS_ORE = new BlockItem(ModBlocks.GRANITE_LAPIS_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ANDESITE_LAPIS_ORE = new BlockItem(ModBlocks.ANDESITE_LAPIS_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DIORITE_LAPIS_ORE = new BlockItem(ModBlocks.DIORITE_LAPIS_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TUFF_LAPIS_ORE = new BlockItem(ModBlocks.TUFF_LAPIS_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem GRANITE_DIAMOND_ORE = new BlockItem(ModBlocks.GRANITE_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ANDESITE_DIAMOND_ORE = new BlockItem(ModBlocks.ANDESITE_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DIORITE_DIAMOND_ORE = new BlockItem(ModBlocks.DIORITE_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TUFF_DIAMOND_ORE = new BlockItem(ModBlocks.TUFF_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem GRANITE_EMERALD_ORE = new BlockItem(ModBlocks.GRANITE_EMERALD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ANDESITE_EMERALD_ORE = new BlockItem(ModBlocks.ANDESITE_EMERALD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DIORITE_EMERALD_ORE = new BlockItem(ModBlocks.DIORITE_EMERALD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TUFF_EMERALD_ORE = new BlockItem(ModBlocks.TUFF_EMERALD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "granite_coal_ore"), GRANITE_COAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "andesite_coal_ore"), ANDESITE_COAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "diorite_coal_ore"), DIORITE_COAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "tuff_coal_ore"), TUFF_COAL_ORE);

        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "granite_iron_ore"), GRANITE_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "andesite_iron_ore"), ANDESITE_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "diorite_iron_ore"), DIORITE_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "tuff_iron_ore"), TUFF_IRON_ORE);

        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "granite_gold_ore"), GRANITE_GOLD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "andesite_gold_ore"), ANDESITE_GOLD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "diorite_gold_ore"), DIORITE_GOLD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "tuff_gold_ore"), TUFF_GOLD_ORE);

        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "granite_copper_ore"), GRANITE_COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "andesite_copper_ore"), ANDESITE_COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "diorite_copper_ore"), DIORITE_COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "tuff_copper_ore"), TUFF_COPPER_ORE);

        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "granite_redstone_ore"), GRANITE_REDSTONE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "andesite_redstone_ore"), ANDESITE_REDSTONE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "diorite_redstone_ore"), DIORITE_REDSTONE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "tuff_redstone_ore"), TUFF_REDSTONE_ORE);

        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "granite_lapis_ore"), GRANITE_LAPIS_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "andesite_lapis_ore"), ANDESITE_LAPIS_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "diorite_lapis_ore"), DIORITE_LAPIS_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "tuff_lapis_ore"), TUFF_LAPIS_ORE);

        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "granite_diamond_ore"), GRANITE_DIAMOND_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "andesite_diamond_ore"), ANDESITE_DIAMOND_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "diorite_diamond_ore"), DIORITE_DIAMOND_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "tuff_diamond_ore"), TUFF_DIAMOND_ORE);

        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "granite_emerald_ore"), GRANITE_EMERALD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "andesite_emerald_ore"), ANDESITE_EMERALD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "diorite_emerald_ore"), DIORITE_EMERALD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Mores.MOD_ID, "tuff_emerald_ore"), TUFF_EMERALD_ORE);
    }
}
