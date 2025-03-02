package top.fpsmaster.interfaces;

import top.fpsmaster.interfaces.client.IConstantsProvider;
import top.fpsmaster.interfaces.game.*;
import top.fpsmaster.interfaces.gui.IGuiIngameProvider;
import top.fpsmaster.interfaces.gui.IGuiMainMenuProvider;
import top.fpsmaster.interfaces.packets.IPacketChat;
import top.fpsmaster.interfaces.packets.IPacketPlayerList;
import top.fpsmaster.interfaces.packets.IPacketTimeUpdate;
import top.fpsmaster.interfaces.render.IEffectRendererProvider;
import top.fpsmaster.interfaces.render.IRenderManagerProvider;
import top.fpsmaster.interfaces.sound.ISoundProvider;

public class ProviderManager {
    public static IConstantsProvider constants;
    public static IUtilityProvider utilityProvider;
    public static IMinecraftProvider mcProvider;
    public static IGuiMainMenuProvider mainmenuProvider;
    public static ISkinProvider skinProvider;
    public static IWorldClientProvider worldClientProvider;
    public static ITimerProvider timerProvider;
    public static IRenderManagerProvider renderManagerProvider ;
    public static IGameSettings gameSettings;

    // Packets
    public static IPacketChat packetChat;
    public static IPacketPlayerList packetPlayerList;
    public static IPacketTimeUpdate packetTimeUpdate;
    public static IGuiIngameProvider guiIngameProvider;
    public static ISoundProvider soundProvider;
    public static IEffectRendererProvider effectManager;
}
