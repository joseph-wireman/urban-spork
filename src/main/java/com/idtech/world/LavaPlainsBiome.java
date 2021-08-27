package com.idtech.world;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class LavaPlainsBiome extends Biome {
    public static Biome INSTANCE = new LavaPlainsBiome(new Builder()
    .surfaceBuilder(SurfaceBuilder.NETHER, new SurfaceBuilderConfig(Blocks.LAVA.getDefaultState(), Blocks.OBSIDIAN.getDefaultState(), Blocks.COBBLESTONE.getDefaultState()))
    .precipitation(RainType.NONE)
    .category(Category.DESERT)
    .depth(.9f)
    .scale(1f)
    .temperature(2f)
    .downfall(0f)
    .func_235097_a_((new BiomeAmbience.Builder()).func_235246_b_(4159204).func_235248_c_(329011).func_235239_a_(12638463).func_235243_a_(MoodSoundAmbience.field_235027_b_).func_235238_a_()).parent((String) null)
    ).setRegistryName("lavaplains");

    protected LavaPlainsBiome(Builder biomeBuilder) {
        super(biomeBuilder);
        DefaultBiomeFeatures.addDesertFeatures(this);
    }
}
