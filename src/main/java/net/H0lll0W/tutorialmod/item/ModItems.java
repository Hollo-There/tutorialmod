package net.H0lll0W.tutorialmod.item;

import net.H0lll0W.tutorialmod.TutorialMod;
import net.H0lll0W.tutorialmod.item.custom.FuelItem;
import net.H0lll0W.tutorialmod.item.custom.MetalDetectorItem;
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
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> CHILI = ITEMS.register("chili",
            () -> new Item(new Item.Properties().food(ModFoods.CHILI)));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoods.CORN)));
    public static final RegistryObject<Item> LENTILS = ITEMS.register("lentils",
            () -> new Item(new Item.Properties().food(ModFoods.LENTILS)));
    public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper",
            () -> new Item(new Item.Properties().food(ModFoods.PEPPER)));
    public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado",
            () -> new Item(new Item.Properties().food(ModFoods.AVOCADO)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    public static final RegistryObject<Item> PINEAPPLE = ITEMS.register("pineapple",
            () -> new Item(new Item.Properties().food(ModFoods.PINEAPPLE)));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().food(ModFoods.BLUEBERRY)));

    public static final RegistryObject<Item> GASOLINE = ITEMS.register("gasoline",
            () -> new FuelItem(new Item.Properties(), 400));
    public static final RegistryObject<Item> KEROSENE = ITEMS.register("kerosene",
            () -> new FuelItem(new Item.Properties(), 200));
    public static final RegistryObject<Item> NATURAL_GAS = ITEMS.register("natural_gas",
            () -> new FuelItem(new Item.Properties(), 600));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
