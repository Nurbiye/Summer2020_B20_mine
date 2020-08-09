package day23_Arrays_loopsTask;

import java.util.Scanner;
/*
Create an array that holds 12 months names
User should be able to enter month index and output should be:
“The month name is <MonthName>”
 */
public class Months {
    public static void main(String[] args) {

        String month[] ={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        //index            0     1     2     3     4     5     6     7     8    9     10     11
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1~12");
        int n = scan.nextInt(); //while user input 5 for may, it will print index 5-1=4 string
        System.out.println(month[n-1]);



    }
}
