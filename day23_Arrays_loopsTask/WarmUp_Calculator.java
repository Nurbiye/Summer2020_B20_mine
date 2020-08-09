package day23_Arrays_loopsTask;

import java.util.Scanner;
/*
 1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the answer is not a valid answer (not yes or no), the the program should
                    repeatedly ask the user re-enter
            HINT: nested loop task, outer loop need to be an infinite loop
 */
public class WarmUp_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Enter two numbers");
            double num1=input.nextDouble();
            double num2 = input.nextDouble();
            System.out.println("Enter the math operator");
            char o = input.next().charAt(0);
            double result = (o=='+')? num1+num2 :(o=='-')? num1-num2:(o=='*')?num1*num2:(o=='/')? num1/num2:
                    (o=='%')?num1%num2 : 0;
            //we can also use switch statement for char operator instead of ternary above
            System.out.println(result);
            /*
            switch(o){
            case'+':
            sout(num1+num2);
            break;
            case'-';
            ......
            default:
            sout("Invalid answer");
             */

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
