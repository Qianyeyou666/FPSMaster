package top.fpsmaster.interfaces.game;


public interface IWorldClientWrapper {
    IIBlockStateWrapper getBlockState(IWrapperBlockPosProvider pos);
    IBlockWrapper getBlock(IWrapperBlockPosProvider pos);
    IAxisAlignedBBWrapper getBlockBoundingBox(IWrapperBlockPosProvider pos, IIBlockStateWrapper state);
    void addWeatherEffect(IEntityLightningBoltProvider entityLightningBolt);
    IWorldClientWrapper getWorld();
    void setWorldTime(long l);
}