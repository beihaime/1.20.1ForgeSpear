package net.beihaime.forgespear.sound;

import net.beihaime.forgespear.ForgeSpear;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModSounds {
    public static DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(
            Registries.SOUND_EVENT,
            ForgeSpear.MOD_ID);
    public static final RegistryObject<SoundEvent> SPEAR_WOOD_USE = SOUNDS.register(
            "spear_wood_use",
            () -> SoundEvent.createVariableRangeEvent(
                    new ResourceLocation(
                            ForgeSpear.MOD_ID,
                            "spear_wood_use")));

    public static final RegistryObject<SoundEvent> SPEAR_USE = SOUNDS.register(
            "spear_use",
            () -> SoundEvent.createVariableRangeEvent(
                    new ResourceLocation(
                            ForgeSpear.MOD_ID,
                            "spear_use")
            ));
}
