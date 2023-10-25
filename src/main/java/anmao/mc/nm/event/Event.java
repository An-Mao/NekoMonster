package anmao.mc.nm.event;

import anmao.mc.nm.NM;
import anmao.mc.nm.entity.monster.Monsters;
import anmao.mc.nm.entity.monster.alice.Alice;
import anmao.mc.nm.entity.monster.test.Test;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NM.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class Event {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(Monsters.TEST.get(), Test.creatAttribute().build());
        event.put(Monsters.ALICE.get(), Alice.creatAttribute().build());
    }
}
