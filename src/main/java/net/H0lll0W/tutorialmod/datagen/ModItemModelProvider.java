package net.H0lll0W.tutorialmod.datagen;

import net.H0lll0W.tutorialmod.TutorialMod;
import net.H0lll0W.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.REFINED_IRIDIUM);
        simpleItem(ModItems.UNREFINED_IRIDIUM);
        simpleItem(ModItems.METAL_DETECTOR);

        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.AVOCADO);
        simpleItem(ModItems.CORN);
        simpleItem(ModItems.CHILI);
        simpleItem(ModItems.LENTILS);
        simpleItem(ModItems.PEPPER);
        simpleItem(ModItems.PINEAPPLE);
        simpleItem(ModItems.BLUEBERRY);
        simpleItem(ModItems.TOMATO);
    }

    private ItemModelBuilder simpleItem (RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TutorialMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
