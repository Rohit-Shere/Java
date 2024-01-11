package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
     public String toString(){
        return "I am String ";
    }
    @Override
    public String getMessage(){
        return "I am a Message";
    }

}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}

public class chw_81_Exception_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if (a<9){
            try {
                throw new MyException();
            }
            catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Finished");
        }
    }

}
