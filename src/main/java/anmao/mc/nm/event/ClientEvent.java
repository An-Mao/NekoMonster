package anmao.mc.nm.event;

import anmao.mc.nm.NM;
import anmao.mc.nm.entity.monster.alice.AliceModel;
import anmao.mc.nm.entity.monster.alice.AliceLayer;
import anmao.mc.nm.entity.monster.alice.AliceModelLayers;
import anmao.mc.nm.entity.monster.test.ModelLayers;
import anmao.mc.nm.entity.monster.test.TestModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NM.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class ClientEvent {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModelLayers.TEST_LAYER, TestModel::createBodyLayer);
        event.registerLayerDefinition(AliceModelLayers.ALICE_LAYER, AliceModel::createBodyLayer);
        event.registerLayerDefinition(AliceModelLayers.ALICE_OUT_LAYER, AliceModel::createClothLayer);
    }
}
