package day59_OOPReview;

class A{
    private int a =100;
    int b = 200;
    protected  int c = 300;
    public int d = 400;

    private void method1(){}
    void method2(){}
    protected void method3(){
    }
    public void method4(){
    }

}

public class Inheritance extends A {

    protected void method3(){
        System.out.println("Hello Cybertek");
    }
    public void method4(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
       //  System.out.println(obj.a); //private can not be inherited
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

      //  obj.method1();  private method can not be called
        obj.method2();
        obj.method3();
        obj.method4();





    }

}
