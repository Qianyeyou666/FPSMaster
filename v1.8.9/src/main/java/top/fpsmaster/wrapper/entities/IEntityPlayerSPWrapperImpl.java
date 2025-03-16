package top.fpsmaster.wrapper.entities;

import net.minecraft.client.entity.EntityPlayerSP;
import top.fpsmaster.interfaces.game.IEntityPlayerSPWrapper;

public class IEntityPlayerSPWrapperImpl implements IEntityPlayerSPWrapper {
    EntityPlayerSP obj;

    public IEntityPlayerSPWrapperImpl(EntityPlayerSP thePlayer) {
        obj = thePlayer;
    }
}
