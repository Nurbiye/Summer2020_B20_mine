package OurStudyGroup;

public class OddEven1 {
    public static void main(String[] args) {
 //write a program that can print all the ODD/Even numbers between 0 ~ 100 that can be divisible by 3 & 5
        for(int i=1; i<=100;i+=2){
            if (i%5==0 && i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        for(int i=0;i<=100; i+=2){
            if(i%3==0 && i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.println("============================================");

        for (int i=0;i<=100;i++){
            if(i%2!=0){
                if(i%5==0 && i%3==0){
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println();

        for(int i =0; i<=100; i++){
            if(i%2==0){
                if(i%15==0){
                    System.out.print(i+" ");
                }
            }
        }





    }
}
