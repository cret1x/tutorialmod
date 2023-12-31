package com.cretix.tutorialmod;

import com.cretix.tutorialmod.block.ModBlocks;
import com.cretix.tutorialmod.block.entity.ModBlockEntities;
import com.cretix.tutorialmod.item.ModItemGroups;
import com.cretix.tutorialmod.item.ModItems;
import com.cretix.tutorialmod.recipe.ModRecipes;
import com.cretix.tutorialmod.screen.ModScreenHandlers;
import com.cretix.tutorialmod.sound.ModSounds;
import com.cretix.tutorialmod.util.ModCustomTrades;
import com.cretix.tutorialmod.util.ModLootTableModifiers;
import com.cretix.tutorialmod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillagers();
		ModSounds.registerSounds();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
	}
}