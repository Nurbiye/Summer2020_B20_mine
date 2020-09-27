package day54_Abstraction.CarTask;

public class BMW extends Car {
    //it is mandatory to sub class to override the abstract class's abstract method
    public void start(){
        System.out.println("starting BMW by: push start button");
    }

}
