package OurStudyGroup.Arrays;

import java.util.Arrays;

public class Duplicate_undo {
    public static void main(String[] args) {
        String str = "My name is Nurbiye Nurbiye means Nur Lady I like my Name";
        //find out the duplicate words in this sentence
        String[] a = str.split(" ");
        System.out.println(Arrays.toString(a));

        int count=0;
        for (int i = 0; i <=a.length-1 ; i++) {
            if (a[0].equalsIgnoreCase(a[1]) ){

            }

        }
            System.out.println("==============================");

            //How to find the duplicate words in String using Array
            //"Hi I am Jika and I'll get better soon! Jika"

                String str1 = "Hi I am Jika and I'll Hi get better soon! Jika";
                String[] arr = str1.split(" ");
        System.out.println(Arrays.toString(arr) );
                for(int i=0; i<=arr.length-1;i++){//0, 1 ,6
                    for(int j=i+1;j<= arr.length-1;j++){//1,2,3,4,5,6   //2,3,4,5,6
                        if(arr[i].equals(arr[j])){
                            System.out.println(arr[i]);
                        }
                    }
                }






            }


        }

