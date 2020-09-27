package day57_Polymorphism.phoneTask;
/*
5. create a class named iPhone that can inherit from AppleApp and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphone is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
 */
public class Iphone extends Phone implements AppleApp {

    public Iphone(String model, double price, String size) {
        super("Iphone", model, size, price);
        if (price >=1500){
            throw new RuntimeException("Invalid Price, Iphone' price cannot more than 1500");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling to "+phoneNumber);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is faceTiming with " + phoneNumber);
    }


    @Override
    public void download() {
        System.out.println("Iphone is downloading app from "+AppStoreName);
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }


}
