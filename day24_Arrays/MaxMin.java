package day24_Arrays;

import java.util.Scanner;

/*
 2. write a program that asks user how many numbers he wants to enter,
        and get all the user inputs and store them into an array variable,
        and then write the program that can return maximum and minimum numbers
 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = scan.nextInt();

        int[] arr= new int[n];
        for (int i = 0; i <=n-1 ; i++) { //n is length , n-1 is last index number
            System.out.println("Enter a number");
//            int num =scan.nextInt();
//            arr[i] = num; //get user inputs and storing them in the array
//            //when user enter 4874576540,first 4 will assign to the index 0
            arr [i] =scan.nextInt(); //we can use this instead of line19,20
        }

        int max =arr[0];
        int min =arr[0];

        for(int i=0; i<=arr.length-1; i++){
            if (arr[i]>max){
                max =arr[i];
            }
            if (arr[i]<min){
                min =arr[i];
            }
        }

        System.out.println("Maximum number is: " + max);
        System.out.println("minimum number is: "+ min);











    }
}
