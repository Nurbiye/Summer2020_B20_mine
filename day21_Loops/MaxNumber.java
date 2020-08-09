package day21_Loops;

import java.util.Scanner;

  //write a program that asks user to enter 5 numbers and returns the maximum number

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648; //int range (smallest number)

        for (int i=10;i<=50; i+=10){

            System.out.println("Enter a number");
            int num =scan.nextInt(); //put the user input part within the loop.
            // for example, user input 5 numbers,(repeat "enter a number"5 times, so user will enter 5 numbers
            //20, 5, 10, 30, 3
            if(num>max){
         //if the next user input number greater than the max number, then it will assign to the max number
                max=num;
            }
        }

        System.out.println("Max number: " + max);







    }
}
