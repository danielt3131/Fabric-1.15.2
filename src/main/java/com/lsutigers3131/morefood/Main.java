package com.lsutigers3131.morefood;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer
{

    public static final Item ItemThickSteak = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(12).saturationModifier(16).meat().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,200), 0.5F).build()));


    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("morefood", "ItemThickSteak"), ItemThickSteak);
    }
}

