package com.ordana.mores.registry.blocks;

import com.ordana.mores.Mores;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block GRANITE_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block ANDESITE_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block DIORITE_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block TUFF_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.TUFF));

    public static final Block GRANITE_IRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block ANDESITE_IRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block DIORITE_IRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block TUFF_IRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.TUFF));

    public static final Block GRANITE_GOLD_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block ANDESITE_GOLD_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block DIORITE_GOLD_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block TUFF_GOLD_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.TUFF));

    public static final Block GRANITE_COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block ANDESITE_COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block DIORITE_COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block TUFF_COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.TUFF));

    public static final RedstoneOreBlock GRANITE_REDSTONE_ORE = new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final RedstoneOreBlock ANDESITE_REDSTONE_ORE = new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final RedstoneOreBlock DIORITE_REDSTONE_ORE = new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final RedstoneOreBlock TUFF_REDSTONE_ORE = new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.TUFF));

    public static final Block GRANITE_LAPIS_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block ANDESITE_LAPIS_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block DIORITE_LAPIS_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block TUFF_LAPIS_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.TUFF));

    public static final Block GRANITE_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block ANDESITE_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block DIORITE_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block TUFF_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.TUFF));

    public static final Block GRANITE_EMERALD_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block ANDESITE_EMERALD_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block DIORITE_EMERALD_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.STONE));
    public static final Block TUFF_EMERALD_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3f, 3f).sounds(BlockSoundGroup.TUFF));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "granite_coal_ore"), GRANITE_COAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "andesite_coal_ore"), ANDESITE_COAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "diorite_coal_ore"), DIORITE_COAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "tuff_coal_ore"), TUFF_COAL_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "granite_iron_ore"), GRANITE_IRON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "andesite_iron_ore"), ANDESITE_IRON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "diorite_iron_ore"), DIORITE_IRON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "tuff_iron_ore"), TUFF_IRON_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "granite_gold_ore"), GRANITE_GOLD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "andesite_gold_ore"), ANDESITE_GOLD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "diorite_gold_ore"), DIORITE_GOLD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "tuff_gold_ore"), TUFF_GOLD_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "granite_copper_ore"), GRANITE_COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "andesite_copper_ore"), ANDESITE_COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "diorite_copper_ore"), DIORITE_COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "tuff_copper_ore"), TUFF_COPPER_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "granite_redstone_ore"), GRANITE_REDSTONE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "andesite_redstone_ore"), ANDESITE_REDSTONE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "diorite_redstone_ore"), DIORITE_REDSTONE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "tuff_redstone_ore"), TUFF_REDSTONE_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "granite_lapis_ore"), GRANITE_LAPIS_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "andesite_lapis_ore"), ANDESITE_LAPIS_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "diorite_lapis_ore"), DIORITE_LAPIS_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "tuff_lapis_ore"), TUFF_LAPIS_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "granite_diamond_ore"), GRANITE_DIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "andesite_diamond_ore"), ANDESITE_DIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "diorite_diamond_ore"), DIORITE_DIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "tuff_diamond_ore"), TUFF_DIAMOND_ORE);

        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "granite_emerald_ore"), GRANITE_EMERALD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "andesite_emerald_ore"), ANDESITE_EMERALD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "diorite_emerald_ore"), DIORITE_EMERALD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Mores.MOD_ID, "tuff_emerald_ore"), TUFF_EMERALD_ORE);
    }
}
