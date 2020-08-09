package day29_CustomMethods;

public class RemoveDuplicates {
    // write a method that can remove the duplicates from the string

    public static void main(String[] args) {
        String str="ajhfsakjfhrhfdjhvajdjjjjjkldfjlkahdskfakdsf";
        removeDup(str);



    }





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






}
