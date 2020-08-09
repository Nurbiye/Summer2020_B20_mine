package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A','A','B','B','C','C','D') );

        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>();
        for (Character each: list){
            if (!nonDup.contains(each) ){ //check if the element is contained, if no add to nonDup
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);





    }
}
