package com.cretix.tutorialmod.item;

import com.cretix.tutorialmod.TutorialMod;
import com.cretix.tutorialmod.block.ModBlocks;
import com.cretix.tutorialmod.item.custom.LootboxItem;
import com.cretix.tutorialmod.item.custom.MetalDetectorItem;
import com.cretix.tutorialmod.item.custom.ModArmorItem;
import com.cretix.tutorialmod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item RUBY_STAFF = registerItem("ruby_staff",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item LOOTBOX = registerItem("lootbox", new LootboxItem(new FabricItemSettings()));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, 4, 1f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 1, 2.5f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, 0, 3.5f, new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 4, 2.5f, new FabricItemSettings()));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));
    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN_CROP, new FabricItemSettings()));

    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings().food(ModFoodComponents.CORN)));

    public static final Item MOD_MUSIC_DISC_1 = registerItem("mod_music_disc_1", new MusicDiscItem(
            1, ModSounds.MOD_MUSIC_DISC_1, new FabricItemSettings().maxCount(1), 149));
    public static final Item MOD_MUSIC_DISC_2 = registerItem("mod_music_disc_2", new MusicDiscItem(
            2, ModSounds.MOD_MUSIC_DISC_2, new FabricItemSettings().maxCount(1), 193));
    public static final Item MOD_MUSIC_DISC_3 = registerItem("mod_music_disc_3", new MusicDiscItem(
            3, ModSounds.MOD_MUSIC_DISC_3, new FabricItemSettings().maxCount(1), 116));
    public static final Item MOD_MUSIC_DISC_4 = registerItem("mod_music_disc_4", new MusicDiscItem(
            4, ModSounds.MOD_MUSIC_DISC_4, new FabricItemSettings().maxCount(1), 276));
    public static final Item MOD_MUSIC_DISC_5 = registerItem("mod_music_disc_5", new MusicDiscItem(
            5, ModSounds.MOD_MUSIC_DISC_5, new FabricItemSettings().maxCount(1), 207));
    public static final Item MOD_MUSIC_DISC_6 = registerItem("mod_music_disc_6", new MusicDiscItem(
            6, ModSounds.MOD_MUSIC_DISC_6, new FabricItemSettings().maxCount(1), 171));
    public static final Item MOD_MUSIC_DISC_7 = registerItem("mod_music_disc_7", new MusicDiscItem(
            7, ModSounds.MOD_MUSIC_DISC_7, new FabricItemSettings().maxCount(1), 89));
    public static final Item MOD_MUSIC_DISC_8 = registerItem("mod_music_disc_8", new MusicDiscItem(
            8, ModSounds.MOD_MUSIC_DISC_8, new FabricItemSettings().maxCount(1), 213));
    public static final Item MOD_MUSIC_DISC_9 = registerItem("mod_music_disc_9", new MusicDiscItem(
            9, ModSounds.MOD_MUSIC_DISC_9, new FabricItemSettings().maxCount(1), 118));
    public static final Item MOD_MUSIC_DISC_10 = registerItem("mod_music_disc_10", new MusicDiscItem(
            10, ModSounds.MOD_MUSIC_DISC_10, new FabricItemSettings().maxCount(1), 200));
    public static final Item MOD_MUSIC_DISC_11 = registerItem("mod_music_disc_11", new MusicDiscItem(
            11, ModSounds.MOD_MUSIC_DISC_11, new FabricItemSettings().maxCount(1), 318));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
