package net.highom.highomscooltestmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TUTELBREAD = new FoodComponent.Builder().hunger(9).saturationModifier(1f).build();
    public static final FoodComponent TUTELFRIEDEGG =  new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 30, 2), 1f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 30, 3), 1f).build();
}
