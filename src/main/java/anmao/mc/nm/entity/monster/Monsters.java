package anmao.mc.nm.entity.monster;

import anmao.mc.nm.NM;
import anmao.mc.nm.entity.monster.alice.Alice;
import anmao.mc.nm.entity.monster.test.Test;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Monsters {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE_REGISTER = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NM.MOD_ID);

    public static final RegistryObject<EntityType<Test>> TEST =ENTITY_TYPE_REGISTER.register("test",()->EntityType.Builder.of(Test::new, MobCategory.MONSTER).sized(1.0f,2.0f).build("test"));

    public static final RegistryObject<EntityType<Alice>> ALICE = ENTITY_TYPE_REGISTER.register("alice",()->EntityType.Builder.of(Alice::new,MobCategory.MONSTER).sized(1.0f,2.0f).build("alice"));

    public static void reg(IEventBus eventBus){
        ENTITY_TYPE_REGISTER.register(eventBus);
    }
}
