package day12_switch_scanner;
/*
    2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
 */
public class AgeGroup {
    public static void main(String[] args) {
        int age=43;

        String ageGroup="";

        if (age>=0 && age<=150){
         /*   if(age <21){
                ageGroup="Teenager";
            }else if(age <= 55){
                ageGroup="Adult";
            }else{
                ageGroup ="Senior";
            }
        */       //we can use ternary for sub condition part here above.
        ageGroup = (age <21)? "Teenager" : (age <= 55) ?"Adult":"Senior";

        }else{
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);



    }
}
