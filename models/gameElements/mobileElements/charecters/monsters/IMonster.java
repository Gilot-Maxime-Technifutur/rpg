package org.example.rpg.models.gameElements.mobileElements.charecters.monsters;

import org.example.rpg.models.gameElements.mobileElements.charecters.ICharacter;
import org.example.rpg.models.inventory.Inventory;

public interface IMonster extends ICharacter {
    Inventory drop();
}
