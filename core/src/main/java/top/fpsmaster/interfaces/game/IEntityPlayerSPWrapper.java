package top.fpsmaster.interfaces.game;

import java.util.ArrayList;

public interface IEntityPlayerSPWrapper extends IEntityWrapper {
    int getHurtTime();

    ArrayList<IPotionEffectWrapper> getActivePotionEffects();
}
