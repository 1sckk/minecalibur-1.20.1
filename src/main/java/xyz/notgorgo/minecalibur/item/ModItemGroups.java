package xyz.notgorgo.minecalibur.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.notgorgo.MineCalibur;

public class ModItemGroups {
    public static final ItemGroup SWORD_GROUP;

    static {
        SWORD_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(MineCalibur.MOD_ID, "sword"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sword"))
                        .icon(() -> new ItemStack(ModItems.SWORD)).entries((displayContext, entries) -> {
                            entries.add(ModItems.SWORD);



                        }).build());



    }
    public static void registerModItemGroups() {
        MineCalibur.LOGGER.info("Registering Mod Item Groups for" + MineCalibur.MOD_ID);
    }
}
