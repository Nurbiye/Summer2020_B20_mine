package day51_Exceptions.PetsTask;

public class Dog extends Pet{



    public Dog(String name, String bread, char gender, int age, String color) {
        super(name, bread, gender, age, color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
