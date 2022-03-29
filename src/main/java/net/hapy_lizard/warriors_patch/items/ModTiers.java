package net.happy_lizard.warriors_patch.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier BAMBOO = new ForgeTier(4, 1200, 0.2f,
            4f, 5, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.BAMBOO));
    public static final ForgeTier BONE = new ForgeTier(4, 1200, 0.3f,
            7f, 3, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.BONE));
    public static final ForgeTier PRISMARINE = new ForgeTier(4, 1200, 0.2f,
            3f, 50, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.PRISMARINE));
    public static final ForgeTier VINE = new ForgeTier(4, 1200, 0f,
            -1f, 50, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.VINE));
}
