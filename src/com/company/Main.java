package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome");

        Shop shop = GameSystem.initShop();
        shop.showAmulets();
        shop.showHelms();
        shop.showWeapons();


    }
}
