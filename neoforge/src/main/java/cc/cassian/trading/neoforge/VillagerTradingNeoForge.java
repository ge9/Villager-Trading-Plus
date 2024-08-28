package cc.cassian.trading.neoforge;

import cc.cassian.trading.VillagerTrading;
import cc.cassian.trading.config.neoforge.ModConfigFactory;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

import static cc.cassian.trading.helpers.ModHelpers.clothConfigInstalled;


@Mod(VillagerTrading.MOD_ID)
public final class VillagerTradingNeoForge {
    public VillagerTradingNeoForge() {
        // Run our common setup.
        VillagerTrading.init();
        registerModsPage();


    }

    //Integrate Cloth Config screen (if mod present) with NeoForge mod menu.
    public void registerModsPage() {
        if (clothConfigInstalled()) ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, ModConfigFactory::new);
    }

}
