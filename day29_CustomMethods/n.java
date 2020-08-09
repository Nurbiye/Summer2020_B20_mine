package day29_CustomMethods;

import java.util.Arrays;

public class n {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple" , "note"};


        String[] n= new String[words.length];

//        for(int i=0; i<=words.length-1;i++){
//            char ch1=words[i].charAt(0);
//            char ch2= words[i].charAt(words[i].length()-1);
//            String comb=""+ch1+ch2;
//            n[i]=comb;
//        }
//        System.out.print(Arrays.toString(n));

         for(String each: words) {
             char ch1 = each.charAt(0);
             char ch2 = each.charAt(each.length() - 1);
             String result = "" + ch1 + ch2;
             System.out.print(result+" ");
             //the problem now is, how can i convert string to array in for each loop
         }










    }
}
