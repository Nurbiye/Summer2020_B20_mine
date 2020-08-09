package day08_LogicalOperators;

public class practice2 {
    public static void main(String[] args) {
        int age =12;
        String citizen1 = "USA";
        String citizen2 = "France";

        boolean eligibleAge= age >=18; //we can change the age 20, larger or equal18. result will be true.
                         // 12>=18==>false
        boolean usCitizen = citizen1 == "USA" || citizen2 =="USA";
                          // "USA" == "USA" || "france"=="usa"
                           // true ||false
                        // true
        boolean eligibleToVote = eligibleAge && usCitizen;
                                 // false   && true
        System.out.println(eligibleToVote); // we can add name and write full print statement with string.







    }
}

