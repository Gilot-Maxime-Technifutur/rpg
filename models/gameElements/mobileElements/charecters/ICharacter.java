package org.example.rpg.models.gameElements.mobileElements.charecters;

import org.example.rpg.models.gameElements.mobileElements.IMobileElement;

public interface ICharacter extends IMobileElement {
    String getName();

    int getStr();

    int getSta();

    int getCurrentLp();

    int getMaxLp();

    void hit(ICharacter character);

    void take(int dmg);
}
