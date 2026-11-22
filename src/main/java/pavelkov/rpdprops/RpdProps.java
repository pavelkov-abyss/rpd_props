package pavelkov.rpdprops;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pavelkov.rpdprops.item.ModItems;
import pavelkov.rpdprops.item.RpdModItems;

public class RpdProps implements ModInitializer {
	public static final String MOD_ID = "rpd_props";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello, Fabric world that I hate! (big rofls)");
		RpdModItems.initialize();
		ModItems.initialize();
		LOGGER.info("All classes is load");
	}
}
