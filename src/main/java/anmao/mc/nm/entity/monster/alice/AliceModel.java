package anmao.mc.nm.entity.monster.alice;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AliceModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	//public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "a"), "main");
	private final ModelPart a;

	public AliceModel(ModelPart root) {
		this.a = root;
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(36, 38).addBox(-2.0F, -24.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg = body.addOrReplaceChild("leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg_l = leg.addOrReplaceChild("leg_l", CubeListBuilder.create(), PartPose.offset(-1.5F, -11.0F, 0.0F));

		PartDefinition cube_r1 = leg_l.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 42).addBox(-1.0F, -5.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition leg_r = leg.addOrReplaceChild("leg_r", CubeListBuilder.create(), PartPose.offset(1.5F, -11.0F, 0.0F));

		PartDefinition cube_r2 = leg_r.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 14).addBox(-1.0F, -5.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.0F, 0.0F, -0.0436F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}
	public static LayerDefinition createClothLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		//PartDefinition cloth = partdefinition.addOrReplaceChild("cloth", CubeListBuilder.create(), PartPose.offset(0.0065F, -14.2714F, 0.0112F));
		//PartDefinition cloth = partdefinition.addOrReplaceChild("cloth", CubeListBuilder.create(), PartPose.offset(0.0F, 0F, 0.0F));
		//PartDefinition cloth = partdefinition.addOrReplaceChild("cloth", CubeListBuilder.create(), PartPose.offset(0.0065F, 9.7286F, 0.0112F));

		PartDefinition cloth = partdefinition.addOrReplaceChild("cloth", CubeListBuilder.create().texOffs(40, 27).addBox(-2.0065F, -5.4786F, -2.0112F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0065F, 9.7286F, 0.0112F));

		PartDefinition cube_r3 = cloth.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 14).addBox(-2.0F, -7.0F, -2.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9935F, 0.2714F, 3.9888F, 0.5236F, 0.1396F, -0.1571F));

		PartDefinition cube_r4 = cloth.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 28).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9935F, 0.2714F, 1.9888F, 0.3491F, 0.0F, -0.3491F));

		PartDefinition cube_r5 = cloth.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 28).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0065F, 0.2714F, 1.9888F, 0.3491F, 0.0F, 0.3491F));

		PartDefinition cube_r6 = cloth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0065F, 0.2714F, -2.0112F, -0.3491F, 0.0F, 0.3491F));

		PartDefinition cube_r7 = cloth.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 14).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9935F, 0.2714F, -2.0112F, -0.3491F, 0.0F, -0.3491F));

		PartDefinition cube_r8 = cloth.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -6.0F, 0.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9903F, 1.2552F, 0.3936F, 0.2618F, 0.1396F, -0.5236F));

		PartDefinition cube_r9 = cloth.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(8, 22).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4023F, 0.3947F, -1.0112F, -2.6505F, -1.2778F, 2.1083F));

		PartDefinition cube_r10 = cloth.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 36).addBox(0.0F, -5.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9935F, -0.7286F, -0.0112F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r11 = cloth.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.924F, -0.6558F, 3.1725F, 0.5627F, 0.2981F, 0.4734F));

		PartDefinition cube_r12 = cloth.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(32, 28).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0065F, -0.7286F, 1.9888F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r13 = cloth.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -6.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0065F, -0.6053F, -3.4201F, -0.6514F, -0.1776F, 0.3638F));

		PartDefinition cube_r14 = cloth.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(16, 14).addBox(-2.0F, -6.0F, 0.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9935F, -0.6053F, -3.4201F, -0.5701F, -0.0049F, -0.2004F));

		PartDefinition cube_r15 = cloth.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0065F, -0.7286F, -2.0112F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r16 = cloth.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, -6.0F, -1.1F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4224F, 0.3349F, 1.628F, 1.5548F, -1.3835F, -0.8869F));

		PartDefinition cube_r17 = cloth.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(8, 8).addBox(0.0F, -6.0F, 0.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1384F, -0.3956F, -2.1579F, -0.1912F, -0.1082F, 0.5959F));

		PartDefinition cube_r18 = cloth.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(40, 0).addBox(-2.0F, -5.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0065F, -0.7286F, -0.0112F, 0.0F, 0.0F, 0.6981F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}
	/*
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		a.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	 */

	@Override
	public ModelPart root() {
		return this.a;
	}
}