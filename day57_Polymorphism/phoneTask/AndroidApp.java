package day57_Polymorphism.phoneTask;
/*
 2. create an interface named AndroidApp that can inherit from Downloadable
            variable: AppStoreName
 */
public  interface AndroidApp extends Downloadable{

   static final String AppStoreName = "Google play";

   //and it has one abstract method from parent interface

}


