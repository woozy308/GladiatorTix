package CS143.jtnguyen5;

public class Message {

    public void begin() {
        System.out.println("*~----------*|~|~|^|~|~|*----------~*");
        System.out.println("Welcome to the GladiatorTix System!");
        System.out.println();
        System.out.println("What can I do for you today?");
        System.out.println();
    }

    public void menu() {
        System.out.println("----------*~*----------");
        System.out.println("1- Open a new ticket");
        System.out.println("2- Open an existing ticket");
        System.out.println("3- Delete tickets");
        System.out.println("4- Management Vault");
        System.out.println("5- Turn off system");
        System.out.println("----------*~*----------");
    }

    public boolean vaultKey(int value) {
        return value == 9812; // vault key //
    }

    public void end() {
        System.out.println();
        System.out.println("Thank you for using GladiatorTix!!!");
        System.out.println("Have a wonderful day/night :) ");
        System.out.println("*~----------*|~|~|^|~|~|*----------~*");
    }
}
