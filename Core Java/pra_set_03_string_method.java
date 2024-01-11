package com.company;

import java.util.Scanner;

public class pra_set_03_string_method {
    public static void main(String[] args) {

        Scanner ac= new Scanner(System.in);
//        System.out.println("Enter the string:");
//        String str = ac.nextLine();

//        Q2
        //        System.out.println("Your formated string is :"+str.replace(" ","_"));

//        Q3
//        String letter= "Dear <name>,You are really genius, Thanks a lot.";
//        System.out.println(letter.replace("<name>",str));
//

//        Q4
            String a4= "counting a double  and   triple space";
        System.out.println(a4.indexOf("  "));
        System.out.println(a4.indexOf("   "));


//        Q5
        String letter= "Dear Rohit \n \t\t\tYou are really genius,\n Thanks a lot.";
        System.out.println(letter);



    }
}
