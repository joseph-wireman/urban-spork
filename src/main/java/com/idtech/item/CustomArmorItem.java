package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.SoundEvents;


import javax.annotation.Nullable;

public class CustomArmorItem extends ArmorItem {

    private static IArmorMaterial customMaterial = ItemUtils.buildArmorMaterial("rubber", 22,
            new int[]{10,10,10,10}, 5, SoundEvents.ENTITY_COW_HURT,4.0f,
            .3f, "examplemod:rubber");

    private static Properties properties = new Properties().group(ItemGroup.MISC);

    public CustomArmorItem(IArmorMaterial material, EquipmentSlotType type, Properties properties) {
        super(material, type, properties);
    }
    public static Item HELM = new CustomArmorItem(customMaterial, EquipmentSlotType.HEAD, properties).setRegistryName(BaseMod.MODID, "customhelm");
    public static Item LEGS = new CustomArmorItem(customMaterial, EquipmentSlotType.LEGS, properties).setRegistryName(BaseMod.MODID, "customlegs");
    public static Item CHEST = new CustomArmorItem(customMaterial, EquipmentSlotType.CHEST, properties).setRegistryName(BaseMod.MODID, "customchest");
    public static Item BOOTS = new CustomArmorItem(customMaterial, EquipmentSlotType.FEET, properties).setRegistryName(BaseMod.MODID, "customboots");


    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if (slot==EquipmentSlotType.LEGS){
            return "examplemod:textures/models/armor/custom_armor_layer_2.png";
        } else {
            return "examplemod:textures/models/armor/custom_armor_layer_1.png";
        }

    }
}
