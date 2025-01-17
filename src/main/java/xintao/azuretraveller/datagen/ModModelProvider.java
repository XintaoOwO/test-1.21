package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ArmorItem;
import xintao.azuretraveller.block.ModBlockFamilies;
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
        ModBlockFamilies.getFamilies()
                .filter(BlockFamily::shouldGenerateModels)
                .forEach(blockFamily ->
                        blockStateModelGenerator.registerCubeAllModelTexturePool(blockFamily.getBaseBlock())
                                .family(blockFamily));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_MYTHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CELESTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CELESTITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CELESTE_WOOD);
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
        
        itemModelGenerator.register(ModItems.MYTHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_HOE, Models.HANDHELD);
        
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MYTHRIL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MYTHRIL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MYTHRIL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MYTHRIL_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OBSIDIAN_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OBSIDIAN_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OBSIDIAN_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OBSIDIAN_BOOTS);
        
        itemModelGenerator.register(ModItems.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_HOE, Models.HANDHELD);
        
        itemModelGenerator.register(ModItems.BLUEBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUCKY_APPLE, Models.GENERATED);
    }
}
