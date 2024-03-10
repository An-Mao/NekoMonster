package anmao.mc.nm;

import anmao.mc.nm.network.NetReg;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NM.MOD_ID)
public class NM
{
    public static final String MOD_ID = "nm";

    public NM()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        NetReg.reg(modEventBus);
    }
}
