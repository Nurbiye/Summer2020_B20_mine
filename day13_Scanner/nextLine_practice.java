package day13_Scanner;

import java.util.Scanner;

public class nextLine_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number: ");//7925Enter
        int buildingNumber = scan.nextInt();//this variable takes out number:7925

        scan.nextLine();//take out the Enter
        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();//there is 'Enter'in Scanner,
        // so in this part the left part in scanner will automatically assigned to the variable in here
        //so before we enter our street name, i have to take out remaining in scanner by using nextLine(); see:line11

        System.out.println(buildingNumber + " "+ streetName);


        scan.close();


    }
}
