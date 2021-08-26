package com.idtech.block;


import com.idtech.BaseMod;
import com.idtech.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class ExperienceSpawnerBlock extends Block {
    private static Properties properties = Properties.create(Material.ANVIL).harvestTool(ToolType.PICKAXE).tickRandomly();

    public static Block INSTANCE = new ExperienceSpawnerBlock(properties).setRegistryName(BaseMod.MODID, "xpblock");

    public static Item ITEM = BlockUtils.createBlockItem(INSTANCE, ItemGroup.MISC);



    public ExperienceSpawnerBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        Utils.spawnEntity(worldIn, EntityType.EXPERIENCE_ORB, pos);
        Utils.spawnEntity(worldIn, EntityType.EXPERIENCE_ORB, pos);
        Utils.spawnEntity(worldIn, EntityType.EXPERIENCE_ORB, pos);
        Utils.spawnEntity(worldIn, EntityType.EXPERIENCE_ORB, pos);
        Utils.spawnEntity(worldIn, EntityType.EXPERIENCE_ORB, pos);
        Utils.spawnEntity(worldIn, EntityType.EXPERIENCE_ORB, pos);
        Utils.spawnEntity(worldIn, EntityType.EXPERIENCE_BOTTLE, pos);
        Utils.spawnEntity(worldIn, EntityType.EXPERIENCE_BOTTLE, pos);
        Utils.spawnEntity(worldIn, EntityType.EXPERIENCE_BOTTLE, pos);


    }
}
