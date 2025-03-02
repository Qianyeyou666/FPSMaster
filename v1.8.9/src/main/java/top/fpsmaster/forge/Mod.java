package top.fpsmaster.forge;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import top.fpsmaster.FPSMaster;
import top.fpsmaster.interfaces.ProviderManager;
import top.fpsmaster.interfaces.client.IConstantsProvider;
import top.fpsmaster.interfaces.game.*;
import top.fpsmaster.interfaces.gui.IGuiIngameProvider;
import top.fpsmaster.interfaces.gui.IGuiMainMenuProvider;
import top.fpsmaster.interfaces.packets.IPacketChat;
import top.fpsmaster.interfaces.packets.IPacketPlayerList;
import top.fpsmaster.interfaces.packets.IPacketTimeUpdate;
import top.fpsmaster.interfaces.render.IEffectRendererProvider;
import top.fpsmaster.interfaces.render.IRenderManagerProvider;
import top.fpsmaster.interfaces.sound.ISoundProvider;
import top.fpsmaster.wrapper.*;
import top.fpsmaster.wrapper.packets.SPacketChatProvider;
import top.fpsmaster.wrapper.packets.SPacketPlayerListProvider;
import top.fpsmaster.wrapper.packets.SPacketTimeUpdateProvider;
import top.fpsmaster.wrapper.sound.SoundProvider;

@net.minecraftforge.fml.common.Mod(modid = "fpsmaster", useMetadata=true)
public class Mod {
    @net.minecraftforge.fml.common.Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ForgeEventAPI());

        ProviderManager.constants = new Constants();
        ProviderManager.utilityProvider = new UtilityProvider();
        ProviderManager.mcProvider = new MinecraftProvider();
        ProviderManager.mainmenuProvider = new GuiMainMenuProvider();
        ProviderManager.skinProvider = new SkinProvider();
        ProviderManager.worldClientProvider = new WorldClientProvider();
        ProviderManager.timerProvider = new TimerProvider();
        ProviderManager.renderManagerProvider = new RenderManagerProvider();
        ProviderManager.gameSettings = new GameSettingsProvider();

        // Packets
        ProviderManager.packetChat = new SPacketChatProvider();
        ProviderManager.packetPlayerList = new SPacketPlayerListProvider();
        ProviderManager.packetTimeUpdate = new SPacketTimeUpdateProvider();
        ProviderManager.guiIngameProvider = new GuiIngameProvider();
        ProviderManager.soundProvider = new SoundProvider();
        ProviderManager.effectManager = new EffectRendererProvider();

        FPSMaster.INSTANCE.initialize();
    }
}
