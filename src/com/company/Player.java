package com.company;

public class Player {

    private String name;
    private int minDamage;
    private int maxDamage;
    private int health;
    private int gold;
    private int armor;
    private int magicPower;
    private int strength;

    public Player(String name) {
        this.name = name;
        this.minDamage = 1;
        this.maxDamage = 2;
        this.health = 100;
        this.gold = 0;
        this.armor = 0;
        this.magicPower = 0;
        this.strength = 0;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
