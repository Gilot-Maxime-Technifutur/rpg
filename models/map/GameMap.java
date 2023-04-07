package org.example.rpg.models.map;

import org.example.rpg.models.gameElements.mobileElements.charecters.monsters.IMonster;
import org.example.rpg.models.gameElements.mobileElements.charecters.monsters.entities.Dragonewt;
import org.example.rpg.models.gameElements.mobileElements.charecters.monsters.entities.Orc;
import org.example.rpg.models.gameElements.mobileElements.charecters.monsters.entities.Wolf;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class GameMap {
    private final int width;
    private final int height;
    private final Map<Position, IMonster> monsters = new HashMap<>();
    private final Cell[][] map;
    private Position pHero;

    public GameMap(int width, int height) {
        this.width = width;
        this.height = height;
        this.map = new Cell[height][width];
        this.initMap();
    }

    public Position insertHero() {
        this.pHero = generateRandomPos();
        Cell cell = this.get(this.pHero);
        cell.changeContent(ContentType.HERO);

        return this.pHero;
    }

    private void initMap() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Cell cell = new Cell();
                cell.changeContent(ContentType.EMPTY);
                this.map[y][x] = cell;
            }
        }
    }

    public Cell get(Position pos) {
        return this.map[pos.getY()][pos.getX()];
    }

    public boolean has(Position pos) {
        if (pos.getX() < 0 || pos.getX() >= this.width) return false;
        return pos.getY() >= 0 && pos.getY() < this.height;
    }

    private Position generateRandomPos() {
        SecureRandom random = new SecureRandom();

        int x = random.nextInt(width + 1);
        int y = random.nextInt(height + 1);

        return new Position(x, y);
    }

    public IMonster getMonster(Position pos) {
        if (!monsters.containsKey(pos)) throw new RuntimeException();

        return monsters.get(pos);
    }

    private void generateMonster(int nbMonster) {
        int generatedMonster = 0;

        while (generatedMonster < nbMonster) {
            Position pos = generateRandomPos();
            Cell cell = this.get(pos);
            if (cell.getCurrentContent() != ContentType.EMPTY) {
                continue;
            }

            SecureRandom random = new SecureRandom();
            int monsterType = random.nextInt(3);
            IMonster monster;
            switch (monsterType) {
                case 0 -> {
                    monster = new Wolf();
                    cell.changeContent(ContentType.WOLF);
                }
                case 1 -> {
                    monster = new Orc();
                    cell.changeContent(ContentType.ORC);
                }
                case 2 -> {
                    monster = new Dragonewt();
                    cell.changeContent(ContentType.DRAGONEWT);
                }
                default -> {
                    throw new RuntimeException();
                }
            }

            monster.setPos(new Position(pos));
            this.monsters.put(monster.getPos(), monster);
            generatedMonster++;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int y = 0; y < height; y++) {
            builder.append("|");
            for (int x = 0; x < width; x++) {
                builder.append(this.map[y][x])
                        .append("|");
            }
            builder.append("\n");
        }

        return builder.toString();

    }
}
