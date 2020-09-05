package day51_Exceptions;


class A{
    protected void method(){

    }

}


public class MethodOverRiding extends A {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
