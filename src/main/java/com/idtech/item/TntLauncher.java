package com.idtech.item;

import com.idtech.Utils;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TntLauncher extends Item {

    private static Properties properties = new Properties().group(ItemGroup.MISC).maxStackSize(1);
    public static Item INSTANCE = new TntLauncher(properties).setRegistryName("tntlauncher");



    public TntLauncher(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand hand) {
        ItemStack itemstack = playerIn.getHeldItem(hand);
        BlockPos pos = Utils.getBlockAtCursor(playerIn, 1000, true);

        Utils.spawnEntity(worldIn, EntityType.TNT,  pos);
        return ActionResult.resultSuccess(itemstack);
    }
}
