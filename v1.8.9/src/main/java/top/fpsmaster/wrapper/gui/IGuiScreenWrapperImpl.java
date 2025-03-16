package top.fpsmaster.wrapper.gui;

import net.minecraft.client.gui.GuiScreen;
import top.fpsmaster.interfaces.gui.IGuiScreenWrapper;

public class IGuiScreenWrapperImpl implements IGuiScreenWrapper {

    GuiScreen obj;
    public IGuiScreenWrapperImpl(GuiScreen guiScreen) {
        obj = guiScreen;
    }
}
