package xintao.azuretraveller.item;

import java.util.function.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import xintao.azuretraveller.tag.ModBlockTags;

public enum ModToolMaterials implements ToolMaterial 
{
    OBSIDIAN(ModBlockTags.INCORRECT_FOR_OBSIDIAN_TOOL, 2048, 8.0f, 2.5f, 10,
            () -> Ingredient.ofItems(ModItems.OBSIDIAN_INGOT)), 
    MYTHRIL(ModBlockTags.INCORRECT_FOR_MYTHRIL_TOOL, 1200, 10.0f, 5.0f, 18,
            () -> Ingredient.ofItems(ModItems.MYTHRIL_INGOT));
    
    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) 
    {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() 
    {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() 
    {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() 
    {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() 
    {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() 
    {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() 
    {
        return this.repairIngredient.get();
    }
}
