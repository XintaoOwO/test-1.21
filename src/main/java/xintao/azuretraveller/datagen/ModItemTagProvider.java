package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.item.ModItems;
import xintao.azuretraveller.tag.ModBlockTags;
import xintao.azuretraveller.tag.ModItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider 
{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) 
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) 
    {
        getOrCreateTagBuilder(ModItemTags.SUGAR_REFINING_TAG)
                .add(Items.BEETROOT);
        
        getOrCreateTagBuilder(ModItemTags.MINERAL_BASIC_ITEM)
                .add(ModItems.SILVER_INGOT)
                .add(ModItems.MYTHRIL_INGOT)
                .add(ModItems.CELESTITE_INGOT);
    }
}
