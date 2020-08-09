package day34_WrapperClass;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(45);
        list.add(60);
        list.add(98);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer each: list ){//get access to each element in the list
            if (each> max){
                max=each;
            }

            if (each < min){
                min = each;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: "+min);









    }




}
