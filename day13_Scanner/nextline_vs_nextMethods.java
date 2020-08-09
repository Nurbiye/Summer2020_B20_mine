package day13_Scanner;

import java.util.Scanner;

public class nextline_vs_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);//while we enter salary, 120000 and we hit "enter"keyboard,and in system there is:120000 enter
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();//it will take off the 120000. but in scanner system there is still"enter"left.

        scan.nextLine();//we can use this to take out the "enter"that we hit after entering the salary,
        //and also only use nextLine . only it will takeout all the string that scanner left

        System.out.println("Enter your full name: ");
        String fullName= scan.nextLine();//it will takes everything that we input, even the "enter"that we hit in the keyboard
        //if we r using nextLine method right after other scanner methods, it will show

        System.out.println("salary: " +salary);
        System.out.println("full name: "+fullName);

        //next, and nextline() are use for string...but next()just take first one word.
        //nextline() will take whole things in the scanner has.


    }
}
