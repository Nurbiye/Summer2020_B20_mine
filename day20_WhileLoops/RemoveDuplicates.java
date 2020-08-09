package day20_WhileLoops;
/*
write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str ="aabb";  //our final result : "ab"

        String result = ""; //"a"

        for(int i=0; i<=str.length()-1; i++){

            String s = ""+str.charAt(i); //a,a,b,b charAt methods gets each

            if(!result.contains(s)){
                //this is the logic part . if the character is already contained in result, we will نوت
                result +=s;

            }
        }
        /*
          for(int i=0; i<=str.length()-1; i++){
            String s = ""+str.charAt(i); //a,a,b,b charAt methods gets each
            if(!result.contains(s)){
                continue;
            }
             result +=s;
        }
         */


    }

}
