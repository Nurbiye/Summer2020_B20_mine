package day16_String;

public class String_Methods {
    public static void main(String[] args) {
        //replace()
        String word = "java";
        word = word.replace("a","e");
        System.out.println(word);

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java","a, C#");

        sentence = sentence.replace("Java ", "Python ");
        System.out.println(sentence);

        String s2 = "I like to leaRn Java";
        s2 = s2.replace('R','r'); //we can also open double quote.
        System.out.println(s2);


        //replaceFirst:
        String s3 = "I like to drink tea and tea";
        s3 = s3.replaceFirst("tea","Cola");
        //it just replace the first that specific word in the sentence
        System.out.println(s3);

        String s4 = "I like to watch Game of thrones, and walking dead";
        //in order to remove the text", and walking dead" from above sentence,
        // we don't have remove method, but we can replace it to empty double quote.
        s4 = s4.replace(", and walking dead", "");
        System.out.println(s4);

        //indexOf:
        String s5 = "I like to stay in cybertek, we are learning Java";
        int r1 = s5.indexOf("r");
        System.out.println(r1);
        //what if we need the index number of second r?
        //we can add other characters to make it unique
        int r2 = s5.indexOf("re"); //we can also use"ar" but it will print"a" 's index number, then we can add 1.
        //it is better we can put the letter in first and add other letter to make it unique
        int r3 = s5.indexOf("rning "); //returns the first char'r' index

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        //lastIndexOf()
        String s6 = "Java is programming language, and Java is fun";
        int I1= s6.indexOf(" J") + 1;//next char after that letter
        int I2 = s6.lastIndexOf("J");

        System.out.println(I1);
        System.out.println(I2);

        String s7= "Java";
        int a1 = s7.indexOf("A"); //it will return negative number, because this letter is not exist in the String
        System.out.println(a1);//-1 "A"is not in the String, so returns to negative






    }
}
