package xintao.azuretraveller.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;

public class ModItems 
{
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new Item.Settings()));
    public static final Item RAW_CELESTITE = registerItem("raw_celestite", new Item(new Item.Settings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
    public static final Item CELESTITE_INGOT = registerItem("celestite_ingot", new Item(new Item.Settings()));
    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword", new Item(new Item.Settings()));
    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe", new Item(new Item.Settings()));
    public static final Item MYTHRIL_AXE = registerItem("mythril_axe", new Item(new Item.Settings()));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel", new Item(new Item.Settings()));
    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe", new Item(new Item.Settings()));
    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet", new Item(new Item.Settings()));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate", new Item(new Item.Settings()));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings", new Item(new Item.Settings()));
    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_INGOT = registerItem("obsidian_ingot", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe", new Item(new Item.Settings()));
    
    public static final Item LUCKY_APPLE = registerItem("lucky_apple", new Item(new Item.Settings()
            .food(ModFoodComponents.LUCKY_APPLE)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings()
            .food(ModFoodComponents.STRAWBERRY)));
    public static final Item BLUEBERRY = registerItem("blueberry", new Item(new Item.Settings()
            .food(ModFoodComponents.BLUEBERRY)));
    
    private static Item registerItem(String id, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(AzureTraveller.MOD_ID, id), item);
    }

    public static void registerModItem()
    {
        AzureTraveller.LOGGER.info("Registering Items");
        AzureTraveller.LOGGER.info("正在注册物品");
    }
}