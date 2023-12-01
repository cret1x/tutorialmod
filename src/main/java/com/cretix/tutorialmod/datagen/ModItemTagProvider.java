package com.cretix.tutorialmod.datagen;

import com.cretix.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.MOD_MUSIC_DISC_1)
                .add(ModItems.MOD_MUSIC_DISC_2)
                .add(ModItems.MOD_MUSIC_DISC_3)
                .add(ModItems.MOD_MUSIC_DISC_4)
                .add(ModItems.MOD_MUSIC_DISC_5)
                .add(ModItems.MOD_MUSIC_DISC_6)
                .add(ModItems.MOD_MUSIC_DISC_7)
                .add(ModItems.MOD_MUSIC_DISC_8)
                .add(ModItems.MOD_MUSIC_DISC_9)
                .add(ModItems.MOD_MUSIC_DISC_10)
                .add(ModItems.MOD_MUSIC_DISC_11);
    }
}
