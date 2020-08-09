package day24_Arrays;

public class UniqueNumbers2 {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,7,8,8,9,9,9,9,3,4,6,7,6,7,7};
    //we can convert for loops to for each loop, in for each loop we don't need index number stuffs
        for(int a :arr){ //a is element
           //  int num1=a;
            int count=0;
            for (int b:arr) {
                if(b ==a){
                    count++;
                }
            }
            if(count==1){
                System.out.print(a+" ");
            }

        }








    }
}
