package com.company;

public class Helm extends Item {

    private int id;
    private static int idCounter = 1;
    private int armor;


    public Helm(String name, int cost, int armor) {
        super(name, cost);
        this.id = idCounter;
        this.armor = armor;
        idCounter++;
    }

    public int getArmor() {
        return armor;
    }

    public int getId() {
        return id;
    }
}
