package top.fpsmaster.interfaces.game;

import top.fpsmaster.interfaces.IWrapper;

public interface IUtilityWrapper extends IWrapper {
    int getPotionIconIndex(IPotionEffectWrapper effect);
    Object makeChatComponent(String msg);

    IResourceLocationWrapper getResourceLocation(String cape);
}
