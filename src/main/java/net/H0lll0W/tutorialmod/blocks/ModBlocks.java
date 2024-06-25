package net.H0lll0W.tutorialmod.blocks;

import net.H0lll0W.tutorialmod.TutorialMod;
import net.H0lll0W.tutorialmod.blocks.custom.TribalDrum;
import net.H0lll0W.tutorialmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static  final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> HAPPY_BLOCK = registerBlock("happy_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> IRIDIUM_ORE = registerBlock("iridium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3.0f).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> DEEPSLATE_IRIDIUM_ORE = registerBlock("deepslate_iridium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .strength(4.5f).requiresCorrectToolForDrops(), UniformInt.of(6, 10)));
    public static final RegistryObject<Block> TRIBAL_DRUM = registerBlock("tribal_drum",
            () -> new TribalDrum(BlockBehaviour.Properties.copy(Blocks.NOTE_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBLockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBLockItem (String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
