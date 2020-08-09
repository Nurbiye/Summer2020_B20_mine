package day28_Recap;

public class ArraysShortQuiz {
    public static void main(String[] args) {
        int[] num1=new int[3];
        int[]num2 ={1,2,3,4,5};
        num1=num2;
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }

        int wd=0;
        String[] days ={"sun","mon","wed","sat"};
        for (int i = 0; i < days.length; i++) {

            switch (days[i]){
                case "sat":
                case "sun":
                    wd -=1;
                    break;

                case "mon":
                    wd++;

                case "wed":
                    wd +=2;
            }

        }
        System.out.println(wd);

        int[] a = {1,2,3,4};
        int y=0;

        do{
            System.out.print(a[y]);
            y++;
        }while (y <a.length-1);

    }
}
