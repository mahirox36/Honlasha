package net.mahiro.honlasha.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mahiro.honlasha.HonLasha;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item MIXED_IRON_COAL = registerItem("mixed_iron_coal", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(HonLasha.MOD_ID, name), item);
    }

    private static void customIng(FabricItemGroupEntries entries){
        entries.add(STEEL_INGOT);
        entries.add(MIXED_IRON_COAL);
    }

    public static void registerModItems(){
        HonLasha.LOGGER.info("YEAH BOI");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIng);
    }
}
