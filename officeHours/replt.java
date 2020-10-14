package officeHours;

import java.util.Scanner;

public class replt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();
        String name = fullName.toLowerCase();
       // boolean user = name=="max payne" || name=="alan wake";
        if(name=="max payne"){
            System.out.println("User found!");
        }else if (name=="alan wake"){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }



    }
}
