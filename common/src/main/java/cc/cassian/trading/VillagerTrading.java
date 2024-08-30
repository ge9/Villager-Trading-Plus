package cc.cassian.trading;

import cc.cassian.trading.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VillagerTrading {

    public static final String MOD_ID = "villager_trading_plus";
    public static final String MOD_NAME = "Villager Trading Plus";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public static void init() {
        ModConfig.load();
        LOGGER.info("Successfully initialized Villager Trading Plus. Villagers, just hand over the Emeralds!");
    }
}
