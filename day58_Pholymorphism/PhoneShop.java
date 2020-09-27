package day58_Pholymorphism;

import day57_Polymorphism.phoneTask.*;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Create a class called PhoneShop
    Copy the following array of Phone:

            (Phone is imported from day57 package)
        create an arrayList called phoneShop and store all phone objects from array of phone
        write a program that can count the total number of Iphone, Samsung and Huawei from the list
 */
public class PhoneShop {
    public static void main(String[] args) {
        Phone[] phone = {
                new Iphone("12", 1000, "5.3"),
                new Samsung("S20", 1000, "5.3"),
                new Iphone("12",  1000, "5.3"),
                new Samsung("S20", 1000, "5.3"),
                new Iphone("12", 1000, "5.3"),
                new Samsung("S20", 1000, "5.3"),
                new Iphone("12", 1000, "5.3"),
                new Samsung("S20", 1000, "5.3"),
                new Iphone("12", 1000, "5.3"),
                new Samsung("S20", 1000, "5.3"),
                new Iphone("12", 1000, "5.3"),
                new Samsung("S20", 1000, "5.3"),
                new Samsung("S20", 1000, "5.3"),
                new Iphone("12",1000, "5.3"),
                new Samsung("S20", 1000, "5.3")
        };


        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone));
        int countIphone = 0;
        int countSamSung = 0;
        int countHuaWei = 0;

        /*
        for(int i = 0; i <= phoneShop.size()-1; i++){
            Phone each = phoneShop.get(i);  // get each objects from array
            if( each instanceof Iphone  ){ // checks if the objects is Iphone
                countIphone++;
            }else if(each instanceof Samsung){ // checks if the object is samsung
                countSamSung++;
            }else {
                countHuaWei++;
            }
        }
        */

        for (Phone each : phoneShop) {
            if (each instanceof Iphone) {
                countIphone++;
            } else if (each instanceof Samsung) {
                countSamSung++;
            } else {
                countHuaWei++;
            }
        }

        System.out.println("Iphone: " + countIphone);
        System.out.println("Samsung: " + countSamSung);
        System.out.println("Huawei: " + countHuaWei);


    }
    }