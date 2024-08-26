package xintao.xintaotest.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xintao.xintaotest.XintaoTest;

public class ModItems 
{
    public static final Item MYTHRIL_INGOT = registerItems("mythril_ingot", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItems("silver_ingot", new Item(new Item.Settings()));
    
    private static Item registerItems(String id, Item item)
    {
        //return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(Test.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(XintaoTest.MOD_ID, id), item);
    }
    
    public static void registerModItems()
    {
        XintaoTest.LOGGER.info("Registering Items");
    }
}
