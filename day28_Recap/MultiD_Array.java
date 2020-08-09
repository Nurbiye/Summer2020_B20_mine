package day28_Recap;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        int[] arr1D = {1,2,3};
        //                0 1 2    0 1 2 3 4    0 1  2  3  4
        int [][] arr2D={ {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };
        //                  1          2               3
        System.out.println(Arrays.toString(arr2D[1]) ); //single dimensional int array

        System.out.println(Arrays.deepToString(arr2D) );

        System.out.println(arr2D[1][3]); //7

        System.out.println("=====================================");
        for (int i = 0; i <=arr2D.length-1; i++) { //iterates each 1D array from 2D array.
            int[] each1DArray = arr2D[i]; //in order to print every single element in the 2D array
           // System.out.print(Arrays.toString(each1DArray) );
            for (int j = 0; j <=each1DArray.length-1; j++) { //is the index of single array,prints(iterates) the elements of each 1D array
                int eachNum = each1DArray[j];
                if (eachNum%2==0){ //if we are asked to print the even numbers
                    System.out.print(eachNum+" ");
                }
            }
            System.out.println();
        }

        System.out.println("=========================");

        for (int[] each1D: arr2D) { //in order to iterate each elements from the the each1D,we use another for loop inside this loop
            for (int eachElement : each1D){
                if (eachElement %2!=0){//if we print only odd numbers
                    System.out.print(eachElement);    //if we print all the numbers,we can remove if statement, and just leave the print statement
                }
            }
            System.out.println();
        }


    }
}
