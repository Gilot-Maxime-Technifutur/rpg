package org.example.rpg.models.gameElements.mobileElements.charecters.monsters.entities;

import org.example.rpg.models.gameElements.mobileElements.charecters.monsters.Monster;
import org.example.rpg.models.inventory.ItemType;
import org.example.rpg.utils.Dice;

public class Dragonewt extends Monster {
    public Dragonewt() {
        super("Dragonewt", 1, 1);
        this.inventory.add(ItemType.LEATHER, Dice.d4.roll());
        this.inventory.add(ItemType.GOLD, Dice.d6.roll());
    }
}
