package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Nurbiye");
        earlyBirdList.add("Bahrulla");
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Nur");
        earlyBirdList.add("Mohammed");
        earlyBirdList.add("Adax");

        earlyBirdList.set(3,"Bayima"); //replace that specific index string to new string

        System.out.println(earlyBirdList);

        earlyBirdList.clear();

        System.out.println(earlyBirdList);
        System.out.println(earlyBirdList.size() );

        System.out.println("============================");
        //remove(int index):it will take the index number of the
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);  //0
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7); //6

        list.remove(3);//1,2,3,5,6,7
        list.remove(5);//

        System.out.println(list);


        System.out.println("====================");
        //remove(Element) ==remove the specific element
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);  //0
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7); //6

        //if you don't pass the primitive to remove method, it will assume it as element
        Integer a = 1;
        list.remove(a); //now a is Integer, not int (primitive), so it removes that element
                //if we pass primitive to remove method, it will remove that index
        System.out.println(list2);

        System.out.println("================== ");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Nurbiye");
        list3.add("Bahrulla");
        list3.add("Ibrahim");
        list3.add("Nur");
        list3.add("Mohammed");
        list3.remove(3); //passing primitive ==>removes"Nur"
        list3.remove("Nurbiye");//passing non-primitive (Element)

        System.out.println(list3);
        //remove method returns boolean, if it can successfully removes index or element, it returns true
        //if not, it returns false
        boolean r = list3.remove("Nur"); //==>it will returns false, since no "Nur" left in the list
        //we won't use this boolean in any where , just know know
        System.out.println(r);











    }
}
