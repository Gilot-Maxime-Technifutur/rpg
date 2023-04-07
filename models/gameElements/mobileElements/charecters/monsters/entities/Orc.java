package org.example.rpg.models.gameElements.mobileElements.charecters.monsters.entities;

import org.example.rpg.models.gameElements.mobileElements.charecters.monsters.Monster;
import org.example.rpg.models.inventory.ItemType;
import org.example.rpg.utils.Dice;

public class Orc extends Monster {
    public Orc() {
        super("Orc", 2, 0);
        this.inventory.add(ItemType.GOLD, Dice.d6.roll());
    }
}
