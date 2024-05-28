package com.ohgiraffers.section04.use3;

public class SuperDice implements Dice{

    int min;
    int max;

    public SuperDice(int min, int max) {
        this.min = min;
        this.max = max;
        min = 1;
        max = 10;
    }

    @Override
    public int getNumber()
    {
        int random = (int) (Math.random() * 10);

        return random;
    }
}
