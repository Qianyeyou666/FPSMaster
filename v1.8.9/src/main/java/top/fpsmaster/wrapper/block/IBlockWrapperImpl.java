package top.fpsmaster.wrapper.block;

import net.minecraft.block.Block;
import top.fpsmaster.interfaces.game.IBlockWrapper;

public class IBlockWrapperImpl implements IBlockWrapper {
    Block obj;
    public IBlockWrapperImpl(Block block) {
        obj = block;
    }
}
