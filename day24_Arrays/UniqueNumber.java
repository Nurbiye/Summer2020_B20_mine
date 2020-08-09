package day24_Arrays;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,7,8,8,9,9,9,9,3,4,6,7,6,7,7};

        for (int j = 0; j <=arr.length-1 ; j++) {
        int num1=arr[j];  //number //j is index number
        int count=0; //   frequency      : store the 'frequency' of this number in the array above

        for (int i = 0; i <=arr.length-1 ; i++) {
            int each =arr[i]; //1 1 2 3 3
            if(each ==num1){
                count++;  //only calculates the frequency of num
            }

        }
            if(count==1){ //any number frequency is equal to 1, then it is unique
                System.out.print(num1);
            }

        }




    }
}
