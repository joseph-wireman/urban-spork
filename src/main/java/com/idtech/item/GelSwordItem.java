package com.idtech.item;


import com.idtech.BaseMod;
import com.idtech.Utils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class GelSwordItem extends SwordItem {
    public static IItemTier tier = ItemUtils.buildItemTier(0,2500, 0, 10F, 10, "minecraft.diamond");
    public static Item INSTANCE = new GelSwordItem(tier, 50, 100, new Properties().group(ItemGroup.TOOLS)).setRegistryName(BaseMod.MODID,"gelsword");

    public GelSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        ItemStack itemstack = playerIn.getHeldItem(handIn);
        BlockPos location = Utils.getBlockAtCursor(playerIn, 1000, true);
        float explosionRadius = 2000.0f;
        if(location != null){
            Utils.createExplosion(worldIn, location, 2000);
            Utils.strikeLightning(worldIn, location);
            return ActionResult.resultSuccess(itemstack);
        } else {
            return ActionResult.resultFail(itemstack);
        }
    }
}
