package top.fpsmaster.wrapper.render;

import net.minecraft.client.renderer.texture.TextureManager;
import top.fpsmaster.interfaces.render.ITextureManagerWrapper;

public class ITextureManagerWrapperImpl implements ITextureManagerWrapper {
    TextureManager textureManager;

    public ITextureManagerWrapperImpl(TextureManager textureManager) {
        this.textureManager = textureManager;
    }
}
