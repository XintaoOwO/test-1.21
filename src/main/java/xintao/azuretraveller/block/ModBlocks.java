package xintao.azuretraveller.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;

public class ModBlocks 
{
    public static final Block MYTHRIL_BLOCK = register("mythril_block", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block CELESTITE_BLOCK = register("celestite_block", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block SILVER_BLOCK = register("silver_block", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block MYTHRIL_ORE = register("mythril_ore", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block CELESTITE_ORE = register("celestite_ore", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block SILVER_ORE = register("silver_ore", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block RAW_MYTHRIL_BLOCK = register("raw_mythril_block", 
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    public static final Block RAW_SILVER_BLOCK = register("raw_silver_block",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f)));
    // 以下物品未添加.json文件
    public static final Block CELESTE_LOG = register("celeste_log", 
            new Block(AbstractBlock.Settings.create()));
    public static final Block CELESTE_WOOD = register("celeste_wood", 
            new Block(AbstractBlock.Settings.create()));
    public static final Block CELESTE_PLANKS = register("celeste_planks", 
            new Block(AbstractBlock.Settings.create()));
    
    public static void registerBlockItems(String id, Block block)
    {
        Item item = Registry.register(Registries.ITEM, Identifier.of(AzureTraveller.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    
    public static Block register(String id, Block block) 
    {
        registerBlockItems(id, block);
        
        return Registry.register(Registries.BLOCK, Identifier.of(AzureTraveller.MOD_ID, id), block);
    }
    
    public static void registerModBlocks()
    {
        AzureTraveller.LOGGER.info("Registering Blocks");
    }
}
