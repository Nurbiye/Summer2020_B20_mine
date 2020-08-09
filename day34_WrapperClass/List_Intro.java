package day34_WrapperClass;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(95);  // compiler will see 95 as an int, but ArrayList doesn't support primitives, so here happens autoboxing automatacilly
        scores.add(100);  //1
        scores.add(85);//add method only accept
        scores.add(75);
        scores.add(2,300); //we can add number in specific index position
        // we can not skip add the index when we adding object to the list by using index
       // scores.add(7,299);   //this is not right
        System.out.println(scores);

        //100;
        System.out.println(scores.get(2));// this is Integer, because in arrayList it supports wrapper class





    }
}
