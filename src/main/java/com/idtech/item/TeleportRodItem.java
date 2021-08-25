package com.idtech.item;

import com.idtech.Utils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TeleportRodItem extends Item {
    private static Properties properties = new Properties().group(ItemGroup.TOOLS).maxStackSize(1).defaultMaxDamage(10);
    public static Item INSTANCE = new TeleportRodItem(properties).setRegistryName("teleportrod");

    public TeleportRodItem(Properties properties) {super(properties);}

    @Override
    public ActionResult<ItemStack> onItemRightClick (World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getHeldItem(hand);



        //get the block at cursor
        BlockPos pos = Utils.getBlockAtCursor(player, 1000, true);

        if(pos != null) {
            player.setPosition(pos.getX(), pos.getY()+1, pos.getZ());
            itemstack.damageItem(1, player, playerEntity -> playerEntity.sendBreakAnimation(EquipmentSlotType.MAINHAND) );
            return ActionResult.resultSuccess(itemstack);
        } else {
            return ActionResult.resultFail(itemstack);
        }
    }
}
