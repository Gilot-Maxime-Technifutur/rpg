package org.example.rpg.models.gameElements.mobileElements.charecters.monsters.entities;

import org.example.rpg.models.gameElements.mobileElements.charecters.monsters.Monster;
import org.example.rpg.models.inventory.ItemType;
import org.example.rpg.utils.Dice;

public class Wolf extends Monster {
    public Wolf() {
        super("Wolf", 0, 0);
        this.inventory.add(ItemType.LEATHER, Dice.d4.roll());
    }
}
