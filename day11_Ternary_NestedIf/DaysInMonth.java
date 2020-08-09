package day11_Ternary_NestedIf;
/*
2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2 (Febrary)
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
             if not these numbers, invalid: num<1 || num>12
 */
public class DaysInMonth {
    public static void main(String[] args) {
        int month = 7;

        boolean days28= month==2;  //for the month that has 28 days.
        boolean days30 =  month==4 || month==6 || month==9 || month==11; //for the month that has 30 days
       // boolean dayas31 = 1,3,5,7,8,10,12==>it will be too long if use this condition,
        //instead we can use invalid boolean then else is 31days
        boolean invalid = month<1 || month>12;

        String result ="";

        if (days28){
            result="28 days";
        }else if(days30){
            result= "30 days";
        }else if(invalid){
            result="Invalid";
        }else { //!days28 && !days30 && invalid==>it will be month 1,3,5,7,8,10,12
            result = "31 days";
        }
        System.out.println(result);

        System.out.println("================");
        //use ternary
        String result1 = (days28) ? "28 days" : (days30) ? "30 days" : (invalid) ? "Invalid" : "31 days";
        System.out.println(result1);





    }
}
