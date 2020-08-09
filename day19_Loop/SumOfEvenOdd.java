package day19_Loop;
      /*
    3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
    4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
      */
public class SumOfEvenOdd {
    public static void main(String[] args) {
      //task3
        int sumOfEven = 0;
        // sum+=2, sum+=4, sum+=6.......add all the even numbers
        /*for (int i=0;i<=100;i+=2){ //even number
            sumOfEven += i; //sum of all even numbers
        } */  //we used mathematical approach to find the even number, next we use nested if:

        for(int i=0; i<=1000; i++){
            if(i%2==0){
                sumOfEven +=1;
            }
        }
        System.out.println(sumOfEven);

        System.out.println("===================================");
        //task4
        int sumOfOdd=0;
        /*for(int i=1; i<=99; i+=2){
            sumOfOdd +=i;
        }*/  //===> we used mathematical approach
        for(int i=1;i<=99;i++){
            if(i%2!=0){
                sumOfOdd +=i;
            }
        }
        System.out.println(sumOfOdd);







    }
}
