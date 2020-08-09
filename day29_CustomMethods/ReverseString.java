package day29_CustomMethods;
//create a method that can reverse any String
public class ReverseString {
    //if there is no reverse method in system, we can create a custom method
    public static void main(String[] args) {

        reverse("Nurbiye");
        reverse("Mohammed");
        reverse("Ibrahim");
        reverse("Bahrulla");


    }



    public static void reverse(String str){ //if user give a string, how do i reverse it
        String result ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i); //from the argument string str, we call index number
        }
        System.out.println(result);
    }






}
