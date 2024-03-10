package anmao.mc.nm.event;

import anmao.mc.nm.NM;
import anmao.mc.nm.gui.MusicGui;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


public class ClientEvent {
    @Mod.EventBusSubscriber(modid = NM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class NMBus {
        @SubscribeEvent
        public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
            event.registerAboveAll(MusicGui.id, MusicGui::render);
        }
    }
    @Mod.EventBusSubscriber(modid = NM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
    public static class ForgeBus{
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event){
            if (MusicGui.run && event.getAction() == InputConstants.PRESS){
                MusicGui.KeyPress(event.getKey());
            }
        }
    }
}
