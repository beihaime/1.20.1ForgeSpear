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
                    () -> new SpearItem(59, 0, Tiers.WOOD, -2.46F,new Item.Properties()));

    public static final RegistryObject<Item> STONE_SPEAR =
            ITEMS.register("stone_spear",
                    () -> new SpearItem(131, 0, Tiers.STONE, -2.67F,new Item.Properties()));

    public static final RegistryObject<Item> IRON_SPEAR =
            ITEMS.register("iron_spear",
                    () -> new SpearItem(250, 0, Tiers.IRON, -2.95F, new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_SPEAR =
            ITEMS.register("golden_spear",
                    () -> new SpearItem(32, 0, Tiers.GOLD, -2.95F, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_SPEAR =
            ITEMS.register("copper_spear",
                    () -> new SpearItem(190,0,Tiers.STONE,-2.82F,new Item.Properties()));


    public static final RegistryObject<Item> DIAMOND_SPEAR =
            ITEMS.register("diamond_spear",
                    () -> new SpearItem(1561, 0, Tiers.DIAMOND, -3.05F, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_SPEAR =
            ITEMS.register("netherite_spear",
                    () -> new SpearItem(2031, 0, Tiers.NETHERITE, -3.13F, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
