package day40_CustonClassReview;

public class BankOfAmerica_BOA {
    public static void main(String[] args) {
        BankAccount Nurbiye = new BankAccount();
        Nurbiye.setAccountInfo("saving","Nurbiye Kuresh","657894309485354");
        Nurbiye.getAccountInfo();
        Nurbiye.deposit(1000);
        Nurbiye.checkBalance();
        Nurbiye.withDraw(500);
        Nurbiye.checkBalance();
        Nurbiye.withDraw(10000);
        Nurbiye.checkBalance();



    }
}
