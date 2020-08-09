package day11_Ternary_NestedIf;
/*
Task03:
       write a program that can find the number of days in a months
                    (MUST APPLY NESTED IF)
 */

public class DaysInMonth2_nestedIf {
    public static void main(String[] args) {
        int month= 10;
        boolean validNumber= month>=1 && month <=12; //first verify  valid or not

        boolean days28= month==2;  //for the month that has 28 days.
        boolean days30 =  month==4 || month==6 || month==9 || month==11;

        String result = "";

        if(validNumber){ //valid month
            if(days28){
                result="28 Days";
            }else if(days30){
                result = "30 Days";
            }else{
                result="31 Days";
            }

        }else{ //invalid Month
            result = "Invalid";
        }
        System.out.println(result);




    }

}
