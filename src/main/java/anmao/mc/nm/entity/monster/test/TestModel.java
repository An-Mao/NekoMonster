package anmao.mc.nm.entity.monster.test;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import anmao.mc.nm.entity.monster.test.AnimationDefinitions;
import anmao.mc.nm.entity.monster.test.Test;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class TestModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	//public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "test1"), "main");
	private final ModelPart test;
	private final ModelPart head;

	public TestModel(ModelPart root) {
		this.test = root.getChild("test");
		this.head = test.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition test = partdefinition.addOrReplaceChild("test", CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, -35.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition sword = test.addOrReplaceChild("sword", CubeListBuilder.create().texOffs(78, 27).addBox(-2.0F, -11.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 77).addBox(0.0F, -9.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 61).addBox(0.0F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 57).addBox(-2.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 53).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 49).addBox(-2.0F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 45).addBox(0.0F, 3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 41).addBox(-2.0F, 5.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 37).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(70, 17).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(72, 29).addBox(-2.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 22).addBox(-1.0F, 10.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 33).addBox(0.0F, -13.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -27.0F, 15.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition clo = test.addOrReplaceChild("clo", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = clo.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 63).addBox(0.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -25.5F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0F, -9.5F, 0.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -25.5F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 21).addBox(-1.0F, -9.5F, -2.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -25.5F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 42).addBox(-2.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -25.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bone2 = clo.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(62, 61).addBox(0.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 63).addBox(-1.0F, -9.5F, 0.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 63).addBox(-1.0F, -9.5F, -2.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 63).addBox(-2.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bone3 = clo.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(56, 42).addBox(0.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 61).addBox(-1.0F, -9.5F, 0.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 61).addBox(-1.0F, -9.5F, -2.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 61).addBox(-2.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bone4 = clo.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r13 = bone4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 21).addBox(0.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r14 = bone4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 42).addBox(-1.0F, -9.5F, 0.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -9.5F, -2.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(56, 21).addBox(-2.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bone5 = clo.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r17 = bone5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(24, 42).addBox(0.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r18 = bone5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(32, 42).addBox(-1.0F, -9.5F, 0.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 42).addBox(-1.0F, -9.5F, -2.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bone6 = clo.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r21 = bone6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(40, 0).addBox(0.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r22 = bone6.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(8, 40).addBox(-1.0F, -9.5F, 0.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bone6.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(16, 40).addBox(-1.0F, -9.5F, -2.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone6.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(40, 21).addBox(-2.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bone7 = clo.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r25 = bone7.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(24, 21).addBox(0.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r26 = bone7.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -9.5F, 0.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone7.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(32, 21).addBox(-1.0F, -9.5F, -2.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone7.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 40).addBox(-2.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bone9 = clo.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r29 = bone9.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r30 = bone9.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(8, 19).addBox(-1.0F, -9.5F, 0.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 4.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone9.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(16, 19).addBox(-1.0F, -9.5F, -2.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone9.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(24, 0).addBox(-2.0F, -9.5F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition head = test.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -41.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg = test.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(72, 0).addBox(-3.0F, -21.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(70, 63).addBox(1.0F, -21.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRot(netHeadYaw,headPitch,ageInTicks);
		this.animateWalk(AnimationDefinitions.TEST_MOVE,limbSwing,limbSwingAmount,2,2.5f);
		this.animate(((Test)entity).idle,AnimationDefinitions.TEST_IDLE,ageInTicks,1f);
		this.animate(((Test)entity).attack,AnimationDefinitions.TEST_ATK,ageInTicks);
	}
	private void applyHeadRot(float y,float hp,float tick){
		y = Mth.clamp(y,-30,30);
		hp = Mth.clamp(hp,-25,45);
		this.head.yRot = y * (float) (Math.PI/180);
		this.head.xRot = hp * (float) (Math.PI/180);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		test.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return test;
	}
}