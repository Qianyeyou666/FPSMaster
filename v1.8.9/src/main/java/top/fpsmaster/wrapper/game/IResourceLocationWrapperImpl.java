package top.fpsmaster.wrapper.game;

import net.minecraft.util.ResourceLocation;
import top.fpsmaster.interfaces.game.IResourceLocationWrapper;

public class IResourceLocationWrapperImpl implements IResourceLocationWrapper {
    ResourceLocation resourceLocation;

    public IResourceLocationWrapperImpl(ResourceLocation resourceLocation) {
        this.resourceLocation = resourceLocation;
    }

    public IResourceLocationWrapperImpl(String name) {
        this.resourceLocation = new ResourceLocation(name);
    }

    @Override
    public String getResourcePath() {
        return resourceLocation.getResourcePath();
    }
}
