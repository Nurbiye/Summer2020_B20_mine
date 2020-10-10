package day60_Collection;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Practice2 {
    public static void main(String[] args) {

        String[] arr = {"Ahmet","Aalia","Nurbiye","Ahmet","Ahmet","Ahmet","Nurbiye"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr) );
        Iterator<String>  it = names.iterator();
        while (it.hasNext() ){
            if (it.next().equals("Ahmet") ){
                it.remove();
            }
        }
        System.out.println(names);


        System.out.println("=================================================");

        ArrayList<String> employee = new ArrayList<>(Arrays.asList(arr));

        for( Iterator<String> i = employee.iterator();  i.hasNext();) {
            if(i.next().equals("Ahmed")){
                i.remove();
            }
        }

        System.out.println(employee);

        System.out.println("=======================================================");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        list.removeIf(  p -> p.equals("Ahmed")  ) ;  // internally uses iterator

        System.out.println(list);

    }




















    }

