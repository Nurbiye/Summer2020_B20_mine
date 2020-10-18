package day62_Maps;

import java.util.*;

public class $FrequencyOfChars {
    public static void main(String[] args) {


    //1. Write a program that stores the the character and frequency of each character from a String in to a Map
    //
    //    Ex: "aaabbbccb"
    //    output:
    //        {a=3, b=4, c=2}

    String str = "aaabbbccd";
    Map<String, Integer> map = new LinkedHashMap<>();

    List<String> list = Arrays.asList(str.split("") ); //we create a list to store each of the character of the string
        for (String each : list) {
            int frequency  = Collections.frequency(list,each);
            map.put(each, frequency);
        }
        System.out.println(map);

//    String[] s = str.split(""); //[a, a, a, b, b, b, c, c, d]
//        System.out.println(Arrays.toString(s));
//        int count = 0;
//        for (int i = 0; i < s.length; i++) {
//            String nonDup = "" + s[i];
//            if (s[i]==nonDup){
//                count++;
//            }
//        }
//        System.out.println(count);
//        Map(String, Integer) s1 = new LinkedHashMap<>();












//Warmup tasks:
//    1. cretea 3 LinkedHashMaps that contains employee name and jobTitle
//    2. create a List of Map and store all LinkedHashMaps objects into the list.
//    3. Iterate each objects from the list andprint out the name of the employee if the jobTitle of the employee is SDET

}
}