package com.idtech.block;

import com.idtech.BaseMod;
import com.idtech.Utils;
import com.idtech.world.WorldMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class CreeperSurpriseBlock extends Block {
    private static Properties properties = Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE);
    public static Block INSTANCE = new CreeperSurpriseBlock(properties).setRegistryName(BaseMod.MODID, "creeper_surprise_block");
    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE, ItemGroup.MISC);


    public CreeperSurpriseBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityWalk(worldIn,pos,entityIn);

        if (entityIn instanceof LivingEntity) {
            Utils.spawnEntity(worldIn, EntityType.TNT, pos);
        }
    }
}
