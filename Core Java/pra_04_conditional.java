package com.company;

import java.util.Scanner;

public class pra_04_conditional {
    public static void main(String[] args) {
//  Q1
//        simple if else
//        int a= 10;
//        if (a==11){
//            System.out.println("I am 11 now");
//        }
//        else {
//            System.out.println("I am not 11");
//        }


//        Q4
//        Scanner marks= new Scanner(System.in);
//
//        System.out.println("Enter your 1st subject's marks:");
//        int mark1 = marks.nextInt();
//
//        System.out.println("Enter your 2nd subject's marks:");
//        int mark2= marks.nextInt();
//
//        System.out.println("Enter your 3rd subject's marks:");
//        int mark3= marks.nextInt();
//
//        int sum =( mark1+mark2+mark3)/3;
//
//
//     if (mark1>=33&&mark2>=33&&mark3>=33&&sum>=40)  {
//         System.out.println("You are pass.");
//     }else {
//         System.out.println("You are fail.");
//     }


//        Q4
//   calculating the income tax
//        Scanner income = new Scanner(System.in);
//        System.out.println("Enter your income in lakhs for calculating your incometax:");
//        float a = income.nextFloat();
//
//
//         if (2.5<=a&&a<=5){
//          float  n= a*0.05f*100000;
//            System.out.println("Your incometax is :"+n+" Rs");
//        } else if (5 <= a && 10 >= a) {
//            float n= (a-2.5f)*0.2f*100000;
//            System.out.println("Your incometax is :"+n+" Rs");
//        }else if (2.5>=a){
//
//             System.out.println("you are not eligible for paying income tax");
//         }else{
//             float n= (a*0.3f*100000)+25000;
//             System.out.println("Your incometax is :"+n+" Rs");
//         }


//        Q5
//
//
//        Scanner year = new Scanner(System.in);
//        System.out.println("Enter a year:");
//        int a = year.nextInt();
//        if (a%4==0){
//            System.out.println("This is leap year.");
//        }else {
//            System.out.println("This is not a leap year.");
//        }


//        Q6
        Scanner web=new Scanner(System.in);
        System.out.println("Enter the Website name:");
        String website= web.nextLine();

        if (website.endsWith(".com")){
            System.out.println("This website is commercial ");
        } else if (website.endsWith(".in")) {
            System.out.println("This website is Indian ");
        } else if (website.endsWith(".org")) {
            System.out.println("This website is Organisation ");
            
        }


    }
}
