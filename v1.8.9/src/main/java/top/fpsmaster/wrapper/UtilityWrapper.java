package top.fpsmaster.wrapper;

import net.minecraft.potion.Potion;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import top.fpsmaster.interfaces.game.*;

public class UtilityWrapper implements IUtilityWrapper {
    public String getResourcePath(IResourceLocationProvider resourceLocation){
        return resourceLocation.getResourcePath();
    }

    public double getDistanceToEntity(IEntityProvider e1, IEntityProvider e2){
        return e1.getDistanceToEntity(e2);
    }

    public boolean isItemEnhancementEmpty(IItemStackWrapper i){
        return i.hasNoTags();
    }

    public int getPotionIconIndex(IPotionEffectWrapper effect){
        Potion potion = Potion.potionTypes[effect.getPotionID()];
        return potion.getStatusIconIndex();
    }

    public IChatComponent makeChatComponent(String msg) {
        return new ChatComponentText(msg);
    }
}
