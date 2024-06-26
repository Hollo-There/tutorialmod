package net.H0lll0W.tutorialmod.datagen;

import net.H0lll0W.tutorialmod.TutorialMod;
import net.H0lll0W.tutorialmod.blocks.ModBlocks;
import net.H0lll0W.tutorialmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_DETECTED)
                .add(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get())
                .add(ModBlocks.IRIDIUM_ORE.get())
                .add(Blocks.IRON_ORE)
                .add(Blocks.DEEPSLATE_IRON_ORE)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE);
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.IRIDIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.IRIDIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get());
    }
}
