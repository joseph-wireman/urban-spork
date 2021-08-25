package com.idtech.item;

import com.idtech.BaseMod;
import com.idtech.Utils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;

public class ZooSworditem extends SwordItem {

    private static Properties properties = new Properties().group(ItemGroup.MISC);
    public static IItemTier tier = ItemUtils.buildItemTier(3, 1561, 2.0f, 2.0f, 2, "minecraft:steak");

    public static Item INSTANCE = new ZooSworditem(tier, 2, 1, properties).setRegistryName(BaseMod.MODID, "zoosword");

    public ZooSworditem(IItemTier tier, int speed, float damage, Properties properties) {
        super(tier, speed, damage, properties);
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        BlockPos block = target.func_233580_cy_();

        int size = 5;

        EntityType animals[] = new EntityType[size];

        animals[0] = EntityType.SNOW_GOLEM;
        animals[1] = EntityType.ENDER_DRAGON;
        animals[2] = EntityType.LIGHTNING_BOLT;
        animals[3] = EntityType.POLAR_BEAR;
        animals[4] = EntityType.HORSE;

        int rand = attacker.world.rand.nextInt(4);
        EntityType animalToSpawn = animals[rand];

        if (block != null) {
            Utils.spawnEntity(attacker.world, animalToSpawn, block);
        }

        return super.hitEntity(stack,target,attacker);

    }

}

