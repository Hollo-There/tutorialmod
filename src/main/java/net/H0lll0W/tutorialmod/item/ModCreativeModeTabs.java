package net.H0lll0W.tutorialmod.item;

import net.H0lll0W.tutorialmod.TutorialMod;
import net.H0lll0W.tutorialmod.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RANDOM_TAB = CREATIVE_MODE_TABS.register("random_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRICK2048_128.get()))
                    .title(Component.translatable("creativetab.random_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.BRICK2048_128.get());
                        pOutput.accept(ModItems.BRICK2048_128.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(ModItems.TOMATO.get());
                        pOutput.accept(ModItems.CHILI.get());
                        pOutput.accept(ModItems.CORN.get());
                        pOutput.accept(ModItems.LENTILS.get());
                        pOutput.accept(ModItems.AVOCADO.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.PINEAPPLE.get());
                        pOutput.accept(ModItems.BLUEBERRY.get());
                        pOutput.accept(ModItems.PEPPER.get());

                        pOutput.accept(ModItems.GASOLINE.get());
                        pOutput.accept(ModItems.KEROSENE.get());
                        pOutput.accept(ModItems.NATURAL_GAS.get());

                        pOutput.accept(Items.GLOW_INK_SAC);

                        pOutput.accept(ModBlocks.HAPPY_BLOCK.get());
                        pOutput.accept(ModBlocks.TRIBAL_DRUM.get());

                        pOutput.accept(ModBlocks.IRIDIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get());
                        pOutput.accept(ModItems.UNREFINED_IRIDIUM.get());
                        pOutput.accept(ModItems.REFINED_IRIDIUM.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
