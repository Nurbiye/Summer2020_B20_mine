package day56_Abstraction.PhoneTask;

public class IPHO extends Iphone {

    public IPHO(String brand, String model, double price, String size) {
        super(brand, model, price, size);
    }

    @Override
    public int section() {
        return 0;
    }
}
