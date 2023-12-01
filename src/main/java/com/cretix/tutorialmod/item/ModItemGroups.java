package com.cretix.tutorialmod.item;

import com.cretix.tutorialmod.TutorialMod;
import com.cretix.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby")).icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                entries.add(ModItems.RUBY);
                entries.add(ModItems.RAW_RUBY);
                entries.add(ModItems.TOMATO);
                entries.add(ModItems.TOMATO_SEEDS);
                entries.add(ModItems.CORN);
                entries.add(ModItems.CORN_SEEDS);
                entries.add(ModItems.COAL_BRIQUETTE);

                entries.add(ModItems.METAL_DETECTOR);
                entries.add(ModItems.RUBY_STAFF);

                entries.add(ModItems.RUBY_AXE);
                entries.add(ModItems.RUBY_PICKAXE);
                entries.add(ModItems.RUBY_SHOVEL);
                entries.add(ModItems.RUBY_SWORD);
                entries.add(ModItems.RUBY_HOE);

                entries.add(ModItems.RUBY_HELMET);
                entries.add(ModItems.RUBY_CHESTPLATE);
                entries.add(ModItems.RUBY_LEGGINGS);
                entries.add(ModItems.RUBY_BOOTS);

                entries.add(ModItems.LOOTBOX);

                entries.add(ModBlocks.RUBY_BLOCK);
                entries.add(ModBlocks.RAW_RUBY_BLOCK);

                entries.add(ModBlocks.RUBY_STAIRS);
                entries.add(ModBlocks.RUBY_SLAB);
                entries.add(ModBlocks.RUBY_BUTTON);
                entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                entries.add(ModBlocks.RUBY_DOOR);
                entries.add(ModBlocks.RUBY_TRAPDOOR);
                entries.add(ModBlocks.RUBY_FENCE);
                entries.add(ModBlocks.RUBY_FENCE_GATE);
                entries.add(ModBlocks.RUBY_WALL);

                entries.add(ModBlocks.RUBY_ORE);
                entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                entries.add(ModBlocks.NETHER_RUBY_ORE);
                entries.add(ModBlocks.END_STONE_RUBY_ORE);
                entries.add(ModBlocks.SOUND_BLOCK);

                entries.add(ModItems.MOD_MUSIC_DISC_1);
                entries.add(ModItems.MOD_MUSIC_DISC_2);
                entries.add(ModItems.MOD_MUSIC_DISC_3);
                entries.add(ModItems.MOD_MUSIC_DISC_4);
                entries.add(ModItems.MOD_MUSIC_DISC_5);
                entries.add(ModItems.MOD_MUSIC_DISC_6);
                entries.add(ModItems.MOD_MUSIC_DISC_7);
                entries.add(ModItems.MOD_MUSIC_DISC_8);
                entries.add(ModItems.MOD_MUSIC_DISC_9);
                entries.add(ModItems.MOD_MUSIC_DISC_10);
                entries.add(ModItems.MOD_MUSIC_DISC_11);

            }).build()
    );

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
