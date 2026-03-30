package cc.cassian.trading.helpers;

//? fabric {
import net.fabricmc.loader.api.FabricLoader;
import walksy.quickswaprebinder.RebindQuickSwapMod;
//?}
//? neoforge {
/*import net.neoforged.fml.loading.FMLPaths;
import net.minecraft.client.Minecraft;
*///?}
import java.nio.file.Path;

public class ModHelpers {

    public static Path configPath() {
        //? neoforge
        /*return FMLPaths.CONFIGDIR.get();*/
        //? fabric
        return FabricLoader.getInstance().getConfigDir();
    }

    public static boolean shouldQuickSwap() {
        //? neoforge
        /*return Minecraft.getInstance().hasShiftDown();*/
        //? fabric {
        if (FabricLoader.getInstance().isModLoaded("rebindquickswap")) {
            return RebindQuickSwapMod.shouldQuickSwap();
        }
        return ModHelpers.shouldQuickSwap();
        //?}
    }
}
