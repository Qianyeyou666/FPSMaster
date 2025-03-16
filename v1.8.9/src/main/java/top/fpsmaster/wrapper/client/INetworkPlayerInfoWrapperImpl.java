package top.fpsmaster.wrapper.client;

import net.minecraft.client.network.NetworkPlayerInfo;
import top.fpsmaster.interfaces.game.INetworkPlayerInfoWrapper;

public class INetworkPlayerInfoWrapperImpl implements INetworkPlayerInfoWrapper {
    NetworkPlayerInfo obj;
    public INetworkPlayerInfoWrapperImpl(NetworkPlayerInfo networkPlayerInfo) {
        obj = networkPlayerInfo;
    }
}
