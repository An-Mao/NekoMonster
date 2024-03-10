package anmao.mc.nm.network;

import anmao.mc.amlib.amlib.network.easy_net.EasyNet;
import anmao.mc.nm.gui.MusicGui;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class MusicGuiNet extends EasyNet {
    @Override
    public void server(Supplier<NetworkEvent.Context> contextSupplier, CompoundTag dat) {
        super.server(contextSupplier, dat);
    }

    @Override
    public void client(Supplier<NetworkEvent.Context> contextSupplier, CompoundTag dat) {
        MusicGui.handle(dat);
        super.client(contextSupplier, dat);
    }
}
