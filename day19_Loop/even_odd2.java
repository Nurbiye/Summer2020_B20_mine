package day19_Loop;

public class even_odd2 {
    public static void main(String[] args) {
        //use continue statement to print the even and odd numbers
        for(int i=1; i<=50; i++){
            if(i%2!=0){ //if the number is odd , then skip
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println();

        for(int i=1; i<=50; i++){ //in order to print odd number , we can choose to skip the even number
            if(i%2==0){ //if the number is even , then skip
                continue;
            }
            System.out.print(i+" ");
        }




    }
}
