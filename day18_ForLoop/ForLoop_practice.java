package day18_ForLoop;

import java.sql.SQLOutput;

public class ForLoop_practice {
    public static void main(String[] args) {
        //print 1 to 10 in one line for 10 times
        for (int i=1; i <= 100; i++){
            //System.out.println(i); //different lines
            System.out.print(i + " "); //print in one same line
        }

        System.out.println("================");
        for(int i = 100;i>=1; i--){
            System.out.print (i+" ");
        }

        System.out.println("======================");
        for( int i = 1;  i <= 5; ++i ){ //i: 1, 2, 3, 4, 5, 6

            System.out.println("Cybertek Batch 20"); //5

        }

        System.out.println("=====================================");
        //print number squared: 1,4,9,16....81,100 in different lines
        for (int i=1;i<=10;i++){
            System.out.println(i*i);
        }





    }
}
