package top.fpsmaster.wrapper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Session;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.fpsmaster.forge.api.IMinecraft;
import top.fpsmaster.interfaces.game.*;
import top.fpsmaster.interfaces.gui.IFontRendererWrapper;
import top.fpsmaster.interfaces.gui.IGuiScreenWrapper;
import top.fpsmaster.wrapper.client.INetworkPlayerInfoWrapperImpl;
import top.fpsmaster.wrapper.entities.IEntityPlayerSPWrapperImpl;
import top.fpsmaster.wrapper.gui.IGuiScreenWrapperImpl;
import top.fpsmaster.wrapper.render.FontRendererWrapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class MinecraftWrapper implements IMinecraftWrapper {
    public File getGameDir() {
        return Minecraft.getMinecraft().mcDataDir;
    }

    public IFontRendererWrapper getFontRenderer() {
        return new FontRendererWrapper(Minecraft.getMinecraft().fontRendererObj);
    }

    public IEntityPlayerSPWrapper getPlayer() {
        return new IEntityPlayerSPWrapperImpl(Minecraft.getMinecraft().thePlayer);
    }

    public boolean isHoveringOverBlock() {
        return Minecraft.getMinecraft().objectMouseOver != null && Minecraft.getMinecraft().objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK;
    }


    public IWorldClientWrapper getWorld() {
        return new WorldClientWrapper(Minecraft.getMinecraft().theWorld);
    }


    public void setSession(ISessionWrapper mojang) {
        ((IMinecraft) Minecraft.getMinecraft()).arch$setSession((Session) mojang.getObject());
    }

    public Integer getRespondTime() {
        if (Minecraft.getMinecraft().isSingleplayer())
            return 0;
        return Minecraft.getMinecraft().getNetHandler().getPlayerInfo(Minecraft.getMinecraft().thePlayer.getUniqueID()).getResponseTime();
    }
    public void drawString(String text, float x, float y, int color) {
        Minecraft.getMinecraft().fontRendererObj.drawString(text, (int) x, (int) y, color);
    }
    @NotNull
    public String getServerAddress() {
        if (Minecraft.getMinecraft().isSingleplayer())
            return "localhost";
        return Minecraft.getMinecraft().getNetHandler().getNetworkManager().getRemoteAddress().toString();
    }
    public void removeClickDelay() {
        ((IMinecraft) Minecraft.getMinecraft()).arch$setLeftClickCounter(0);
    }

    @Override
    public void printChatMessage(Object message) {
        Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage((IChatComponent) message);
    }

    @Override
    public Collection<INetworkPlayerInfoWrapper> getPlayerInfoMap() {
        Collection<NetworkPlayerInfo> playerInfoMap = Minecraft.getMinecraft().getNetHandler().getPlayerInfoMap();
        ArrayList<INetworkPlayerInfoWrapper> playerInfoWrappers = new ArrayList<>();
        for (NetworkPlayerInfo networkPlayerInfo : playerInfoMap) {
            playerInfoWrappers.add(new INetworkPlayerInfoWrapperImpl(networkPlayerInfo));
        }
        return playerInfoWrappers;
    }

    @Override
    public void displayGuiScreen(IGuiScreenWrapper gui) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen) gui.getObject());
    }

    @Override
    public String getVersion() {
        return "1.8.9";
    }

    UtilityWrapper utilityWrapper = new UtilityWrapper();

    @Override
    public IUtilityWrapper getUtilityWrapper() {
        return utilityWrapper;
    }

    @Nullable
    @Override
    public IGuiScreenWrapper getCurrentScreen() {
        return new IGuiScreenWrapperImpl(Minecraft.getMinecraft().currentScreen);
    }
}
