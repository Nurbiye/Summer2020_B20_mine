package day24_Arrays;
/*
Write a program that can return the average number from an array of integers
            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
            average: 10
 */
public class averageNumber {
    public static void main(String[] args) {
        //in order to know the average , we have to know the sum of the numbers and length of the array
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        int sum=0;

        for (int i=arr.length-1; i>=0; i--){
            sum +=arr[i]; //to find the sum, add the num to the sum.
        }
        System.out.println(sum);

        double average = sum/(double)arr.length; //average usually is decimal, we can assign it to double
         //              int / int
         //             so cast it to double (even we assign it to the double, it takes int/int as int then add0.0

        System.out.println("Average number is: " + average);




    }

}
