package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import xintao.azuretraveller.item.ModItems;
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
        
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.OBSIDIAN_HELMET)
                .add(ModItems.OBSIDIAN_CHESTPLATE)
                .add(ModItems.OBSIDIAN_LEGGINGS)
                .add(ModItems.OBSIDIAN_BOOTS)
                .add(ModItems.MYTHRIL_HELMET)
                .add(ModItems.MYTHRIL_CHESTPLATE)
                .add(ModItems.MYTHRIL_LEGGINGS)
                .add(ModItems.MYTHRIL_BOOTS);
    }
}
