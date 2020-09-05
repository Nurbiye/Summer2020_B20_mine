package day51_Exceptions.PetsTask;

public class Tiger extends Pet{
    public Tiger(String name, String bread, char gender, int age, String color) {
        super(name, bread, gender, age, color);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
