package day21_Loops;

import java.util.Scanner;
  //2. write a program that asks user to enter 5 numbers and returns the minimum number
public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;  //int range largest number in int

        for(int i=1; i<=5; i++){

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num<min){ //whatever user input is smaller than the min ,which will assign to the min variable
                min=num;
            }
        }
        System.out.println(min);




    }
}
