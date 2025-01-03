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
    public static final RegistryKey<ItemGroup> AT_Materials = register("at_materials");
    public static final RegistryKey<ItemGroup> AT_Building_Blocks = register("at_building_blocks");
    public static final RegistryKey<ItemGroup> AT_Tools_Armors = register("at_tools_armors");
    public static final RegistryKey<ItemGroup> AT_Food = register("at_food");
    
    private static RegistryKey<ItemGroup> register(String id) 
    {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(AzureTraveller.MOD_ID, id));
    }
    
    public static void registerModItemGroup()
    {
        Registry.register(Registries.ITEM_GROUP, AT_Materials, 
                ItemGroup.create(null, -3)
                        .displayName(Text.translatable("itemGroup.at_materials"))
                        .icon(() -> new ItemStack(ModItems.MYTHRIL_INGOT))
                        .entries((displayContext, entries) -> 
                         {
                             entries.add(ModItems.RAW_SILVER);
                             entries.add(ModItems.RAW_MYTHRIL);
                             entries.add(ModItems.RAW_CELESTITE);
                             entries.add(ModItems.SILVER_INGOT);
                             entries.add(ModItems.OBSIDIAN_INGOT);
                             entries.add(ModItems.MYTHRIL_INGOT);
                             entries.add(ModItems.CELESTITE_INGOT);
                         }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Building_Blocks,
                ItemGroup.create(null, -4)
                        .displayName(Text.translatable("itemGroup.at_building_blocks"))
                        .icon(() -> new ItemStack(ModBlocks.CELESTITE_BLOCK))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(ModBlocks.CELESTE_LOG);
                            entries.add(ModBlocks.CELESTE_WOOD);
                            entries.add(ModBlocks.CELESTE_PLANKS);
                            
                            entries.add(ModBlocks.SILVER_ORE);
                            entries.add(ModBlocks.MYTHRIL_ORE);
                            entries.add(ModBlocks.CELESTITE_ORE);
                            entries.add(ModBlocks.SILVER_BLOCK);
                            entries.add(ModBlocks.MYTHRIL_BLOCK);
                            entries.add(ModBlocks.CELESTITE_BLOCK);
                            entries.add(ModBlocks.RAW_SILVER_BLOCK);
                            entries.add(ModBlocks.RAW_MYTHRIL_BLOCK);
                            
                            entries.add(ModBlocks.MYTHRIL_SLAB);
                            entries.add(ModBlocks.MYTHRIL_STAIRS);
                            entries.add(ModBlocks.MYTHRIL_FENCE);
                            entries.add(ModBlocks.MYTHRIL_FENCE_GATE);
                            entries.add(ModBlocks.MYTHRIL_WALL);
                            entries.add(ModBlocks.MYTHRIL_BUTTON);
                            entries.add(ModBlocks.MYTHRIL_PRESSURE_PLATE);
                            entries.add(ModBlocks.MYTHRIL_DOOR);
                            entries.add(ModBlocks.MYTHRIL_TRAPDOOR);
                        }
                )
                .build()
        );
        
        Registry.register(Registries.ITEM_GROUP, AT_Tools_Armors,
                ItemGroup.create(null, -2)
                        .displayName(Text.translatable("itemGroup.at_tools_armors"))
                        .icon(() -> new ItemStack(ModItems.MYTHRIL_PICKAXE))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(ModItems.OBSIDIAN_SWORD);
                            entries.add(ModItems.OBSIDIAN_PICKAXE);
                            entries.add(ModItems.OBSIDIAN_AXE);
                            entries.add(ModItems.OBSIDIAN_SHOVEL);
                            entries.add(ModItems.OBSIDIAN_HOE);
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
        
        Registry.register(Registries.ITEM_GROUP, AT_Food, 
                ItemGroup.create(null, -1)
                        .displayName(Text.translatable("itemGroup.at_food"))
                        .icon(() -> new ItemStack(ModItems.STRAWBERRY))
                        .entries((displayContext, entries) ->
                        {
                            entries.add(ModItems.BLUEBERRY);
                            entries.add(ModItems.STRAWBERRY);
                            entries.add(ModItems.LUCKY_APPLE);
                        }
                )
                .build()
        );
    
        AzureTraveller.LOGGER.info("Registering Item Groups");
        AzureTraveller.LOGGER.info("正在注册物品分类组");
    }
}
