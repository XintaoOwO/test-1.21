package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import xintao.azuretraveller.block.ModBlocks;
import xintao.azuretraveller.tag.ModBlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider
{

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MYTHRIL_ORE)
                .add(ModBlocks.MYTHRIL_BLOCK)
                .add(ModBlocks.RAW_MYTHRIL_BLOCK)
                .add(ModBlocks.CELESTITE_ORE)
                .add(ModBlocks.CELESTITE_BLOCK)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.RAW_SILVER_BLOCK);
        
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.RAW_SILVER_BLOCK);
        
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MYTHRIL_ORE)
                .add(ModBlocks.MYTHRIL_BLOCK)
                .add(ModBlocks.RAW_MYTHRIL_BLOCK)
                .add(ModBlocks.CELESTITE_ORE)
                .add(ModBlocks.CELESTITE_BLOCK);
        
        getOrCreateTagBuilder(ModBlockTags.MINERAL_STD_BLOCK)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.MYTHRIL_BLOCK)
                .add(ModBlocks.CELESTITE_BLOCK);
        
        getOrCreateTagBuilder(ModBlockTags.ORE_LIST)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.MYTHRIL_ORE)
                .add(ModBlocks.CELESTITE_ORE);
    }
}
