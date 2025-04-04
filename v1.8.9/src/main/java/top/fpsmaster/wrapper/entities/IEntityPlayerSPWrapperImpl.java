package top.fpsmaster.wrapper.entities;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.potion.PotionEffect;
import top.fpsmaster.interfaces.game.IEntityPlayerSPWrapper;
import top.fpsmaster.interfaces.game.IEntityWrapper;
import top.fpsmaster.interfaces.game.IPotionEffectWrapper;
import top.fpsmaster.wrapper.game.IEntityWrapperImpl;
import top.fpsmaster.wrapper.game.IPotionEffectWrapperImpl;

import java.util.ArrayList;

public class IEntityPlayerSPWrapperImpl extends IEntityWrapperImpl implements IEntityPlayerSPWrapper {
    EntityPlayerSP obj;

    public IEntityPlayerSPWrapperImpl(EntityPlayerSP thePlayer) {
        super(thePlayer);
    }

    @Override
    public int getHurtTime() {
        return obj.hurtTime;
    }

    @Override
    public ArrayList<IPotionEffectWrapper> getActivePotionEffects() {
        ArrayList<IPotionEffectWrapper> effects = new ArrayList<IPotionEffectWrapper>();
        for (PotionEffect activePotionEffect : obj.getActivePotionEffects()) {
            effects.add(new IPotionEffectWrapperImpl(activePotionEffect));
        }
        return effects;
    }

    @Override
    public double getDistanceToEntity(IEntityWrapper e2) {
        return e2.getDistanceToEntity(this);
    }
}
