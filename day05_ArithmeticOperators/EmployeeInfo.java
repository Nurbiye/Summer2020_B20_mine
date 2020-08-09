package day05_ArithmeticOperators;
                  /*
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
                   */

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Danial";
        int age = 128;
        String companyName = "CapitalOne";
        char gender = 'M';
        String jobTitle = "SDET";
        double Salary = 120_000.5;
        boolean isFullTime = true;
        boolean isMarried = false;
        String fullName = firstName + " " + lastName;  //we can concatenate the full name, since we write first last two name each time.

              /*
                 output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
              */
        System.out.println("Employee' full name is: " + firstName + lastName);
        System.out.println( firstName+" " + lastName + "' gender is: " + gender);
        System.out.println(firstName+" " + lastName + "' age is: " + age);
        System.out.println(firstName+" " + lastName + " works at: " + companyName);
        System.out.println( firstName+" " + lastName + "' Job title is: " + jobTitle);
        System.out.println(firstName+" " + lastName + "' salary is " + Salary+ " $");
        System.out.println(firstName+" " + lastName + " is full time employee: "+isFullTime);
        System.out.println(firstName+" " + lastName + " is married: " + isMarried );


     // we can concatenate the names as full name:

        System.out.println("Employee' full name is: " + firstName + lastName);
        System.out.println( fullName + "' gender is: " + gender);
        System.out.println(fullName + "' age is: " + age);
        System.out.println(fullName + " works at: " + companyName);
        System.out.println( fullName + "' Job title is: " + jobTitle);
        System.out.println(fullName + "' salary is " + Salary+ " $");
        System.out.println(fullName + " is full time employee: "+isFullTime);
        System.out.println(fullName + " is married: " + isMarried );

    }




}
