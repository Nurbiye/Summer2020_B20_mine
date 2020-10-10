package day60_Collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import day54_Abstraction.CarTask.Car;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();//get, add, remove, set, removeAll, contains, size
        list1.addAll(Arrays.asList(1,2,3,4,5) );
        list1.addAll(Arrays.asList(1,2,3,4,5) );
        System.out.println("ArrayList: " + list1);
        System.out.println(list1.get(2) ); //fastest compare to other
        //ArrayList faster in retrieving the data compare to LinkList,vector, stack.  //get method fast
        //because ArrayList internally use Array, Array always the fastest

        List<Integer> list2= new LinkedList<>();//get, add, remove, set, removeAll, contains, size
        list2.addAll(Arrays.asList(1,2,3,4,5) );
        list2.addAll(Arrays.asList(1,2,3,4,5) );
        System.out.println("LinkedList: " + list2);
        //LinkedList each object is doubly linked to each other, it means add/remove are faster.
        //add(); remove(); method is fastest compare to others


        List<Integer> list3 = new Vector<>();//get, add, remove, set, removeAll, contains, size
        list3.addAll(Arrays.asList(1,2,3,4,5) );
        list3.addAll(Arrays.asList(1,2,3,4,5) );
        System.out.println("Vector: " + list3);
        //Vector is synchronized, thread safe, one thread at a time in multiple threads.

        List<Integer> list4 = new Stack<>();//get, add, remove, set, removeAll, contains, size
        list4.addAll(Arrays.asList(1,2,3,4,5) );
        list4.addAll(Arrays.asList(1,2,3,4,5) );
        System.out.println("Stack: " + list4);

        ( (Stack)list4).pop();
        System.out.println("list4 = " + list4);


        System.out.println("===============================");
       Stack<Integer> list5 = new Stack<>();
       list5.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("list5 = " + list5);
        int lastObject = list5.pop();
        System.out.println("list5 = " + list5);
        int lastObject2 = list5.pop();
        System.out.println("list5 = " + list5);
        list5.removeAll(Arrays.asList(1,4,5));
        System.out.println(list5);
        int lastObject3 = list5.pop();
        System.out.println(list5);


        System.out.println("================================");

        int[] arr1 = {1,2,3,4};
        int[][] arr2 = { {1,2,3,4} , {5,6,7,8,9}} ;

        ArrayList<String> l1 = new ArrayList<>(); //only store string object
        l1.add("A");

       //object type is:ArrayList of Integer
        ArrayList<ArrayList<Integer> > l2 = new ArrayList<>(); //only integers
        // this above is known as : list of lists
        //l2.add("M");   not string
       // l2.add(5);    not int
        l2.add( new ArrayList<Integer>(Arrays.asList(1,2,3,4) )  ); //now list has 1 arrayList
                                     //object of arrayList
        l2.add(  new ArrayList<>()  );
        System.out.println("l2 = " + l2);
        l2.get(1).addAll( Arrays.asList(5,6,7,8,9) );
        l2.get(0).removeAll( Arrays.asList(1,3 ) );
        System.out.println("l2 = " + l2);
        System.out.println("Size of first ArrayList: " + l2.get(0).size() );
        System.out.println("Size of second ArrayList: " + l2.get(1).size() );

        System.out.println("=================================");
//        List<String> group1 = new ArrayList<>();
//        List<String> group2 = new ArrayList<>();
//        List<String> group3 = new ArrayList<>();
//        List<String> group4 = new ArrayList<>();
//        List<String> group5 = new ArrayList<>();
//
//        List< List<String> > groups = new ArrayList<>();
//        groups.addAll( Arrays.asList(group1,group2,group3, group4, group5) );
        List< List<String> > groups = new ArrayList<>();
         groups.addAll( Arrays.asList(new ArrayList<>(),
                                       new ArrayList<>(),
                                       new ArrayList<>(),
                                        new ArrayList<>(),
                                       new ArrayList<>()
         ) );
        System.out.println("groups = " + groups);

        groups.get(0).addAll( Arrays.asList( "Alexey","Ana","Andrei","Busra Y","Busra O"    ));
        groups.get(1).addAll( Arrays.asList("Nickolas","Evgeniya","Aizhan","Kalbinur","Paola"));
        groups.get(2).addAll( Arrays.asList("Ceren","Elizaveta","Heydar","Hunisddin","Kalbinur"));
        groups.get(3).addAll( Arrays.asList("Murat", "Ayhan", "Uros", "Aysel", "Esra"));
        groups.get(4).addAll( Arrays.asList("Ashenafi", "Ali", "Hamid", "Mokinur", "Nikola"));

        for( List<String>  eachGroup : groups ){
            ( (Stack)eachGroup ).pop();
            System.out.println(eachGroup);
        }



        // System.out.println(groups);

        /*
        1. add 5 different names in each group
        2. iterate the list of lists (groups)
        3. print out the names of each student
         */

        List<Car> SUVs = new ArrayList<>();
        List<Car> sedans = new ArrayList<>();
        List<Car> truck = new ArrayList<>();
        List<Car> convertible = new ArrayList<>();



        List< List<Car> >  cars = new ArrayList<>();

        /*
        iterate every single car and print out the:
            brand : model : price
         */







    }

    public void method1(){

    }

    public synchronized void method2(){

    }





}




