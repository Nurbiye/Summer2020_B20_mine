package day41_toString_Practice;

public class Car {

        String brand;
        String model;
        int year;
        double price;
        String color;

        public void setCarInfo(String brand, String model, int year, double price, String color){
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
            this.color= color;
        }

    /*
    //toString method
    This method is used to print the objects how we want.
    If you try to print an object like array right away we get the hashcode for it,
    not the actual values. For arrays we have to use a utility class because they behave
    a little different, but for something like our Carpet class if we wanted to print
    the objects it would print us hashcodes. When we make the toString method we are able to
     print the object directly without any info method and it will show it the format we give
     */
        public String toString(){
            return year +" "+brand+" "+model+", "+color+", $"+price;
        }

    }
