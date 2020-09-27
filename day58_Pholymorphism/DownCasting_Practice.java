package day58_Pholymorphism;

import day57_Polymorphism.phoneTask.Huawei;
import day57_Polymorphism.phoneTask.Iphone;
import day57_Polymorphism.phoneTask.Phone;
import day57_Polymorphism.phoneTask.Samsung;

public class DownCasting_Practice {
    public static void main(String[] args) {
        Phone phone1 = new Iphone("11",1000,"6");
        Iphone iphone = (Iphone)phone1;

        System.out.println(phone1);
        System.out.println(iphone);
        iphone.faceTiming(53434354);
        ((Iphone) phone1).faceTiming(134343524);

        System.out.println("=====================================");
        Phone phone2 = new Samsung("s20",1000,"7");
        ( (Samsung)phone2).freezing();
       // ((Iphone)phone2).faceTiming(233232423);  //classCast exception , no is a relation with samsung object

        System.out.println("===========================");
        Phone phone3 = new Huawei("spy",1000,"7");
        ( (Huawei)phone3 ).stealInfo();

        //    ( (Iphone)phone3 ).faceTiming(1233111);





    }
}
