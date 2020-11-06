package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static boolean quit = false;

    public static void main(String[] args) {

        menu();
        do {
            userEntry();
        } while (!quit);


    }


    // Printing the options on the menu
    private static void menu() {
        System.out.println("\n \n Welcome to the Dungeon Adventure \uD83E\uDDD9\uD83C\uDFFB\u200D️\uD83E\uDDDD\uD83C\uDFFB\u200D️ \n");
        System.out.println("If you want to start a new adventure, type 1 and let the magic happen");
        System.out.println("If you're too coward to even try, just type 2 and quit already");
    }

    private static void userEntry() {
        try {
            int userChoice = scanner.nextInt();
            // Swich case for user choice
            switch (userChoice) {
                case 1:
                    Game.enterTheDungeon();
                    Game.game();
                    break;
                case 2:
                    quit = true;
                    break;
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Be careful, you need to type a number or you'll suffer the wrath of the Monsters");
            menu();
            scanner.nextLine();
        }
    }
}