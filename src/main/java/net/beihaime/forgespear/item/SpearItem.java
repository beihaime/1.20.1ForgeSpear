package net.beihaime.forgespear.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

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
}