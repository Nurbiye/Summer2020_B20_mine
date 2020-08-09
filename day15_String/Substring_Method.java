package day15_String;

public class Substring_Method {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        //                 012345678910
        //in order to create the substring from 'sentence'
        //substring(beginning index, ending index,but ending index will be excluded)
        String word = sentence.substring(0, 4);
        System.out.println(word);

        //in order to print 'fun'as substring. we use index 8,9,10, but ending index will be excluded,so we use the next index)
        String word2 = sentence.substring(8,11);
                                          //instead of 11, we can call this the last length of the total char
        System.out.println(word2);        //use ===last index +1. for the ending index

        System.out.println("===================");
        String sentence2 = " I like movie and TV Series";
        //index             0123456789

        String word3 = sentence2.substring(7,12+1);

        System.out.println(word3);


        System.out.println("==================================");
        String firstName = "cRISTINa";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1, firstName.length() ); // firstName.length(): lastIndex + 1

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();

        System.out.println(firstName);

        System.out.println("===============================" );
        String lastName = "school"; //we can try "nURbIyE"
        String firstChar = lastName.substring(0,1); //s
        String remaining = lastName.substring(1);  //chool
        lastName= firstChar.toUpperCase() + remaining.toLowerCase(); //school
        System.out.println(lastName);

        System.out.println("===================================");
        String s = "I like Java programming language";
        //          0123456789
        String language = s.substring(7);
        System.out.println(language);




    }
}
