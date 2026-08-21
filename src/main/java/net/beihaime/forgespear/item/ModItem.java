package net.beihaime.forgespear.item;

import net.beihaime.forgespear.ForgeSpear;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ForgeSpear.MOD_ID);

    public static final RegistryObject<Item> WOODEN_SPEAR =
            ITEMS.register("wooden_spear",
                    () -> new SpearItem(new Item.Properties()));

    public static final RegistryObject<Item> STONE_SPEAR =
            ITEMS.register("stone_spear",
                    () -> new SpearItem(new Item.Properties()));

    public static final RegistryObject<Item> IRON_SPEAR =
            ITEMS.register("iron_spear",
                    () -> new SpearItem(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_SPEAR =
            ITEMS.register("golden_spear",
                    () -> new SpearItem(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_SPEAR =
            ITEMS.register("copper_spear",
                    () -> new SpearItem(new Item.Properties()));


    public static final RegistryObject<Item> DIAMOND_SPEAR =
            ITEMS.register("diamond_spear",
                    () -> new SpearItem(new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_SPEAR =
            ITEMS.register("netherite_spear",
                    () -> new SpearItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
