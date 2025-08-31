package cc.cassian.trading.helpers.fabric;

import net.fabricmc.loader.api.FabricLoader;
import walksy.quickswaprebinder.RebindQuickSwapMod;

public class ModHelpersImpl {
    public static boolean clothConfigInstalled() {
        return FabricLoader.getInstance().isModLoaded("cloth-config");
    }
    public static boolean shouldQuickSwap() {
        if (FabricLoader.getInstance().isModLoaded("rebindquickswap")) {
            return RebindQuickSwapMod.shouldQuickSwap();
        }
        return net.minecraft.client.gui.screen.Screen.hasShiftDown();
    }
}
