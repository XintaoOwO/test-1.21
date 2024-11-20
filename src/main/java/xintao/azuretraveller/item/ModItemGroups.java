package xintao.azuretraveller.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;
import xintao.azuretraveller.block.ModBlocks;

public class ModItemGroups 
{
    public static final RegistryKey<ItemGroup> AzureTraveller_Materials = register("azuretraveller_materials");
    public static final RegistryKey<ItemGroup> AzureTraveller_Building_Blocks = register("azuretraveller_building_blocks");
    public static final RegistryKey<ItemGroup> AzureTraveller_Tools_Armors = register("azuretraveller_tools_armors");
    
    private static RegistryKey<ItemGroup> register(String id) 
    {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(AzureTraveller.MOD_ID, id));
    }
    
    public static void registerModItemGroups()
    {
        Registry.register(Registries.ITEM_GROUP, AzureTraveller_Materials, 
                ItemGroup.create(null, -2)
                        .displayName(Text.translatable("itemGroup.azuretraveller_materials"))
                        .icon(() -> new ItemStack(ModItems.MYTHRIL_INGOT))
                        .entries((displayContext, entries) -> 
                         {
                             entries.add(ModItems.RAW_SILVER);
                             entries.add(ModItems.RAW_MYTHRIL);
                             entries.add(ModItems.CELESTITE);
                             entries.add(ModItems.SILVER_INGOT);
                             entries.add(ModItems.MYTHRIL_INGOT);
                             entries.add(ModItems.CELESTITE_INGOT);
                         }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AzureTraveller_Building_Blocks,
                ItemGroup.create(null, -3)
                        .displayName(Text.translatable("itemGroup.azuretraveller_building_blocks"))
                        .icon(() -> new ItemStack(ModBlocks.CELESTITE_BLOCK))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(ModBlocks.SILVER_ORE);
                            entries.add(ModBlocks.MYTHRIL_ORE);
                            entries.add(ModBlocks.CELESTITE_ORE);
                            entries.add(ModBlocks.RAW_MYTHRIL_BLOCK);
                            entries.add(ModBlocks.SILVER_BLOCK);
                            entries.add(ModBlocks.MYTHRIL_BLOCK);
                            entries.add(ModBlocks.CELESTITE_BLOCK);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AzureTraveller_Tools_Armors,
                ItemGroup.create(null, -1)
                        .displayName(Text.translatable("itemGroup.azuretraveller_tools_armors"))
                        .icon(() -> new ItemStack(ModItems.MYTHRIL_PICKAXE))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(ModItems.MYTHRIL_SWORD);
                            entries.add(ModItems.MYTHRIL_PICKAXE);
                            entries.add(ModItems.MYTHRIL_AXE);
                            entries.add(ModItems.MYTHRIL_SHOVEL);
                            entries.add(ModItems.MYTHRIL_HOE);
                            entries.add(ModItems.MYTHRIL_HELMET);
                            entries.add(ModItems.MYTHRIL_CHESTPLATE);
                            entries.add(ModItems.MYTHRIL_LEGGINGS);
                            entries.add(ModItems.MYTHRIL_BOOTS);
                        }
                )
                .build()
        );
    
        AzureTraveller.LOGGER.info("Registering Item Groups");
    }
}
