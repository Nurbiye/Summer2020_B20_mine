package day39_CustomClass;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        /*
            car1.brand ="Toyota";
            car1.model="Corolla";
            car1.year=2020;
            car1.color="White";
            car1.mileage=20000;
            car1.price =19000.50;
             //initialize the instance variable
        */
        car1.setCarInfo("Toyota","Corolla",2010,"red",55000,16000);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.mileage);
        System.out.println(car1.price);


        System.out.println("===================================");

        Car car2= new Car();
        /*
        car2.brand = "Mercedes";
        car2.model = "G 550";
        ...
        */
        car2.setCarInfo("BMW","X5",2018,"Black",15000,40000);
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

    }
}
