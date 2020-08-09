package day35_ArrayList;

import java.util.ArrayList;

/*
write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"
 */
public class Combine2Arrays_List {
    public static void main(String[] args) {
        String[] group1 = {"Nurbiye","Bharulla","Mohammed","Ibrahim"};
        String[] group2 ={"Kuresh","Abdullah","Bayima","Mayram"};

        ArrayList<String> studentsList = new ArrayList<>();
               for (String each: group1){
                 studentsList.add(each);
                    }
               for (String each: group2){
                 studentsList.add(each);
                    }

        System.out.println(studentsList);

    }
}
