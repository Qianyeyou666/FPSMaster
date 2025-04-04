package top.fpsmaster.features.impl.interfaces;

import top.fpsmaster.event.Subscribe;
import top.fpsmaster.event.events.EventAttack;
import top.fpsmaster.event.events.EventTick;
import top.fpsmaster.features.impl.InterfaceModule;
import top.fpsmaster.features.manager.Category;
import top.fpsmaster.features.settings.impl.ColorSetting;
import top.fpsmaster.interfaces.game.IEntityWrapper;

import java.awt.Color;

import static top.fpsmaster.FPSMaster.mc;

public class ComboDisplay extends InterfaceModule {

    private IEntityWrapper target = null;

    public static int combo = 0;
    public static ColorSetting textColor = new ColorSetting("TextColor", new Color(255, 255, 255));

    public ComboDisplay() {
        super("ComboDisplay", Category.Interface);
        addSettings(textColor, backgroundColor, betterFont, fontShadow, rounded, bg, rounded, roundRadius);
    }

    @Subscribe
    public void onTick(EventTick e) {
        if (mc.getPlayer() == null) return;
        if (mc.getPlayer().getHurtTime() == 1 || (target != null && target.getDistanceToEntity((IEntityWrapper) mc.getPlayer()) > 7)) {
            combo = 0;
        }
        if (target != null && target.isEntityAlive() && target.hurtResistantTime == 19) {
            combo++;
        }
    }

    @Subscribe
    public void attack(EventAttack e) {
        target = e.target;
    }
}
