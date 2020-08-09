package day29_CustomMethods;
//write a method that can print out the unique elements from an array of string
public class UniqueElements {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C","D","E"};
        uniques(arr);
        System.out.println("Hello");

        String[] arr2={"B","R","W","R","E","A","R","L"};
        uniques(arr2);



    }




    public static void uniques(String[] arr){ //in main, we have to have String[] array
        for (String a: arr){  //gets each of the element
            int count = 0;
            for (String each : arr){ //gets the frequency of the element
                if (a.equals(each) ){
                    count ++;
                }
            }
            if (count==1){ //unique
                System.out.print(a+" ");
            }
        }
        System.out.println();
    }








}
