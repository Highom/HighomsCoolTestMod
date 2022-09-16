package net.highom.highomscooltestmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.highom.highomscooltestmod.HighomsCoolTestMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup HighomMod = FabricItemGroupBuilder.build(new Identifier(HighomsCoolTestMod.MOD_ID, "highom"),
            () -> new ItemStack(ModItems.TUTEL_BREAD));
}
