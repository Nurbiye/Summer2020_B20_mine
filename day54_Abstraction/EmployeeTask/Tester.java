package day54_Abstraction.EmployeeTask;

import day53_FinalKeyword.Test;

import java.time.LocalDate;

public final class Tester extends Employee { //since super class has constructor with argument, we have to create constructor to call it
    // to make sure Tester class can not be inherited in anywhere, we set Tester class as final
    //final keyword either can be before or after access modifier
    public Tester(String name, char gender, LocalDate DOFB, String jobTitle, double salary){
        super(name, gender, DOFB, jobTitle, salary);
    }

    public void findBug(){
        System.out.println("Tester found bug...");
    }

}
