package net.H0lll0W.tutorialmod.item;

import net.H0lll0W.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRICK2048_128 = ITEMS.register("brick2048_128",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNREFINED_IRIDIUM = ITEMS.register("unrefined_iridium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_IRIDIUM = ITEMS.register("refined_iridium",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
