package com.lsutigers3131.morefood;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.lsutigers3131.morefood.items.item_lightsaber;

public class Main implements ModInitializer
{

    public static final Item item_thicksteak = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(12).saturationModifier(16).meat().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,200), 0.5F).build()));
    public static final Item item_lightsaber = new item_lightsaber(new Item.Settings().group(ItemGroup.COMBAT).maxDamage(99999));
    public static final Item item_corn = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(ItemReference.item_corn_hunger).saturationModifier(ItemReference.item_corn_saturation).build()));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("morefood", "item_thicksteak"), item_thicksteak);
        Registry.register(Registry.ITEM, new Identifier("morefood", "item_lightsaber"), item_lightsaber);
        Registry.register(Registry.ITEM, new Identifier("morefood", "item_corn"), item_corn);
    }
}

