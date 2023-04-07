package org.example.rpg.models.map;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position position) {
        this.x = position.getX();
        this.y = position.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position cloneX(int y) {
        return new Position(this.x, y);
    }

    public Position cloneY(int x) {
        return new Position(x, this.y);
    }
}

