package day57_Polymorphism.EmployeeTask;

public class Developer extends Employee{

    public Developer(String name, int id, String jibTitle, double salary, char gender) {
        super(name, id, jibTitle, salary, gender);
    }

    @Override
    public void work() {

    }
}
