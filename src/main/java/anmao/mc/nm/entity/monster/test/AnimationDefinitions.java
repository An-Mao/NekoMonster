package anmao.mc.nm.entity.monster.test;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class AnimationDefinitions {

    public static final AnimationDefinition TEST_ATK = AnimationDefinition.Builder.withLength(0.5f)
            .addAnimation("sword",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(-18f, 14f, -25f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(15f, -11f, -35f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("sword",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-122.46f, 52.37f, 12.96f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-117.42f, -44.64f, 59.72f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition TEST_IDLE = AnimationDefinition.Builder.withLength(0.5f).looping()
            .addAnimation("sword",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("sword",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 360f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition TEST_MOVE = AnimationDefinition.Builder.withLength(0.25f).looping()
            .addAnimation("sword",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, -21f, -14f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.posVec(0f, -21f, -14f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("sword",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-90f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.25f, KeyframeAnimations.degreeVec(-90f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
}
