package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         // --------variables -------//
        // string - stores text
        String name = "Christian Fonseca";
        String Github = "https://github.com/Christfg1";
        String LinkedIn = "https://www.linkedin.com/in/christianfg1026/";
        int age = 23 ;
        String motto = "Every day is an opportunity to learn";
        char initial = 'C' ;
        double gpa = 3.4 ;
        float hourlyRate = 230 ;
        long phoneNumber = 9258525773L ;
        boolean availableForWork = true ;
// ----- Output -----//
        System.out.println("================================================");
        System.out.println(" MY BUSINESS CARD ");
        System.out.println("================================================");
        System.out.println("Initial : " + initial);
        System.out.println("Name : " + name);
        System.out.println("GitHub : " + Github) ;
        System.out.println("LinkedIn : " + LinkedIn);
        System.out.println("Age : " + age);
        System.out.println("GPA : " + gpa);
        System.out.println("Rate : €" + hourlyRate + " per hour");
        System.out.println("Phone : +" + phoneNumber);
        System.out.println("Available: " + availableForWork);
        System.out.println("Motto : " + motto);
        System.out.println("================================================");
    }
}
