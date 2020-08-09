package day21_Loops;

public class do_WhileLoop {
    public static void main(String[] args) {
        //print 1-20 by using do..while loop
        int num=1;
        do{
            System.out.print(num + " ");
            num++; //where to place the iterator is matter, if we put before print statement above, it doesn't print 1
        }while(num<=20); //if this condition is num>20(false), it only print 1
        System.out.println();

        System.out.println(num);

        System.out.println("============================");
        // print the character from Z to A

        char ch = 'Z';
        do{
            System.out.println(ch +" ");
            ch--;
        }while(ch>='A');

        System.out.println();






    }
}
