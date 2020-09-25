package com.company;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Amulet> listOfAmulets = new ArrayList<>();
    private ArrayList<Helm> listOfHelms = new ArrayList<>();
    private ArrayList<Weapon> listOfWeapons = new ArrayList<>();

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
            System.out.println(amulet.getId() + ". " + amulet.getName());
        }
    }

    public void showHelms(){
        System.out.println("-- HELMS --");
        for (Helm helm : listOfHelms) {
            System.out.println(helm.getId() + ". " + helm.getName());
        }
    }

    public void showWeapons(){
        System.out.println("-- WEAPONS --");
        for (Weapon weapon : listOfWeapons) {
            System.out.println(weapon.getId() + ". " + weapon.getName());
        }
    }
}
