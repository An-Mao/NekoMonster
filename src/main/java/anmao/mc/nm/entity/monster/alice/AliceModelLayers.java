package anmao.mc.nm.entity.monster.alice;

import anmao.mc.nm.NM;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AliceModelLayers {
    public static final ModelLayerLocation ALICE_LAYER = new ModelLayerLocation(
            new ResourceLocation(NM.MOD_ID,"alice"),"main"
    );
    public static final ModelLayerLocation ALICE_OUT_LAYER = new ModelLayerLocation(
            new ResourceLocation(NM.MOD_ID,"alice"),"outer"
    );
}
