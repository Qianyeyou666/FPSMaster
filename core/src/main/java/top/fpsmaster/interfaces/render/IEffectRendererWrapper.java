package top.fpsmaster.interfaces.render;

import top.fpsmaster.interfaces.IWrapper;
import top.fpsmaster.interfaces.game.IWrapperBlockPosProvider;

public interface IEffectRendererWrapper extends IWrapper {
    void addRedStoneBreak(IWrapperBlockPosProvider pos);
}
