package day25_StringLoopArray_Recap;

public class LongestString {
    public static void main(String[] args) {
        // Write a program that can return the longest string of text from a String array
        String[] arr={"Nur","Bahrullah","Ibrahim","Mohammed","Koresh","Bayima","Abdullah","Mayram"};
        int maxLength = arr[0].length();
        for(String each : arr){
            if (each.length() >maxLength){ //to find the max length
                maxLength = each.length();
            }
        }
        System.out.println(maxLength);
        //now we have the maximum length, now we have to know how many string that has the maximum length

        for (String each:arr){ //this loop is for printing out the maximum element
            if (each.length()==maxLength){
                System.out.println(each);
            }
        }





    }
}
