package day24_Arrays;

public class UniqueWords2 {
    public static void main(String[] args) {
         String[] words ={"C#","C#","Java","Python","Python","C++"};

         for (String each:words) { //outer loop, we also used for each loop
             // String s = each;
             int count = 0;

             for (String b : words) {  //b represents each elements in the array  ==>inner for each loop
                 if (each.equals(b)) {   //if (s.equals(b)){
                     count++;
                 }
             }
             if (count == 1) {
                 System.out.println(each);
             }
         }






        }

    }

