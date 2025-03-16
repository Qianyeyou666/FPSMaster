package top.fpsmaster.interfaces.gui;

import top.fpsmaster.interfaces.IWrapper;

public interface IGuiMainMenuWrapper extends IWrapper {
    void initGui();
    void renderSkybox(int mouseX, int mouseY, float partialTicks, int width, int height, float zLevel);
    void showSinglePlayer(IGuiScreenWrapper screen);
}
