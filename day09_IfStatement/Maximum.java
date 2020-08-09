package day09_IfStatement;
/*
1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
 */
public class Maximum {
    public static void main(String[] args) {
        double a = 500;
        double b = 300;
        double c = 1000;

        boolean aIsMax = a>b && a>c;

        boolean  bIsMax = aIsMax == false && b>c;
        // bIsMax = b>a && b>c; we also can use this.. but try different approach might be good.

        boolean cIsMax = !aIsMax && !bIsMax;  //there are several ways to express it.
                // aIsMax==false && bIsMax==false;
                // cIsMax = c>a && c>b;
             // !aIsMax && !bIsMax ===> !(aIsMax && bIsMax)
        /* we can use our old way to print out the maximum number, but let's try another way.
        if (aIsMax){
            System.out.println(a);
        }
        if (bIsMax){
            System.out.println(b);
        }
        if (cIsMax){
            System.out.println(c);
        }
         */

        double max = 0; //we want to assign the maximum number to variable max.
        //in local variable, we should initialize the variable by assigning any number on it first

        if (aIsMax){
           max = a;
        }

        if (bIsMax){
           max=b;
        }

        if (cIsMax){
            max=c;
        }

        System.out.println(max + " is maximum number");


    }
}
