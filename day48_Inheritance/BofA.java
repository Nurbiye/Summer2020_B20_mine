package day48_Inheritance;

public class BofA { //Bank of America
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Nurbiye","Nur");
        obj.setAccountHolder(obj.firstName + " " + obj.lastName);
        obj.setAccountNumber(131278643);
        obj.setBalance(50);

        obj.availableBalance();
        obj.deposit(500);
        obj.availableBalance();
        obj.withdraw(700);
        obj.withdraw(-200);
        obj.deposit(100000);
        System.out.println(obj);


    }
}
