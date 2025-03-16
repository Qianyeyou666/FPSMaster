package top.fpsmaster.interfaces.game;

import top.fpsmaster.interfaces.IWrapper;

public interface IGameSettings extends IWrapper {
    void setKeyPress(IKeyBindingProvider key, boolean value);
}