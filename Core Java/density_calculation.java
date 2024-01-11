package com.company;

import java.util.Scanner;

public class density_calculation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of z:");
        float z=sc.nextFloat();
        System.out.println("Enter the value of M:");
        float M=sc.nextFloat();
        System.out.println("Enter the value of a:");
        float a= sc.nextFloat();
        float N=6.023f;

        float d = z*M/(a*a*a*N);
        System.out.println("The density is :"+d);

    }
}
