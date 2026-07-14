import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/* import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException; */


public class Message {

    LocalTime time = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
    String cleanTime = time.format(formatter);

    public void begin() {
        System.out.println("*~----------*|~|~|^|~|~|*----------~*");
        System.out.println("Welcome to the GladiatorTix System!");
        System.out.println("Clock: "+ cleanTime);

        /*
        try {
            File welcome = new File("C:/Users/sunni/IdeaProjects/GladiatorTix/src/welcome.png");
            BufferedImage welcomeImage = ImageIO.read(welcome);
        } catch (IOException e) {
            System.out.println("Image failed to load!");
        }
        */

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