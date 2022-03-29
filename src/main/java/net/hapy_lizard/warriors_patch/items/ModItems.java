package net.happy_lizard.warriors_patch.items;

import net.happy_lizard.warriors_patch.warriors_patch;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, warriors_patch.MOD_ID);

    public static final RegistryObject<Item> ROLL = ITEMS.register("roll",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFood.ROLL)));
    public static final RegistryObject<Item> BAMBOO_NUNCHUCK = ITEMS.register("bamboo_nunchuck",
            () -> new SwordItem(ModTiers.BAMBOO, 0, 2f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BAMBOO_KATANA = ITEMS.register("bamboo_katana",
            () -> new SwordItem(ModTiers.BAMBOO, 2  , -2f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BONEBREAKER = ITEMS.register("bonebreaker",
            () -> new SlownesSwordItem(ModTiers.BONE, 3  , -3.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> WOODEN_SPEAR = ITEMS.register("wooden_spear",
            () -> new SwordItem(Tiers.WOOD, 6  , -3.1f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STONE_SPEAR = ITEMS.register("stone_spear",
            () -> new SwordItem(Tiers.STONE, 7  , -3.1f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> VINE_WHIP = ITEMS.register("vine_whip",
            () -> new PoisonSwordItem(ModTiers.VINE, 4  , -2f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear",
            () -> new SwordItem(Tiers.IRON, 8  , -3.1f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GOLDEN_SPEAR = ITEMS.register("golden_spear",
            () -> new SwordItem(Tiers.GOLD, 7  , -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> PRISMARINE_SPEAR = ITEMS.register("prismarine_spear",
            () -> new SwordItem(ModTiers.PRISMARINE, 9  , -3.1f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear",
            () -> new SwordItem(Tiers.NETHERITE, 5  , -3.1f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> BLESSED_WOOD = ITEMS.register("blessed_wood",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BLESSED_MASK = ITEMS.register("blessed_mask",
            () -> new ArmorItem(ModArmorMaterials.BLESSED_MASK, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
