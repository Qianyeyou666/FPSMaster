package top.fpsmaster.interfaces.game;

import top.fpsmaster.interfaces.IProvider;

public interface IUtilityProvider extends IProvider {
    String getResourcePath(IResourceLocationProvider resourceLocation);
    double getDistanceToEntity(IEntityProvider e1, IEntityProvider e2);
    boolean isItemEnhancementEmpty(IItemStackProvider i);
    int getPotionIconIndex(IPotionEffectProvider effect);
    Object makeChatComponent(String msg);
}
