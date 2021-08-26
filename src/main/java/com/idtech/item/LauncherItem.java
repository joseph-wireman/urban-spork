package com.idtech.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import java.util.Random;

public class LauncherItem extends Item {
    private static Properties properties = new Properties().group(ItemGroup.MISC).maxStackSize(1);
    public static Item INSTANCE = new LauncherItem(properties).setRegistryName("launcher");



    public LauncherItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand hand) {
        Random rand = new Random();
        int rand_x = rand.nextInt(5)+1;
        int rand_y = rand.nextInt(5)+1;
        int rand_z = rand.nextInt(5)+1;

        if (rand_x % 2 ==0) {
            rand_x = rand_x *-1;
        }
        if (rand_y % 2 ==0) {
            rand_y = rand_y *-1;
        }
        if (rand_z % 2 ==0) {
            rand_z = rand_z *-1;
        }
        ItemStack itemStack = playerIn.getHeldItem(hand);
        playerIn.addVelocity(rand_x,rand_y,rand_z);
        return ActionResult.resultSuccess(itemStack);
    }
}

