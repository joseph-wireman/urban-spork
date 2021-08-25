package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.item.*;

public class GelHoeItem extends HoeItem {

    public static IItemTier tier = ItemUtils.buildItemTier(0, 1561, 1.0F, 3.0F, 10, "examplemod:gelore");
    public static Item INSTANCE = new GelPickaxeItem(tier,2, 5, new Properties().group(ItemGroup.TOOLS)).setRegistryName(BaseMod.MODID,"gelhoe");


    public GelHoeItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties properties){
        super(tier, attackDamageIn, attackSpeedIn, properties);

    }
}