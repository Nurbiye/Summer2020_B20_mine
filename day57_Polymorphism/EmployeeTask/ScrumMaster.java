package day57_Polymorphism.EmployeeTask;

public class ScrumMaster extends Employee {

    public ScrumMaster(String name, int id, String jibTitle, double salary, char gender) {
        super(name, id, jibTitle, salary, gender);
    }

    @Override
    public void work() {

    }

    @Override
    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jibTitle='" + jibTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
