package day34_WrapperClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        //print all odd or even numbers from 1-100
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }
        }
        System.out.println(oddList);
        System.out.println();
        System.out.println(evenList);

        System.out.println("================================");
       ArrayList<String> groceryList = new ArrayList<>();
       groceryList.add("milk");
       groceryList.add("Apple");
       groceryList.add("Eggs");
       groceryList.add("Ice cream");

        for (int i = groceryList.size()-1; i >=0 ; i--) { //can not use for each, since we etreate the elements from the last index
            System.out.print(groceryList.get(i) + "   ");
        }
        System.out.println();
        System.out.println(groceryList);









    }



}
