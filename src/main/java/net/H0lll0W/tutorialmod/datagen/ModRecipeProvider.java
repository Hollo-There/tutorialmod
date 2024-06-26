package net.H0lll0W.tutorialmod.datagen;

import net.H0lll0W.tutorialmod.TutorialMod;
import net.H0lll0W.tutorialmod.blocks.ModBlocks;
import net.H0lll0W.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    private static final List<ItemLike> IRIDIUM_REFINEABLES = List.of(ModItems.UNREFINED_IRIDIUM.get(),
            ModBlocks.IRIDIUM_ORE.get(),ModBlocks.DEEPSLATE_IRIDIUM_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, IRIDIUM_REFINEABLES, RecipeCategory.MISC,ModItems.REFINED_IRIDIUM.get(), 0.25f,50,"iridium");
        oreSmelting(pWriter, IRIDIUM_REFINEABLES, RecipeCategory.MISC,ModItems.REFINED_IRIDIUM.get(), 0.25f,100,"iridium");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TRIBAL_DRUM.get())
                .pattern("RHR")
                .pattern("BEB")
                .pattern("WWW")
                .define('R', Items.RABBIT_HIDE)
                .define('H', Items.LEATHER)
                .define('B', Items.BONE)
                .define('W', ItemTags.PLANKS)
                .define('E', Items.AIR)
                .unlockedBy(getHasName(ModBlocks.TRIBAL_DRUM.get()), has(ItemTags.PLANKS))
                .save(pWriter);

    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, TutorialMod.MOD_ID+ ":" +getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
