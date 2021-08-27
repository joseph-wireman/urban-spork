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
    public static final Item RUBBER2 = ItemUtils.buildBasicItem("rubber1", ItemGroup.MISC);
    public static final Item STRUCTURE_GEL = ItemUtils.buildBasicItem("structuregel", ItemGroup.MISC);
    public static final Item GEL_ORE = ItemUtils.buildBasicItem("gelore", ItemGroup.FOOD);
    public static final Item BIG_CAKE = ItemUtils.buildBasicItem("bigcake", ItemGroup.MISC);
    public static final Item PLASTIC_ORE = ItemUtils.buildBasicItem("plasticore", ItemGroup.MISC);
    public static final Item PLASTIC_INGOT = ItemUtils.buildBasicItem("plasticingot", ItemGroup.BREWING);
    public static final Item RUBBER = ItemUtils.buildBasicItem("rubber", ItemGroup.MISC);
    public static final Item TAPE = ItemUtils.buildBasicItem("tape", ItemGroup.MISC);

    //FOODS
    public static Food yummyFood = (new Food.Builder()).hunger(5).saturation(1.4f).effect(new EffectInstance(Effects.SPEED, 400, 1), 1.0F).setAlwaysEdible().build();
    public static Item yummyFoodItem = ItemUtils.buildFoodItem("yummyfood", yummyFood);
    public static Food baguette = (new Food.Builder()).hunger(5).saturation(1.4f).effect(new EffectInstance(Effects.JUMP_BOOST, 400, 1), 1.0F).setAlwaysEdible().build();
    public static Item baguetteItem = ItemUtils.buildFoodItem("baguette", baguette);
    public static Food banana = (new Food.Builder()).hunger(20).saturation(12.8f).effect(new EffectInstance(Effects.STRENGTH, 400, 1), 1.0F).effect(new EffectInstance(Effects.STRENGTH, 400, 1), 1.0F).setAlwaysEdible().build();
    public static Item bananasItem = ItemUtils.buildFoodItem("bananas", banana);
    public static Food syrup = (new Food.Builder()).hunger(5).saturation(.6f).setAlwaysEdible().build();
    public static Item syrupItem = ItemUtils.buildFoodItem("syrup", syrup);
    public static Food popcorn = (new Food.Builder()).hunger(10).saturation(.8f).setAlwaysEdible().build();
    public static Item popcornItem = ItemUtils.buildFoodItem("popcorn", popcorn);


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //BASIC ITEMS
        event.getRegistry().register(TAPE);
        event.getRegistry().register(RUBBER);
        event.getRegistry().register(BIG_CAKE);
        event.getRegistry().register(STRUCTURE_GEL);
        event.getRegistry().register(GEL_ORE);
        event.getRegistry().register(TeleportRodItem.INSTANCE);
        event.getRegistry().register(GelPickaxeItem.INSTANCE);
        event.getRegistry().register(GelAxeItem.INSTANCE);
        event.getRegistry().register(LightningHammerItem.INSTANCE);
        event.getRegistry().register(PLASTIC_INGOT);
        event.getRegistry().register(ZooSworditem.INSTANCE);
        event.getRegistry().register(RUBBER2);


        // ITEMS

        // TOOLS
        event.getRegistry().register(GelPickaxeItem.INSTANCE);
        event.getRegistry().register(RubberSwordItem.INSTANCE);
        event.getRegistry().register(GelShovelItem.INSTANCE);
        event.getRegistry().register(GelHoeItem.INSTANCE);
        event.getRegistry().register(LauncherItem.INSTANCE);
        event.getRegistry().register(TntLauncher.INSTANCE);


        // FOOD
        event.getRegistry().register(yummyFoodItem);
        event.getRegistry().register(baguetteItem);
        event.getRegistry().register(bananasItem);
        event.getRegistry().register(syrupItem);
        event.getRegistry().register(GelSwordItem.INSTANCE);
        event.getRegistry().register(popcornItem);


        // ARMOR
        event.getRegistry().register(CustomArmorItem.HELM);
        event.getRegistry().register(CustomArmorItem.BOOTS);
        event.getRegistry().register(CustomArmorItem.TORSO);
        event.getRegistry().register(CustomArmorItem.PANTS);


    }
}
