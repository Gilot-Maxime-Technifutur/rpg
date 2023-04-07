package org.example.rpg.models.gameElements.interactiveElement.entities;

import org.example.rpg.models.gameElements.interactiveElement.InteractiveElement;

public class Button extends InteractiveElement {
    @Override
    public void action() {
        super.action();
        System.out.println("*CLICK*");
    }
}
