package top.fpsmaster.event.events;

import top.fpsmaster.FPSMaster;
import top.fpsmaster.event.CancelableEvent;
import top.fpsmaster.interfaces.game.IResourceLocationWrapper;

import java.util.HashMap;
import java.util.Map;

public class EventCapeLoading extends CancelableEvent {
    Map<String, IResourceLocationWrapper> capeCache = new HashMap<>();

    public String playerName;
    public AbstractClientPlayer player;
    public IResourceLocationWrapper cape;

    public EventCapeLoading(String playerName, AbstractClientPlayer player) {
        this.playerName = playerName;
        this.player = player;
    }

    public void setCachedCape(String cape) {
        if (capeCache.containsKey(cape)) {
            this.cape = capeCache.get(cape);
        } else {
            this.cape = FPSMaster.mc.getUtilityWrapper().getResourceLocation(cape);
            capeCache.put(cape, this.cape);
        }
    }
}
