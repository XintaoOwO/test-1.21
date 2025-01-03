package xintao.azuretraveller.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;

public class ModBlockFamilies 
{
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.<Block, BlockFamily>newHashMap();
    
    public static final BlockFamily MYTHRIL = register(ModBlocks.MYTHRIL_BLOCK)
            .slab(ModBlocks.MYTHRIL_SLAB)
            .stairs(ModBlocks.MYTHRIL_STAIRS)
            .fence(ModBlocks.MYTHRIL_FENCE)
            .fenceGate(ModBlocks.MYTHRIL_FENCE_GATE)
            .wall(ModBlocks.MYTHRIL_WALL)
            .button(ModBlocks.MYTHRIL_BUTTON)
            .pressurePlate(ModBlocks.MYTHRIL_PRESSURE_PLATE)
            .door(ModBlocks.MYTHRIL_DOOR)
            .trapdoor(ModBlocks.MYTHRIL_TRAPDOOR)
            .unlockCriterionName("has_mythril_block")
            .build();

    public static BlockFamily.Builder register(Block baseBlock) 
    {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = (BlockFamily)BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) 
        {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } 
        else 
        {
            return builder;
        }
    }

    public static Stream<BlockFamily> getFamilies() 
    {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }
}
