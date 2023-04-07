package org.example.rpg.utils;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public enum Dice {
    d4(4),
    d6(6),
    d10(10);

    private final int nbFace;

    Dice(int nbFace) {
        this.nbFace = nbFace;
    }

    public int roll() {
        SecureRandom rnd = new SecureRandom();

        return rnd.nextInt(nbFace + 1) + 1;
    }

    public int roll(int nbRoll, int nbKeep) {
        List<Integer> rolls = new ArrayList<>();

        for (int i = 0; i < nbRoll; i++) {
            rolls.add(roll());
        }

        return rolls.stream()
                .mapToInt(i -> i)
                .unordered()
                .limit(nbKeep)
                .sum();
    }

    public int roll(int nbRoll) {
        return roll(nbRoll, 3);
    }

}

