package xintao.azuretraveller.item;

import net.minecraft.item.*;
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
    public static final Item OBSIDIAN_INGOT = registerItem("obsidian_ingot", new Item(new Item.Settings()));
    
    public static final Item LUCKY_APPLE = registerItem("lucky_apple", new Item(new Item.Settings()
            .food(ModFoodComponents.LUCKY_APPLE)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings()
            .food(ModFoodComponents.STRAWBERRY)));
    public static final Item BLUEBERRY = registerItem("blueberry", new Item(new Item.Settings()
            .food(ModFoodComponents.BLUEBERRY)));

    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword", new SwordItem(ModToolMaterials.MYTHRIL, 
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 
                    3, -2.4f))));
    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe", new PickaxeItem(ModToolMaterials.MYTHRIL, 
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 
                    1.0f, -2.8f))));
    public static final Item MYTHRIL_AXE = registerItem("mythril_axe", new AxeItem(ModToolMaterials.MYTHRIL, 
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 
                    5.0f, -3.0f))));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel", new ShovelItem(ModToolMaterials.MYTHRIL, 
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 
                    1.5f, -3.0f))));
    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe", new HoeItem(ModToolMaterials.MYTHRIL, 
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.MYTHRIL, 
                    -3.0f, 0.0f))));
    
    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet", new ArmorItem(ModArmorMaterials.MYTHRIL, 
            ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25))));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate", new ArmorItem(ModArmorMaterials.MYTHRIL, 
            ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(25))));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings", new ArmorItem(ModArmorMaterials.MYTHRIL, 
            ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(25))));
    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots", new ArmorItem(ModArmorMaterials.MYTHRIL, 
            ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(25))));

    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet", new ArmorItem(ModArmorMaterials.OBSIDIAN,
            ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(30))));
    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate", new ArmorItem(ModArmorMaterials.OBSIDIAN,
            ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(30))));
    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings", new ArmorItem(ModArmorMaterials.OBSIDIAN,
            ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(30))));
    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots", new ArmorItem(ModArmorMaterials.OBSIDIAN,
            ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(30))));
    
    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword", new SwordItem(ModToolMaterials.OBSIDIAN, 
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 
                    3, -2.4f))));
    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe", new PickaxeItem(ModToolMaterials.OBSIDIAN, 
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 
                    1.0f, -2.8f))));
    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe", new AxeItem(ModToolMaterials.OBSIDIAN, 
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 
                    5.0f, -3.0f))));
    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel", new ShovelItem(ModToolMaterials.OBSIDIAN, 
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 
                    1.5f, -3.0f))));
    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe", new HoeItem(ModToolMaterials.OBSIDIAN, 
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 
                    -3.0f, 0.0f))));
    
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