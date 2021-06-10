package com.idtech.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityMod {

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event){

        event.getRegistry().register(ZomboEntity.TYPE);
        GlobalEntityTypeAttributes.put(ZomboEntity.TYPE, ZomboEntity.setupAttributes().func_233813_a_());
    }

    @SubscribeEvent
    public static void registerEntityEggs(final RegistryEvent.Register<Item> event){

        event.getRegistry().register(ZomboEntity.EGG);


    }

    public static void entityRenderers(){

        RenderingRegistry.registerEntityRenderingHandler(ZomboEntity.TYPE, ZomboRenderFactory.INSTANCE);

    }

}