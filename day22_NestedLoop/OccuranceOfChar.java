package day22_NestedLoop;

import java.util.Scanner;

/*
2. Write a program that can asks user to enter one string and one char and
then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2
 */
public class OccuranceOfChar {
    public static void main(String[] args) {
       // String str = "ababc"; //instead of i gave the input, i can ask user enter the string
       // char ch = 'a';
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch= scan.next().charAt(0); //enter and word, find the frequency of the first index

        int count = 0; //1+1 =2, frequency of ch in str

        for(int i=0; i<=str.length()-1 ; i++){

            char each = str.charAt(i); //a b a b c

            if(each==ch){ //if true, means ch is occured in str
                count +=1;  //logic in the task
            }

        } //we also can use while loop..it is in the teacher code, go and check
        System.out.println(count);










    }
}
