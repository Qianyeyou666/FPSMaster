package top.fpsmaster.interfaces.game;

import top.fpsmaster.interfaces.IWrapper;

public interface IUtilityWrapper extends IWrapper {
    String getResourcePath(IResourceLocationProvider resourceLocation);
    double getDistanceToEntity(IEntityProvider e1, IEntityProvider e2);
    boolean isItemEnhancementEmpty(IItemStackWrapper i);
    int getPotionIconIndex(IPotionEffectWrapper effect);
    Object makeChatComponent(String msg);
}
