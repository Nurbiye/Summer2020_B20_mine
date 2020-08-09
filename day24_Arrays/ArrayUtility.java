package day24_Arrays;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
// import java.util.*;  this is for whole class.. we can use above import statement
public class ArrayUtility {
    public static void main(String[] args) {

        int[] arr ={1,2,3}; //in order to print this array we have to convert it to string
        System.out.println(arr); //==>this one doesn't print numbers
        System.out.println(Arrays.toString(arr) ); //convert other array to string then print it out

        String s1=Arrays.toString(arr);
        System.out.println(s1);

        String[] names= {"Nurbiye","Bahrullah","Muhammed","Ibrahim"};
        System.out.println(names); //this doesn't print the names
        //in order to print array variable we must convert it to String
        System.out.println(Arrays.toString(names));


        System.out.println("============================");
        int[] nums = {5,4,6,5,4,3,10}; //these numbers in array is not in order, let's sort then in order
        Arrays.sort(nums); //[3,4,4,5,5,6,10]  in ascending order
        System.out.println(Arrays.toString(nums));

        System.out.println("Maximum number: " + nums[nums.length-1] ); //after sorting, last element is maximum
        //after sorting,it is sorted in ascending order, so to find max number,we find the last index number
        System.out.println("minimum number: "+ nums[0]);//after sorting,the first element is the minimum number

        System.out.println("=====");
        String students[] = {"Nurbiye","Bahrullah","Muhammed","Ibrahim"}; //A-Z
        Arrays.sort(students);//sort by alphabeticla asscending order,as well as ascii table order
        System.out.println(Arrays.toString(students));


        System.out.println("==========================");
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        boolean r1= Arrays.equals(arr1,arr2);
        System.out.println(r1);//true

        int[] arr3 = {2,1,3};
        boolean r2= Arrays.equals(arr2,arr3);
        System.out.println(r2); //false ,  i can sort them first.
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        /*
        I saw some confusion about why we don’t need to reassign the array when we sort it.
        So remember we usually did reassignment with the variable when we were working with Strings,
        the reason was because the Strings are immutable, meaning the original object could not be changed,
        so whenever we used a method we needed to reassign to keep the changes to made.
        Now, arrays are mutable, which means that you can change the object, so when we call the sort method from
        that Arrays class that will sort that elements into ascending order it will do it to the object that we
        passed, meaning the arrays is sorted and the reference (variable name) you have still points to the
        array object that you gave.   We will cover more about how objects works in the future.
        Also you don’t need to start worrying about which things are mutable and immutable.
        If its immutable like String we will say.
         */
        boolean r3 = Arrays.equals(arr2,arr3);
        System.out.println(r3); //true

        int[] arr4={3,5,4,6,7,};
        int[] arr5={9,5,3};
        boolean r4 = Arrays.equals(arr2,arr3);
        System.out.println(r4); //false ===>size(elements) of the array is different.












    }

}
