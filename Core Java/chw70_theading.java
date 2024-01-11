package com.company;

import java.security.spec.RSAOtherPrimeInfo;

class myThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("Cooking thread is running ");
            System.out.println("I am very Sad");
            i++;
        }
    }

}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("Chatting thread is running ");
            System.out.println("IS rani loves me?");
            i++;
        }
    }

}

public class chw70_theading {
    public static void main(String[] args) {
        myThread1 t1=new myThread1();
        myThread2 t2= new myThread2();
        t1.start();
        t2.start();

    }
}
