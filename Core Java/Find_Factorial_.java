package com.company;

import java.util.Scanner;

public class Find_Factorial_ {
    public static void main(String[] args) {

        Scanner as= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = as.nextInt();
        long fact = 1;
//        for (int i=1;i<=a;i++){
//
//            fact=fact*i;
//
//        }
        int i=1;

        while (i<=a){
            fact=fact*i;
            i++;
        }
        System.out.printf("The factorial of %d is %d",a,fact);
    }
}
