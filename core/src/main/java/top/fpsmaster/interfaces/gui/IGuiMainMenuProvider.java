package top.fpsmaster.interfaces.gui;

import top.fpsmaster.interfaces.IProvider;

public interface IGuiMainMenuProvider extends IProvider {
    void initGui();
    void renderSkybox(int mouseX, int mouseY, float partialTicks, int width, int height, float zLevel);
    void showSinglePlayer(IGuiScreenProvider screen);
}
