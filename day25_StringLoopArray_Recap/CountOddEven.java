package day25_StringLoopArray_Recap;

public class CountOddEven {
    public static void main(String[] args) {
        //Write a program that can count the even and odd number from an array of integers
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int countEven = 0;//in order to know how many even numbers, we assign this
        int countOdd = 0;

        String even="";//in order to print out the even numbers
        String odd="";


        for (int each: nums){
            if(each%2==0){
                countEven +=1;//how many even numbers
                even += each+" "; // print out even
            }else{
                countOdd++; //how many odd
                odd += each+" ";
            }
        }
        System.out.println("Even Numbers: "+countEven);
        System.out.println(even);

        System.out.println("Odd Numbers: "+countOdd);
        System.out.println(odd);





    }
}
