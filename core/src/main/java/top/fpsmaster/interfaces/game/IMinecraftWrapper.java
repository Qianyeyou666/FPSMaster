package top.fpsmaster.interfaces.game;

import top.fpsmaster.interfaces.IWrapper;
import top.fpsmaster.interfaces.gui.IFontRendererWrapper;
import top.fpsmaster.interfaces.gui.IGuiScreenWrapper;

import java.io.File;
import java.util.Collection;

public interface IMinecraftWrapper extends IWrapper {
    IUtilityWrapper getUtilityWrapper();
    IGuiScreenWrapper getCurrentScreen();
    File getGameDir();
    IFontRendererWrapper getFontRenderer();
    IEntityPlayerSPWrapper getPlayer();
    boolean isHoveringOverBlock();
    IWorldClientWrapper getWorld();
    void setSession(ISessionWrapper mojang);
    Integer getRespondTime();
    String getServerAddress();
    void removeClickDelay();
    void printChatMessage(Object message);
    Collection<INetworkPlayerInfoWrapper> getPlayerInfoMap();
    void displayGuiScreen(IGuiScreenWrapper gui);
    String getVersion();
}
