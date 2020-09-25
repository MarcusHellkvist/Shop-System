package com.company;

public class Amulet extends Item{

    private int id;
    private static int idCounter = 1;
    private int magicPower;

    public Amulet(String name, int cost, int magicPower) {
        super(name, cost);
        this.magicPower = magicPower;
        this.id = idCounter;
        idCounter++;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getId() {
        return id;
    }
}
