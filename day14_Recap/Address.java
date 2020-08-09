package day14_Recap;
/*
write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */
import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt();

        scan.nextLine();
        //if we r using the nextLine method after other scanner method, then we neet to use this to clean the scanner
        System.out.println("Enter your street address: ");
        String streetAddress = scan.nextLine();
        //we don't need to give scan.nextLine(); here.
        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = scan.next();

        System.out.println("Enter your zipcode: ");
        int zipcode = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        //we can close the scan thus code performance will be faster..
        scan.close();


        /*
         Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
         */

        System.out.println("\nship to: " + fullName + "\n             " +buildingNumber + streetAddress +
                "\n             " +cityName + ", " + stateName +" " + zipcode );






    }
}
