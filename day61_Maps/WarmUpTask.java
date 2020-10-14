package day61_Maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WarmUpTask {
    public static void main(String[] args) {


    //1. Write a program that stores the the character and frequency of each character from a String in to a Map
    //
    //    Ex: "aaabbbccb"
    //    output:
    //        {a=3, b=4, c=2}

    String str = "aaabbbccd";
    String[] s = str.split(""); //[a, a, a, b, b, b, c, c, d]
        System.out.println(Arrays.toString(s));
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            String nonDup = "" + s[i];
            if (s[i]==nonDup){
                count++;
            }
        }
        System.out.println(count);


//        Map(String, Integer) s1 = new LinkedHashMap<>();







    //2. write a program that stores the unique characters from a string into map:
    //
    //        Ex: "abacbdeef";
    //        output:
    //            {c=1, d=1, f=1}







}
}