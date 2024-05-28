package net.H0lll0W.tutorialmod.item;

import net.H0lll0W.tutorialmod.TutorialMod;
import net.H0lll0W.tutorialmod.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
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

                        pOutput.accept(Items.GLOW_INK_SAC);

                        pOutput.accept(ModBlocks.HAPPY_BLOCK.get());



                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
