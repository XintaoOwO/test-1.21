package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import xintao.azuretraveller.block.ModBlocks;
import xintao.azuretraveller.item.ModItems;

public class ModModelProvider extends FabricModelProvider
{

    public ModModelProvider(FabricDataOutput output) 
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) 
    {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CELESTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CELESTITE_BLOCK);
        
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CELESTE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CELESTE_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CELESTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CELESTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_HOE, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.BLUEBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUCKY_APPLE, Models.GENERATED);
    }
}
