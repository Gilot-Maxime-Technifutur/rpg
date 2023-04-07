package org.example.rpg.models.gameElements.mobileElements;

import org.example.rpg.models.gameElements.Element;
import org.example.rpg.models.map.Position;

public abstract class MobileElement extends Element implements IMobileElement {
    @Override
    public void setPos(Position pos) {
        this.pos = pos;
    }
}
