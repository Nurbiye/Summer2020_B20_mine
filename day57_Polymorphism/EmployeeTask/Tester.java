package day57_Polymorphism.EmployeeTask;

public class Tester extends Employee{


    public Tester(String name, int id, String jibTitle, double salary, char gender) {
        super(name, id, jibTitle, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Tester "+ name + "is working");
    }
}
