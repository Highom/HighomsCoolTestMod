package net.highom.highomscooltestmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.highom.highomscooltestmod.HighomsCoolTestMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item TUTEL_BREAD = registerItem("tutel_bread",
            new Item(new FabricItemSettings().group(ModItemGroup.HighomMod).food(ModFoodComponents.TUTELBREAD)));
    public static final Item TUTEL_FRIED_EGG = registerItem("tutel_fried_egg",
            new Item(new FabricItemSettings().group(ModItemGroup.HighomMod).food(ModFoodComponents.TUTELFRIEDEGG)));

    public static final Item STONE_HELMET = registerItem("stone_helmet",
            new ArmorItem(ModArmorMaterials.STONE, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item STONE_CHESTPLATE = registerItem("stone_chestplate",
            new ArmorItem(ModArmorMaterials.STONE, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item STONE_LEGGINGS = registerItem("stone_leggings",
            new ArmorItem(ModArmorMaterials.STONE, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item STONE_BOOTS = registerItem("stone_boots",
            new ArmorItem(ModArmorMaterials.STONE, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(HighomsCoolTestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HighomsCoolTestMod.LOGGER.info("Registering Mod Items for " + HighomsCoolTestMod.MOD_ID);
    }
}
