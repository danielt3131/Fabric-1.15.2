package com.lsutigers3131.morefood.items;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class item_lightsaber extends Item {
    public item_lightsaber(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use (World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.BLOCK_ANVIL_LAND, 1.0F, 1.0F);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,20, 255));
        return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    }
}



