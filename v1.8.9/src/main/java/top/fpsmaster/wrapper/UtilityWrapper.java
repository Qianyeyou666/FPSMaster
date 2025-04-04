package top.fpsmaster.wrapper;

import net.minecraft.potion.Potion;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import top.fpsmaster.interfaces.game.*;
import top.fpsmaster.wrapper.game.IResourceLocationWrapperImpl;

public class UtilityWrapper implements IUtilityWrapper {

    public int getPotionIconIndex(IPotionEffectWrapper effect){
        Potion potion = Potion.potionTypes[effect.getPotionID()];
        return potion.getStatusIconIndex();
    }

    public IChatComponent makeChatComponent(String msg) {
        return new ChatComponentText(msg);
    }

    @Override
    public IResourceLocationWrapper getResourceLocation(String name) {
        return new IResourceLocationWrapperImpl(name);
    }
}
