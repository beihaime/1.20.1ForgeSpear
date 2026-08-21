package net.beihaime.forgespear.item;

import net.beihaime.forgespear.ForgeSpear;
import net.beihaime.forgespear.sound.ModSounds;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundEvents;

public class SpearItem extends SwordItem {

    private final int durability;
    private final int attackDamage;

    public SpearItem(int durability, int attackDamage, Tier tier, float attackSpeed,Item.Properties properties) {
        super(tier, attackDamage, attackSpeed,properties.durability(durability));

        this.durability = durability;
        this.attackDamage = attackDamage;

    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getDurability() {
        return durability;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(
            Level pLevel,
            Player pPlayer,
            InteractionHand
                    pUsedHand){
        ItemStack stack = pPlayer.getItemInHand(pUsedHand);
        double x = pPlayer.getX();
        double y = pPlayer.getY();
        double z = pPlayer.getZ();
        SoundEvent spear_use = ModSounds.SPEAR_USE.get();
        SoundEvent spear_wood_use= ModSounds.SPEAR_WOOD_USE.get();
        if (stack.is(ModItem.WOODEN_SPEAR.get())) {
            pPlayer.playSound(
                    spear_wood_use,
                    1.0F,
                    1.0F
            );
        }
        else {
            pPlayer.playSound(
                    spear_use,
                    1.0F,
                    1.0F
            );
        }
        if (!pLevel.isClientSide) {
            String playerName = pPlayer.getName().getString();
            String itemName = stack.getHoverName().getString();


/*
Debugging logs
 */

//            pPlayer.sendSystemMessage(Component.literal(
//                    playerName
//                    + " used "
//                    + itemName
//                    + " at: "
//                    + String.format("%.2f %.2f %.2f", x,y,z)));

        }
        return InteractionResultHolder.success(stack);
    }

}