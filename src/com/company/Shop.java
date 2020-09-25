package com.company;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Amulet> listOfAmulets;
    private ArrayList<Helm> listOfHelms;
    private ArrayList<Weapon> listOfWeapons;

    public Shop(ArrayList<Amulet> listOfAmulets, ArrayList<Helm> listOfHelms, ArrayList<Weapon> listOfWeapons) {
        this.listOfAmulets = listOfAmulets;
        this.listOfHelms = listOfHelms;
        this.listOfWeapons = listOfWeapons;
    }

    public ArrayList<Amulet> getListOfAmulets() {
        return listOfAmulets;
    }

    public ArrayList<Helm> getListOfHelms() {
        return listOfHelms;
    }

    public ArrayList<Weapon> getListOfWeapons() {
        return listOfWeapons;
    }

    public void showAmulets(){
        System.out.println("-- AMULETS --");
        for (Amulet amulet : listOfAmulets) {
            System.out.println(amulet.getId() + ". " + amulet.getName() + " - (+" + amulet.getMagicPower() + " Magic Power) - " +
                    amulet.getCost() + " gold.");
        }
    }

    public void showHelms(){
        System.out.println("-- HELMS --");
        for (Helm helm : listOfHelms) {
            System.out.println(helm.getId() + ". " + helm.getName() + " - (+" + helm.getArmor() + " Armor) - " +
                    helm.getCost() + " gold.");
        }
    }

    public void showWeapons(){
        System.out.println("-- WEAPONS --");
        for (Weapon weapon : listOfWeapons) {
            System.out.println(weapon.getId() + ". " + weapon.getName() + " - (+" + weapon.getStrength() + " Strength) - " +
                    weapon.getCost() + " gold.");
        }
    }

    public void sellItem(int type, int userChoice, Player player){

        Item item = new Item();

        if (type == 1){
            item = listOfWeapons.get(userChoice - 1);
        } else if (type == 2){
            item = listOfHelms.get(userChoice - 1);
        } else if (type == 3){
            item = listOfAmulets.get(userChoice - 1);
        } else {
            System.out.println("That's not an option!");
        }

        int itemCost = item.getCost();
        int playerGold = player.getGold();

        if (playerGold >= itemCost){
            buyItem(item, player);
            player.setGold(playerGold - itemCost);
        } else {
            System.out.println("You can't afford that right now!");
        }


    }

    private void buyItem(Item item, Player player) {

        if (item instanceof Weapon){
            Weapon weapon = (Weapon) item;
            player.setStrength(player.getStrength() + weapon.getStrength());
        } else if (item instanceof Helm){
            Helm helm = (Helm) item;
            player.setArmor(player.getArmor() + helm.getArmor());
        } else if (item instanceof Amulet){
            Amulet amulet = (Amulet) item;
            player.setMagicPower(player.getMagicPower() + amulet.getMagicPower());
        }

        System.out.println("Can you feel your new powers?");

    }
}
