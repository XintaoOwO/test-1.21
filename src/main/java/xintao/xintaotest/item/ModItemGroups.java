package xintao.xintaotest.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xintao.xintaotest.XintaoTest;

public class ModItemGroups 
{
    public static final RegistryKey<ItemGroup> XintaoTest_Group = register("xintaotest_group");
    
    private static RegistryKey<ItemGroup> register(String id) 
    {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(XintaoTest.MOD_ID, id));
    }
    
    public static void registerModItemGroups()
    {
        Registry.register(Registries.ITEM_GROUP, XintaoTest_Group, 
                ItemGroup.create(null, -1)
                        .displayName(Text.translatable("itemGroup.xintaotest_group"))
                        .icon(() -> new ItemStack(ModItems.MYTHRIL_INGOT))
                        .entries((displayContext, entries) -> 
                            {
                                entries.add(ModItems.MYTHRIL_INGOT);
                                entries.add(ModItems.SILVER_INGOT);
                                entries.add(ModItems.CELESTE_INGOT);
                                entries.add(ModItems.MYTHRIL_SWORD);
                                entries.add(ModItems.MYTHRIL_PICKAXE);
                                entries.add(ModItems.MYTHRIL_AXE);
                                entries.add(ModItems.MYTHRIL_SHOVEL);
                                entries.add(ModItems.MYTHRIL_HOE);
                                entries.add(ModItems.MYTHRIL_HELMET);
                                entries.add(ModItems.MYTHRIL_CHESTPLATE);
                                entries.add(ModItems.MYTHRIL_LEGGINGS);
                                entries.add(ModItems.MYTHRIL_BOOTS);
                                entries.add(ModItems.MYTHRIL_BLOCK);
                                entries.add(ModItems.MYTHRIL_ORE);
                                entries.add(ModItems.RAW_MYTHRIL);
                            }
                        )
                        .build()
        );
        
        XintaoTest.LOGGER.info("Registering Item Groups");
    }
}
