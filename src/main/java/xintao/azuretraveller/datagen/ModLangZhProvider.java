package xintao.azuretraveller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import xintao.azuretraveller.block.ModBlocks;
import xintao.azuretraveller.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLangZhProvider extends FabricLanguageProvider
{
    public ModLangZhProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) 
    {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) 
    {
        translationBuilder.add("itemGroup.at_building_blocks", "蔚蓝旅行家 建筑方块");
        translationBuilder.add("itemGroup.at_materials", "蔚蓝旅行家 材料");
        translationBuilder.add("itemGroup.at_tools_armors", "蔚蓝旅行家 工具装备");
        
        translationBuilder.add(ModItems.SILVER_INGOT, "银锭");
        translationBuilder.add(ModItems.MYTHRIL_INGOT, "秘银锭");
        translationBuilder.add(ModItems.CELESTITE_INGOT, "天蓝矿锭");
        translationBuilder.add(ModItems.RAW_SILVER, "粗银");
        translationBuilder.add(ModItems.RAW_MYTHRIL, "粗秘银");
        translationBuilder.add(ModItems.RAW_CELESTITE, "天蓝石");
        translationBuilder.add(ModItems.MYTHRIL_SWORD, "秘银剑");
        translationBuilder.add(ModItems.MYTHRIL_PICKAXE, "秘银镐");
        translationBuilder.add(ModItems.MYTHRIL_AXE, "秘银斧");
        translationBuilder.add(ModItems.MYTHRIL_SHOVEL, "秘银锹");
        translationBuilder.add(ModItems.MYTHRIL_HOE, "秘银锄");
        translationBuilder.add(ModItems.MYTHRIL_HELMET, "秘银头盔");
        translationBuilder.add(ModItems.MYTHRIL_CHESTPLATE, "秘银胸甲");
        translationBuilder.add(ModItems.MYTHRIL_LEGGINGS, "秘银护腿");
        translationBuilder.add(ModItems.MYTHRIL_BOOTS, "秘银靴子");
        translationBuilder.add(ModItems.OBSIDIAN_INGOT, "黑曜石锭");
        translationBuilder.add(ModItems.OBSIDIAN_SWORD, "黑曜石剑");
        translationBuilder.add(ModItems.ONSIDIAN_PICKAXE, "黑曜石镐");
        translationBuilder.add(ModItems.OBSIDIAN_AXE, "黑曜石斧");
        translationBuilder.add(ModItems.OBSIDIAN_SHOVEL, "黑曜石锹");
        translationBuilder.add(ModItems.OBSIDIAN_HOE, "黑曜石锄");
        translationBuilder.add(ModItems.BLUEBERRY, "蓝莓");
        translationBuilder.add(ModItems.STRAWBERRY, "草莓");
        translationBuilder.add(ModItems.LUCKY_APPLE, "幸运果");

        translationBuilder.add(ModBlocks.SILVER_ORE, "银矿石");
        translationBuilder.add(ModBlocks.SILVER_BLOCK, "银块");
        translationBuilder.add(ModBlocks.RAW_SILVER_BLOCK, "粗银块");
        translationBuilder.add(ModBlocks.MYTHRIL_ORE, "秘银矿石");
        translationBuilder.add(ModBlocks.MYTHRIL_BLOCK, "秘银块");
        translationBuilder.add(ModBlocks.RAW_MYTHRIL_BLOCK, "粗秘银块");
        translationBuilder.add(ModBlocks.CELESTITE_ORE, "天蓝矿石");
        translationBuilder.add(ModBlocks.CELESTITE_BLOCK, "天蓝矿锭块");
        translationBuilder.add(ModBlocks.CELESTE_LOG, "天蓝木原木");
        translationBuilder.add(ModBlocks.CELESTE_WOOD, "天蓝木");
        translationBuilder.add(ModBlocks.CELESTE_PLANKS, "天蓝木板");
    }
}
