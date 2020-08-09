package day14_Recap;
/*
task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */
import java.util.Scanner;

public class Scanner_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Enter
        System.out.println("Enter your gender: ");
        String gender= input.next();  // female

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //19

        input.nextLine();// it will take out the 2 enter that we input.
        System.out.println("Enter you country name: ");
        String countryName = input.nextLine();
        //while using the nextLine method i have to take all enter or unused input into account.

        System.out.println("Enter your zipcode: ");
        int zipCode = input.nextInt();

        input.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your Company name: ");
        //but before this , we don't need to use input.nextline to clear the scanner
        String companyName = input.nextLine();
        //use input.nextline(); only when othe scanner methods are used before nextline method
        //if before is nextline method, we don't need to clean the scanner











    }
}
