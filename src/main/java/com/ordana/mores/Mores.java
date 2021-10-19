package com.ordana.mores;

import com.ordana.mores.registry.blocks.ModBlocks;
import com.ordana.mores.registry.items.ModItems;
import net.fabricmc.api.ModInitializer;

public class Mores implements ModInitializer {

    public static final String MOD_ID = "mores";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
