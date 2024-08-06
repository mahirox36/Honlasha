package net.mahiro.honlasha;

import net.fabricmc.api.ModInitializer;

import net.mahiro.honlasha.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HonLasha implements ModInitializer {
	public static String MOD_ID = "honlasha";
    public static final Logger LOGGER = LoggerFactory.getLogger("honlasha");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("LET'S GO");
	}
}