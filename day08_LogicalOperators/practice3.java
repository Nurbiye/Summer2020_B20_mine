package day08_LogicalOperators;

public class practice3 {
    public static void main(String[] args) {
        int b=2; //     b1=3,    b2=2
        boolean res = ++b ==2 || --b ==2 && --b==2; //
                    // 3==2   ||  2 == 2 && 1==2

        System.out.println(res);

        int c=5;   //c1=6      c2=5
        boolean r2= c++ ==6 || c-- ==5;
                  //5 == 6 ||  6 == 5
        System.out.println(r2);

        boolean A = true;
        boolean B = !A; //b=false
        boolean C = A!=B && A==!B  && !A==B;
         //    true!=false && true  && true
         //        true   &&
        System.out.println(C);


    }
}
