package OfficeHours.Practice_07_15_2020;
//finding the frequency of single character, number,
public class frequencyOfWords2 {
    public static void main(String[] args) {

        String str ="catcatcatcatcatcat";
        int count = 0;
        while (str.contains("cat")){
            count++;
            str=str.replaceFirst("cat","");//in order to remove any string
        }

        System.out.println(count);

    }
}
