package com.cretix.tutorialmod.util;

import com.cretix.tutorialmod.item.ModItems;
import com.cretix.tutorialmod.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.TOMATO, 6),
                    8, 5, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.TOMATO, 20),
                    new ItemStack(Items.EMERALD, 2),
                    10, 5, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.CORN, 4),
                    8, 5, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.CORN, 17),
                    new ItemStack(Items.EMERALD, 3),
                    10, 5, 0.075f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RUBY, 32),
                    EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.MENDING, 1)),
                    8, 12, 0.05f
            ));
        });
        TradeOfferHelper.registerWanderingTraderOffers(2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RAW_RUBY, 16),
                    new ItemStack(ModItems.METAL_DETECTOR, 1),
                    8, 12, 0.05f
            ));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RUBY, 16),
                    new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1),
                    8, 12, 0.05f
            ));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RUBY, 16),
                    new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                    8, 12, 0.05f
            ));
        });
    }
}
