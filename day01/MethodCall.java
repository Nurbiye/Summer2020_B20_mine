package day01;

import library.CustomMethod2;

public class MethodCall { //by importing the method class... package name,class name
    public static void main(String[] args) {
        int[] numbers= {300,200,10880,-938493,22322839};

        CustomMethod2.maxNum(numbers);
        CustomMethod2.minNum(numbers);




    }
}
