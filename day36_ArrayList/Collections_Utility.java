package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {
        /*
        Arrays: utility for Array
        Collections : utility for collection

        Collections.sort(): sorts the arraylist in ascending order

        Collections.swap(ArrayList, index1, index2): swaps the elements of the given indexes

        frequency(ArrayList, Element): returns the frequency of the element from the arraylist
         */

        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(10); //0
        list1.add(269); //1
        list1.add(50); //2
        list1.add(40); //3
        list1.add(15); //4

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("Maximum number: " + list1.get(list1.size()-1) );
                                              // to find the last index element in the list
        System.out.println("Minimum number: " + list1.get(0));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        System.out.println(list2);

        Collections.swap(list2, 1,  2); //{A, C, B, D, E};

        System.out.println(list2);


        Collections.swap(list2, 0, list2.size()-1); //{E, C, B, D, A};

        System.out.println(list2);


        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('A');
        charList.add('A');
        charList.add('C');

        int count =  Collections.frequency(charList, 'B');

        System.out.println(count);



    }
}
