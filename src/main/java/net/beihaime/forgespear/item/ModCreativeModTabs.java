package net.beihaime.forgespear.item;

import net.beihaime.forgespear.ForgeSpear;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS  =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForgeSpear.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SPEAR_TAB = CREATIVE_MOD_TABS.register("forgespear",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPEAR.get()))
                    .title(Component.translatable("creativetab.forgespear"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SPEAR.get());
                    })
                    .build() );
    public static void register(IEventBus modEventBus) {
        CREATIVE_MOD_TABS.register(modEventBus);
    }
}
