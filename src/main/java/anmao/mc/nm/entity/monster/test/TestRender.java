package anmao.mc.nm.entity.monster.test;

import anmao.mc.nm.NM;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TestRender extends MobRenderer<Test,TestModel<Test>> {
    public TestRender(EntityRendererProvider.Context pContext) {
        super(pContext, new TestModel<>(pContext.bakeLayer(ModelLayers.TEST_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Test pEntity) {
        return new ResourceLocation(NM.MOD_ID,"textures/entity/test.png");
    }

    @Override
    public void render(Test pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
