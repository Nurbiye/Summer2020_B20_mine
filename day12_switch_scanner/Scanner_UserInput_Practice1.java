package day12_switch_scanner;

import java.util.Scanner;

public class Scanner_UserInput_Practice1 {

    public static void main(String[] args) {
/*
1. write a program that can ask user to enter a number
            if the number is odd number print: "odd number"
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
               double num = scan.nextDouble();  //scanner method, i can't type anything in compiler without this method

           // String result=(num%2==0)?"Even" : "Odd";
        String result=(num%2==0) ? num + " is Even number" : num + " is Odd number";
        System.out.println(result);

    }
}
