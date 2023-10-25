package anmao.mc.nm.entity.monster.test;

import anmao.mc.nm.entity.Dark;
import anmao.mc.nm.entity.monster.Monsters;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class Test extends Dark {
    public Test(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public final AnimationState idle = new AnimationState();
    public final AnimationState attack = new AnimationState();
    private int idleTimeout = 0;


    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide()){
            setupAnimation();
        }
    }
    private void setupAnimation(){
        if (this.idleTimeout <= 0){
            this.idleTimeout = this.random.nextInt(40)*80;
            this.idle.start(this.tickCount);
        }else {
            --this.idleTimeout;
        }
    }

    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if (this.getPose() == Pose.STANDING){
            f = Math.min(pPartialTick *6,1);
        }else {
            f = 0;
        }
        this.walkAnimation.update(f,0.2F);
    }

    @Override
    public void onSyncedDataUpdated(EntityDataAccessor<?> pKey) {
        if (DATA_POSE.equals(pKey)) {
            Pose pose = this.getPose();
            if (pose == Pose.SPIN_ATTACK) {
                this.attack.start(this.tickCount);
            } else {
                this.attack.stop();
            }
        }
        super.onSyncedDataUpdated(pKey);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0,new FloatGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(8,new LookAtPlayerGoal(this, Player.class,3));
        this.goalSelector.addGoal(8,new RandomLookAroundGoal(this));

        //this.goalSelector.addGoal(1,new TemptGoal(this,1.2, Ingredient.of(Items.ENCHANTED_GOLDEN_APPLE),false));

        this.targetSelector.addGoal(3,new NearestAttackableTargetGoal<>(this, Villager.class,false));

        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, false));
    }

    public static AttributeSupplier.Builder creatAttribute(){
        return Monster.createMonsterAttributes()
                .add(Attributes.ATTACK_DAMAGE,6)
                .add(Attributes.MAX_HEALTH,36)
                .add(Attributes.ATTACK_KNOCKBACK,0.7)
                .add(Attributes.ARMOR,10)
                .add(Attributes.FOLLOW_RANGE,9)
                .add(Attributes.MOVEMENT_SPEED,0.2);
    }
}
