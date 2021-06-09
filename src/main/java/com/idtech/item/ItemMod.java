package com.idtech.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemMod {

    //BASIC ITEMS
    public static final Item STRUCTURE_GEL = ItemUtils.buildBasicItem("structuregel", ItemGroup.MISC);
    public static final Item GEL_ORE = ItemUtils.buildBasicItem("gelore", ItemGroup.MISC);


    //FOODS
    public static Food yummyFood = (new Food.Builder()).hunger(5).saturation(1.4f).effect(new EffectInstance(Effects.SPEED, 400, 1), 1.0F).setAlwaysEdible().build();
    public static Item yummyFoodItem = ItemUtils.buildFoodItem("yummyfood", yummyFood);

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //BASIC ITEMS
        event.getRegistry().register(STRUCTURE_GEL);
        event.getRegistry().register(GEL_ORE);
        event.getRegistry().register(TeleportRodItem.INSTANCE);
        event.getRegistry().register(GelPickaxeItem.INSTANCE);

        // ITEMS

        // TOOLS
        event.getRegistry().register(GelPickaxeItem.INSTANCE);


        // FOOD
        event.getRegistry().register(yummyFoodItem);


        // ARMOR

    }
}
