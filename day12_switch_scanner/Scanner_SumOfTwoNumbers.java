package day12_switch_scanner;

import java.util.Scanner;

public class Scanner_SumOfTwoNumbers {
    public static void main(String[] args) {
        /*
write a program that can ask user to enter two number, and the prints the sum of those two number
            Enter your first number
            10
            Enter your second number
            20
 */
        Scanner scan = new Scanner(System.in);  //now since this topic is new, i have to memorize these.
        System.out.println("Enter your first number: ");
             int num1 = scan.nextInt();
        System.out.println("Enter your second number: ");
             int num2 = scan.nextInt();
             int sum=num1+num2;
        System.out.println("Sum of those two numbers are: " +sum );

    }
}
