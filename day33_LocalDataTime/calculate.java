package day33_LocalDataTime;

public class calculate {
    /*
    Task01:
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals
     */

    public static void main(String[] args) {
        float num1=10f;
        float num2=39;

        System.out.println(addition(num1,num2) );
        System.out.println(addition(90.6,540));


        System.out.println(multiplication(3.8,89) );

        long l1 =100;
        long l2= 200;

        System.out.println(multiplication((int)l1, (int)l2) );
      //long will assign to the double multiplication method, but if we insist to assign to int method, we can cast it



    }


    public static int addition(int a, int b){
        return a+b;
    }
    public static double addition(double a , double b){
        return a+b;
    }
    public static double addition(double a, int b){
        return a+b;
    }


    public static int multiplication(int a, int b){
        return a*b;
    }

    public static double multiplication(double a , double b){
        return a*b;
    }









}
