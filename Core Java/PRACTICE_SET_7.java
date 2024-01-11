package com.company;

import java.util.Scanner;

public class PRACTICE_SET_7 {


    //    PATTERN
    static void pattern (int n){
        for (int i=1;i<= n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    static int sum (int n){
        if (n==1){
            return 1;
        }

        return n +sum(n-1);
    }




     static int multable(int n){
        for (int i=1;i<=10;i++){
            int multi=n*i;
            System.out.printf("%d * %d is %d",n,i,multi);
            System.out.println(" ");

        }
        return 0;
    }
    static void revpattern (int n){
        for (int i=n;i>0 ;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    static int fabo(int n) {

        if (n == 1) {

            return 0;
        }else if (n == 2) {
            return 1;

        }else if(n>2){
            return fabo(n-1)+fabo(n-2);
        }
        return 0;
         }


         static int avg (int ...n){
          int sum= 0;
        for (int a:n){
              sum=sum+a;

          }
        int  avg =sum/n.length;

        return avg;
      }

      static float celciusToFahrn (float g){
        float f=g*1.8f+32;
        return f;
      }

    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner a = new Scanner(System.in);
//        int m= a.nextInt();
//        System.out.println("This is original pattern :");
//        pattern(m);
//        System.out.println("The sum is : "+sum(m));
//        System.out.println(" This is revers pattern: ");
//        revpattern(m);
//        System.out.println("Your nth fabonacci is : "+fabo(m));


//        System.out.println("The avarage is : "+avg(1,3,5,7,9));

        float c= a.nextFloat();
        System.out.println("Temperature in Fahrenheit is :"+celciusToFahrn(c));

    }







}
