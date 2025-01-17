package xyz.notgorgo;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.notgorgo.minecalibur.item.ModItemGroups;
import xyz.notgorgo.minecalibur.item.ModItems;

public class MineCalibur implements ModInitializer {
	public static final String MOD_ID = "minecalibur";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();

		LOGGER.info("Hello Fabric world!");
	}
}