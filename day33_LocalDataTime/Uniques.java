package day33_LocalDataTime;

public class Uniques {
    /*
Task03:
        1. create a method that can print out the unique numbers from an array of integer
        2. create a method that can print out the unique numbers from an array of double
        3. create a method that can print out the unique words from an array of String
        4. create a method that can print out the unique characters from an array of chars
     */
    public static void main(String[] args) {
        int[] arr = {2,2,1,3,3,4,5,6,7,8,7};


//        int element= arr[0]; //in order to find the frequency of first element, we compare it within the array
//        int count = 0 ; //if that element occurs in the array, we add in count.
//        for (int b: arr){
//            if (element==b){
//                count ++;
//            }
//        }
//        if (count==1){
//            System.out.println(element);
//        }
//    }
        for (int element: arr){
        //int element= arr[0]; //in order to find the frequency of first element, we compare it within the array
        int count = 0 ; //if that element occurs in the array, we add in count.
        for (int b: arr){
            if (element==b){
                count ++;
            }
        }
        if (count==1){
            System.out.print(element+" ");
        }
    }
        System.out.println();


        System.out.println("=================================");
        int[] n1={10,20,30,40,50,50,60,60,60,7608,67086,7705,100,100,101};
        uniqueElements(n1);

        System.out.println("=================================");
        double[] n2={10,30,40,40,24,30,18};
        uniqueElements(n2);

        System.out.println("==================================");
        char[] ch= {'A','B','C','C','A'};
        uniqueElements(ch);

        System.out.println("===================================");
        String[] str= {"ad","sfasfa","fds","ad"};
        uniqueElements(str);

    }


    public static void uniqueElements(int[] arr){
        for (int element: arr){
            int count = 0 ;
            for (int b: arr){
                if (element==b){
                    count ++;
                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();

    }

    public static void uniqueElements(double[] arr){
        for (double element: arr){
            int count = 0 ;
            for (double b: arr){
                if (element==b){
                    count ++;
                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();

    }

    public static void uniqueElements(char[] arr){
        for (char element: arr){
            int count = 0 ;
            for (char b: arr){
                if (element==b){
                    count ++;
                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();

    }

    public static void uniqueElements(String[] arr){
        for (String element: arr){
            int count = 0 ;
            for (String b: arr){
                if (element.equals(b)){
                    count ++;
                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();

    }







}





