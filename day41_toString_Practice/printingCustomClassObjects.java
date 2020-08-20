package day41_toString_Practice;

public class printingCustomClassObjects {
    public static void main(String[] args) {
        String str = new String("Cybertek");
        System.out.println(str);//object name
        System.out.println(new String("Nurbiye"));//object


        System.out.println(str.toString() );
        System.out.println(new String("Nurbiye"));
        //if we get hashcode in compiler,  always remember we have to customize the (toString) method
// toString
        System.out.println("======================================================");

        Carpet c1 = new Carpet();
        c1.customOrder(5,6,19, true);


        System.out.println(c1);



    }
}
