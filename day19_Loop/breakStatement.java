package day19_Loop;

public class breakStatement {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            break;
        }

        System.out.println("====================");
        for(char ch='A';ch<='H';ch++){
            System.out.println(ch+" ");//A B C
            if(ch=='C'){
                break;
            }
        }

        //let's change the break position if it has different result
        for(char ch='A';ch<='H';ch++){
            if(ch=='C'){
                break; //when ch='C',this if statement will executed then it will stop, but without printing C.
            }
            System.out.println(ch+" "); //A B
        }

        //when should we use the break statement..
        System.out.println("===================");
        for(int i=10;i<=50;i+=10){ //i: 10,20,30,40,50 five times
            System.out.print(i+" ");
            if(i==30){
                break; //30 will be printed
            }
        }
        System.out.println();

        for(int i=10;i<=50;i+=10){ //i: 10,20,30,40,50 five times
            if(i==30){
                break; //30 will not be printed
            }
            System.out.print(i+" "); //10 20
        }










    }
}
