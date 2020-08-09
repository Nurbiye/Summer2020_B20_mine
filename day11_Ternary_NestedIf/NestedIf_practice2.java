package day11_Ternary_NestedIf;

public class NestedIf_practice2 {
    public static void main(String[] args) {
        /*
    Task02:
         1Monday
         2Tuesday
         3Wednesday
         ...
         7 Sunday
         invalid ==>there is no such a day
         */
        int day = 5;
        boolean validNumber = day>=1&& day<=7; // at first i didn't use boolean, but it is good to set this boolean first
        String result = "";

        if (validNumber){
            /* we can try this sub nested if blocks to ternary
            if (day==1){
                result="Monday";
            }else if(day==2){
                result="Tuesday";
            }else if(day==3){
                result="Wednesday";
            }else if (day==4){
                result="Thurday";
            }else if (day==5){
                result="Friday";
            }else if(day==6){
                result="Saturday";
            }else{
                result="Sunday";
            }
            */
         result= (day==1) ? "Monday" : (day==2) ? "Tuesday" : (day==3)?"Wednesday":(day==4)?"Thursday":
                 (day==5) ? "Friday" : (day==6) ? "Saturday" : "Sunday";
        }else{
            result= "Invalid";
        }
        System.out.println(result);













    }
}
