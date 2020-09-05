package day51_Exceptions;

class C {

    public C (int a){ //if this constructor is default(no-arg),sub class call it automaticlly, if it is
        System.out.println("Super class constructor with int arg");
    }
}

public class SuperKeyword3 extends C {

    public SuperKeyword3 (int a ){
        super(100);
        System.out.println("sub class constructor with int arg");
    }

    public static void main(String[] args) {

    }

}
