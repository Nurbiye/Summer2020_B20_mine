package day30_CustomMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ReturnMethods4 {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        //combine2Array(a1,a2);
        int[] a3 = combine2Array(a1, a2);
        System.out.println(Arrays.toString(a3));
        System.out.println(a3[0]);
        System.out.println(a3[a3.length - 1]);


    }


    public static int[] combine2Array(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }
        return arr3; //instead of using:  System.out.println();
    }



}
