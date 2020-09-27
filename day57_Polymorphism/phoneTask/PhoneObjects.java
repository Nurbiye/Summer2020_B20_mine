package day57_Polymorphism.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("12",1200,"5.3'");
        Samsung samsung = new Samsung("S20", 899, "6.5' " );
        Huawei huawei = new Huawei("Robbery", 25, "5.3'");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        Phone phone1 = new Iphone("11",900,"6");
        Phone phone2 = new Samsung("S8", 800, "6.5");
        Phone phone3 = new Huawei("sadassda", 20, "3");

        //  Iphone[] phones = {iphone, samsung , huawei };
        //  Samsung[] phones = {iphone, samsung , huawei };
        //    Huawei[] phones = {iphone, samsung , huawei };

        Phone[] phones ={iphone, samsung , huawei, phone1, phone2, phone3 };


    }

}
