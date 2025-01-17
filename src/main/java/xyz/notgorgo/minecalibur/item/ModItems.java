package xyz.notgorgo.minecalibur.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.notgorgo.MineCalibur;

public class ModItems {

    public static final Item SWORD = registerItem("sword_of_setuska", new Item(new FabricItemSettings()));



    private  static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MineCalibur.MOD_ID, name), item);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    public static void registerModItems() {
        MineCalibur.LOGGER.info("Registering Mod Items for" + MineCalibur.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
