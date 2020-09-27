package day58_Pholymorphism.quiz;

interface A{
    void redBook();
    abstract void watchTV();
}

abstract class B implements A{
    @Override
    public void redBook() {
        System.out.println("reading");
    }
}
public class C extends B{

    @Override
    public void watchTV() {

    }
}
