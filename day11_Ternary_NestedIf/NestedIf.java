package day11_Ternary_NestedIf;
         /*
         90 ~ 100 ==> A
          80 ~ 89 ==> B
          70 ~ 79 ==> C
          60 ~ 69 ==> D
          0-59  ==> F
          other==>invalid
        */
public class NestedIf {
    public static void main(String[] args) {
        int score = 100;
        String result= "";

        if (score >=0 && score <= 100){ //valid score
            //using nested if we are creating pre-condition.
            if(score>=90){
                result = "A";
            }else if(score >=80 ){
                //we can add && score<90 in about(),but no need, if the last statement is false then this line will excuted
                result ="B";
            }else if (score >=70){
                result="C";
            }else if(score>=60){
                result="D";
            }else{
                result="F";
            }
        } else { //invalid score
            result="Invalid";
        }
        System.out.println(result);

        System.out.println("==============================");





    }
}
