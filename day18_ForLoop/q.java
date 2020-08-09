package day18_ForLoop;

public class q {
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 ="abc";
        System.out.println("s1 + s2 is: "+"abc"=="abc");


        for(int i=0; i<=4;){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();


        for(int i=0; i<5; i++){//if i--,infinite
            System.out.print("cyber");
        }
        System.out.println();

        int a =0;
        while(a<=6){
            a+=2;
        }
        System.out.println(a);


    }
}
