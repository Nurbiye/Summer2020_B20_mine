package day08_LogicalOperators;

public class practice {
    public static void main(String[] args) {
        String firstName = "Nurbiye";
        String lastName = "Kuresh";
        int age = 19;
        String citizenShip = "USA";

        boolean eligibleToVote = age >=18 && citizenShip=="USA";
        //in order to be true, both condition should be true.

        String fullName = firstName+ " " +lastName;
        System.out.println(fullName + " is eligible to vote: " + eligibleToVote);

    }
}
