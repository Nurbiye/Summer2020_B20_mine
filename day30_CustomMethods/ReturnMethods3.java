package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods3 {
    public static void main(String[] args) {
        int[] arr= {100,200,50,40,60};
      //  max(arr); //return type is int, we can assign it to int
        int num =max(arr);

        System.out.println(num);
        System.out.println(num>300); //we can return the value and reuse it in anywhere .
        // but in void type we can not

        max2(arr); // this is void method..we can only apply its function and print it out..we couldn't reuse the value

        // int num2 = max2(arr);  this will shows error since i can't reuse the value in void method

    }

    public static int max(int[] arr){
        Arrays.sort(arr);
        int max =arr[arr.length-1];
        return max;
    }



    public static void max2(int[] arr){
        Arrays.sort(arr);
        int max =arr[arr.length-1];
        System.out.println(max);
    }

}
