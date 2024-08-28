package cc.cassian.trading.config.neoforge;

import cc.cassian.trading.VillagerTrading;
import net.neoforged.fml.loading.FMLLoader;

import java.nio.file.Path;


public class ModConfigImpl {
    public static Path configPath() {
        return Path.of(FMLLoader.getGamePath() + "/config").resolve(VillagerTrading.MOD_ID + ".json");
    }
}
