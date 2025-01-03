package xintao.azuretraveller.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import xintao.azuretraveller.AzureTraveller;

public class ModBlockTags 
{
    public static final TagKey<Block> ORE_LIST = of("ore_list");
    public static final TagKey<Block> MINERAL_STD_BLOCK = of("mineral_std_block");
    
    private static TagKey<Block> of(String id) 
    {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(AzureTraveller.MOD_ID, id));
    }
    
    public static void registerModBlockTag()
    {
        AzureTraveller.LOGGER.info("Registering Block Tags");
    }
}
