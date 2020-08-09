package day21_Loops;
/* (interview question) divide the two numbers without division operators
 3. write a program that can divide two numbers without using / & % operators and returns the division and remainder
            ex:
                input:  10
                        3
                0utPut: 3 with a remainder of 1
                10-3=7
                7-3=4
                4-3=1
 */
public class DevideTwoNumbers {
    public static void main(String[] args) {
        int a =10;
        int b = 3; //in mathematics denominator can not be zero.
        if(b==0){
            System.out.println("Invalid Input");
            System.exit(0); //exit the whole
        }


        int count = 0; //how many time we subtracted the denominator from nominator

        while(a >= b){
            a -=b;
            count++; //how many time it subtracted
        }
        System.out.println(count + "with a remainder of " +a);


    }
}
