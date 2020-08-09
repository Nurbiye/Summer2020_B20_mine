package day31_recap;

public class Methods_Practice {

    public static void main(String[] args) {
        //compare two numbers, find out the max

        max(10,30); //we should only give the arguments that return to the parameters


        int b=max2(38,334); //can reuse the value as much as we can

        System.out.println(max2(12,343));
        System.out.println(max2(12,343)*32483);

    }


    //create a method that find the maximum number between two numbers
    public static void max(int a, int b){ //void only execute the function, but couldn't reuse value
        //let's use ternary to find max
        int max= ( a>b ) ? a : b;
        System.out.println(max);

    }

    public static int max2(int a,int b){ //return type

        return ( a>b ) ? a : b;
    }


}
