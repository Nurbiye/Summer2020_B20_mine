package day19_Loop;

import javax.swing.*;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scan.nextLine();
        // String str = "Cyber"; // reverse---rebyC
        //    index:  01234
        // String result= "" + str.charAt(str.length()-1) + str.charAt(3) +str.charAt(2)+str.charAt(1)+str.charAt(0);
        //we repeated the charAt method for 5 times, what if this is a long sentence and how we do reverse.

        String result ="";
       /* for (int i=4; i>=0;i--){ //4,3,2,1,0
            result += str.charAt(i);
        }
        System.out.print(result);
        //regardless of the length of the string, we can give the length-1
        System.out.println();
        */
        for (int i=str.length()-1; i>=0; i--){
            result +=str.charAt(i);
        } //we print the result after loop, otherwise it will loop the name as well.
        //this loop can reverse any words. we can use Scanner to ask the user give the word and reverse it

        System.out.print(result);







        }


    }
