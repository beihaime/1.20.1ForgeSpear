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

    private static SwordItem spear(
            int durability,
            int attackDamage,
            float attackSpeed,
            Tier tier
    ) {
        return new SwordItem(
                tier,
                attackDamage,
                attackSpeed,
                new Item.Properties().durability(durability)
        );
    }

    public static final RegistryObject<Item> WOODEN_SPEAR =
            ITEMS.register("wooden_spear",
                    () -> spear(59, 1, -2.46F, Tiers.WOOD));

    public static final RegistryObject<Item> STONE_SPEAR =
            ITEMS.register("stone_spear",
                    () -> spear(131, 2, -2.67F, Tiers.STONE));

    public static final RegistryObject<Item> IRON_SPEAR =
            ITEMS.register("iron_spear",
                    () -> spear(250, 3, -2.95F, Tiers.IRON));

    public static final RegistryObject<Item> GOLDEN_SPEAR =
            ITEMS.register("golden_spear",
                    () -> spear(32, 1, -2.95F, Tiers.GOLD));

    public static final RegistryObject<Item> DIAMOND_SPEAR =
            ITEMS.register("diamond_spear",
                    () -> spear(1561, 4, -3.05F, Tiers.DIAMOND));

    public static final RegistryObject<Item> NETHERITE_SPEAR =
            ITEMS.register("netherite_spear",
                    () -> spear(2031, 5, -3.13F, Tiers.NETHERITE));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
