package com.company;


import java.util.Scanner;

public class CHW_42_CONSTRUCTER {
    public static void main(String[] args) {

        int a ;
        String n1 ;
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter the Id of user:");
        a= ac.nextInt();

        System.out.println("Enter the name of user:");
        n1=ac.nextLine();
        System.out.println(n1);
        MyMainEmployee Rohit= new MyMainEmployee(a,"rohit");

        System.out.println(Rohit.getId());
        System.out.println(Rohit.getName());



    }


}
