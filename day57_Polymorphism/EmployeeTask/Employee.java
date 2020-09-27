package day57_Polymorphism.EmployeeTask;

public abstract class Employee {
    public String name;
    public int id;
    public String jibTitle;
    public double salary;
    public char gender;

    public Employee(String name, int id, String jibTitle, double salary, char gender) {
        this.name = name;
        this.id = id;
        this.jibTitle = jibTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jibTitle='" + jibTitle + '\'' +
                ", salary= $" + salary +
                ", gender=" + gender +
                '}';
    }

}
