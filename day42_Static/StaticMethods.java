package day42_Static;

public class StaticMethods {
    int a =200;
    static int b=400;

    public static void main(String[] args) {
        System.out.println(b); // we can call b because it is static
        // System.out.println(a); // we couldn't call a because it is not static
        //System.out.println(this.a); // we lso couldn't call in this way,no object instances in this static method

        //but how we can call a? call through the object, create an object  from the class ---> StaticMethod
        StaticMethods obj =new StaticMethods();
        System.out.println(obj.a);//this is the only way we can call instance in static method

        staticMethod();
        StaticMethods.staticMethod();//can call from class

        //instanceMethod(); can not call
        obj.instanceMethod();//only from--> object-->class
        // StaticMethods.instanceMethod();-->this is also can't

    }

    public static void staticMethod(){

    }
    public void instanceMethod(){

    }





}
