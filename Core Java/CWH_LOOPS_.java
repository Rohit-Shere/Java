package com.company;

import java.util.Scanner;

public class CWH_LOOPS_ {
    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        System.out.println("enter the n:");
        int n= ac.nextInt();
        for (int i=n;i>=0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
}
