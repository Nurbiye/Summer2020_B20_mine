package day19_Loop;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        /*
        2.print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
         */






        /*
        3. print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
            Hint: in the loop body , only place the statements that you need to repeat
         */




        //4. write a program that can calculate the sum of all numbers between 1 to 100
        int sum=0;
        for(int i=1;i<=100;i++){
            sum +=i;
        }
        System.out.println(sum);



    //5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
        int sum1=0;
        for(int i=0;i<=100; i++){
            if(i%2==0){
                sum1 +=i;
            }
        }
        System.out.println(sum1);



    //6. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
        int sum2=0;
        for(int i=1; i<100;i++){
            if(i%2!=0){
                sum2 +=i;
            }
        }
        System.out.println(sum2);



    /* 7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
            input : 200
            output : 20100
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        int sum3 = 0;
        for(int i=1;i<=num; i++){
            sum3 +=i;
        }
        System.out.println(sum3);









    }
}
