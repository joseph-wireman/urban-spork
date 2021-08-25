package com.idtech.entity;

import com.idtech.BaseMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class ZomboEntity extends ZombieEntity {

    public static EntityType<ZomboEntity> TYPE = (EntityType<ZomboEntity>)EntityType.Builder.create(
            ZomboEntity::new,
            EntityClassification.MONSTER).build("zombo").
            setRegistryName(BaseMod.MODID, "zombo");

    public static Item EGG = EntityUtils.buildEntitySpawnEgg(TYPE, 0xb00101, 0xacbf1f);

    public static AttributeModifierMap.MutableAttribute setupAttributes() {
        return MobEntity.func_233666_p_().func_233815_a_(Attributes.field_233819_b_, 35.0D) //follow range
                .func_233815_a_(Attributes.field_233821_d_, (double) 0.4F) //movement_speed
                .func_233815_a_(Attributes.field_233823_f_, 5.0D) //attack_damage
                .func_233815_a_(Attributes.field_233826_i_, 2.0D) //armor
                .func_233814_a_(Attributes.field_233829_l_); //zombie.spawnreinforcements (this is required because of the super class )
    }



    public ZomboEntity(World worldIn) {super(TYPE, worldIn);}
    public ZomboEntity(EntityType type, World worldIn) {super(type, worldIn);}


    @Override
    public void registerGoals() {
        this.targetSelector.addGoal(0, new SwimGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, SkeletonEntity.class, false));
        this.targetSelector.addGoal(2, new MeleeAttackGoal(this, 2,false));

    }


}
