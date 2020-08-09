package day10_IfStatements;
/*  1. write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
               ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
2. write a program that can identify if the given character character is Digit
                ex:
                    character = '1'
                output:
                    1 is a Digit
                    character  = '!'
                output:
                    ! is not a digit
3. write a program that can identify if the given character is a symbol
                ex:
                    character = '!'
                output:
                    ! is a symbol
                    character  = 'a'
                output:
                    a is not a symbol
 */
public class Character_Identify {
    public static void main(String[] args) {
        // in order to find if the character is alphabet, we need to check ASCII table.
        char character = 'A'; //any alphabet

         //                 65 <= character <= 90             ||     97 <= character <= 122
        boolean isAlphabet = (character >= 65 && character <= 90) || (character >= 97 && character <=122);
         //                    upper case letters         ||          lower case letters


        if (isAlphabet) {
            System.out.println(character + " is Alphabetic");
        } else{
            System.out.println(character + " is not Alphabetic");
        } //if you don't want to use 2 print statement, let's give variable and initialize it.
        /*
        String alphabet = "";
        if (isAlphabet) {
            alphabet= character + " is Alphabetic";
        } else{
           alphabet= character + " is not Alphabetic";
           }
           sout (alphabet);
         */
        System.out.println("======================");
        //if character is digit
        char character1 = '&';
        // in ascii table digits are between48-57.
        //48<= character <=57;
        boolean isDigit = character1 >=48 && character1<=57;

        String digit = "";
        if(isDigit){
            digit= character1 + " is a digit";
        } else {
            digit = character1 + " is not a digit";
        }
        System.out.println(digit);

        System.out.println("=======================");

        char character2 = '^';
        boolean isSpecial = !isAlphabet && !isDigit;
            // or we also can say:  isAlphabet==false && isDigit==false;

        String special = "";
        if (isSpecial){
            special = character2 + " is Special Character";
        }else {
            special = character2 + " is not Special Character";
        }
        System.out.println(special);



    }
}
