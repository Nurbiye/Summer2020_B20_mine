package OfficeHours.Practice_07_13_2020;

public class frequencyOfChar1 {
    public static void main(String[] args) {
        String str = "ABDJHFDKJHFSFBDNSDSBFJFJDAABSDJSFKFJSF";    //"OOPQQ";
        //add the each character from this string to the nonDup string by removing the duplicated char
        String nonDup = "";//"O"+"p"+"Q"

        //remove duplicates
        for (int i = 0; i < str.length() - 1; i++) {
            String s = "" + str.charAt(i);    // O O P Q Q
            if (!nonDup.contains(s)) {
                //  the string nonDup does not contain s characters
                nonDup += s;
            }
        }
        String result ="";  //O2P1Q2
        //nonDup = "OPQ"  str="OOPQQ"     ========>O2P1Q2

    /*    char ch1 = nonDup.charAt(0); //0===>we will do this to index 1 ,2 then get the
        int count =0; //1+1
        for (int i = 0; i <str.length()-1 ; i++) {
            char each = str.charAt(i); // O O P Q Q
            if(each==ch1){
                count +=1;
            }
        }
        result +=""+ch1 +count;
   */
        for (int j = 0; j <nonDup.length()-1 ; j++) {

            char ch = nonDup.charAt(j);
            int count =0;
            for (int i = 0; i <str.length()-1 ; i++) {
                char each = str.charAt(i);
                if(each==ch){
                    count +=1;
                }
            }
            result +=""+ch +count;

        }
        System.out.println(result);








    }

}
