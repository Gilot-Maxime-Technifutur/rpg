package org.example.rpg.models.gameElements;

import lombok.Getter;
import org.example.rpg.models.map.Position;

public abstract class Element implements IElement {
    @Getter
    protected Position pos;
}
