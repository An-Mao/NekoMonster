package anmao.mc.nm.entity.monster.test;

import anmao.mc.nm.NM;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModelLayers {
    public static final ModelLayerLocation TEST_LAYER = new ModelLayerLocation(
            new ResourceLocation(NM.MOD_ID,"test_layer"),"main"
    );

}
