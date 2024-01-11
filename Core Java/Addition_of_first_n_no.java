package com.company;

import java.util.Scanner;

public class Addition_of_first_n_no {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int a = num.nextInt();
        int sum=0;
        for (int i=0;i<=2*a;i++){
            if (i%2==0){
                sum=sum+i;
            }

        }

        System.out.println("The addition of first "+a+" numbers is: "+sum);
    }
}
