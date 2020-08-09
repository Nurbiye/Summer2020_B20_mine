package day24_Arrays;

import java.util.Scanner;
/*
1. write a program that can find the unique characters from a String
        Ex:
        input: aabccd
        output: bd
 */
public class Uniques2 {
    public static void main(String[] args) {
        //for finding the uniques of anything(word or character), we can start from counting the frequency
        // unique means frequency ==1
        Scanner scan=new Scanner(System.in);
        String str = scan.nextLine();//we previous used "aabcc"; bt we can let user input it
        String expectedResult = "";

        for(int j=0;j<=str.length()-1; j++) { //we create this loop to find the frequency of every single char in the string

            char ch1 = str.charAt(0); //a
            int count1 = 0;          //1
            //we count the first character, we can compare the character to every other character in str
            //we create a loop can iterate every single char in the string
            //to find every char in the string , we use charAt method
            for (int i = 0; i <= str.length() - 1; i++) { //used for finding the frequency of ch and assign it
                char each = str.charAt(i); // a a b c c ==>to find the frequency of the char, we compare them to other char in the string,
                if (ch1 == each) {
                    count1 += 1; //if the character is unique we don't
                }
            }
            if (count1 == 1) { //if it only occurred one time
                expectedResult += ch1; //if it is unique add it to the string
            }
            //from line12--25, is for finding the frequency of first character, we have to repeat this to other character,
            // instead we use nested loop

        }
        System.out.print(expectedResult);

    }
}
