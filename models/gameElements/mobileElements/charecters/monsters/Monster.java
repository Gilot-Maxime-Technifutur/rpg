package org.example.rpg.models.gameElements.mobileElements.charecters.monsters;

import org.example.rpg.models.gameElements.mobileElements.charecters.Character;
import org.example.rpg.models.inventory.Inventory;

public abstract class Monster extends Character implements IMonster {
    protected Monster(String name, int baseStr, int baseSta) {
        super(name, baseStr, baseSta);
    }

    @Override
    public Inventory drop() {
        return this.inventory;
    }
}
