package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Player player = GameSystem.initGame("Marcus");
        Shop shop = GameSystem.initShop();

        boolean isRunning = true;

        System.out.println(player);

        while(isRunning){
            showMenu();
            int type = scanner.nextInt();

            if (type == 1){
                shop.showWeapons();
            } else if (type == 2){
                shop.showHelms();
            } else if (type == 3){
                shop.showAmulets();
            } else if (type == 0){
                System.out.println("Bye!");
                isRunning = false;
            } else {
                System.out.println("That is not currently an option!");
            }

            System.out.println("Want to buy anything?");
            int userChoice = scanner.nextInt();

            shop.sellItem(type, userChoice, player);

            System.out.println(player);

        }

    }

    private static void showMenu() {
        System.out.println("Do you see anything you like?");
        System.out.println("1. Weapons");
        System.out.println("2. Helms");
        System.out.println("3. Amulets");
        System.out.println("0. Exit Shop");
    }
}
