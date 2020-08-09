package day08_LogicalOperators;

public class Logical {
    public static void main(String[] args) {
     // ! : opposite boolean
        boolean r1 = 9>7; // true
        //boolean r2 = r1; true
        boolean r2 = ! r1; //false
        System.out.println(r2);

        System.out.println( !false ); //true
        System.out.println( !true); //false

        boolean r3 = !false == true;
                    // true == true ==> true
        System.out.println(r3);

        boolean r4 = true == ! true; //false
        System.out.println(r4);

        // && : and  ==>both
        //in order to return true, both expressions should be true.
        boolean r5= 9>5 && 9>10;
                 // true && false==>false
        boolean r6 = !true && false; //flase
        boolean r7 =!false && 9>11; //


        //  ||  : or ==> either
        // as long as one condition is true, it will always returns true
        boolean r8 = !false || 7 <3; //true
        System.out.println(r8);


        boolean r9= !true==false || !false==false;
        System.out.println(r9); //true, as long as one expression is true






    }
}
