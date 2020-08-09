package day13_Scanner;

import java.util.Scanner;

public class next_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Cybertek school
        System.out.println("Enter your first name: ");//as soon as we enter the full name in here,scanner memory save this name
        String firstName = scan.next();//then in this step scanner takes the first name, the in system the last name is left
        //Cybertek
        System.out.println("Enter your last name: ");//school
        String lastName = scan.next();

        String fullName = firstName + " " + lastName;
        System.out.println(firstName);



    }
}
