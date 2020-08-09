package day29_CustomMethods;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.Scanner;

public class CalculateAge {
    //create a method that can calculate the age of the person
    public static void main(String[] args) {

        printHello(100);

        age(1989); //birth year

        age1(1989,2030);

        System.out.println("==================");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter birth year and current year");
        age1 ( scan.nextInt(),scan.nextInt() );


    }




    public static void printHello(int numberOfTimes){ //whatever information is needed for you, put it in (parameter)
        //                      n is the argument that we r going to give(n:is for number of times)
              // argument:

        // with parameter it means that, this methods must have information for complete the task

        for (int i = 0; i < numberOfTimes ; i++) {
            System.out.print("Hello World ");
        }
    }

  public static void age(int birthYear){
        int age=2020-birthYear;
      System.out.println("You are "+age+" years old");
  }

    public static void age1(int birthYear,int currentYear){
        //if we use this method after several years, we ask user provide current year
        if (currentYear<birthYear){
            System.out.println("Invalid Entry");
        }else {
        int age=currentYear-birthYear;
        System.out.println("You are "+age+" years old");
        }
    }




}
