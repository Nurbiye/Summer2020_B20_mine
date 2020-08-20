package day40_CustonClassReview;

import java.util.Scanner;

public class UnitTest3 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] a =new int[size];
//        int i=0;
//        while(i<size){
//            a[i++] = input.nextInt();
//        }
//        method8(a);
//

        //Q16
        double n = add(3.4);
        n+=add("dual");
        n += add(Integer.parseInt("100"));
        n+= add(11341L);
        n += add(Float.parseFloat("50.8"));
        System.out.println(n);//22.5





    }

public static void method8 (int[] arr){
        for(int n: arr){
            if(n%4==0){
                continue;
            }
            System.out.println(n);
        }
}

public static int add(int n){
        return 5;
}
    public static double add(double d){
        return 2.5;
    }
    public static long add(String s){
        return 10;
    }
//public static String method9(String one, String two, String three){
//        return ""+middle(one)+middle(two)+middle(three);
//}

}
