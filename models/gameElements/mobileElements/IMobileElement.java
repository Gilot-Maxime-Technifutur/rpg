package org.example.rpg.models.gameElements.mobileElements;

import org.example.rpg.models.gameElements.IElement;
import org.example.rpg.models.map.Position;

public interface IMobileElement extends IElement {
    void setPos(Position pos);
}
