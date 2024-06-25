package net.H0lll0W.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties TOMATO = new FoodProperties.Builder().saturationMod(.3f).nutrition(3).fast()
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST,2400, 0),0.2f).build();
    public static final FoodProperties CHILI = new FoodProperties.Builder().saturationMod(.1f).nutrition(1).fast().build();
    public static final FoodProperties CORN = new FoodProperties.Builder().saturationMod(.7f).nutrition(5).fast().build();
    public static final FoodProperties LENTILS = new FoodProperties.Builder().saturationMod(.4f).nutrition(2).fast().build();
    public static final FoodProperties PEPPER = new FoodProperties.Builder().saturationMod(.1f).nutrition(3).fast().build();
    public static final FoodProperties AVOCADO = new FoodProperties.Builder().saturationMod(.1f).nutrition(3).fast().build();
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().saturationMod(.2f).nutrition(1).fast().build();
    public static final FoodProperties PINEAPPLE = new FoodProperties.Builder().saturationMod(.5f).nutrition(3).fast().build();
    public static final FoodProperties BLUEBERRY = new FoodProperties.Builder().saturationMod(.2f).nutrition(1).fast().build();
}
