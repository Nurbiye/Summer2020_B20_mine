package day25_StringLoopArray_Recap;

public class ShortestString2 {
    public static void main(String[] args) {
        // Write a program that can return the shortest string of text from a String array
        // this time we use for each loop

        String[] arr={"Nur","Bahrullah","Ibrahim","Mohammed"};
        int minLength = arr[0].length(); //compare this first array element to other elements in the array

        for (String each: arr) { //find out the minimum length of the String in arr
             /* int l = each.length(); // 3, 9,5,6

            if (l<minLength){
                minLength=l;*/
            if (each.length()<minLength){
                minLength=each.length();
            }
        }
        for (String each:arr) { //to see how many strings' length in array match with minimumLength
            if (each.length() == minLength) {
                System.out.println(each);
            }
        }









    }

}
