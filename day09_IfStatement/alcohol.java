package day09_IfStatement;
/*
        warmup tasks:
    4. write a java program that can identify if a person is eligible to buy alcohol
 */
public class alcohol {
    public static void main(String[] args) {
        boolean hasID = true;
        int age = 19;

        boolean eligible = hasID  &&  age >= 21;
        //                 true  &&   false  ===> false


        String result= ""; // this is the another way of doing if statement to print true
        //i can add anything in the double quote

        if(eligible == true ) {
            //System.out.println( "Eligible to buy alcohol");
            // i can don't use string above and sout here directly
            result = "Eligible to buy alcohol";
        }

        if (eligible == false) {
            //System.out.println( "Go buy your milk");
            result = "You are not old enough to buy alcohol";
        }

        System.out.println(result);

    }

}
