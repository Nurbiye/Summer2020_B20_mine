package day12_switch_scanner;

import java.util.Scanner; //only imports scanner class from java.util
//import java.util.*; //this is for all class in java.util. no need to use this, it will increase the system memory if using

public class Scanner_UserInput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number");
        //after this compiler will show the message and we can type our number under it
        // int num1= input.nextInt();
        //long num2 = input.nextLong();
        double num3= input.nextDouble();


        System.out.println("You entered: " + num3);







    }



}
