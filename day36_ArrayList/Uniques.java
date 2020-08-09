package day36_ArrayList;

import java.util.ArrayList;

/*
3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
 */
public class Uniques {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        ArrayList<Integer> uniques= new ArrayList<>();

       for (Integer element : list){
        //for (int i = 0; i <=list.size()-1 ; i++) { //this outer loop iterates(gets) each element in the list
      //inner loop is for finding the frequency of element in the list
        //Integer element = list.get(i);//compare this element to other elements in the list
        int count = 0;
        for (Integer each : list) {
            if (each==element){
                count++;
            }
        }
        if (count==1){  // verify if element is unique
            uniques.add(element);
        }

        }

        System.out.println(uniques);





    }
}
