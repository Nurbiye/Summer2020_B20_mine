package day23_Arrays_loopsTask;

import java.util.Scanner;

public class WarmUp_Addition {
    public static void main(String[] args) {
        /*
    1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
    then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
but while the answer is not a valid answer (not yes or no), the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
         */
        Scanner input = new Scanner(System.in);

        while(true){

        System.out.println("Enter two numbers");
        int num1=input.nextInt();
        int num2 = input.nextInt();
        int result = num1+num2;
            System.out.println(result);
        System.out.println("Do you want to continue?");
        String a= input.next().toLowerCase(); //there r two ways that we can get rid of case sensitivity.

            while(!(a.equals("yes")||a.equals("no")) ){ //while the answer is invalid
                System.out.println("Invalid Answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                a=input.next().toLowerCase();
                //nested loop deal with if the user enter other input instead of yes or no
            }

        if(a.equals("no")){ //we can use equalsIgnoreCase here to deal with the
            break;
        }
        }
        System.out.println("Thanks for using Cybertek calculator");










    }
}
