package top.fpsmaster.wrapper;

import net.minecraft.client.Minecraft;
import top.fpsmaster.forge.api.IMinecraft;
import top.fpsmaster.interfaces.game.ITimerWrapper;

public class TimerWrapper implements ITimerWrapper {
    public float getRenderPartialTicks(){
        return ((IMinecraft) Minecraft.getMinecraft()).arch$getTimer().renderPartialTicks;
    }
}
