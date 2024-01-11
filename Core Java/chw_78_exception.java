package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class chw_78_exception {
    public static void main(String[] args) {
        int a= 1000;
        int b=0;
       try {
           int c= a/b;
           System.out.println(c);
       }catch (Exception e){
           System.out.println("The program is fail because of :");
           System.out.println(e);
       }
    }

}
