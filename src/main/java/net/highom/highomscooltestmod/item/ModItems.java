package net.highom.highomscooltestmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.highom.highomscooltestmod.HighomsCoolTestMod;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item TUTEL_BREAD = registerItem("tutel_bread",
            new Item(new FabricItemSettings().group(ModItemGroup.HighomMod).food(ModFoodComponents.TUTELBREAD)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(HighomsCoolTestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HighomsCoolTestMod.LOGGER.info("Registering Mod Items for " + HighomsCoolTestMod.MOD_ID);
    }
}
