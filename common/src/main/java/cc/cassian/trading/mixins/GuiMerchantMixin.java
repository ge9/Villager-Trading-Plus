package cc.cassian.trading.mixins;

import cc.cassian.trading.BetterGuiMerchant;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.screen.MerchantScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HandledScreens.class)
public abstract class GuiMerchantMixin {
    
    @Inject(method = "open", at = @At("HEAD"), cancellable = true)
    private static <T extends ScreenHandler> void displayVillagerTradeGui(ScreenHandlerType<T> type, MinecraftClient client, int any, Text component, CallbackInfo ci) {
        if (type == ScreenHandlerType.MERCHANT) {
            MerchantScreenHandler container = ScreenHandlerType.MERCHANT.create(any, client.player.getInventory());
            BetterGuiMerchant screen = new BetterGuiMerchant(container, client.player.getInventory(), component);
            client.player.currentScreenHandler = container;
            client.setScreen(screen);
            ci.cancel();
        }
    }
}
