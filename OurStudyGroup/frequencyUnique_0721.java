package OurStudyGroup;

import java.util.Arrays;

public class frequencyUnique_0721 {
    public static void main(String[] args) {
        String str="aalia";
        //frequency of Chars
        String str2="jsdhflAshewuhfaksnflsdbfsdnflds";
        String expected="";   // a2b1s4d3
        //              absd
//        String nonDup=removeDup(str); // absd
//        for (int i=0;i<nonDup.length();i++){
//            char ch=nonDup.charAt(i);
//            int frequency=frequency(str,ch);
//            expected+=""+ch+frequency; // we calling the frequency from original
//
//        }
//
//        System.out.println(expected);
        //====> how l in string
        int frequency=frequency(str2,'l');
        System.out.println("the total number of l "+frequency);
        String nonDup=removeDup(str2);
        System.out.println(nonDup);
        String [] nonDup2=nonDup.split("");
        Arrays.sort(nonDup2);
        String [] reverse=new String[nonDup2.length];
        int index=0; //1
        for(int i=nonDup2.length-1;i>=0;i--){
            //System.out.println(nonDup2[i]+nonDup2[i-1]);
            reverse[index]=nonDup2[i]; // nonDup last index == reverse first
            //      1       second to last
            index++;
        }
        System.out.println(Arrays.toString(nonDup2));
        System.out.println(Arrays.toString(reverse));
    }
    public static String removeDup(String str){
        String result="";
        char [] arr=str.toCharArray();
        for (char each:arr){
            if(!result.contains(""+each)) {  //  " " a a b s s d
                result+=each; //absd
            }  //str
        }
        return result;
    }
    public static int frequency(String str,char ch){  // frequency of char from the string
        int frequency=0;
        char [] arr=str.toCharArray();
        for (char each:arr){
            if(each==ch){  // == they are chars
                frequency++;
            }
        }
        return frequency;
    }



}
