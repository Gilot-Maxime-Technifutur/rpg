package org.example.rpg.models.gameElements.interactiveElement;

import org.example.rpg.models.gameElements.Element;

public abstract class InteractiveElement extends Element implements IInteractiveElement {
    private boolean state = false;

    @Override
    public boolean getState() {
        return this.state;
    }

    @Override
    public void action() {
        this.state = !this.state;
    }
}
