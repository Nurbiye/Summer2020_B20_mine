package day30_CustomMethods;

import java.util.Arrays;

/*
warmUp tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop
 */
public class warmUpTask {
    public static void main(String[] args) {
        maxNum(12,2324);

        int arr[]={5,6,3,3534,5,645,78798,989,8,89898090,-86,2334,-5,343,4233,43};
        printDesc(arr);

        int[] a1={1,2,3,4,5,5,76,7};
        int[] a2={8,54,57,68,779,9,6788,7890,807};
        combine2Array(a1,a2);

        PosNegZero(0);
        System.out.println("===============================");
        int[] a3 = {100, -100, -200, -300, 0, 0, 900, 5000};

        for( int each : a3){
            PosNegZero(each);
        }


    }



    //task01:
    public static void maxNum(int a, int b){
        if (a==b){
            System.out.println("Equal");
            return;  //exits the method
        }
        if(a>b){
            System.out.println(a+" is maximum");
        }else{
            System.out.println(b+" is maximum");
        }
    }


    //task02:
    public static void printDesc(int[] arr){ //{10,9,20,30,5,6,7}
      Arrays.sort(arr); //{5,6,7,9,10,20,30}
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    //task03: {1,2,3} {3,5,6,7}===>{1,2,3,3,5,6,7}
    public static void combine2Array(int[] arr1, int[] arr2){
        int[] arr3= new int[arr1.length +arr2.length];

        int i=0;
        for (int each: arr1){
            arr3[i] = each;
            i++;
        }

        for (int each :arr2){
            arr3[i] =each;
            i++;
        }

        System.out.println(Arrays.toString(arr3));
    }

    //Task04:
    public static void PosNegZero(int num){

        if(num > 0){
            System.out.println(num+" is positive");
        }else if(num <0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }

    }


    public static void addition(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }






}
