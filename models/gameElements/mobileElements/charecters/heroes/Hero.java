package org.example.rpg.models.gameElements.mobileElements.charecters.heroes;

import org.example.rpg.models.gameElements.mobileElements.charecters.Character;
import org.example.rpg.models.inventory.Inventory;

public abstract class Hero extends Character implements IHero {
    protected Hero(String name, int baseStr, int baseSta) {
        super(name, baseStr, baseSta);
    }

    @Override
    public Inventory getInventory() {
        return this.inventory;
    }

    @Override
    public void loot(Inventory inventory) {
        this.inventory.add(inventory);
    }

    @Override
    public void rest() {
        this.setCurrentLp(this.getMaxLp());
    }
}
