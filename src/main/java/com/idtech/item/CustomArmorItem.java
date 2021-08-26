package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.SoundEvents;

import javax.annotation.Nullable;

public class CustomArmorItem extends ArmorItem {

    private static IArmorMaterial customMaterial = ItemUtils.buildArmorMaterial("tape", 2, new int[]{5,5,5,5}, 3,
            SoundEvents.BLOCK_LAVA_AMBIENT, 4f, .3f, "examplemod:tape");



    private static Properties properties = new Properties().group(ItemGroup.COMBAT);

    public static Item HELM = new CustomArmorItem(customMaterial, EquipmentSlotType.HEAD, properties).setRegistryName(BaseMod.MODID, "customhelm");
    public static Item TORSO = new CustomArmorItem(customMaterial,EquipmentSlotType.CHEST, properties).setRegistryName(BaseMod.MODID, "customchest");
    public static Item PANTS = new CustomArmorItem(customMaterial, EquipmentSlotType.LEGS, properties).setRegistryName(BaseMod.MODID, "custompants");
    public static Item BOOTS = new CustomArmorItem(customMaterial, EquipmentSlotType.FEET, properties).setRegistryName(BaseMod.MODID, "customboots");


    public CustomArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties properties) {
        super(material, slot, properties);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if (slot == EquipmentSlotType.LEGS) {
            return "examplemod:textures/models/armor/custom_armor_layer_2.png";
        } else {
            return "examplemod:textures/models/armor/custom_armor_layer_1.png";
        }
    }

}
