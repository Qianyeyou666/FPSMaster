package top.fpsmaster.wrapper;

import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import top.fpsmaster.interfaces.game.IWrapperBlockPosProvider;
import top.fpsmaster.interfaces.render.IEffectRendererWrapper;

public class EffectRendererProvider implements IEffectRendererWrapper {

    EffectRenderer obj;

    @Override
    public void addRedStoneBreak(IWrapperBlockPosProvider pos) {
        obj.addBlockDestroyEffects((BlockPos) pos.getObject(), Blocks.redstone_block.getBlockState().getBaseState());
    }
}
