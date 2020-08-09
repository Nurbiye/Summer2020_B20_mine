package day16_String;

import java.util.Scanner;
/*
ask the user if he/she is employed

        if the user says yes, print "employed"
        otherwise ==> unemployed
 */
public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employed?");
        String answer = scan.next(); //String answer = scan.next().toLowerCase; //then use equal() in if statement
        //we have two ways to do this in order to deal with the case sensitivity of "yes" that users input

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employeed");
        }else{
            System.out.println("Not employeed");
        }





    }
}
