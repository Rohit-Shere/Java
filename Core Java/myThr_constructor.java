package com.company;

class myThr extends Thread{
    myThr(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("Thank You I am Thread $"+getName());
        }

    }
}
class  myThr3 implements Runnable {

    @Override
    public void run() {
        System.out.println("This is Runnable ");

    }
}

public class myThr_constructor {
    public static void main(String[] args) {
        myThr t = new myThr("Rohit");
        myThr3 r=new myThr3();
        Thread r1 =new  Thread(r);
        r1.start();
        t.start();
        System.out.println("The id of Rohit thread is "+t.getId());
    }
}
