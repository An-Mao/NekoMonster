package anmao.mc.nm.network;

import anmao.mc.amlib.amlib.network.easy_net.EasyNet;
import anmao.mc.amlib.amlib.network.easy_net.EasyNetRegister;
import anmao.mc.nm.NM;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class NetReg {

    public static final DeferredRegister<EasyNet> EASY_NET = DeferredRegister.create(EasyNetRegister.KEY, NM.MOD_ID);
    public static final RegistryObject<EasyNet> MUSIC_GUI = EASY_NET.register("music_gui",MusicGuiNet::new);
    public static void reg(IEventBus eventBus){
        EASY_NET.register(eventBus);
    }
}
