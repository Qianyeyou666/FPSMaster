package top.fpsmaster.wrapper.render;

import net.minecraft.client.gui.FontRenderer;
import top.fpsmaster.interfaces.gui.IFontRendererWrapper;

public class FontRendererWrapper implements IFontRendererWrapper {
    FontRenderer obj;
    public FontRendererWrapper(FontRenderer fontRendererObj) {
        obj = fontRendererObj;
    }
}
