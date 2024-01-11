package com.company;

import java.util.Scanner;

public class CHW_RECURSION {

    static long factoorial (long a){
        if (a==0||a==1){
            return 1;

        }else {
            return a*factoorial(a-1);
        }

    }

    public static void main(String[] args) {

        Scanner num =new Scanner(System.in);
        long  n = num.nextInt();
        System.out.print("The factorial of is : "+factoorial(n));
    }



}
