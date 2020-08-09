package day34_WrapperClass;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class WrapperClass_Methods {
    public static void main(String[] args) {
        String str = "123";
        int a =Integer.parseInt(str);  //123

        System.out.println(str+1);
        System.out.println(a+1);

        Double d1 = Double.parseDouble("7.5");
        System.out.println(d1-1);

        String s1 = "true";
        String s2="FALSE";
        boolean b1 = Boolean.parseBoolean(s1);
        boolean b2 = Boolean.parseBoolean(s2);
        System.out.println(b1);
        System.out.println(!b2);

        System.out.println("============================");
        String s3 = "10000.5";
        double d2= Double.valueOf(s3); //unboxing
        System.out.println(d2*2);

        String s4 ="FaLse";
        boolean r2 = Boolean.valueOf(s4); //unboxing
        System.out.println(r2);







    }
}
