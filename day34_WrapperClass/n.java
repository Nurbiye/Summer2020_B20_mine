package day34_WrapperClass;

import java.util.Arrays;

public class n {
    /*
    create methods that can sort Integer array, Double Array, Character array in descending order
        create methods that can combine two double arrays, char arrays, String arrays,
        Integer arrays, Double arrays, Character Arrays
     */
    public static void main(String[] args) {









    }


    public static int[]  sortDesc(int[] arr){
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }

}
