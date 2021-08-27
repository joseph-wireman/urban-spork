package com.idtech.entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityMod {

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event){
        event.getRegistry().register(ExplodingPigEntity.TYPE);
        GlobalEntityTypeAttributes.put(ExplodingPigEntity.TYPE, ExplodingPigEntity.setupAttributes().func_233813_a_());

        EntityUtils.spawnMobs(ExplodingPigEntity.TYPE, EntityClassification.CREATURE, 100, 1,4);


    }

    @SubscribeEvent
    public static void registerEntityEggs(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(ExplodingPigEntity.EGG);



    }

    public static void entityRenderers(){
        RenderingRegistry.registerEntityRenderingHandler(ExplodingPigEntity.TYPE, ExplodingPigRenderFactory.INSTANCE);


    }

}