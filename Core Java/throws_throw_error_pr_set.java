package com.company;

import java.util.Scanner;

//


public class throws_throw_error_pr_set {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] marks = new int[n - 1];
        for (int i = 0; i < n; i++) {
            marks[i] = scan.nextInt();
        }
        System.out.println("Thanks array is full now.");


        int i = 0;

        boolean flag = true;
        while (flag && i < n) {
            try {
                System.out.println("The marks on " + i + " " + marks[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            finally {
                System.out.println("Program is finish");
            }

        }

    }
}

