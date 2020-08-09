package day25_StringLoopArray_Recap;

import java.util.Arrays;
/*
rite a program that can combine two arrays of integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8
 */
public class CombineTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {6,789,90};
        int[] arr2 ={4,0,6,8,6,7,8,9};
        int size = arr1.length +arr2.length;

        int[] arr3= new int[size]; //9
        /*
        arr3[0] = arr1[0]; //assign the first index of arr1 to arr3
        arr3[1] = arr1[1];
        arr3[2] = arr1[2];
        //after storing all elements from arr1 then combine the arr2 to arr3, continue the arr3's index from adding arr1
        arr3[3] = arr2[0];
        arr3[4] = arr2[1];
        arr3[5] = arr2[2];
        //....repeat till finish adding all arr2 elements
        */ //let's use for each loop to ease the adding index process,first assign an index variable

        int index =0;
        for (int each:arr1){
            arr3[index] =each;
            index +=1;
        }


        for (int each:arr2){
            arr3[index] = each;
            index ++;
        }

        System.out.println(index);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("Maximum number is: " + arr3[arr3.length-1]);


    }
}
