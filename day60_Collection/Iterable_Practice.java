package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Iterable_Practice {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for (int i = 0; i < list1.size() ; i++) {
            if (list1.get(i)<5){
                list1.remove(i);
            }
        }
        System.out.println(list1);


        System.out.println("==============================================");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4));
//        for (Integer each : list2) {
//            if (each<5){
//                list2.remove(each);
//            }
//        }
//        System.out.println(list2);

        list2.removeIf(p-> p < 5); //internally uses the iterator
        System.out.println(list2);







    }
}
