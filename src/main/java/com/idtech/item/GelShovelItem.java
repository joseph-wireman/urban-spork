package com.idtech.item;

import com.idtech.BaseMod;
import com.idtech.Utils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GelShovelItem extends ShovelItem {

    public static IItemTier tier = ItemUtils.buildItemTier(1, 2500, 2, 2f, 6, "examplemod:tape");
    public static Item INSTANCE = new GelShovelItem(tier, 2, 3f, new Properties().group(ItemGroup.MISC)).setRegistryName(BaseMod.MODID,"gelshovel");


    public GelShovelItem(IItemTier tier, int attackDamageIn, float attackSpeed, Item.Properties builder) {
        super(tier, attackDamageIn, attackSpeed, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity player, Hand handIn) {
        ItemStack itemStack = player.getHeldItem(handIn);
        BlockPos location = Utils.getBlockAtCursor(player, 1000, true);
        float explosionRadius = 20f;
        if (location != null) {
            Utils.createExplosion(worldIn,location, explosionRadius);
            Utils.strikeLightning(worldIn, location);
            return ActionResult.resultSuccess(itemStack);
        } else {
            return ActionResult.resultFail(itemStack);
        }



    }
}
