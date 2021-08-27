package com.idtech.entity;

import com.idtech.BaseMod;
import com.idtech.block.ExperienceSpawnerBlock;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.CreeperSwellGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class ExplodingPigEntity extends CreeperEntity {

    public static EntityType<ExplodingPigEntity> TYPE = (EntityType<ExplodingPigEntity>)EntityType.Builder.<ExplodingPigEntity>create(ExplodingPigEntity::new,
            EntityClassification.MONSTER).build("explodingpig").setRegistryName(BaseMod.MODID, "explodingpig");

    public static Item EGG = EntityUtils.buildEntitySpawnEgg(TYPE, 0xde10b5, 0x11d957);

    public ExplodingPigEntity(EntityType<ExplodingPigEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public void registerGoals() {
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new CreeperSwellGoal(this));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false));
    }

    public static AttributeModifierMap.MutableAttribute setupAttributes() {
        return MonsterEntity.func_234295_eP_().func_233815_a_(Attributes.field_233821_d_, 0.25D);
    }

}
