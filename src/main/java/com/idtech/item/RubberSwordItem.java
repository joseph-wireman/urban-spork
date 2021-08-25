package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class RubberSwordItem extends SwordItem {
    public static IItemTier tier = ItemUtils.buildItemTier(0,100,0,10F,10,"examplemod.rubber");
    public static Item INSTANCE = new RubberSwordItem(tier, 50, 100, new Properties().group(ItemGroup.MISC)).setRegistryName(BaseMod.MODID, "rubbersword");

    public RubberSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder){
        super(tier, attackDamageIn,attackSpeedIn, builder);
    }
}
