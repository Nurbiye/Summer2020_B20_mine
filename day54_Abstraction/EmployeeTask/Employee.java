package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

/*
    Task:
    1.create a class named Employee (meant to be super class):
            Attributes:
                    name, gender(final), DOfB(final), jobTitle, Salary
                    create constructor that can initialize lal those attributes
                        (even final variable you should initialize them within constructor)
            Action:
     */
public class Employee {

    public String name;
    final public char gender;
    final public LocalDate DOFB;
    public String jobTitle;
    public double salary;

    public Employee(String name, char gender, LocalDate DOFB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOFB = DOFB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOFB=" + DOFB +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

}
