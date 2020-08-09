package day09_IfStatement;
/*
3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
 */
public class MediumNumber {
    public static void main(String[] args) {
        double a =100;
        double b = 200;
        double c = 300;

         // boolean is the key here.
        boolean aIsMed = (a>b && a<c) || (a>c && a<b);
        boolean bIsMed = (b>c && b<a) || (b>a && b<c);
        boolean cIsMed = !aIsMed && !bIsMed;
                        //(c>a && c<b) || (c<a && c>b);

        double med = 40; //we can assign any number:0, 3,39832423, but i used 40, it will change after if statement.
         if (aIsMed){
             med=a;
         }
         if (bIsMed){
             med=b;
         }
         if(cIsMed){
             med=c;
         }

        System.out.println(med + " is the medium number");


    }
}
