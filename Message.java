import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/* import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException; */

public class Message {

    Scanner keyboard = new Scanner(System.in);

    public String getTime() {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String cleanTime = time.format(formatter);
        return cleanTime;
    }

    public void begin() {
        System.out.println("*~----------*|~|~|^|~|~|*----------~*");
        System.out.println("Welcome to the GladiatorTix System!");
        System.out.println("Clock: "+ getTime());

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
        System.out.println("Current Time: "+ getTime());
        salutationTime();
        System.out.println("*~----------*|~|~|^|~|~|*----------~*");
    }

    public void salutationTime() {
        LocalTime goodbyeTime = LocalTime.now();
        int currentHour = goodbyeTime.getHour();

        if (currentHour >= 5 && currentHour < 12) {
            System.out.println("Have an excellent morning! 🥱🌄");
        }
        else if (currentHour >= 12 && currentHour < 17) {
            System.out.println("Have a great afternoon! 😁🔆");
        }
        else if (currentHour >= 17 && currentHour < 21) {
            System.out.println("Have a nice evening! 😎🌇");
        }
        else {
            System.out.println("Have a wonderful night! 😴💤");
        }
    }

    public void ticketReader() {
        int selectedTicket;
        System.out.println("Which ticket would you like to open? Please insert the three digits now.");
        selectedTicket = keyboard.nextInt();

        try {
            File ticketRead = new File("TICKET #" + selectedTicket + ".txt");
            Scanner myReader = new Scanner(ticketRead);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println();
                System.out.println(data);
                System.out.println();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("The selected ticket, 'TICKET #" + selectedTicket + "', does not exist.");
            // e.printStackTrace(); //
        }
    }

}
