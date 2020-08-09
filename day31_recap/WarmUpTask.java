package day31_recap;
/*
warmup tasks:
    1.  write a return method called frequency that accepts two parameters:
     string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class
    2. use the above method to create another called uniques that accepts a string paramter and
    returns it's unique characters as String
            Ex:
                uniques("ABBC");       ==> "AC"
                uniques("Cybertek");   ==> "cybrtk"
                please copy paste the method to the util class
    3. use the methods removeDup and frequency in util class to create a third method called
    frequencyOfChars that can find the frequency of all characters from a string
        Ex:
            frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
            frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3
 */
public class WarmUpTask {
    public static void main(String[] args) {
        String str = "Aaabcccdefffffjkkkkkkkl";
        String uniques = "";
        for(char each  : str.toCharArray() ){
            int count =frequency(str, each);
            if(count == 1){
                uniques += each;
            }
        }
        System.out.println(uniques);
        System.out.println("======================================");

        String str2 = "pppoiiiiuuuuytttttr";
        String uniques2 = uniques(str2);
        System.out.println(uniques2);
    }


    public static int frequency(String str, char ch){ // finds the frequency of char from string str
        int count = 0;
        for(char each  : str.toCharArray() ){
            if(each == ch){
                count++;
            }
        }

        return count;
    }


    public static String uniques(String str){
        String uniques = "";

        for(char each  : str.toCharArray() ){
            int count =frequency(str, each);  // frequency of every character
            if(count == 1){
                uniques += each;
            }
        }

        return uniques;
    }




}
