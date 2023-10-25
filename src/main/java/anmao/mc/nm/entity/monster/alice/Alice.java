package anmao.mc.nm.entity.monster.alice;

import anmao.mc.nm.entity.Dark;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class Alice extends Dark {
    public Alice(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public static AttributeSupplier.Builder creatAttribute(){
        return Monster.createMonsterAttributes()
                .add(Attributes.ATTACK_DAMAGE,6)
                .add(Attributes.MAX_HEALTH,36)
                .add(Attributes.ATTACK_KNOCKBACK,0.7)
                .add(Attributes.ARMOR,10)
                .add(Attributes.FOLLOW_RANGE,9)
                .add(Attributes.MOVEMENT_SPEED,2.0F);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0,new FloatGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(8,new LookAtPlayerGoal(this, Player.class,3));
        this.goalSelector.addGoal(8,new RandomLookAroundGoal(this));

        this.targetSelector.addGoal(3,new NearestAttackableTargetGoal<>(this, Villager.class,false));
        this.targetSelector.addGoal(3,new NearestAttackableTargetGoal<>(this, Player.class,true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, false));
    }
}
