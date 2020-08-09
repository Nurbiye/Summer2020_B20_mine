package day28_Recap;

import java.util.Scanner;

public class frequencyOfWord2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scan.nextLine();
        System.out.println("enter your word that you want to count");
        String word = scan.next(); //even the word that we find frequency is inputted by user, we set this scanner

        //(0,3)
        //(1,4)==> +3

        int count=0; //"cat" 3 characters in this word.

        for (int i = 0; i <=str.length()-word.length() ; i++) {
            String a = str.substring(i,i+word.length()); //this is the word that with that character, compare it with "cat"
            if (a.equals(word)){
                count++;
            }
        }
        System.out.println(count);




    }
}
