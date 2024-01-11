package com.company;

import java.util.Scanner;

import static java.lang.Math.sin;

class ncal{

    public void calculater ( int a,int b){
        System.out.println("Addition is "+ (a+b));
    }

}
class scical{
    public  int a ,b;
    public void calculater (int a,int b){
        System.out.println("Sin of a+b is "+ sin(a+b));
    }

}
class hycal{
    public  int a ,b;
    public void calculater (int a,int b){
        System.out.println("Addition is "+ (a+b));
        System.out.println("Sin of a+b is "+ sin(a+b));
    }

}

public class pracset_accesmofire {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter value of a and b :");
        int n = ac.nextInt();
        int m = ac.nextInt();
        ncal a= new ncal();
        scical b = new scical();
        hycal c = new hycal();
        a.calculater(n,m);
        b.calculater(n,m);
        c.calculater(n,m);
    }
}

