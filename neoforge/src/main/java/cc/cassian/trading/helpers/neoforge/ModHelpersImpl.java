package cc.cassian.trading.helpers.neoforge;

import net.neoforged.fml.ModList;

public class ModHelpersImpl {
    public static boolean clothConfigInstalled() {
        return ModList.get().isLoaded("cloth_config");
    }
}
