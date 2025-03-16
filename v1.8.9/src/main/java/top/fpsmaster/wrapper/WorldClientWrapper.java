package top.fpsmaster.wrapper;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import top.fpsmaster.block.IIBlockStateWrapperImpl;
import top.fpsmaster.interfaces.game.*;
import top.fpsmaster.wrapper.block.IBlockWrapperImpl;
import top.fpsmaster.wrapper.blockpos.WrapperBlockPos;
import top.fpsmaster.wrapper.util.IAxisAlignedBBImpl;

public class WorldClientWrapper implements IWorldClientWrapper {

    WorldClient obj;
    public WorldClientWrapper(WorldClient theWorld) {
        obj = theWorld;
    }

    public IIBlockStateWrapper getBlockState(IWrapperBlockPosProvider pos) {
        return new IIBlockStateWrapperImpl(Minecraft.getMinecraft().theWorld.getBlockState((BlockPos) pos.getObject()));
    }

    public IBlockWrapper getBlock(IWrapperBlockPosProvider pos) {
        return new IBlockWrapperImpl(Minecraft.getMinecraft().theWorld.getBlockState(pos.getPos()).getBlock());
    }

    public IAxisAlignedBBWrapper getBlockBoundingBox(IWrapperBlockPosProvider pos, IIBlockStateWrapper state) {
        IBlockWrapper block = getBlock(pos);
        return new IAxisAlignedBBImpl(new AxisAlignedBB(block.getBlockBoundsMinX(), block.getBlockBoundsMinY(), block.getBlockBoundsMinZ(), block.getBlockBoundsMaxX(), block.getBlockBoundsMaxY(), block.getBlockBoundsMaxZ()));
    }

    public void addWeatherEffect(IEntityLightningBoltProvider entityLightningBolt){

    }

    public IWorldClientWrapper getWorld() {
        return new WorldClientWrapper(Minecraft.getMinecraft().theWorld);
    }

    public void setWorldTime(long l) {
        Minecraft.getMinecraft().theWorld.setWorldTime(l);
    }
}
