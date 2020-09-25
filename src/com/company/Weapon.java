package com.company;

public class Weapon extends Item {

    private int strength;
    private int id;
    private static int idCounter = 1;

    public Weapon(String name, int cost, int strength) {
        super(name, cost);
        this.strength = strength;
        this.id = idCounter;
        idCounter++;
    }

    public int getStrength() {
        return strength;
    }

    public int getId() {
        return id;
    }
}
