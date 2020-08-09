package day33_LocalDataTime;

public class OverLoading {

                         //  any name here, no need args all the time
   public static void main(int[] num){
       System.out.println("int array");
   }

    public static void main(double[] args) {
        System.out.println("double array");
    }

    public static void main(String[] args) {
        System.out.println("String array");

    }//above those although we said it is main method , but system (compiler)only print psvm that use more often..
    //other methods also called main, but they are not the real printed main method






}
