package day48_Inheritance.AnimalTask;

public class Cat extends Animal {
    /*
    4 var
    5 method from the parent class
     */

    public Cat(String name, String size, int age, char gender, String breed, double lb) {
        setInfo(name, size, age, gender, breed, lb);
    }

    public void meow(){
        System.out.println(name + " meowing");
    }
}
