package net.beihaime.forgespear.item;

import com.google.common.eventbus.EventBus;
import net.beihaime.forgespear.ForgeSpear;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ForgeSpear.MOD_ID);

    public static final RegistryObject<Item> SPEAR = ITEMS.register("spear",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
