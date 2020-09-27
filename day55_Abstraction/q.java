package day55_Abstraction;

public class q {
    static int a =50;

    static {
        a=500;
    }


    public static void main(String[] args) {

        a= 100;

        try{
            a=200;
        }catch (Exception E){
            a = 300;
        }finally{
            a=400;
        }

        System.out.println(a);
//        String[] names = {"B","O","D"};
//        String name1= names[names.length+1];
//        System.out.println();
//
//



//        try{
//            throw new ArithmeticException();
//        }catch (RuntimeException e){
//            System.out.println("R");
//        }catch (ArithmeticException e){
//            System.out.println("A");
//        }

    }
}
