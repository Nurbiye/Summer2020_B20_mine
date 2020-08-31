package day48_Inheritance.AnimalTask;
                        //super(parent) class
public class Dog extends Animal { //inherit the dog class to animal class, then we can call the name
    //then Dog becomes the sub(child) class,
         /*
         variables:3 //from parent class
         methods:3   //from parent class and from this class
          */
    public Dog(String name, String size, int age, char gender, String breed, double lb){
        setInfo(name, size, age, gender, breed, lb);
    }

    public void bark(){
       System.out.println(name+" is barking");
         }



}
