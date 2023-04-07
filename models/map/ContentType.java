package org.example.rpg.models.map;

public enum ContentType {
    EMPTY(" "),

    MONSTER("M"),
    DRAGONEWT("D"),
    ORC("O"),
    WOLF("W"),

    HERO("H");

    public String sprite;

    ContentType(String sprite) {
        this.sprite = sprite;
    }
}
