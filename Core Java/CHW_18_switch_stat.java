package com.company;

import java.util.Scanner;

public class CHW_18_switch_stat {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a= n.nextInt();

        switch (a){
            case 18:
                System.out.println("You are going to be adult.");
                break;

            case 21:
                System.out.println("You are now adult");
                break;
            case 50:
                System.out.println("YOu are going to retire");
                break;
            case 60:
                System.out.println("You are now retired.");

                break;
            default:
                System.out.println("Enjoy your life");
                break;

        }
    }
}
