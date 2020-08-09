package day29_CustomMethods;

import java.util.Scanner;

public class eligibility {
    /*
    age,citizen,name---vote
    ID, age---buy alcohol
     */
    public  static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID &&  age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }




    public static void main(String[] args) {
        vote("Nurbiye",31,false,"Trump");
        vote("John",17,true,"Kanya");
        eligibleToBuyAlcohol(true,19);

    }



    public static void vote(String name, int age, boolean citizen, String candidateName){
        //                argument should be in this same order
        boolean eligibleToVote=  age>=18 && citizen==true;
        if (eligibleToVote){
            System.out.println(name + " is eligible to vote for "+ candidateName );
        }else{
            System.out.println(name+" is not eligible to vote");
        }
    }

}
