package officeHours;

public class quiz_Practice {
    public static void main(String[] args) {
        int a = 5;
        byte b = (byte)a;
        System.out.println(b);

        long l = 100;
        short s = (short)l;
        System.out.println(s+10);



        int cc =10;
         String d = "T";

         switch (d) {
             case "S":
                 cc++;
             case "T":
             case "W":
                 cc += 10;
             case "TH":
                if(true){
                    break;
                }
             System.out.println(5);

             default:
                 cc = 0;
         }
        System.out.println(cc);




         boolean x = false;
         if (!x){
             System.out.println("yes");
         }else{
             System.out.println("no");
         }

         if(x){
             System.out.println("bye");
         }








    }
}
