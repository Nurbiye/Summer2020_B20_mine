package day26_Multi_DimensionalArray;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {
        char[] ch1={'A','B'};
        char[] ch2={'c','s','g'};
        char[] ch3={'G','D','G'};

        // second bracket 0   1     0   1   2     0   1   2
        char[][] ch2D ={{'A','B'},{'c','s','g'},{'G','D','G'}};
        // first bracket    0            1            2
        //if we want to retreat index1 from ch2D : ch2D[1]
        System.out.println(Arrays.toString(ch2D[1])); //this prints single dimensional arrays in 2 dimen..array

        //two brackets [index of single arrays in 2 dimensional arrays][elements index in the single array]
        System.out.println(ch2D[1][1]);//s

        System.out.println(ch2D[2][0]+" "+ch2D[0][1]); //G B

        System.out.println("=================================");
       //{1,2,3},{4},{5,6},{7,8,9,10}
        // int[] arr1D={{7,8,9,10}};
        int[][] nums ={{1,2,3},{4},{5,6},{7,8,9,10}};
        //in order to print {7,8,9,10}
        System.out.println(Arrays.toString(nums[3]));
       /*let's print out :
        {1,2,3}
        {4}
        {5,6}
        {7,8,9,10}
        */
        for (int i = 0; i <=nums.length-1 ; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
        //if print entire {{1,2,3},{4},{5,6},{7,8,9,10}}
        System.out.println(Arrays.deepToString(nums)); //convert multi-D array to String








    }
}
