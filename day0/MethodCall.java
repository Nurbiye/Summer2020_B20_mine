package day0;

import library.CustomMethods;  //if methods inside is static, we can call the method from other package

public class MethodCall {
    public static void main(String[] args) {
        String str="Cybertek School";

        CustomMethods.reverse(str);

        String str2="aaabbbdddddccccfffdfdsfsfs";

        CustomMethods.removeDup(str2);

    }

}
