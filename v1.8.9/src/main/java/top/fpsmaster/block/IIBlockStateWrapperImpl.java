package top.fpsmaster.block;

import net.minecraft.block.state.IBlockState;
import top.fpsmaster.interfaces.game.IIBlockStateWrapper;

public class IIBlockStateWrapperImpl implements IIBlockStateWrapper {

    IBlockState obj;
    public IIBlockStateWrapperImpl(IBlockState blockState) {
        obj = blockState;
    }
}
