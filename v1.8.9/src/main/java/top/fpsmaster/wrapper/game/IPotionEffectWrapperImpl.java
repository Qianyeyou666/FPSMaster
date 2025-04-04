package top.fpsmaster.wrapper.game;

import net.minecraft.potion.PotionEffect;
import top.fpsmaster.interfaces.game.IPotionEffectWrapper;

public class IPotionEffectWrapperImpl implements IPotionEffectWrapper {
    PotionEffect obj;

    public IPotionEffectWrapperImpl(PotionEffect activePotionEffect) {
        this.obj = activePotionEffect;
    }

    @Override
    public int getPotionID() {
        return obj.getPotionID();
    }
}
