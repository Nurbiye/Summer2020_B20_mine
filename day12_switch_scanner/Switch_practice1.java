package day12_switch_scanner;

public class Switch_practice1 {

    public static void main(String[] args) {

        String productName = "MacBook";

        switch (productName) {

            case "galaxy":
                System.out.println("Samsung");
                break;

            case "iphone":
            case "ipad":
            case "MacBook":
                System.out.println("Apple");
                break;

        }

    }
}
