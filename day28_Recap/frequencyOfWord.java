package day28_Recap;
/*
 1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour
 */
public class frequencyOfWord {
    public static void main(String[] args) {
        String str="javajava"; //now we use the approach of: take out four character that is matches "java" word.
        //substring(0,4)==> java
        //substring(1,5)==> avaj
        //substring(2,6)==> vaja
        //substring(3,7)==> ajav
        //substring(4,8)==> java

        //substring(i,i+4)==> java
        int count=0;
        for (int i = 0; i <=str.length()-4 ; i++) { //if i is 5, then it became(5,9),out of bound, so condition is
            String s= str.substring(i,i+4); //during this it prints four character, we compare it to"java"
            if (s.equals("java")){
                count++;
            }

        }
        System.out.println(count);









    }
}
