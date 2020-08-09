package day04_Variables;
   /* Task:
      create a class called CarInfo:
            Year
            Brand
            Model
            Mileage
            Price
            print the info of the car


      Ex:      2020
                BMW
                X5
                30000
                45000
            output:
                2020 BMW X5, 3000 miles, $45000
      */

public class CarInfo {
    public static void main(String[] args) {
        int year = 2020;
        String brand = "BMW";
        String model = "X5";
        short mileage = 30000;
        double price = 45000; //we can use int if we want to print integer price
        String color = "Red";
        //in one line my result should be : 2020 BMW X5, 3000 miles, $45000

        System.out.println(year + " " + brand +" " + model +", " + mileage +" miles, $" +price);

        //If we want to print other cars information, we can change the Info above main statement.
    }


}
