package day47_Encapsulations;

public class Test {
    public static void main(String[] args) {

        System.out.println( AccessModifiers.publicVariable ); // public is accessible at every where
        AccessModifiers.publicMethod();


        System.out.println( AccessModifiers.defaultVariable ); // default is accessible within the same package
        AccessModifiers.defaultMethod();


        //   System.out.println( AccessModifiers.privateVariable ); // private is not visible outside its class
        //  AccessModifiers.privateMethod();


    }
}
