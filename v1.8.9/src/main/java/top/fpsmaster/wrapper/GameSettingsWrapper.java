package top.fpsmaster.wrapper;

import net.minecraft.client.settings.KeyBinding;
import top.fpsmaster.forge.api.IKeyBinding;
import top.fpsmaster.interfaces.game.IGameSettings;
import top.fpsmaster.interfaces.game.IKeyBindingProvider;

public class GameSettingsWrapper implements IGameSettings {

    @Override
    public void setKeyPress(IKeyBindingProvider key, boolean value) {
        ((IKeyBinding) key).setPressed(value);
    }
}
