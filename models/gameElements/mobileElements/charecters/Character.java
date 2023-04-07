package org.example.rpg.models.gameElements.mobileElements.charecters;

import lombok.Getter;
import lombok.Setter;
import org.example.rpg.models.gameElements.mobileElements.MobileElement;
import org.example.rpg.models.inventory.Inventory;
import org.example.rpg.utils.Dice;

public abstract class Character extends MobileElement implements ICharacter {
    @Getter
    private final String name;
    @Getter
    private final int str;
    @Getter
    private final int sta;
    protected Inventory inventory = new Inventory();
    @Getter
    @Setter
    private int currentLp;


    protected Character(String name, int baseStr, int baseSta) {
        this.name = name;
        this.str = calculateStat(baseStr);
        this.sta = calculateStat(baseSta);
        this.currentLp = getMaxLp();
    }

    private int calculateStat(int baseStat) {
        return Dice.d6.roll(4) + baseStat;
    }

    @Override
    public int getMaxLp() {
        return this.sta + modifier(this.sta);
    }

    private int modifier(int stat) {
        if (stat < 5) return -1;
        if (stat < 10) return 0;
        if (stat < 15) return 1;

        return 2;
    }

    @Override
    public void hit(ICharacter character) {
        int dmg = calculateHitPoints();
        character.take(dmg);
    }

    private int calculateHitPoints() {
        return Dice.d4.roll() + this.modifier(this.str);
    }

    @Override
    public void take(int dmg) {
        this.currentLp -= dmg;
        if (this.currentLp <= 0) {
            System.out.println(name + " DIES");
        }
    }

    @Override
    public String toString() {
        String format = """
                %s : {
                    STR : %d
                    STA : %d
                    LP : %d / %d
                }
                """;

        return String.format(format,
                this.name.toUpperCase(),
                this.str,
                this.sta,
                this.currentLp,
                this.getMaxLp());
    }
}
