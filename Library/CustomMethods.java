package Library;

public class CustomMethods {

    public static void removeDup(String str){
        String nonDup=""; //if there is no character is contained in nonDup then we add that character

        for(String each: str.split("")){//we forcefully used for each loop even there is no array
            //but we split the str with empty string then it became character's array
            if (!nonDup.contains(each) ){
                nonDup +=each;
            }
        }
        System.out.println(nonDup);
    }



    public static void reverse(String str){ //if user give a string, how do i reverse it
        String result ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i); //from the argument string str, we call index number
        }
        System.out.println(result);
    }








}
