package anmao.mc.nm.entity;

import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;

import java.util.EnumSet;

public class DarkAttackGoal extends Goal {
    public DarkAttackGoal(){
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }
    @Override
    public boolean canUse() {
        return false;
    }
}
