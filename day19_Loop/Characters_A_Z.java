package day19_Loop;
/*
       5. Write a program that will print out all letters in English alphabet in ascending order A-Z
      6. Write a program that will print out all letters in English alphabet in descending order Z-A
 */
public class Characters_A_Z {
    public static void main(String[] args) {
        //task5
        for(char ch='A'; ch<='Z'; ch++){ //we even can use lower case for printing a-z
            System.out.print(ch+" "); //print out all letters in English alphabet in ascending order A-Z
        }
        System.out.println();

        for (int i=97;i<=122;i++){ //we use number to converting to char
            char ch =(char)i;
            System.out.print(ch + " "); //we casted the int to char . expleced casting.
        }
        System.out.println();
        System.out.println("=============================");
        //task6
        for(char ch='Z';ch>='A'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();
        for(int i=90; i>=65; i--){ //we can use the numbers of the characters from Ascii table.
            System.out.print( (char)i + " ");
        }
        System.out.println();

       /* for(int i=0;i<6500;i++){   //print all the characters in computer, not only ascii table
            System.out.print((char)i);
        }*/







    }
}
