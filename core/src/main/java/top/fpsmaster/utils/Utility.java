package top.fpsmaster.utils;

import top.fpsmaster.interfaces.game.IMinecraftWrapper;
import top.fpsmaster.modules.dev.DevMode;

import static top.fpsmaster.FPSMaster.mc;

public class Utility {

    public static void sendClientMessage(String msg) {
        if (mc.getWorld() != null) {
            mc.printChatMessage(mc.getUtilityWrapper().makeChatComponent(msg));
        }
    }

    public static void sendClientNotify(String msg) {
        if (mc.getWorld() != null) {
            mc.printChatMessage(mc.getUtilityWrapper().makeChatComponent("§9[FPSMaster]§r " + msg));
        }
    }

    public static void sendClientDebug(String msg) {
        if (DevMode.INSTACE.dev) {
            if (mc.getWorld() != null) {
                mc.printChatMessage(mc.getUtilityWrapper().makeChatComponent("§9[FPSMaster]§r " + msg));
            }
        }
    }
}
