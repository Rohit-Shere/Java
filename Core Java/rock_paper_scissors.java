package com.company;


import java.util.Random;
import java.util.Scanner;

class initialize{
    public int a;
    public int b;

    initialize(String term){

        switch (term) {
            case "Rock" -> a = 0;
            case "Paper" -> a = 1;
            case "Scissor" -> a = 2;
        }
    }
    public int rand(){
        Random ad = new Random();
        b=ad.nextInt(2);
        return b;
    }
    public void checkWinner(int b){

        if (a==0&&b==1){
            System.out.println("Computer win...");
        }else
        if(a==1&&b==2){
            System.out.println("computer win...");
        }else
        if (a==1&&b==0){
            System.out.println("You win... ");
        } else if (a == 2 && b == 1) {
            System.out.println("You win...");
        }else {
            System.out.println("Tie...");
        }
    }
}

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter your response (Rock , Paper,Scissor) :");
       String term= as.nextLine();

       initialize a2 = new initialize(term);
      int b=   a2.rand();

       a2.checkWinner(b);

    }

}
