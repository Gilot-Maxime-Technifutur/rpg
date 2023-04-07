package org.example.rpg.models.gameElements.interactiveElement.entities;

import org.example.rpg.models.gameElements.interactiveElement.InteractiveElement;

public class Switch extends InteractiveElement {
    @Override
    public void action() {
        super.action();
        if (getState()) {
            System.out.println("*OPEN*");
        } else {
            System.out.println("*CLOSE*");
        }
    }
}
