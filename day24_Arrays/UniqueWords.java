package day24_Arrays;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words ={"C#","C#","Java","Python","Python","C++"};
        //whichever elements frequency equals to 1 , which element is unique.
        for (int j = 0; j <=words.length-1 ; j++) {

        String s = words[j]; //j is index
        int count = 0; //declare the frequency of s.
        //compare the shown index number's elements with other every single elements in the Array

        //I'm going to need a loop, to iterate all the given elements in Array
        for (int i = 0; i <=words.length-1 ; i++) {
            String each = words[i]; //"C#","C#","Java","Python","Python","C++"
            if (s.equals(each)){
                count++;
            }
        }
        if (count==1){
            System.out.println(s);
        }

        }






    }
}
