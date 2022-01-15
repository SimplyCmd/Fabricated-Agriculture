package simplycmd.fabricated_agriculture;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer, ClientModInitializer {
	public static final String MOD_ID = "fabricated_agriculture";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Entities.register();
		LOGGER.info(MOD_ID + " has been activated :D");
	}

	@Override
	public void onInitializeClient() {
		Entities.registerClient();
	}
}
