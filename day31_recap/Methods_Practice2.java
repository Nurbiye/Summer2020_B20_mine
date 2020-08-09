package day31_recap;
/*
1. create a method that can reverse a string
2. identify if a string is palindrome
 */
public class Methods_Practice2 {
    public static void main(String[] args) {
        String name = "madam";
        reverse1(name);
       // System.out.println(name.equalsIgnoreCase(reverse1(name) ) ); this shows error because void does not return value that can reuse

        String rev = reverse2(name);
        System.out.println(rev);
        System.out.println(name.equalsIgnoreCase(reverse2(name) )  );



    }

    public static void reverse1(String str){
        String expectedResult="";
        for (int i = str.length()-1; i <=0; i++) {
            expectedResult +=str.charAt(i);
        }
        System.out.println(expectedResult);
    }

    public static String reverse2(String str){
        String expectedResult="";
        for (int i = str.length()-1; i <=0; i++) {
            expectedResult +=str.charAt(i);
        }
        return expectedResult;
    }




}
