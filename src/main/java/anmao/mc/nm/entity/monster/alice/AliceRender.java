package anmao.mc.nm.entity.monster.alice;

import anmao.mc.nm.NM;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AliceRender extends MobRenderer<Alice,AliceModel<Alice>> {
    public AliceRender(EntityRendererProvider.Context pContext) {
        super(pContext, new AliceModel<>(pContext.bakeLayer(AliceModelLayers.ALICE_LAYER)), 0.3F);
        this.addLayer(new AliceLayer<>(this,pContext.getModelSet()));
    }


    @Override
    public ResourceLocation getTextureLocation(Alice pEntity) {
        return new ResourceLocation(NM.MOD_ID,"textures/entity/alice.png");
    }

    @Override
    public void render(Alice pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
