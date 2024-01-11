package com.company;

public class Thrad_priority {
    public static void main(String[] args) {
        myThr a2=new myThr("Rohit");
        myThr a3 = new myThr("Pratap");
        myThr a4=new myThr("Pradip");

        a3.setPriority(Thread.MAX_PRIORITY);
        a2.setPriority(Thread.MIN_PRIORITY);
        a4.getPriority();
        a4.start();
        a2.start();
        a3.start();
    }
}
