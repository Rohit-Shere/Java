package com.company;

class mythreadrunable1 implements Runnable{
    public void run(){
        int i=0;
        while ( i<400){
        System.out.println("this is runnable by MyThreadRunnable 1");
        i++;}
    }

}
class mythreadrunable2 implements Runnable{
    public void run(){
        int i=0;
        while ( i<400){
            System.out.println("this is runnable by MyThreadRunnable 2");
            i++;}
    }
}



public class chw_71_thredbyinterfeces {
    public static void main(String[] args) {
        mythreadrunable1 a =new mythreadrunable1();
        Thread a1=new Thread(a);
        mythreadrunable2 b =new mythreadrunable2();
        Thread b2= new Thread(b);

        a1.start();
        b2.start();

    }
}
