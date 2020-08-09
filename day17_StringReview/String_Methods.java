package day17_StringReview;

import sun.font.CStrike;

public class String_Methods {
    public static void main(String[] args) {
       //charAt:
       String str = "Cybertek";
       //index No.   01234567
        char ch1 = str.charAt(5);
        System.out.println(ch1);

        //concat("") or +
        String str2 = "Cybertek";
        str2= str2+" school";
        //  str2.concat(" school");

        //length()
        int l = str2.length();
        System.out.println(l);

        //lastIndex = length-1
        char ch2 = str2.charAt(l-1);
        System.out.println("last index number is " + (l-1));

        //upperCase && lowerCase
        String str4 = "cybertek";
         str4=str4.toUpperCase();
        System.out.println(str4);

        String str5 = "JAVA";
         str5 = str5.toLowerCase();
        System.out.println(str5);

        //trim()  str6=str6.trim();

        //substring (beginning index, ending index+1) || (beginning)
        String str7="I like reading books";
        //           0123456789..........
        String word = str7.substring(7,13+1);
        //it is better to assign for other variable, since str7 might be used later
        System.out.println(word);

        String word2 = str7.substring(12,str7.length());//
        //if i want to print the from specific index till the end, i can only provide the beginning as well

        //indexOf && lastIndexOf()
        String str8="Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W"); //here we print the first W, if we want the second W, we can make it unique,like:We
        System.out.println(i1);
        System.out.println(str8.charAt(i1));

        String str9 = "Java Java Java";
        int i4 =str9.lastIndexOf("J");
        int i5 =str9.indexOf("J");
        int i6 = str9.indexOf(" Java ") +1;

        //replace & replaceFirst
        String s1 = "I like Java, Java is a programming language";
         s1=s1.replace("Java", "Python");
        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java","C#");
        System.out.println(s2);

        String s3 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst(" Java is"," C# is");
        System.out.println(s3);







    }
}
