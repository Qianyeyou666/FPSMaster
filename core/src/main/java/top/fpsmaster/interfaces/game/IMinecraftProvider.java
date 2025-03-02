package top.fpsmaster.interfaces.game;

import top.fpsmaster.interfaces.IProvider;
import top.fpsmaster.interfaces.gui.IFontRendererProvider;
import top.fpsmaster.interfaces.gui.IGuiScreenProvider;

import java.io.File;
import java.util.Collection;

public interface IMinecraftProvider extends IProvider {
    Object getCurrentScreen();
    File getGameDir();
    IFontRendererProvider getFontRenderer();
    IEntityPlayerSPProvider getPlayer();
    boolean isHoveringOverBlock();
    IItemStackProvider getPlayerHeldItem();
    IWorldClientProvider getWorld();
    IItemStackProvider[] getArmorInventory();
    void setSession(ISessionProvider mojang);
    Integer getRespondTime();
    void drawString(String text, float x, float y, int color);
    String getServerAddress();
    void removeClickDelay();
    void printChatMessage(Object message);
    Collection<INetworkPlayerInfoProvider> getPlayerInfoMap();

    void displayGuiScreen(IGuiScreenProvider gui);
}
