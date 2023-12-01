package com.cretix.tutorialmod.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class LootboxItem extends Item {
    public LootboxItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        int count =  user.getStackInHand(hand).getCount();
        Optional<RegistryEntry.Reference<Item>> item = Registries.ITEM.getRandom(world.random);
        if (item.isPresent()) {
            user.getStackInHand(hand).setCount(count - 1);
            user.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
            user.giveItemStack(new ItemStack(item.get()));
            return TypedActionResult.success(user.getStackInHand(hand));
        } else {
            return TypedActionResult.fail(user.getStackInHand(hand));
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Drops random item!"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
