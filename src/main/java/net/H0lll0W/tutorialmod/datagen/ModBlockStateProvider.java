package net.H0lll0W.tutorialmod.datagen;

import net.H0lll0W.tutorialmod.TutorialMod;
import net.H0lll0W.tutorialmod.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TutorialMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.HAPPY_BLOCK);
        blockWithItem(ModBlocks.IRIDIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_IRIDIUM_ORE);
        blockWithItem(ModBlocks.TRIBAL_DRUM);
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
