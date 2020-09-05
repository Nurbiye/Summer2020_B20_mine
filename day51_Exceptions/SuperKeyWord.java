package day51_Exceptions;


class Test{
    int a; //200

    public void method(){
        System.out.println("Hello");
    }

    public void m (){
        this.method();
      //  super.method(); // super is for call from super(parent) class, Test class doesn't have super class
    }

}

public class SuperKeyWord extends Test {
    //a=300;

    public void print1() {
        System.out.println(a); //it prints a from local, superKeyWord class
        // as if--> System.out.println(this. a);
    }

    public void print2() {
        System.out.println(super.a); //it calls a from super class
    }

    public void method2() {
        super.method();
    }


    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.a = 200;

        SuperKeyWord obj2 = new SuperKeyWord();
        obj2.a = 300;


    }

}
