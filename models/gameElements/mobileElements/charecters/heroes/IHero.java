package org.example.rpg.models.gameElements.mobileElements.charecters.heroes;

import org.example.rpg.models.gameElements.mobileElements.charecters.ICharacter;
import org.example.rpg.models.inventory.Inventory;

public interface IHero extends ICharacter {
    Inventory getInventory();

    void loot(Inventory inventory);

    void rest();
}
