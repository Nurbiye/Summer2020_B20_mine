package day23_Arrays_loopsTask;
/*
int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the array
 */
public class Max_Min_Number_InArray {
    public static void main(String[] args) {
        int[] arr = {5,5,4,6,4,1, -100, 100, 200, 3000, -3000};
       // index      0 1 2 3 4 5    6    7    8     9     10

        int max = arr[0]; // 6
        int min = arr[0]; // 1

        for(int i = 1; i <= arr.length-1; i++){

            if(arr[i] > max){ // compares the array' elements, and assign the maximum number to variable max
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }

        }


        System.out.println("Max Number: "+max);
        System.out.println("Min Number: "+min);





    }
}
