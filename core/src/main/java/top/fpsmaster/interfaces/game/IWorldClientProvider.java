package top.fpsmaster.interfaces.game;


public interface IWorldClientProvider {
    IIBlockStateProvider getBlockState(IWrapperBlockPosProvider pos);
    IBlockProvider getBlock(IWrapperBlockPosProvider pos);
    IWrapperAxisAlignedBBProvider getBlockBoundingBox(IWrapperBlockPosProvider pos, IIBlockStateProvider state);
    void addWeatherEffect(IEntityLightningBoltProvider entityLightningBolt);
    IWorldClientProvider getWorld();
    void setWorldTime(long l);
}