package day12_switch_scanner;
import java.util.Scanner;
/*
write a program for the rate calculator
            1. asks the user to enter the salary (as double)
            2. asks the user how many hours does he/she works in a week (as int)
            3. print the hourly rate of the employee
            assume that one year has 52 weeks
            hourRate = salary/ (weeklyHour * 52)
 */
public class Scanner_rateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter your salary: ");
        double salary = input.nextDouble();
        //            get this 'input' name from scanner name in line 13.

        System.out.println("How many hours do you work in a week");
        int weeklyHour = input.nextInt();
        int totalHours= weeklyHour*52; //in a year there are 52 weeks, total hours is yearly total.

        double hourlyRate = salary/totalHours;
        System.out.println("Your hourly Rate is: " + hourlyRate);


    }

}
