package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(30); //0
        list.add(20); //1
        list.add(40); //2
        list.add(50); //3
        list.add(15); //4
        Collections.sort(list);
        System.out.println(list);

//        for (int i = list.size()-1; i >=0 ; i--) {
//            System.out.print(list.get(i) +" " );
//            //we can use like this to print the list , or we also can assign a new arraylist and pass(add)the elements to that new list
//        }
//
        ArrayList<Integer> descendingList= new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            descendingList.add(  list.get(i) ); //look!!
        }
        System.out.println(descendingList);


        /*
        Task:
        1. write a program that can find the unique characters from a string
                DO NOT use nested loop
                "ABABCDEE"
                output: C D
        2. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

         */





    }
}
