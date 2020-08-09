package day23_Arrays_loopsTask;

import java.util.Scanner;
      /*
      create an array that holds the days
      User should be able to enter the day index and output should be:
      “Today is Monday”
       */
public class Days {
    public static void main(String[] args) {
        String[] days= new String[7];
        days[6] ="Sunday";
        days[4] ="Friday";
        days[0] ="Monday";
        days[3] ="Thursday";
        days[1] ="Tuesday";
        days[2] ="Wednesday";
        days[5] ="Saturday";

        for(int i=0; i<=days.length-1; i++){
            System.out.print(days[i]+" "); //return as index number order
        }

        System.out.println();

        System.out.println("=================================");
        Scanner scan= new Scanner(System.in);  //it is much more easier with scanner
        System.out.println("Enter a number between 1~7");
        int n =scan.nextInt();

        System.out.println(days[n-1]);




    }



}
