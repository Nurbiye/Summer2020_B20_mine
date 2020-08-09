package day24_Arrays;
import java.util.Arrays;

public class   String_Methods {
    public static void main(String[] args) {
        String str = "ABCD";
        char[] ch=str.toCharArray();

        System.out.println( Arrays.toString(ch));
        System.out.println("===================");

        String str1 = "DCEBA";
        String str2 = "ABDCE";
        char[] ch1 = str1.toCharArray(); // D, C. E, B, A
        char[] ch2 = str2.toCharArray(); // A, B, D, C, E
        //in order to compare this two char let's sort them
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean r1= Arrays.equals(ch1,ch2);
        System.out.println(r1);

        System.out.println("======================");
        //let's use split method to reverse the words in this sentence,==>language programming love I
        String sentence="I love programming language";

        //we can get each of the word first.
        String[] words= sentence.split(" "); //{I, love, programming, language}
        System.out.println(Arrays.toString(words) );

        //in order to reverse these words, we use loop, start from the last index
        for(int i= words.length -1; i>=0; i--){
            System.out.print(words[i]+" "); //we reverse the sentence by words not by characters.
        }
        System.out.println();

        System.out.println("=====================");
        String s="JAVA";
        String[] arr= s.split(""); //if we split by empty string, it can get each character
        System.out.println(Arrays.toString(arr));//every single elements are string

        char[] c =s.toCharArray(); //every single element is char
        System.out.println(Arrays.toString(c));








    }
}
