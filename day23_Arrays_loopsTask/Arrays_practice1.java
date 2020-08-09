package day23_Arrays_loopsTask;

public class Arrays_practice1 {
    public static void main(String[] args) {
        //String students ="Muhtar","Nadir","Asiya";

        String[] students = {"Cybertek","Muhtar","Nadir","Asiye"}; //we can put [] after variable name student[] as well
        //index NO for array     0          1       2        3
        String name1 = students[1];
        System.out.println(name1);

        System.out.println("==========================");
        int[] scores={85,70,95,90,100};
        //             0  1  2  3   4
        String[] names = {"Mike","Adam","Tonny","John","Amy"};
        //                   0      1      2       3     4

      /*
        System.out.println(names[0]+" : " + scores[0]);
        //if i want to print out the students name and grades, i repeat this statement for 5 times
        .
        .
        System.out.println(names[2]+" : " + scores[2]);
        System.out.println(names[3]+" : " + scores[3]);
        System.out.println(names[4]+" : " + scores[4]);
        //instead repeating , we can use loop. let's use for loop
        */

        for(int i=0; i<=4; i++){ //i:0,1,2,3,4
            System.out.println(names[i] + " : " + scores[i]);
        }

        System.out.println("========================================");
        String[] classmates = new String[5]; //initialize the array size ===> size is 5
        classmates[0]="Fatih";
        classmates[2]="Hazel";
        classmates[1]="Viorel";
        classmates[3]="Elkem";
        classmates[4]="Ahmed"; //we are storing names in array

        for (int i=0; i<=4; i++){
            System.out.print(classmates[i]+" ");
        }







    }
}
