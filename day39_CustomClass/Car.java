package day39_CustomClass;

import sun.jvm.hotspot.debugger.win32.coff.COFFLineNumber;

public class Car {
    /*
       Attributes:
             model, brand, year, color, mileage,VIN...
     */
    String model;
    String brand;
    int year;
    String color;
    double mileage;
    double price;
    //these are instance variables

//    public static void seInfo(String carBrand) { //instance method should not contain static
////this is not instance method, we couldn't call the instance variables from this method.
//    }  //if Static, we could set all objects inside ,
    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice ){
        brand = carBrand;
        model = carModel;
        year =carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;

    }
      /*
      car1 : Toyota
      car2 : BMW
      car3: Tesla //each object has its own copy
       */
    // 2012  Toyota Corolla Red, 10000, $45000
    public void getCarInfo() { //instance method
        System.out.println(year + " " + brand + " " + model + ", " + color + ", " + mileage + ", $" + price);
    }



        public void start(){
            System.out.println(brand+" "+model+" is started");
        }



    /*
    car1: Toyota
    car2: BMW
    car3: Tesla
     */




}
