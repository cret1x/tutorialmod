package com.cretix.tutorialmod.item.custom;

import com.cretix.tutorialmod.item.ModArmorMaterial;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;

public class ModArmorItem extends ArmorItem {

    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
                    .put(ModArmorMaterial.RUBY, new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 400,
                            4, false, false, false)).build();

    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (entity instanceof PlayerEntity player && hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (var entry: MATERIAL_TO_EFFECT_MAP.entrySet()) {
            var armorMaterial = entry.getKey();
            var statusEffect = entry.getValue();
            if (hasCorrectArmorOn(armorMaterial, player)) {
                addStatusEffectForMaterial(player, armorMaterial, statusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, ArmorMaterial armorMaterial, StatusEffectInstance statusEffect) {
        var hasEffect = player.hasStatusEffect(statusEffect.getEffectType());
        if (hasCorrectArmorOn(armorMaterial, player) && !hasEffect) {
            player.addStatusEffect(new StatusEffectInstance(statusEffect));
        }
    }

    private boolean hasCorrectArmorOn(ArmorMaterial armorMaterial, PlayerEntity player) {
        for (var stack : player.getInventory().armor) {
            if (!(stack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }
        var boots = (ArmorItem) player.getInventory().getArmorStack(0).getItem();
        var leggings = (ArmorItem) player.getInventory().getArmorStack(1).getItem();
        var chestplate = (ArmorItem) player.getInventory().getArmorStack(2).getItem();
        var helmet = (ArmorItem) player.getInventory().getArmorStack(3).getItem();
        return boots.getMaterial() == material && leggings.getMaterial() == material &&
                chestplate.getMaterial() == material && helmet.getMaterial() == material;
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }
}
