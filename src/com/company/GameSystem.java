package com.company;

import java.util.ArrayList;

public class GameSystem {

    public static Shop initShop(){

        // CREATE INDIVIDUAL ITEMS
        Amulet amulet1 = new Amulet("Amulet of Magic", 100, 6);
        Amulet amulet2 = new Amulet("Iron Neckless", 25, 1);

        Helm helm1 = new Helm("Wooden Helm", 50, 2);
        Helm helm2 = new Helm("Queen's Helmet", 500, 15);

        Weapon weapon1 = new Weapon("Kingslayer", 200, 7);

        // CREATE A LISTS
        ArrayList<Amulet> listOfAmulets = new ArrayList<>();
        listOfAmulets.add(amulet1);
        listOfAmulets.add(amulet2);
        ArrayList<Helm> listOfHelms = new ArrayList<>();
        listOfHelms.add(helm1);
        listOfHelms.add(helm2);
        ArrayList<Weapon> listOfWeapons = new ArrayList<>();
        listOfWeapons.add(weapon1);

        // ADD ITEMS TO THE LIST

        return new Shop(listOfAmulets, listOfHelms, listOfWeapons);
    }

}
