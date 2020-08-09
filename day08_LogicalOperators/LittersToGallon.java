package day08_LogicalOperators;
/*
write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 liter = 1/3.785
 */
public class LittersToGallon {
    public static void main(String[] args) {
        double liters = 200;
        double gallons = liters/3.785;

        System.out.println( liters + " liters equal to " + (int)gallons +" gallons");
                                       //by casting int we can make it integer without changing above variables



    }
}
