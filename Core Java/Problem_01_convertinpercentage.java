package com.company;
import java.util.Scanner;

public class Problem_01_convertinpercentage {
    public static void main(String[] args){
        System.out.println("Calculating the percentages of Students");
        Scanner marks=new Scanner(System.in);
        System.out.println("Enter the marks of Maths :");
        int a =marks.nextInt();
        System.out.println("Enter the marks of English :");
        int b = marks.nextInt();
        System.out.println("Enter the marks of History :");
        int c = marks.nextInt();
        System.out.println("Enter the marks of Geography :");
        int d = marks.nextInt();
        System.out.println("Enter the marks of Science :");
        int e= marks.nextInt();

float sum= a+b+c+d+e ;
        System.out.println("The sum of marks is :");
        System.out.println(sum);
float percent =(sum/500)*100;
        System.out.println("The percentage is :");
        System.out.println(percent);

    }
}
