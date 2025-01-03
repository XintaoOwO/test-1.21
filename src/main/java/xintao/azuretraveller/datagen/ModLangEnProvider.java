package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.ModBlocks;
import xintao.azuretraveller.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLangEnProvider extends FabricLanguageProvider
{
    public ModLangEnProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder)
    {
        translationBuilder.add("itemGroup.at_building_blocks", "Azure Traveller Building Blocks");
        translationBuilder.add("itemGroup.at_materials", "Azure Traveller Materials");
        translationBuilder.add("itemGroup.at_tools_armors", "Azure Traveller Tools & Armors");
        translationBuilder.add("itemGroup.at_food", "Azure Traveller Food");
        
        translationBuilder.add(ModItems.SILVER_INGOT, "Silver Ingot");
        translationBuilder.add(ModItems.MYTHRIL_INGOT, "Mythril Ingot");
        translationBuilder.add(ModItems.CELESTITE_INGOT, "Celestite Ingot");
        translationBuilder.add(ModItems.RAW_SILVER, "Raw Silver");
        translationBuilder.add(ModItems.RAW_MYTHRIL, "Raw Mythril");
        translationBuilder.add(ModItems.RAW_CELESTITE, "Raw Celestite");
        translationBuilder.add(ModItems.MYTHRIL_SWORD, "Mythril Sword");
        translationBuilder.add(ModItems.MYTHRIL_PICKAXE, "Mythril Pickaxe");
        translationBuilder.add(ModItems.MYTHRIL_AXE, "Mythril Axe");
        translationBuilder.add(ModItems.MYTHRIL_SHOVEL, "Mythril Shovel");
        translationBuilder.add(ModItems.MYTHRIL_HOE, "Mythril Hoe");
        translationBuilder.add(ModItems.MYTHRIL_HELMET, "Mythril Helmet");
        translationBuilder.add(ModItems.MYTHRIL_CHESTPLATE, "Mythril Chestplate");
        translationBuilder.add(ModItems.MYTHRIL_LEGGINGS, "Mythril Leggings");
        translationBuilder.add(ModItems.MYTHRIL_BOOTS, "Mythril Boots");
        translationBuilder.add(ModItems.OBSIDIAN_INGOT, "Obsidian Ingot");
        translationBuilder.add(ModItems.OBSIDIAN_SWORD, "Obsidian Sword");
        translationBuilder.add(ModItems.OBSIDIAN_PICKAXE, "Obsidian Pickaxe");
        translationBuilder.add(ModItems.OBSIDIAN_AXE, "Obsidian Axe");
        translationBuilder.add(ModItems.OBSIDIAN_SHOVEL, "Obsidian Shovel");
        translationBuilder.add(ModItems.OBSIDIAN_HOE, "Obsidian Hoe");
        translationBuilder.add(ModItems.BLUEBERRY, "blueberry");
        translationBuilder.add(ModItems.STRAWBERRY, "strawberry");
        translationBuilder.add(ModItems.LUCKY_APPLE, "lucky_apple");
        
        translationBuilder.add(ModBlocks.SILVER_ORE, "Silver Ore");
        translationBuilder.add(ModBlocks.SILVER_BLOCK, "Silver Block");
        translationBuilder.add(ModBlocks.RAW_SILVER_BLOCK, "Raw Silver Block");
        translationBuilder.add(ModBlocks.MYTHRIL_ORE, "Mythril Ore");
        translationBuilder.add(ModBlocks.MYTHRIL_BLOCK, "Mythril Block");
        translationBuilder.add(ModBlocks.RAW_MYTHRIL_BLOCK, "Raw Mythril Block");
        translationBuilder.add(ModBlocks.CELESTITE_ORE, "Celestite Ore");
        translationBuilder.add(ModBlocks.CELESTITE_BLOCK, "Celestite Block");
        translationBuilder.add(ModBlocks.CELESTE_LOG, "Celeste Log");
        translationBuilder.add(ModBlocks.CELESTE_WOOD, "Celeste Wood");
        translationBuilder.add(ModBlocks.CELESTE_PLANKS, "Celeste Planks");
        translationBuilder.add(ModBlocks.MYTHRIL_SLAB, "Mythril Slab");
        translationBuilder.add(ModBlocks.MYTHRIL_STAIRS, "Mythril Stairs");
        translationBuilder.add(ModBlocks.MYTHRIL_FENCE, "Mythril Fence");
        translationBuilder.add(ModBlocks.MYTHRIL_WALL, "Mythril Wall");
        translationBuilder.add(ModBlocks.MYTHRIL_BUTTON, "Mythril Button");
        translationBuilder.add(ModBlocks.MYTHRIL_PRESSURE_PLATE, "Mythril Pressure Plate");
        translationBuilder.add(ModBlocks.MYTHRIL_DOOR, "Mythril Door");
        translationBuilder.add(ModBlocks.MYTHRIL_TRAPDOOR, "Mythril Trapdoor");
    }
}
