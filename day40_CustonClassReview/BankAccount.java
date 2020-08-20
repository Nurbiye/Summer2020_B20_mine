package day40_CustonClassReview;
/*
BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions:
            1. CheckBalance,   2. deposit,  3. withdraw

          requirements:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance

 */
public class BankAccount {
    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;
    //to use it in next time, avoid setting them one by one, we can set a setInfo method(action)
    public void setAccountInfo (String clientAccountType, String name, String acctNum){
        //       in order to open bank account we need these three information
        accountType = clientAccountType;
        accountHolder = name;
        accountNumber = acctNum;
    }
//                                  // local variables(system prefer to use local variables)
//        public void setAccountInfo(String accountType, String accountHolder, String accountNumber){ // sets the info
//
//            this.accountType = accountType;
//            this.accountHolder = accountHolder;
//            this.accountNumber = accountNumber;
//       //if local variables names in method are same with instance variables, we use 'this. ' to call it
//        }


    //in order to display all these info together, we can create getInfo method
    public void getAccountInfo(){
        System.out.println("=====================");
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Balance: "+balance);
        System.out.println("=====================");
    }

    //check balance action
    public void checkBalance(){
        System.out.println("Account Balance: "+balance);
    }

    //deposit money
    public void deposit(double amount){
        System.out.println("Depositing $"+amount+" to "+accountNumber);
        balance +=amount;
    }

    //withdraw money
    public void withDraw(double amount){
        if (amount>=balance){
            System.out.println("not enough balance");
            return; //exit the method
            // system.exit(0) will end the whole system, and user couldn't perform other operation
        }
        System.out.println("Withdrawing $"+amount+" from "+accountNumber);
        balance -= amount;
    }

}
