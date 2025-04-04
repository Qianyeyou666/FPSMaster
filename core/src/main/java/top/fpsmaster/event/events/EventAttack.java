package top.fpsmaster.event.events;

import top.fpsmaster.event.Event;
import top.fpsmaster.interfaces.game.IEntityWrapper;

public class EventAttack implements Event {
    public IEntityWrapper target;
    public EventAttack(IEntityWrapper target) {
        this.target = target;
    }
}
