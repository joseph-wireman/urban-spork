package com.idtech.block;

import com.idtech.item.ItemUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BlockMod {

    //Basic Block

    public static final Block CASTLE_WALL = BlockUtils.createBasicBlock("castlewall", Material.ROCK, 0.5f, 0.9f, ToolType.PICKAXE);
    public static final Item CASTLE_WALL_ITEM = BlockUtils.createBlockItem(CASTLE_WALL, ItemGroup.MISC);

    public static final Block GEL_ORE_BLOCK = BlockUtils.createBasicBlock("geloreblock", Material.ROCK, 0.5f, 0.6f, ToolType.PICKAXE);
    public static final Item GEL_ORE_BLOCK_ITEM = BlockUtils.createBlockItem(GEL_ORE_BLOCK, ItemGroup.MISC);

    public static final Block PLASTIC_BLOCK = BlockUtils.createBasicBlock("plasticblock", Material.ROCK, 0.5f, 0.9f, ToolType.PICKAXE);
    public static final Item PLASTIC_BLOCK_ITEM = BlockUtils.createBlockItem(PLASTIC_BLOCK, ItemGroup.MISC);

    public static final Block RUBBER_BLOCKX = BlockUtils.createBasicBlock("rubberblockx", Material.ROCK, .5f, 12.0f, ToolType.AXE);
    public static final Item RUBBER_BLOCKX_ITEM =BlockUtils.createBlockItem(RUBBER_BLOCKX, ItemGroup.MISC);

    public static final Block FOOD_BLOCK = BlockUtils.createBasicBlock("foodblock", Material.PISTON, .5f, 12.0f, ToolType.SHOVEL);
    public static final Item FOOD_BLOCK_ITEM = BlockUtils.createBlockItem(FOOD_BLOCK, ItemGroup.MISC);

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(FOOD_BLOCK_ITEM);

        event.getRegistry().register(GEL_ORE_BLOCK_ITEM);
        event.getRegistry().register(CASTLE_WALL_ITEM);
        event.getRegistry().register(RubberBlock.ITEM);
        event.getRegistry().register(CreeperSurpriseBlock.ITEM);
        event.getRegistry().register(CreepingMoldBlock.ITEM);
        event.getRegistry().register(PLASTIC_BLOCK_ITEM);
        event.getRegistry().register(RUBBER_BLOCKX_ITEM);
        event.getRegistry().register(ExperienceSpawnerBlock.ITEM);



    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(FOOD_BLOCK);

        event.getRegistry().register(GEL_ORE_BLOCK);
        event.getRegistry().register(RubberBlock.INSTANCE);
        event.getRegistry().register(CreeperSurpriseBlock.INSTANCE);
        event.getRegistry().register(CASTLE_WALL);
        event.getRegistry().register(CreepingMoldBlock.INSTANCE);
        event.getRegistry().register(PLASTIC_BLOCK);
        event.getRegistry().register(RUBBER_BLOCKX);
        event.getRegistry().register(ExperienceSpawnerBlock.INSTANCE);
    }
}























