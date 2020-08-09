package day10_IfStatements;

public class If_WithoutCurlyBraces {
    //if we don't use curly brace in if statement,it will just print the first line if the boolean is true.
    public static void main(String[] args) {
        if(9 > 10){
            System.out.println("Hello");
            System.out.println("How are you");
        }

        System.out.println("======================");

        if(9 > 10) {
            System.out.println("Hello");
        }

        System.out.println("How are you");

        System.out.println("===============================");

        int num = 100;
        if(num%2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");



    }
}
