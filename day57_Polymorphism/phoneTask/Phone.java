package day57_Polymorphism.phoneTask;
//create an abstract class named Phone
public abstract class Phone {
    //instance variables: brand, model, price, size
    public String brand;
    public String model;
    public double price;
    public String size;
    //if all are same data type, we can create this instance variable in this way
   //public String brand,model, size;


   // abstract methods: texting(), calling()
    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

    //add constructor that can initialize the fields
//if the price is set to negative, the system should throw an exception with a message of:Invalid Price, cannot be negative
    public Phone(String brand, String model, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        if(price<0){
            throw new RuntimeException("Invalid Price, cannot be negative");
        }//set this condition before setting price variable
        this.price = price;
    }






}
