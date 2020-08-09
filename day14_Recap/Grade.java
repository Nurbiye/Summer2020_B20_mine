package day14_Recap;

import java.util.Scanner;

/*
write a program that can calculate the grade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF
   0<= score <= 100;==> pre
 */
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the score: ");
        double score= scan.nextDouble();
        //scan.close();  we can use this scanner close, thus the performance of the code might be faster

        String result = "";
        if (score >=0 && score<=100 ){ // 5 possible outcomes
            if (score >= 90) {
                result="Excellent";
            }else if(score >=80){
                result="Great";
            }else if (score>=70){//this one will be executed only the previous score>=80 is false
                result="Good";
            }else if(score >= 60){
                result="Passed";
            }else{
                result= "Failed";
            }//the oly time when above multi-branch if is executed is when the pre-condition is true.

        }else{
            result = "Invalid Entry";
        }
        System.out.println(result);


    }
}
