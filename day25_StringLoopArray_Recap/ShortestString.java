package day25_StringLoopArray_Recap;

public class ShortestString {
    public static void main(String[] args) {
        // Write a program that can return the shortest string of text from a String array
      String[] arr={"Nur","Bahrullah","Ibrahim","Mohammed","Nuh"};
      int minLength = arr[0].length(); //compare this first array element to other elements in the array

        for (int i = 0; i <=arr.length-1; i++) {
            //this loop is only use to find out the minimum length of the String in arr
            int l = arr[i].length(); //

            if (l<minLength){
                minLength = l;

            }
        }
        System.out.println(minLength);


        for (int i = 0; i <=arr.length-1; i++) {
            //use this loop to see how many strings' length in array match with minimumLength

            if (arr[i].length() == minLength) { //compare the length to minLength
                System.out.println(arr[i]);
            }
        }







    }
}
