package day07_Unary_ShortHand;

public class Unary {
    public static void main(String[] args) {
        System.out.println(-1 + -10);
        System.out.println(-1 - -10);

        //-- decrement
        int a= 20;
        --a;  //it is same with a= a-1; but --ais simple short, more convenient when we use loop;

        // ++ increment
        int b =10;
        b=b+1; // 11
        ++b; // 12

        System.out.println(--a);

        // pre increment and decrement
        int g =100;
        int f=200;
        System.out.println(--g); //99
        System.out.println(++f);//201
        System.out.println(--f);//200





    }
}
