package day20_WhileLoops;

public class WhileLoop_Practice {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.print(i+ " ");
        }
        System.out.println();

        int num =1; //we can give the initialization before the while loop,
        while(num <=10){
         //   condition
            System.out.print(num + " ");

            num++; //give the iterator after all the statements.
            //in for loop iterator executes after the statement.
        }
        System.out.println();

        System.out.println("=====================");
        int num2 =1;
        while(num2<=10){
            System.out.println("Nurbiye");
            num2++;
        }



    }
}
