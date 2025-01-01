package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.ModBlocks;
import xintao.azuretraveller.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    private static final List<ItemConvertible> MYTHRIL_INGOT = List.of(ModItems.RAW_MYTHRIL);
    
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) 
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) 
    {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.MYTHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_MYTHRIL, 
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_MYTHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SILVER_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_SILVER,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.CELESTITE_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.CELESTITE_BLOCK);

        //ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, );
        
        
        offerSmelting(exporter, MYTHRIL_INGOT, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 
                0.7f, 200, "mythril_ingot");
        
        offerBlasting(exporter, MYTHRIL_INGOT, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 
                0.7f, 100, "mythril_ingot");
    }
}
