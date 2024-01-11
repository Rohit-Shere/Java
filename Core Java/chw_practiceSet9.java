package com.company;

import java.util.Scanner;

class cylinder{
    private int rad;
    private int h8;

    cylinder(){
        this.rad=5;
        this.h8=10;
    }

    public void setRadiusHeight(int n, int m ){

        this.rad=n;
        this.h8=m;

    }

    public int getRadius(){
        return rad;
    }
    public int getHeight(){
        return h8;
    }



    public void getSurfaceArea(){

        double area = (double) ((2*3.14*rad*h8)+(2*3.14*rad*rad));
        System.out.println("\nThe surface area of cylinder is : "+area+" square units");
    }
    public void getVolume (){
        double vol= (double) (3.14*rad*rad*h8);
        System.out.println("The volume of cylinder is  : "+vol+" cubic units ");
    }
}

public class chw_practiceSet9 {
    public static void main(String[] args) {
        Scanner as= new Scanner(System.in);
        System.out.println("Enter the radius :");
        int a= as.nextInt();

        System.out.println("Enter the height :");
        int b = as.nextInt();

        cylinder a1= new cylinder();
//        a1.setRadiusHeight(a,b);
        int c= a1.getRadius();
        int d= a1.getHeight();
        System.out.format("The radius of cylinder is %d \n and height of cylinder is %d",c,d);

        a1.getSurfaceArea();
        a1.getVolume();
    }


}
