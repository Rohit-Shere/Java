package com.company;


import java.util.Random;
import java.util.Scanner;

class game{

  public   int number;
  public int  inputNumber;
  public int noOfGuesses=0;

  int getNoOfGuesses(){
      return noOfGuesses;
  }
    void setNoOfGuesses(int noOfGuesses ){
      this.noOfGuesses=noOfGuesses;
  }

    void userInput(){
        System.out.println("Enter Your no :");
        Scanner sc= new Scanner(System.in);
        inputNumber=sc.nextInt();
  }
  void game(){
      Random rand= new Random();
      this.number= rand.nextInt(100);

  }
  boolean isCorrectNumber(){
      noOfGuesses++;
      System.out.println(number);
      if (number==inputNumber){
          System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", inputNumber, noOfGuesses);
          return true;

      } else if (number < inputNumber) {
          System.out.println("The guess is greater.");

      }else {
          System.out.println("The guess is smaller.");

      }

      return false;
  }



}

public class guessNumber {
    public static void main(String[] args) {

        game g = new game();
        boolean b= false;

        while (!b){

            g.userInput();
            b=g.isCorrectNumber();
        }


    }

}
