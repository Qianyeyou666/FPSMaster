package top.fpsmaster.utils;

import top.fpsmaster.interfaces.ProviderManager;
import top.fpsmaster.interfaces.game.IMinecraftProvider;
import top.fpsmaster.modules.dev.DevMode;

public class Utility {

    public static IMinecraftProvider mc = ProviderManager.mcProvider;

    public static void sendClientMessage(String msg) {
        if (mc.getWorld() != null) {
            mc.printChatMessage(ProviderManager.utilityProvider.makeChatComponent(msg));
        }
    }

    public static void sendClientNotify(String msg) {
        if (mc.getWorld() != null) {
            mc.printChatMessage(ProviderManager.utilityProvider.makeChatComponent("§9[FPSMaster]§r " + msg));
        }
    }

    public static void sendClientDebug(String msg) {
        if (DevMode.INSTACE.dev) {
            if (mc.getWorld() != null) {
                mc.printChatMessage(ProviderManager.utilityProvider.makeChatComponent("§9[FPSMaster]§r " + msg));
            }
        }
    }
}
