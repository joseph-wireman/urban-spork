package com.idtech.item;

import com.idtech.Utils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LightningHammerItem extends Item {


    //static instance for registration
    private static Properties properties = new Properties().group(ItemGroup.MISC).maxStackSize(1);
    public static Item INSTANCE = new LightningHammerItem(properties).setRegistryName("lightninghammer");
    public LightningHammerItem(Properties properties) {
        super(properties);

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        BlockPos location = Utils.getBlockAtCursor(playerIn, 20.0d, true);
        float explosionRadius = 0.5f;
        if(location != null){
            Utils.createExplosion(worldIn, location, explosionRadius);
            Utils.strikeLightning(worldIn, location);
            return ActionResult.resultSuccess(itemstack);
        } else {
            return ActionResult.resultFail(itemstack);
        }
    }
}