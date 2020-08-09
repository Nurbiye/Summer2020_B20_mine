package day36_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(10); //0
        list1.add(20); //1
        list1.add(30); //2
        list1.add(40); //3
        list1.add(50);
        int a = list1.indexOf(40);//return the specific index,
        System.out.println(a);
        System.out.println(list1.indexOf(60)); //60 is not exist in the list
        System.out.println(list1.lastIndexOf(40));






    }

}
