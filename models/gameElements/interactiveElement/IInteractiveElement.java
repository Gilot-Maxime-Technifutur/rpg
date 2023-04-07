package org.example.rpg.models.gameElements.interactiveElement;

import org.example.rpg.models.gameElements.IElement;

public interface IInteractiveElement extends IElement {
    boolean getState();

    void action();
}
