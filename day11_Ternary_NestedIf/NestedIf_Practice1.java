package day11_Ternary_NestedIf;

public class NestedIf_Practice1 {
    public static void main(String[] args) {
        /*
        Task01:
        precondition: minimum salary of 30k
              sub condition :  minimum 2 years of job history
         eligible to loan or not.
         */
        double salary= 450000;
        int JobHistory = 3;
        String loan = " ";

        if (salary >= 30_000){
            if(JobHistory >= 2){
                loan ="You are qualified";
            }else{ //jobHistory < 2
                loan="You must have been on job at least 2 year";
            } //these sub condition execute only the pre condition is true

        }else{
            loan = "You MUST earn at least 30K per year";
        }
        System.out.println(loan);





    }
}
