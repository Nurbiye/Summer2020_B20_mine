package day11_Ternary_NestedIf;

//there are also some practices in "Ternary" class.

public class Ternary_Practice {
    public static void main(String[] args) {
        //if the number is positive, negative or zero, using multi-branch if statement,
        // let's use ternary to write it down
        int c=65;
        String result7= (c > 0) ? "positive" : (c<0)? "negative" : "zero";
        System.out.println(result7);

        System.out.println("=========================");
        /*
        write a program that can compare two numbers
        a=10, b=20
        output: b is greater

        a=30, b=10
        output: a is greater

        a=20, b=20;
        output: a is equal to b
         */
        int a= 10; //we can change the a,b values according to the requirement
        int b=20;
        String result = (a>b) ? "a is greater" : (a<b) ? "b is greater" :  "a is equal to b";
        System.out.println(result);






    }
}
