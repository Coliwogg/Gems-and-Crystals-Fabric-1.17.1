package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY;
    public static final Item SAPPHIRE;
    public static final Item TOPAZ;

    static {
        RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ = registerItem("topaz", new Item(new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GemsAndCrystals.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GemsAndCrystals.LOGGER.info("Registering ModItems for " + GemsAndCrystals.MOD_ID);
    }

}
