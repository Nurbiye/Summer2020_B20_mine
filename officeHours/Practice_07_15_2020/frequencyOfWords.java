package officeHours.Practice_07_15_2020;

public class frequencyOfWords {
    public static void main(String[] args) {
        String str ="catcatcatcatcatcat";

        int count = 0;  //to know the frequency of the word in a word , let's count first
       /* if (str.contains("cat")){
            count++; //after counting by one, we remove the word that we count , thn continue to count
            str=str.replace("cat",""); //we are removing "cat", by replacing it with empty string
        }
        System.out.println(str);
        System.out.println(count);*/
        //we have to use as many if statements as the words we are counting, so we can use while loop instead of if

        while (str.contains("cat")){
            count++; //after counting by one, we remove the word that we count , thn continue to count
            str=str.replace("cat",""); //we are removing "cat", by replacing it with empty string
        }

        System.out.println(count);





    }
}
