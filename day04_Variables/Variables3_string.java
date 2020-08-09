package day04_Variables;
     /*




      */

import java.sql.SQLOutput;

public class Variables3_string {
    public static void main(String[] args) {
        String schoolName = "Cybertek School";
        System.out.println(schoolName);
        System.out.println("==============================");

        String employeeName = "Nurbiye";
        int employeeID = 20830824; //if there is letter in ID, we can use string
        //String employeeID = "Bj238294";
        String jobTitle = "SDET";
        double salary = 120000.50;
        char gender='F';
        boolean isFullTime = true;

        System.out.println(employeeName);
        System.out.println(employeeID);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(gender);
        System.out.println(isFullTime);
// if we want to print out more readable information:
        System.out.println("Emoloyee Name is " + employeeName); //it will exqute whatever comes first..in order
        System.out.println("EmployeeID " +  employeeID);
        System.out.println("Job Title is " +  jobTitle);
        System.out.println( "Salary is " + salary + " USD");
        System.out.println( "Gender: " +  gender);
        System.out.println("FUll Time: "+ isFullTime);
   // we can change personal information,maybe more employees...then printout

    }




}
