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
        this.gold = 500;
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

    public void equipItem(Item item){

        //Inventory inventory = new Inventory();

        if (item instanceof Weapon){
            Weapon weapon = (Weapon) item;
            setStrength(strength +weapon.getStrength());
            //inventory.setWeapon(weapon);

        } else if (item instanceof Helm){
            Helm helm = (Helm) item;
            setArmor(armor + helm.getArmor());
        } else if (item instanceof Amulet){
            Amulet amulet = (Amulet) item;
            setMagicPower(magicPower + amulet.getMagicPower());
        }

        setGold(gold - item.getCost());
        System.out.println("Can you feel your new powers?");
    }



    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", minDamage=" + minDamage +
                ", maxDamage=" + maxDamage +
                ", health=" + health +
                ", gold=" + gold +
                ", armor=" + armor +
                ", magicPower=" + magicPower +
                ", strength=" + strength +
                '}';
    }

}
