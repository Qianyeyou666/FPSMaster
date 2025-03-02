package top.fpsmaster.interfaces.game;

import top.fpsmaster.interfaces.IProvider;

public interface IGameSettings extends IProvider {
    void setKeyPress(IKeyBindingProvider key, boolean value);
}