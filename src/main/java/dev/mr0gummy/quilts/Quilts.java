package dev.mr0gummy.quilts;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quilts implements ModInitializer {
	public static final String MOD_ID = "quilts";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.init();

		LOGGER.info("Hi this is gummy, so why why did you want to try this mod. why-");
	}
}