package day22_NestedLoop;
/*
12345
12345
12345
12345
we want to print 12345 for 5--6 times..
           for(int i=1; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();       is their any easy way except we repeat for 5 times?
        the best way to do so is, place them in another loop.
 */
public class Nested_Loop {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=1; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=1; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=1; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();


        for(int i=1; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("===========================");

        for(int i=1; i<=5; i++){ //loop in the loop , result will be same with above codes.

            for(int j=1; j<=5; j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }



    }
}
