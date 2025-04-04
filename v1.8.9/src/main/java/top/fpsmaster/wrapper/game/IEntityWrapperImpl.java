package top.fpsmaster.wrapper.game;

import net.minecraft.entity.Entity;
import top.fpsmaster.interfaces.game.IEntityWrapper;

public class IEntityWrapperImpl implements IEntityWrapper {
    Entity obj;

    public IEntityWrapperImpl(Entity obj) {
        this.obj = obj;
    }

    @Override
    public double getDistanceToEntity(IEntityWrapper e2) {
        return obj.getDistanceToEntity(((IEntityWrapperImpl) e2).obj);
    }
}
