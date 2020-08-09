package day29_CustomMethods;
//write a method that can check if a string is plaindrome, print true if it's  otherwise print false

public class PalindromeTest {
    /*
    kayak==>kayak  true
    Java==>avaJ    false
     */
    public static void main(String[] args) {
        palindrome("level");
        palindrome("mom");
        palindrome("verlkjfd");



    }






    public static void palindrome(String word){
        String revered="";
        for (int i = word.length()-1; i >=0 ; i--) {
           revered +=word.charAt(i);
        }
        System.out.println(revered.equalsIgnoreCase(word) ); //varify if given string is palindrome
    }


}
